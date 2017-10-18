package com.crazysd.springmvc.service;

import java.util.List;
import java.util.Map;

import com.crazysd.springmvc.model.Offers;

public interface OffersService {
	
	Offers findById(int id);
	
	void save(Offers offers);

	void updateOffers(Offers offers);

	void deleteById(int id);
	
	List<Object> findAllOffers(int pageno, int limit, int sortorder);

	Offers getCouponCode(int offerid);

	List<Offers[]> findAllOffersTypewise();

	List<Offers[]> findAllOffersCompanywise();
	
	List<Object> findCompanyOffers(int id_company, int pageno, int limit, int sortorder);

	List<Object> getSearchOffers(String text, int pageno, int limit, int sortorder);

	List<Offers[]> findAllOffersCategorywise();

	List<Object> findCategoryOffers(int id_category, int pageno, int limit, int sortorder);

	List<Offers> findSliderOffers(int offercount);
	
}