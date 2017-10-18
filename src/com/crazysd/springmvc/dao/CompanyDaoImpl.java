package com.crazysd.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.crazysd.springmvc.model.Company;

@Repository("companyDao")
public class CompanyDaoImpl extends AbstractDao<Integer, Company> implements CompanyDao {

	public Company findById(int id) {
		Company company = getByKey(id);
		if(company!=null){
			Hibernate.initialize(company.getCompany_name());
		}
		return company;
	}

	public void save(Company company) {
		// TODO Auto-generated method stub
		persist(company);
	}

	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("company_name", name));
		Company company = (Company)crit.uniqueResult();
		delete(company);		
	}

	@SuppressWarnings("unchecked")
	public List<Company> findAllCompanies() {
		// TODO Auto-generated method stub
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("company_name"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
		List<Company> companies = (List<Company>) criteria.list();

		return companies;
	}
	
	public Company findByName(String name) {
		System.out.println("Name : "+name);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("company_name", name));
		Company company = (Company)crit.uniqueResult();
		if(company!=null){
			Hibernate.initialize(company.getCompany_name());
		}
		return company;
	}

	// currently using this function 
	public Company getCompanyDetails(String comp_name) {
	Criteria criteria = createEntityCriteria();
	criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.

	criteria.add(Restrictions.eq("company_name", comp_name));
	Company comp = (Company)criteria.uniqueResult();

	return comp;
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
