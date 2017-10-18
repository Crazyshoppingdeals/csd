package com.crazysd.springmvc.service;

import java.util.List;

import com.crazysd.springmvc.model.Subscribe;

public interface SubscribeService {

	Subscribe findById(int id);
	
	void save(Subscribe subscribe) ;

	Subscribe getSubscriber(String email) ;
	
	List<Subscribe> findAllSubscribers(int limit);
}