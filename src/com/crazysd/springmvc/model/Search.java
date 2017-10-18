package com.crazysd.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SEARCH")
public class Search {
/*
	id_search,
	search_words,
	search_count,
	search_status
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_search;	

	@Column(name="search_words", unique=true, nullable=false)
	private String search_words;
	
	@Column(name="search_count", nullable=true)
	private int search_count;
	
	@Column(name="search_status", nullable=true)
	private int search_status;
	

	public Integer getId_search() {
		return id_search;
	}

	public void setId_search(Integer id_search) {
		this.id_search = id_search;
	}

	public String getSearch_words() {
		return search_words;
	}

	public void setSearch_words(String search_words) {
		this.search_words = search_words;
	}

	public int getSearch_count() {
		return search_count;
	}

	public void setSearch_count(int search_count) {
		this.search_count = search_count;
	}

	public int getSearch_status() {
		return search_status;
	}

	public void setSearch_status(int search_status) {
		this.search_status = search_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_search == null) ? 0 : id_search.hashCode());
		result = prime * result + ((search_words == null) ? 0 : search_words.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Search))
			return false;
		Search other = (Search) obj;
		
		if (id_search == null) {
			if (other.id_search != null)
				return false;
		} else if (!id_search.equals(other.id_search))
			return false;

		if (search_words == null) {
			if (other.search_words != null)
				return false;
		} else if (!search_words.equals(other.search_words))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "website [id_search=" + id_search + ", search_words=" + search_words + ", search_count=" + search_count + "]";
	}


}
