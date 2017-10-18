package com.crazysd.springmvc.dao;

import java.util.List;

import com.crazysd.springmvc.model.Search;

public interface SearchDao {

	Search findById(int id);
	
	void save(Search search) ;

	void incrementSearch(int searchid);
		
	int getSearch_count(int searchid) ;
	
	List<Search> findAllSearches(int limit);

	void findSearch(String words);
}

