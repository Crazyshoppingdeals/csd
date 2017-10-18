package com.crazysd.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SUBSCRIBE")
public class Subscribe {
/*
id_subscribe
subscribe_email
subscribed_at
subscribe_status
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_subscribe;	

	@Column(name="subscribe_email", unique=true, nullable=false)
	private String subscribe_email;
	
	@Column(name="subscribed_at", nullable=true)
	private String subscribed_at;
	
	@Column(name="subscribe_status", nullable=true)
	private int subscribe_status;
	

	public Integer getId_subscribe() {
		return id_subscribe;
	}

	public void setId_subscribe(Integer id_subscribe) {
		this.id_subscribe = id_subscribe;
	}

	public String getSubscribe_email() {
		return subscribe_email;
	}

	public void setSubscribe_email(String subscribe_email) {
		this.subscribe_email = subscribe_email;
	}

	public String getSubscribed_at() {
		return subscribed_at;
	}

	public void setSubscribed_at(String subscribed_at) {
		this.subscribed_at = subscribed_at;
	}

	public int getSubscribe_status() {
		return subscribe_status;
	}

	public void setSubscribe_status(int subscribe_status) {
		this.subscribe_status = subscribe_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_subscribe == null) ? 0 : id_subscribe.hashCode());
		result = prime * result + ((subscribe_email == null) ? 0 : subscribe_email.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Subscribe))
			return false;
		Subscribe other = (Subscribe) obj;
		
		if (id_subscribe == null) {
			if (other.id_subscribe != null)
				return false;
		} else if (!id_subscribe.equals(other.id_subscribe))
			return false;

		if (subscribe_email == null) {
			if (other.subscribe_email!= null)
				return false;
		} else if (!subscribe_email.equals(other.subscribe_email))
			return false;

		return true;
	}

	@Override
	public String toString() {
		return "website [id_subscribe=" + id_subscribe + ", subscribe_email =" + subscribe_email + ", subscribed_at =" + subscribed_at + "]";
	}


}
