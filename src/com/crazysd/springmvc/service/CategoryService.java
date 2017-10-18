package com.crazysd.springmvc.service;

import java.util.List;
import java.util.Map;

import com.crazysd.springmvc.model.Category;
import com.crazysd.springmvc.model.Search;

public interface CategoryService {

	Category findById(int id);
	
	Category findByName(String name);
	
	void save(Category category);
	
	void deleteByName(String name);
	
	List<Category> findAllCategories();

	Map<Category, Integer> findCategoryCount();
}