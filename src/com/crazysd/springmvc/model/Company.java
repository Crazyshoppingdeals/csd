package com.crazysd.springmvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class Company {
/*
	id_company,
	company_name,
	company_logo_src
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_company", unique=true, updatable=false, nullable=false)
	private Integer id_company;	

	@Column(name="company_name", unique=true, nullable=false)
	private String company_name;
	
	@Column(name="company_description", nullable=true)
	private String company_description;
	
	@Column(name="company_logo_src", nullable=true)
	private String company_logo_src;
		
	@Column(name="company_status", nullable=false)
	private int company_status;

	@Column(name="company_popularity", nullable=false)
	private int company_popularity;

	public int getCompany_status() {
		return company_status;
	}

	public void setCompany_status(int company_status) {
		this.company_status = company_status;
	}

	public int getCompany_popularity() {
		return company_popularity;
	}

	public void setCompany_popularity(int company_popularity) {
		this.company_popularity = company_popularity;
	}
	
	
	public Integer getId_company() {
		return id_company;
	}

	public void setId_company(Integer id_company) {
		this.id_company = id_company;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_description() {
		return company_description;
	}

	public void setCompany_description(String company_description) {
		this.company_description = company_description;
	}

	public String getCompany_logo_src() {
		return company_logo_src;
	}

	public void setCompany_logo_src(String company_logo_src) {
		this.company_logo_src = company_logo_src;
	}

	@OneToMany(mappedBy="company")
    private Set<Offers> offers;
	
	public Set<Offers> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offers> offers) {
		this.offers = offers;
	}
		
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name="MAINCATE_COMPANY", 
				joinColumns={@JoinColumn(name="id_company")}, 
				inverseJoinColumns={@JoinColumn(name="id_maincate")})
	private Set<MainCategory> maincate_comp = new HashSet<MainCategory>();
	
	public Set<MainCategory> getMaincate_comp() {
		return maincate_comp;
	}

	public void setMaincate_comp(Set<MainCategory> maincate_comp) {
		this.maincate_comp = maincate_comp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_company == null) ? 0 : id_company.hashCode());
		result = prime * result + ((company_name == null) ? 0 : company_name.hashCode());
		result = prime * result + ((company_logo_src == null) ? 0 : company_logo_src.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Company))
			return false;
		Company other = (Company) obj;
		
		if (id_company == null) {
			if (other.id_company != null)
				return false;
		} else if (!id_company.equals(other.id_company))
			return false;

		if (company_name == null) {
			if (other.company_name != null)
				return false;
		} else if (!company_name.equals(other.company_name))
			return false;
		
		if (company_logo_src == null) {
			if (other.company_logo_src != null)
				return false;
		} else if (!company_logo_src.equals(other.company_logo_src))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Company [id_company=" + id_company + ", company_name=" + company_name + ", company_logo_src=" + company_logo_src + "]";
	}




}
