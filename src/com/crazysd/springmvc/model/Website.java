package com.crazysd.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="WEBSITE")
public class Website {
/*
	id_website,
	website_name,
	homepage_title,
	website_logo_src
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_website;	

	@Column(name="website_name", unique=true, nullable=false)
	private String website_name;
	
	@Column(name="homepage_title", nullable=true)
	private String homepage_title;
	
	@Column(name="website_logo_src", nullable=true)
	private String website_logo_src;
	

	public Integer getId_website() {
		return id_website;
	}

	public void setId_website(Integer id_website) {
		this.id_website = id_website;
	}

	public String getWebsite_name() {
		return website_name;
	}

	public void setWebsite_name(String website_name) {
		this.website_name = website_name;
	}

	public String getHomepage_title() {
		return homepage_title;
	}

	public void setHomepage_title(String homepage_title) {
		this.homepage_title = homepage_title;
	}

	public String getWebsite_logo_src() {
		return website_logo_src;
	}

	public void setWebsite_logo_src(String website_logo_src) {
		this.website_logo_src = website_logo_src;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_website == null) ? 0 : id_website.hashCode());
		result = prime * result + ((website_name == null) ? 0 : website_name.hashCode());
		result = prime * result + ((homepage_title == null) ? 0 : homepage_title.hashCode());
		result = prime * result + ((website_logo_src == null) ? 0 : website_logo_src.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Website))
			return false;
		Website other = (Website) obj;
		
		if (id_website == null) {
			if (other.id_website != null)
				return false;
		} else if (!id_website.equals(other.id_website))
			return false;

		if (website_name == null) {
			if (other.website_name != null)
				return false;
		} else if (!website_name.equals(other.website_name))
			return false;

		if (homepage_title == null) {
			if (other.homepage_title != null)
				return false;
		} else if (!homepage_title.equals(other.homepage_title))
			return false;
				
		if (website_logo_src == null) {
			if (other.website_logo_src != null)
				return false;
		} else if (!website_logo_src.equals(other.website_logo_src))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "website [id_website=" + id_website + ", website_name=" + website_name + ", website_logo_src=" + website_logo_src + "]";
	}




}
