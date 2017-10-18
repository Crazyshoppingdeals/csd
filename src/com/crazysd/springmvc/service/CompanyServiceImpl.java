package com.crazysd.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crazysd.springmvc.dao.CompanyDao;
import com.crazysd.springmvc.model.Company;


@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDao dao;

	public Company findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	public Company findByName(String name) {
		// TODO Auto-generated method stub
		Company company = dao.findByName(name);
		return company;
	}
	
	public Company getCompanyDetails(String comp_name){
		
		return dao.getCompanyDetails(comp_name);
	}

	public void save(Company company) {
		// TODO Auto-generated method stub
		
	}

	public void saveCompany(Company company) {
		// TODO Auto-generated method stub
		dao.save(company);		
	}

	public void updateCompany(Company company) {
		// TODO Auto-generated method stub
		Company entity = dao.findById(company.getId_company());
		if(entity!=null){
			entity.setCompany_name(company.getCompany_name());
			entity.setCompany_logo_src(company.getCompany_logo_src());
		}
		
	}

	public void deleteCompanyByName(String name) {
		// TODO Auto-generated method stub
		dao.deleteByName(name);		
	}

	public List<Company> findAllCompanies() {
		// TODO Auto-generated method stub
		return dao.findAllCompanies();
	}
	
/*
	@Autowired
	private UserDao dao;

	public User findById(int id) {
		return dao.findById(id);
	}

	public User findBySSO(String sso) {
		User user = dao.findBySSO(sso);
		return user;
	}

	public void saveUser(User user) {
		dao.save(user);
	}

	/*
	 * Since the method is running with Transaction, No need to call hibernate update explicitly.
	 * Just fetch the entity from db and update it with proper values within transaction.
	 * It will be updated in db once transaction ends. 
	 */
/*	public void updateUser(User user) {
		User entity = dao.findById(user.getId());
		if(entity!=null){
			entity.setSsoId(user.getSsoId());
			entity.setPassword(user.getPassword());
			entity.setFirstName(user.getFirstName());
			entity.setLastName(user.getLastName());
			entity.setEmail(user.getEmail());
			entity.setUserProfiles(user.getUserProfiles());
		}
	}

	
	public void deleteUserBySSO(String sso) {
		dao.deleteBySSO(sso);
	}

	public List<User> findAllUsers() {
		return dao.findAllUsers();
	}

	public boolean isUserSSOUnique(Integer id, String sso) {
		User user = findBySSO(sso);
		return ( user == null || ((id != null) && (user.getId() == id)));
	}
*/	
}
