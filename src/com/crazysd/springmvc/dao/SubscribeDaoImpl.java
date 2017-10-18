package com.crazysd.springmvc.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.crazysd.springmvc.model.Subscribe;

@Repository("subscribeDao")
public class SubscribeDaoImpl extends AbstractDao<Integer, Subscribe> implements SubscribeDao {

	public Subscribe findById(int id) {
		Subscribe subscribe = getByKey(id);
		if(subscribe!=null){
			Hibernate.initialize(subscribe.getSubscribe_email());
		}
		return subscribe;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subscribe> findAllSubscribers(int limit) {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.

		criteria.add(Restrictions.eq("subscribe_status", 1));

		criteria.addOrder(Order.desc("subscribe_count"));
		criteria.addOrder(Order.desc("id_subscribe"));
		
		if(limit!=0) // if limit is 0 return all subscribees
			criteria.setMaxResults(limit);
		
		List<Subscribe> subscribees = (List<Subscribe>) criteria.list();
		return subscribees;
	}

	public void save(Subscribe subscribe) {
		persist(subscribe);
	}

	@Override
	public Subscribe getSubscriber(String email) {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.

		criteria.add(Restrictions.eq("subscribe_email", email));

		Subscribe subscriber = (Subscribe) criteria.uniqueResult();
		return subscriber;
	}
	

/*

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("subscribe_name", name));
		Subscribe subscribe = (Subscribe)crit.uniqueResult();
		delete(subscribe);		
	}

	@SuppressWarnings("unchecked")
	public List<Subscribe> findAllCategories() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("subscribe_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		List<Subscribe> categories = (List<Subscribe>) criteria.list();

		//		System.out.println("comapnies : "+companies);
		// No need to fetch userProfiles since we are not showing them on list page. Let them lazy load. 
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		return categories;
	}
	
	public Subscribe findByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Name : "+name);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("subscribe_name", name));
		Subscribe subscribe = (Subscribe)crit.uniqueResult();
		if(subscribe!=null){
			Hibernate.initialize(subscribe.getSubscribe_words());
		}
		return subscribe;
	}

	@SuppressWarnings("unchecked")
	public Map<Subscribe, Integer> findSubscribeCount() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("subscribe_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.		
		criteria.setProjection(Projections.projectionList().add(Projections.groupProperty("subscribe_name"), "subscribe_name").add(Projections.rowCount(), "count"));
		Map<Subscribe, Integer> subscribecount = (Map<Subscribe, Integer>) criteria.list();
		return subscribecount;
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
