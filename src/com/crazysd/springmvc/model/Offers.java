package com.crazysd.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OFFERS")
public class Offers {

/*
	id_offers,
	small_title,
	offer_title,
	offer_description,
	coupon_code,
	created_date,
	start_date,
	expiry_date,
	click_count,
	tracking_url,
	id_offertype,
	id_company,
	id_category,
	id_vendor,
	offers_status
*/
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_offers", unique=true, updatable=false, nullable=false)
	private Integer id_offers;	

	@Column(name="small_title", nullable=true)
	private String small_title;
	
	@Column(name="offer_title", nullable=false)
	private String offer_title;

	@Column(name="offer_description", nullable=true)
	private String offer_description;
	
	@Column(name="coupon_code", nullable=true)
	private String coupon_code;
	

	@Column(name="created_date", nullable=true)
	private String created_date;
	
	@Column(name="start_date", nullable=true)
	private String start_date;
	

	@Column(name="expiry_date", nullable=true)
	private String expiry_date;
	
	@Column(name="click_count", nullable=false)
	private int click_count;
	
	@Column(name="tracking_url", nullable=true)
	private String tracking_url;
			
	@Column(name="offers_status", nullable=false)
	private int offers_status;

	

	public Integer getId_offers() {
		return id_offers;
	}

	public void setId_offers(Integer id_offers) {
		this.id_offers = id_offers;
	}

	public String getSmall_title() {
		return small_title;
	}

	public void setSmall_title(String small_title) {
		this.small_title = small_title;
	}

	public String getOffer_title() {
		return offer_title;
	}

	public void setOffer_title(String offer_title) {
		this.offer_title = offer_title;
	}

	public String getOffer_description() {
		return offer_description;
	}

	public void setOffer_description(String offer_description) {
		this.offer_description = offer_description;
	}

	public String getCoupon_code() {
		return coupon_code;
	}

	public void setCoupon_code(String coupon_code) {
		this.coupon_code = coupon_code;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}

	public int getClick_count() {
		return click_count;
	}

	public void setClick_count(int click_count) {
		this.click_count = click_count;
	}

	public String getTracking_url() {
		return tracking_url;
	}

	public void setTracking_url(String tracking_url) {
		this.tracking_url = tracking_url;
	}

	public int getOffers_status() {
		return offers_status;
	}

	public void setOffers_status(int offers_status) {
		this.offers_status = offers_status;
	}

	
	@ManyToOne
    @JoinColumn(name="id_offertype")
    private Offertype offertype;
	 
	 public Offertype getOffertype() {
		return offertype;
	}

	public void setOffertype(Offertype offertype) {
		this.offertype = offertype;
	}

	
	@ManyToOne
    @JoinColumn(name="id_company")
    private Company company;
	 
	 public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
	@ManyToOne
    @JoinColumn(name="id_category")
    private Category category;
	 
	 public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	/*	 
	private Set<Offertype> offertype = new HashSet<Offertype>(0);
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "OFFERS")
	public Set<Offertype> getOffertype() {
		return offertype;
	}

	public void setOffertype(Set<Offertype> offertype) {
		this.offertype = offertype;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "OFFERS")

	
	
//	@JoinTable(name="EMPLOYEE_ACCCOUNT", joinColumns = @JoinColumn(name="EMPLOYEE_ID"),
//	inverseJoinColumns = @JoinColumn(name="ACCOUNT_ID"))
/*	
	@NotEmpty
	@ManyToOne(fetch = FetchType.LAZY)
//	@OneToMany(mappedBy="OFFERS", cascade=CascadeType.ALL)
	@JoinTable(name = "OFFERTYPE", joinColumns = @JoinColumn(name = "id_offertype"))
	private Offertype offertype;
	
	public Offertype getOffertype() {
		return offertype;
	}

	public void setOffertype(Offertype offertype) {
		this.offertype = offertype;
	}
/*
	//	@NotEmpty
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "COMPANY", 
             joinColumns = { @JoinColumn(name = "id_company") })
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "CATEGORY", 
             joinColumns = { @JoinColumn(name = "id_category") })
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinTable(name = "VENDOR", 
             joinColumns = { @JoinColumn(name = "id_vendor") })
	private Vendor vendor;

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}	
*/	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_offers == null) ? 0 : id_offers.hashCode());
		result = prime * result + ((small_title == null) ? 0 : small_title.hashCode());
		result = prime * result + ((offer_title == null) ? 0 : offer_title.hashCode());
		result = prime * result + ((offer_description == null) ? 0 : offer_description.hashCode());
		result = prime * result + ((coupon_code == null) ? 0 : coupon_code.hashCode());
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
		result = prime * result + ((expiry_date == null) ? 0 : expiry_date.hashCode());
//		result = prime * result + ((click_count == null) ? 0 : click_count.hashCode());
		result = prime * result + ((tracking_url == null) ? 0 : tracking_url.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Offers))
			return false;
		Offers other = (Offers) obj;
		
		if (id_offers == null) {
			if (other.id_offers != null)
				return false;
		} else if (!id_offers.equals(other.id_offers))
			return false;

		if (offer_title == null) {
			if (other.offer_title != null)
				return false;
		} else if (!offer_title.equals(other.offer_title))
			return false;
		
		if (offer_description == null) {
			if (other.offer_description != null)
				return false;
		} else if (!offer_description.equals(other.offer_description))
			return false;
				
		
		return true;
	}

	@Override
	public String toString() {
		return "Company [id_offers=" + id_offers + ", offer_title=" + offer_title + ", offer_description=" + offer_description + "]";
	}




}
