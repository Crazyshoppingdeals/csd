package com.crazysd.springmvc.service;

import java.util.List;
import java.util.Map;

import com.crazysd.springmvc.model.Search;

public interface SearchService {

	Search findById(int id);
	
	void save(Search search) ;

	void incrementSearch(int searchid);
		
	int getSearch_count(int searchid) ;
	
	List<Search> findAllSearches(int limit);

	void findSearch(String words);
}