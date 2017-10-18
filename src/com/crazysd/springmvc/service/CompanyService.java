package com.crazysd.springmvc.service;

import java.util.List;

import com.crazysd.springmvc.model.Company;

public interface CompanyService {
	
	Company findById(int id);
	
	Company findByName(String name);
	
	void save(Company company);
	
	void saveCompany(Company company);
	
	void updateCompany(Company company);
	
	void deleteCompanyByName(String name);
	
	List<Company> findAllCompanies();
	
	Company getCompanyDetails(String comp_name);
}