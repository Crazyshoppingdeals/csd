package com.crazysd.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.crazysd.springmvc.model.Category;


public interface CategoryDao {

	Category findById(int id);
	
	Category findByName(String name);
	
	void save(Category category);
	
	void deleteByName(String name);
	
	List<Category> findAllCategories();

	Map<Category, Integer> findCategoryCount();

}

