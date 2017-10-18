package com.crazysd.springmvc.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crazysd.springmvc.dao.SearchDao;
import com.crazysd.springmvc.model.Search;


@Service("searchService")
@Transactional
public class SearchServiceImpl implements SearchService{

	@Autowired
	private SearchDao dao;

	public Search findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Search> findAllSearches(int limit) {
		return dao.findAllSearches(limit);
	}

	@Override
	public void save(Search search) {
		dao.save(search);
	}

	@Override
	public void incrementSearch(int searchid) {
		dao.incrementSearch(searchid);
	}

	@Override
	public int getSearch_count(int searchid) {
		return dao.getSearch_count(searchid);
	}

	@Override
	public void findSearch(String words) {
		dao.findSearch(words);
	}

}
