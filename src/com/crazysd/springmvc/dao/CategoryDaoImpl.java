package com.crazysd.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.crazysd.springmvc.model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractDao<Integer, Category> implements CategoryDao {

	public Category findById(int id) {
		Category category = getByKey(id);
		if(category!=null){
			Hibernate.initialize(category.getCategory_name());
		}
		return category;
	}

	public void save(Category category) {
		// TODO Auto-generated method stub
		persist(category);
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("category_name", name));
		Category category = (Category)crit.uniqueResult();
		delete(category);		
	}

	@SuppressWarnings("unchecked")
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("category_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		List<Category> categories = (List<Category>) criteria.list();

		return categories;
	}
	
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name : "+name);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("category_name", name));
		Category category = (Category)crit.uniqueResult();
		if(category!=null){
			Hibernate.initialize(category.getCategory_name());
		}
		return category;
	}

	@SuppressWarnings("unchecked")
	public Map<Category, Integer> findCategoryCount() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("category_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		criteria.setProjection(Projections.projectionList().add(Projections.groupProperty("category_name"), "category_name").add(Projections.rowCount(), "count"));
		Map<Category, Integer> categorycount = (Map<Category, Integer>) criteria.list();
		return categorycount;
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
