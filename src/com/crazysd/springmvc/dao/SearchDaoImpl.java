package com.crazysd.springmvc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.crazysd.springmvc.model.Search;

@Repository("searchDao")
public class SearchDaoImpl extends AbstractDao<Integer, Search> implements SearchDao {

	public Search findById(int id) {
		Search search = getByKey(id);
		if(search!=null){
			Hibernate.initialize(search.getSearch_words());
		}
		return search;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Search> findAllSearches(int limit) {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.

		criteria.add(Restrictions.eq("search_status", 1));

		criteria.addOrder(Order.desc("search_count"));
		criteria.addOrder(Order.desc("id_search"));
		
		if(limit!=0) // if limit is 0 return all searches
			criteria.setMaxResults(limit);
		
		List<Search> searches = (List<Search>) criteria.list();
		return searches;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void findSearch(String search) {
		
		String[] words=search.split("\\s");
		
		for (String text : words) {

			Criteria criteria = getSession().createCriteria(Search.class);

			criteria.add(Restrictions.eq("search_status", 1));
			criteria.add(Restrictions.like("search_words", "%"+text+"%"));

			List<Search> searches = (List<Search>) criteria.list();
			if(searches.size()!=0){
				for (Search search2 : searches) {
					this.incrementSearch(search2.getId_search());
				}
			}
			else{
				// inserting new search
				Search obj=new Search();
				obj.setSearch_count(1);
				obj.setSearch_words(search);
				obj.setSearch_status(1);
				this.save(obj);
			}
		}
	}

	public void save(Search search) {
		persist(search);
	}
	
	public void incrementSearch(int searchid) {
		Search search = (Search) getSession().get(Search.class, searchid);
		search.setSearch_count((getSearch_count(searchid)+1));
		System.out.println("Updated SearchID: "+searchid+"\tCOunt: "+search.getSearch_count());
		
	}

	public int getSearch_count(int searchid) {
		Search search = getByKey(searchid);
		System.out.println("SearchID: "+searchid+"\tCOunt: "+search.getSearch_count());
		return search.getSearch_count();
	}

	

/*
	public void save(Search search) {
		persist(search);
	}

	public void deleteByName(String name) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("search_name", name));
		Search search = (Search)crit.uniqueResult();
		delete(search);		
	}

	@SuppressWarnings("unchecked")
	public List<Search> findAllCategories() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("search_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		List<Search> categories = (List<Search>) criteria.list();

		
		//		System.out.println("comapnies : "+companies);
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		return categories;
	}
	
	public Search findByName(String name) {
		System.out.println("Name : "+name);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("search_name", name));
		Search search = (Search)crit.uniqueResult();
		if(search!=null){
			Hibernate.initialize(search.getSearch_words());
		}
		return search;
	}

	@SuppressWarnings("unchecked")
	public Map<Search, Integer> findSearchCount() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("search_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		criteria.setProjection(Projections.projectionList().add(Projections.groupProperty("search_name"), "search_name").add(Projections.rowCount(), "count"));
		Map<Search, Integer> searchcount = (Map<Search, Integer>) criteria.list();
		return searchcount;
	}

*/	/*
	public User findById(int id) {
		User user = getByKey(id);
		if(user!=null){
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<User> users = (List<User>) criteria.list();
		
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		for(User user : users){
			Hibernate.initialize(user.getUserProfiles());
		}*/
/*		return users;
	}

	public void save(User user) {
		persist(user);
	}

	public void deleteBySSO(String sso) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", sso));
		User user = (User)crit.uniqueResult();
		delete(user);
	}
*/

}
