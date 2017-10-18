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
@Table(name="OFFERTYPE")
public class Offertype {
/*
	id_offertype,
	offertype_name,
	offertype_logo_src
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_offertype;	

	@Column(name="offertype_name", unique=true, nullable=false)
	private String offertype_name;
	
	@Column(name="offertype_logo_src", nullable=true)
	private String offertype_logo_src;
	
	
	public Integer getId_offertype() {
		return id_offertype;
	}

	public void setId_offertype(Integer id_offertype) {
		this.id_offertype = id_offertype;
	}

	public String getOffertype_name() {
		return offertype_name;
	}

	public void setOffertype_name(String offertype_name) {
		this.offertype_name = offertype_name;
	}

	public String getOffertype_logo_src() {
		return offertype_logo_src;
	}

	public void setOffertype_logo_src(String offertype_logo_src) {
		this.offertype_logo_src = offertype_logo_src;
	}

	
	@OneToMany(mappedBy="offertype")
    private Set<Offers> offers;
	
	public Set<Offers> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offers> offers) {
		this.offers = offers;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_offertype == null) ? 0 : id_offertype.hashCode());
		result = prime * result + ((offertype_name == null) ? 0 : offertype_name.hashCode());
		result = prime * result + ((offertype_logo_src == null) ? 0 : offertype_logo_src.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Offertype))
			return false;
		Offertype other = (Offertype) obj;
		
		if (id_offertype == null) {
			if (other.id_offertype != null)
				return false;
		} else if (!id_offertype.equals(other.id_offertype))
			return false;

		if (offertype_name == null) {
			if (other.offertype_name != null)
				return false;
		} else if (!offertype_name.equals(other.offertype_name))
			return false;
		
		if (offertype_logo_src == null) {
			if (other.offertype_logo_src != null)
				return false;
		} else if (!offertype_logo_src.equals(other.offertype_logo_src))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "offertype [id_offertype=" + id_offertype + ", offertype_name=" + offertype_name + ", offertype_logo_src=" + offertype_logo_src + "]";
	}




}
