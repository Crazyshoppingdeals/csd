package com.crazysd.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.crazysd.springmvc.model.MainCategory;


public interface MainCategoryDao {

	MainCategory findById(int id);
	
	MainCategory findByName(String name);
	
	void save(MainCategory category);
	
	void deleteByName(String name);
	
	List<MainCategory> findAllMainCategories();

	Map<MainCategory, Integer> findMainCategoryCount();

}

