package com.crazysd.springmvc.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class Category {
/*
	id_category,
	category_name,
	category_logo_src
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_category;	

	@Column(name="category_name", unique=true, nullable=false)
	private String category_name;
	
	@Column(name="category_logo_src", nullable=true)
	private String category_logo_src;
	
	@Column(name="category_status", nullable=false)
	private int category_status;

	@Column(name="category_popularity", nullable=false)
	private int category_popularity;

	public int getCategory_status() {
		return category_status;
	}

	public void setCategory_status(int category_status) {
		this.category_status = category_status;
	}

	public int getCategory_popularity() {
		return category_popularity;
	}

	public void setCategory_popularity(int category_popularity) {
		this.category_popularity = category_popularity;
	}



	
	
	public Integer getId_category() {
		return id_category;
	}

	public void setId_category(Integer id_category) {
		this.id_category = id_category;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_logo_src() {
		return category_logo_src;
	}

	public void setCategory_logo_src(String category_logo_src) {
		this.category_logo_src = category_logo_src;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_category == null) ? 0 : id_category.hashCode());
		result = prime * result + ((category_name == null) ? 0 : category_name.hashCode());
		result = prime * result + ((category_logo_src == null) ? 0 : category_logo_src.hashCode());
		return result;
	}
	

	@OneToMany(mappedBy="category")
    private Set<Offers> offers;
	
	public Set<Offers> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offers> offers) {
		this.offers = offers;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Category))
			return false;
		Category other = (Category) obj;
		
		if (id_category == null) {
			if (other.id_category != null)
				return false;
		} else if (!id_category.equals(other.id_category))
			return false;

		if (category_name == null) {
			if (other.category_name != null)
				return false;
		} else if (!category_name.equals(other.category_name))
			return false;
		
		if (category_logo_src == null) {
			if (other.category_logo_src != null)
				return false;
		} else if (!category_logo_src.equals(other.category_logo_src))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Category [id_category=" + id_category + ", category_name=" + category_name + ", category_logo_src=" + category_logo_src + "]";
	}


}
