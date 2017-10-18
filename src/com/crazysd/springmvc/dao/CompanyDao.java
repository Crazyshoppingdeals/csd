package com.crazysd.springmvc.dao;

import java.util.List;

import com.crazysd.springmvc.model.Company;


public interface CompanyDao {

	Company findById(int id);
	
	Company findByName(String name);
	
	void save(Company company);
	
	void deleteByName(String name);
	
	List<Company> findAllCompanies();
	
	Company getCompanyDetails(String comp_name);

}

