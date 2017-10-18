package com.crazysd.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.crazysd.springmvc.model.MainCategory;

@Repository("maincategoryDao")
public class MainCategoryDaoImpl extends AbstractDao<Integer, MainCategory> implements MainCategoryDao {

	public MainCategory findById(int id) {
		MainCategory maincategory = getByKey(id);
		if(maincategory!=null){
			Hibernate.initialize(maincategory.getMaincate_name());
		}
		return maincategory;
	}

	public void save(MainCategory maincategory) {
		persist(maincategory);
	}

	public void deleteByName(String name) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("maincategory_name", name));
		MainCategory maincategory = (MainCategory)crit.uniqueResult();
		delete(maincategory);		
	}

	@SuppressWarnings("unchecked")
	public List<MainCategory> findAllMainCategories() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("maincate_popularity"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		List<MainCategory> categories = (List<MainCategory>) criteria.list();

		return categories;
	}
	
	public MainCategory findByName(String name) {
		System.out.println("Name : "+name);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("maincategory_name", name));
		MainCategory maincategory = (MainCategory)crit.uniqueResult();
		if(maincategory!=null){
			Hibernate.initialize(maincategory.getMaincate_name());
		}
		return maincategory;
	}

	@SuppressWarnings("unchecked")
	public Map<MainCategory, Integer> findMainCategoryCount() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("maincategory_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		criteria.setProjection(Projections.projectionList().add(Projections.groupProperty("maincategory_name"), "maincategory_name").add(Projections.rowCount(), "count"));
		Map<MainCategory, Integer> maincategorycount = (Map<MainCategory, Integer>) criteria.list();
		return maincategorycount;
	}
	
/*
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
