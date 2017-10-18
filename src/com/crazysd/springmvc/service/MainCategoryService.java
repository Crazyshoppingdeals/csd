package com.crazysd.springmvc.service;

import java.util.List;
import java.util.Map;

import com.crazysd.springmvc.model.MainCategory;

public interface MainCategoryService {

	MainCategory findById(int id);
	
	MainCategory findByName(String name);
	
	void save(MainCategory maincategory);
	
	void deleteByName(String name);
	
	List<MainCategory> findAllMainCategories();

	Map<MainCategory, Integer> findMainCategoryCount();
}