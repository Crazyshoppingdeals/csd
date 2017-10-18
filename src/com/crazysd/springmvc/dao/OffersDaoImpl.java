package com.crazysd.springmvc.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.crazysd.springmvc.model.Offers;

@Repository("offersDao")
public class OffersDaoImpl extends AbstractDao<Integer, Offers> implements OffersDao {

	final int TILL_DAYS=90; 

	public Offers findById(int id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("id_offers", id));
		Offers offers = (Offers)crit.uniqueResult();
		if(offers!=null){
			Hibernate.initialize(offers.getOffer_title());
			Hibernate.initialize(offers.getOffer_description());
		}
		return offers;
	}

	public void save(Offers offers) {
		persist(offers);
	}

	public void deleteById(int id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("id_offers", id));
		Offers offers = (Offers)crit.uniqueResult();
		delete(offers);		
	}

	@SuppressWarnings("unchecked")
	public List<Object> findAllOffers(int pageno, int limit, int sortorder) {
		List<Object> lst=new ArrayList<Object>();

		String hql = "";
		if(sortorder==1){
			hql = "select *, @rownum \\:= IF(@current_rownum= id_company, @rownum + 1, 1) AS rownum, "
					+ "@current_rownum \\:= id_company from OFFERS join COMPANY using (id_company) "
					+ "join CATEGORY using (id_category) join OFFERTYPE using (id_offertype) "
					+ "where offers_status = 1 and company_status = 1 and category_status =1 and "
					+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() "
					+ "order by click_count desc, rownum, company_popularity, category_popularity";
		}
		else if(sortorder==2){
			hql = "select *, @rownum \\:= IF(@current_rownum= id_company, @rownum + 1, 1) AS rownum, "
					+ "@current_rownum \\:= id_company from OFFERS join COMPANY using (id_company) "
					+ "join CATEGORY using (id_category) join OFFERTYPE using (id_offertype) "
					+ "where offers_status = 1 and company_status = 1 and category_status =1 and "
					+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() and "
					+ "TO_DAYS(NOW()) - TO_DAYS(STR_TO_DATE(created_date,'%Y%m%d')) <= 3 "   // no of days to show offer as new
					+ "order by  click_count desc, rownum";
		}
		else if(sortorder==3){
			hql = "select *, @rownum \\:= IF(@current_rownum= id_company, @rownum + 1, 1) AS rownum, "
					+ "@current_rownum \\:= id_company from OFFERS join COMPANY using (id_company) "
					+ "join CATEGORY using (id_category) join OFFERTYPE using (id_offertype) "
					+ "where offers_status = 1 and company_status = 1 and category_status =1 and "
					+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() "
					+ "order by click_count desc, rownum";
		}
		else if(sortorder==4){
			hql = "select *, @rownum \\:= IF(@current_rownum= id_company, @rownum + 1, 1) AS rownum, "
					+ "@current_rownum \\:= id_company from OFFERS join COMPANY using (id_company) "
					+ "join MAINCATE_COMPANY using (id_company) join MAINCATE using (id_maincate) "
					+ "join CATEGORY using (id_category) join OFFERTYPE using (id_offertype) "
					+ "where upper(maincate_name) like upper('top%') and "
					+ "offers_status = 1 and company_status = 1 and category_status =1 and "
					+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() "
					+ "order by click_count desc, rownum";
		}
		
		Query query = getSession().createSQLQuery(hql).addEntity(Offers.class);
		List<Offers> offers = query.list();		
		int offersize = offers.size();

		hql += " limit "+(pageno*limit)+","+limit;		
		query = getSession().createSQLQuery(hql).addEntity(Offers.class);
		offers = query.list();
		
		lst.add(offers);
		lst.add(offersize);
		
		return lst;
	}

	@SuppressWarnings("unchecked")
	public List<Offers> findSliderOffers(int offercount) {

		String hql = "select *, @rownum \\:= IF(@current_rownum= id_company, @rownum + 1, 1) AS rownum, "
					+ "@current_rownum \\:= id_company from OFFERS join COMPANY using (id_company) "
					+ "join CATEGORY using (id_category) join OFFERTYPE using (id_offertype) "
					+ "where offers_status = 1 and company_status = 1 and category_status =1 and "
					+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() "
					+ "order by click_count desc, rownum limit "+offercount;
		
		Query query = getSession().createSQLQuery(hql).addEntity(Offers.class);
		List<Offers> offers = query.list();		

		return offers;
	}

	public int getOfferCount(int offerid) {
		Offers offer = getByKey(offerid);
		System.out.println("OfferID: "+offerid+"\tCOunt: "+offer.getClick_count());
		return offer.getClick_count();
	}
	
	public void incrementOfferCount(int offerid){
		Offers offer = (Offers) getSession().get(Offers.class, offerid);
		offer.setClick_count((getOfferCount(offerid)+1));
		System.out.println("Updated OfferID: "+offerid+"\tCOunt: "+offer.getClick_count());
	}
	
	public Offers getCouponCode(int offerid) {
		incrementOfferCount(offerid);
		
		Criteria criteria = getSession().createCriteria(Offers.class,"offer");
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.

		criteria.add(Restrictions.eq("id_offers", offerid));
		Offers offer = (Offers)criteria.uniqueResult();

		return offer;
	}

	@SuppressWarnings({ "unchecked" })
	public List<Object> getSearchOffers(String search, int pageno, int limit, int sortorder) {
		
		List<Offers> offers=new ArrayList<Offers>();
		String[] words=search.split("\\s");
		
		for (String text : words) {

			String hql = "select *, @rownum \\:= IF(@current_rownum= id_company, @rownum + 1, 1) AS rownum, "
					+ "@current_rownum \\:= id_company from OFFERS join COMPANY using (id_company) "
					+ "join CATEGORY using (id_category) join OFFERTYPE using (id_offertype) "
					+ "where offers_status = 1 and company_status = 1 and category_status =1 and "
					+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() and "
					+ "(offertype_name like '%"+text+"%' or "+ "company_name like '%"+text+"%' or "
					+ "category_name like '%"+text+"%' or "+ "offer_title like '%"+text+"%' or "
					+ "offer_description like '%"+text+"%' )"
					+ "order by click_count desc, rownum ";
		
			Query query = getSession().createSQLQuery(hql).addEntity(Offers.class);
			offers = query.list();		
			
		}
		
		List<Object> lst=new ArrayList<Object>();
		int offersize = offers.size();
		System.out.println(offersize);
		
		pageno--;
		int fromIndex=pageno*limit;
		int toIndex=fromIndex+limit;
		
		if(toIndex>offers.size() && offers.size()!=0)
			toIndex=offers.size();

		System.out.println("fromIndex : "+fromIndex);
		System.out.println("toIndex : "+toIndex);

		if(offers.size()!=0){
			offers = offers.subList(fromIndex, toIndex);
			
		}
		lst.add(offers);
		lst.add(offersize);
		
		return lst;
	}
	

	@SuppressWarnings("unchecked")
	public List<Offers[]> findAllOffersTypewise() {
		Criteria criteria = getSession().createCriteria(Offers.class,"offer");
		criteria.createAlias("offer.category", "category");
		criteria.createAlias("offer.company", "company");
		criteria.createAlias("offer.offertype", "offertype");
		
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("offer_title"));
		projList.add(Projections.property("offer_description"));
		projList.add(Projections.property("offertype"));
		projList.add(Projections.count("offertype"),"offertype_count");
		projList.add(Projections.groupProperty("offertype"));
//		Projections.sqlProjection(sql, columnAliases, types)
		criteria.setProjection(projList);
		criteria.add(Restrictions.eq("offers_status", 1));
		criteria.add(Restrictions.eq("company.company_status", 1));
		criteria.add(Restrictions.eq("category.category_status", 1));
		criteria.add(Restrictions.sqlRestriction("TO_DAYS(NOW()) - TO_DAYS(STR_TO_DATE(this_.created_date,'%Y%m%d')) <= "+TILL_DAYS));
		criteria.add(Restrictions.sqlRestriction("(STR_TO_DATE(this_.expiry_date,'%b %d, %Y')) >= curdate()"));

		criteria.addOrder(Order.desc("click_count"));
		criteria.addOrder(Order.desc("created_date"));
		criteria.addOrder(Order.asc("company.company_popularity"));
		criteria.addOrder(Order.asc("category.category_popularity"));

		List<Offers[]> results = criteria.list();
		return results;
	}

	@SuppressWarnings("unchecked")
	public List<Offers[]> findAllOffersCompanywise() {
		Criteria criteria = getSession().createCriteria(Offers.class,"offer");
		criteria.createAlias("offer.category", "category");
		criteria.createAlias("offer.company", "company");
		criteria.createAlias("offer.offertype", "offertype");
		
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("company"));
		projList.add(Projections.count("company"),"company_count");
		projList.add(Projections.groupProperty("company"));

		criteria.setProjection(projList);
		criteria.add(Restrictions.eq("offers_status", 1));
		criteria.add(Restrictions.eq("company.company_status", 1));
		criteria.add(Restrictions.eq("category.category_status", 1));
		criteria.add(Restrictions.sqlRestriction("TO_DAYS(NOW()) - TO_DAYS(STR_TO_DATE(this_.created_date,'%Y%m%d')) <= "+TILL_DAYS));
		criteria.add(Restrictions.sqlRestriction("(STR_TO_DATE(this_.expiry_date,'%b %d, %Y')) >= curdate()"));

		criteria.addOrder(Order.asc("company.company_name"));
		criteria.addOrder(Order.desc("click_count"));

		List<Offers[]> results = criteria.list();
		return results;
	}

	@SuppressWarnings("unchecked")
	public List<Offers[]> findAllOffersCategorywise() {
		Criteria criteria = getSession().createCriteria(Offers.class,"offer");
		criteria.createAlias("offer.category", "category");
		criteria.createAlias("offer.company", "company");
		criteria.createAlias("offer.offertype", "offertype");
//		Criteria criteria = createEntityCriteria();
		
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.property("category"));
		projList.add(Projections.count("category"),"category_count");
		projList.add(Projections.groupProperty("category"));

		criteria.setProjection(projList);
		criteria.add(Restrictions.eq("offers_status", 1));
		criteria.add(Restrictions.eq("company.company_status", 1));
		criteria.add(Restrictions.eq("category.category_status", 1));
		criteria.add(Restrictions.sqlRestriction("TO_DAYS(NOW()) - TO_DAYS(STR_TO_DATE(this_.created_date,'%Y%m%d')) <= "+TILL_DAYS));
		criteria.add(Restrictions.sqlRestriction("(STR_TO_DATE(this_.expiry_date,'%b %d, %Y')) >= curdate()"));

		criteria.addOrder(Order.asc("category.category_name"));
		criteria.addOrder(Order.desc("click_count"));

		List<Offers[]> results = criteria.list();
		return results;
	}

	@SuppressWarnings("unchecked")
	public List<Object> findCompanyOffers(int id_company, int pageno, int limit, int sortorder) {

		String hql = "select * from OFFERS join COMPANY using (id_company) join CATEGORY using (id_category) "
				+ "join OFFERTYPE using (id_offertype) "
				+ "where id_company = "+id_company+" and "
				+ "offers_status = 1 and company_status = 1 and category_status =1 and "
				+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() "
				+ "order by click_count desc, created_date";
	
		Query query = getSession().createSQLQuery(hql).addEntity(Offers.class);

		List<Object> lst=new ArrayList<Object>();
		List<Offers> offers = query.list();		
		
		int offersize = offers.size();

		pageno--;
		hql += " limit "+(pageno*limit)+","+limit;		
		query = getSession().createSQLQuery(hql).addEntity(Offers.class);
		offers = query.list();
		
		lst.add(offers);
		lst.add(offersize);
		
		return lst;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Object> findCategoryOffers(int id_category, int pageno, int limit, int sortorder) {

		String hql = "select * from OFFERS join COMPANY using (id_company) join CATEGORY using (id_category) "
				+ "join OFFERTYPE using (id_offertype) "
				+ "where id_category = "+id_category+" and "
				+ "offers_status = 1 and company_status = 1 and category_status =1 and "
				+ "STR_TO_DATE(expiry_date,'%b %d, %Y') >= curdate() "
				+ "order by click_count desc, created_date";
	
		Query query = getSession().createSQLQuery(hql).addEntity(Offers.class);

		List<Object> lst=new ArrayList<Object>();
		List<Offers> offers = query.list();		
		
		int offersize = offers.size();

		pageno--;
		hql += " limit "+(pageno*limit)+","+limit;		
		query = getSession().createSQLQuery(hql).addEntity(Offers.class);
		offers = query.list();
		
		lst.add(offers);
		lst.add(offersize);
		
		return lst;
	}

}
