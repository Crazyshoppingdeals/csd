package com.crazysd.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crazysd.springmvc.dao.SubscribeDao;
import com.crazysd.springmvc.model.Subscribe;


@Service("subscribeService")
@Transactional
public class SubscribeServiceImp implements SubscribeService{

	@Autowired
	private SubscribeDao dao;

	public Subscribe findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<Subscribe> findAllSubscribers(int limit) {
		return dao.findAllSubscribers(limit);
	}

	@Override
	public void save(Subscribe search) {
		dao.save(search);
	}

	@Override
	public Subscribe getSubscriber(String email) {
		return dao.getSubscriber(email);
	}

}
