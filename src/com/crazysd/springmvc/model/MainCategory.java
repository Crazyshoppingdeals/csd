package com.crazysd.springmvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MAINCATE")
public class MainCategory {
/*
`maincate`.`id_maincate`,
`maincate`.`maincate_name`,
`maincate`.`maincate_logo_src`,
`maincate`.`maincate_popularity`,
`maincate`.`maincate_status`
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_maincate;	

	@Column(name="maincate_name", unique=true, nullable=false)
	private String maincate_name;
	
	@Column(name="maincate_logo_src", nullable=true)
	private String maincate_logo_src;
	
	@Column(name="maincate_popularity", nullable=false)
	private int maincate_popularity;

	@Column(name="maincate_glyphicon", nullable=false)
	private String maincate_glyphicon;
	
	@Column(name="maincate_status", nullable=false)
	private int maincate_status;

	
	public Integer getId_maincate() {
		return id_maincate;
	}

	public void setId_maincate(Integer id_maincate) {
		this.id_maincate = id_maincate;
	}

	public String getMaincate_name() {
		return maincate_name;
	}

	public void setMaincate_name(String maincate_name) {
		this.maincate_name = maincate_name;
	}

	public String getMaincate_logo_src() {
		return maincate_logo_src;
	}

	public void setMaincate_logo_src(String maincate_logo_src) {
		this.maincate_logo_src = maincate_logo_src;
	}

	public int getMaincate_popularity() {
		return maincate_popularity;
	}

	public void setMaincate_popularity(int maincate_popularity) {
		this.maincate_popularity = maincate_popularity;
	}

	public String getMaincate_glyphicon() {
		return maincate_glyphicon;
	}

	public void setMaincate_glyphicon(String maincate_glyphicon) {
		this.maincate_glyphicon = maincate_glyphicon;
	}

	public int getMaincate_status() {
		return maincate_status;
	}

	public void setMaincate_status(int maincate_status) {
		this.maincate_status = maincate_status;
	}

	@ManyToMany(fetch = FetchType.EAGER, mappedBy = "maincate_comp")
	private Set<Company> companies = new HashSet<Company>();
	

	public Set<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_maincate == null) ? 0 : id_maincate.hashCode());
		result = prime * result + ((maincate_name == null) ? 0 : maincate_name.hashCode());
		result = prime * result + ((maincate_logo_src == null) ? 0 : maincate_logo_src.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof MainCategory))
			return false;
		MainCategory other = (MainCategory) obj;
		
		if (id_maincate == null) {
			if (other.id_maincate != null)
				return false;
		} else if (!id_maincate.equals(other.id_maincate))
			return false;

		if (maincate_name == null) {
			if (other.maincate_name != null)
				return false;
		} else if (!maincate_name.equals(other.maincate_name))
			return false;
		
		if (maincate_logo_src == null) {
			if (other.maincate_logo_src != null)
				return false;
		} else if (!maincate_logo_src.equals(other.maincate_logo_src))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "MainCategory [id_maincate=" + id_maincate + ", maincate_name=" + maincate_name + ", maincate_logo_src=" + maincate_logo_src + "]";
	}


}
