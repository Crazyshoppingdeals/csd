package com.crazysd.springmvc.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.util.UriTemplate;

import com.crazysd.springmvc.model.Category;
import com.crazysd.springmvc.model.Company;
import com.crazysd.springmvc.model.MainCategory;
import com.crazysd.springmvc.model.Offers;
import com.crazysd.springmvc.model.Search;
import com.crazysd.springmvc.model.Subscribe;
import com.crazysd.springmvc.service.CategoryService;
import com.crazysd.springmvc.service.CompanyService;
import com.crazysd.springmvc.service.MainCategoryService;
import com.crazysd.springmvc.service.OffersService;
import com.crazysd.springmvc.service.SearchService;
import com.crazysd.springmvc.service.SubscribeService;

@Controller
@RequestMapping("/")
public class AppController {
	
	final int PER_PAGE=16; 
	final int SLIDER_OFFER_LIMIT=12; 
	final int SEARCH_LIMIT=6; 
	
	@Autowired
	CompanyService companyService;

	@Autowired
	CategoryService categoryService;

	@Autowired
	MainCategoryService maincategoryService;

	@Autowired
	OffersService offersService;

	@Autowired
	SearchService searchService;

	@Autowired
	SubscribeService subscribeService;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model, HttpServletRequest request) {

		List<MainCategory> maincategories = maincategoryService.findAllMainCategories();
		List<Offers[]> offerscategorywise = offersService.findAllOffersCategorywise();
		List<Offers[]> offerscompanywise = offersService.findAllOffersCompanywise();
		List<Search> searhces = searchService.findAllSearches(SEARCH_LIMIT);

		List<Offers> slideroffers = offersService.findSliderOffers(SLIDER_OFFER_LIMIT);		
		List<Object> objects = offersService.findAllOffers(0, PER_PAGE, 1);
		List<Offers> offers = (List<Offers>) objects.get(0);
		int offercount=(Integer) objects.get(1);
		System.out.println("Total Offers : "+offercount +" Showing on this page : "+offers.size());
		
		model.addAttribute("maincategories", maincategories);
		model.addAttribute("offerscategorywise", offerscategorywise);
		model.addAttribute("offerscompanywise", offerscompanywise);
		model.addAttribute("recentsearches", searhces);

		model.addAttribute("slideroffers", this.getSliderOffersDone(slideroffers, request));
		model.addAttribute("offers", offers);
		model.addAttribute("paging", this.getPagingDone("loadSortingOffers(0,1,", offercount, 1));

		model.addAttribute("newoffers", getSortingOffers("1","2","1", request));
		model.addAttribute("mostclickedoffers", getSortingOffers("2","3","1", request));
		model.addAttribute("popularoffers", getSortingOffers("3","4","1", request));

		return "mainindex";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/loadSortingOffers", method = RequestMethod.GET)
    public  @ResponseBody   String getSortingOffers(@RequestParam String div_num, @RequestParam String sort_order, @RequestParam String pagenum, HttpServletRequest request) {

		System.out.println("Ajax recieved in getSortingOffers for sortorder "+sort_order+ ", pageno "+pagenum);

		List<Object> objects = offersService.findAllOffers(Integer.parseInt(pagenum), PER_PAGE, Integer.parseInt(sort_order));
		List<Offers> offers = (List<Offers>) objects.get(0);
		int offercount=(Integer) objects.get(1);
		System.out.println("Total Offers : "+offercount +" Showing on this page : "+offers.size());
			
		StringBuffer result = new StringBuffer();

		result.append(this.getMainOffersDone(offers, request));
		result.append(this.getPagingDone("loadSortingOffers("+div_num+","+sort_order+",", offercount, Integer.parseInt(pagenum)));
	    return result.toString();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/offersByCompanyId", method = RequestMethod.GET)
    public  @ResponseBody   String getOffersByCompanyId(@RequestParam String companyid, @RequestParam String pagenum, HttpServletRequest request) {

		System.out.println("Ajax recieved in getOffersByCompanyId for compid-"+companyid+" Pageno-"+pagenum);

		List<Object> objects = offersService.findCompanyOffers(Integer.parseInt(companyid), Integer.parseInt(pagenum), PER_PAGE, 1);
		List<Offers> offers = (List<Offers>) objects.get(0);
		int offercount=(Integer) objects.get(1);
		System.out.println("Total Offers : "+offercount +" Showing on this page : "+offers.size());

		Company comp = companyService.findById(Integer.parseInt(companyid));
		
		StringBuffer result = new StringBuffer("<div class='col-xm-12 col-sm-12 col-md-12 col-lg-12' style='padding:10px 10px; margin-bottom: 15px;'>"
				+"<div class='col-xm-12 col-sm-3 col-md-3 col-lg-3'>"
				+"<img class='companylogo-seppage' src='static/images/Company_Logo/"+comp.getCompany_name()+".jpg' >"
				+"</div>"
				+"<div class='col-sm-9 col-md-9 col-lg-9' >"
				+"<h4 style='padding-left: 15px;'><b>"+comp.getCompany_name()+"</b></h4>"
				+"<h4 style='padding-left: 15px;'>"+comp.getCompany_description()+"</h4>"
				+"</div>	</div>");
		
		result.append("<h3 class='heading-point'>Showing top offers of <i><b>"+comp.getCompany_name()+"</b></i></h3>"
				+"<div id='recommended-item-carousel' class='carousel slide' data-ride='carousel'>");
		
		result.append(this.getMainOffersDone(offers, request));
		result.append(this.getPagingDone("loadOffersByCompanyId("+companyid+",", offercount, Integer.parseInt(pagenum)));
		
		result.append("</div>");
		
	    return result.toString();
	  }

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/offersByCategoryId", method = RequestMethod.GET)
    public  @ResponseBody   String getOffersByCategoryId(@RequestParam String categoryid, @RequestParam String pagenum, HttpServletRequest request) {

		System.out.println("Ajax recieved in... getOffersByCategoryId "+categoryid);

		List<Object> objects = offersService.findCategoryOffers(Integer.parseInt(categoryid), Integer.parseInt(pagenum), PER_PAGE, 1);
		List<Offers> offers = (List<Offers>) objects.get(0);
		int offercount=(Integer) objects.get(1);
		System.out.println("Total Offers : "+offercount +" Showing on this page : "+offers.size());			
		
		Category cate=categoryService.findById(Integer.parseInt(categoryid));
		
		StringBuffer result = new StringBuffer();
		result.append("<h3 class='heading-point'>Showing top offers for <i><b>"+cate.getCategory_name()+"</b></i></h3>"
				+"<div id='recommended-item-carousel' class='carousel slide' data-ride='carousel'>");

		result.append(this.getMainOffersDone(offers, request));
		result.append(this.getPagingDone("loadOffersByCategoryId("+categoryid+",", offercount, Integer.parseInt(pagenum)));

		result.append("</div>");

		return result.toString();
	  }

	@RequestMapping(value = "/getTemp", method = RequestMethod.GET)
    public  @ResponseBody void getTemp() {
		// do nothting
	}
	
	@RequestMapping(value = "/getCouponById", method = RequestMethod.GET)
    public  @ResponseBody String getCouponById(@RequestParam String offer_id, HttpServletRequest request) {
		
		int offerid=Integer.parseInt(offer_id);
		System.out.println("Ajax recieved by fetchOffersByPage...Id-"+offerid);
		Offers offer=offersService.getCouponCode(offerid);
		
		StringBuffer result = new StringBuffer();

		if((offer.getOffertype().getOffertype_name().contains("Coupon"))){
			result.append("<div class='modal-dialog'><div class='modal-content' style='padding-bottom: 10px;'>"
					+ "<button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>X</span>"
					+ "</button> <div class='modal-body'> <h3 class='heading-point' style='text-transform: none; text-align:center; "
					+ "margin-top: 0px;'>Here is your <i><b>"+offer.getCompany().getCompany_name()+"</b></i> coupon code</h3>"
					+ "<div class='show-code'><input class='coupon-code' readonly  id='url_field' type='url' value='"+offer.getCoupon_code()+"'>"
					+ "<input id='copy_btn' class='btn btn-info' type='button' value='COPY' onClick='javascript:copyCouponCode()'>"
					+ "</div> <p><a href='"+offer.getTracking_url()+"' target='_blank' title='"+offer.getCompany().getCompany_name()+"' "
					+ " rel='nofollow'> Click here to go <b>"+offer.getCompany().getCompany_name()+"</b> offer page.</a></p><div class='row coupon-details'>"
					+ "<div class='col-xm-12 col-sm-3 col-md-3 col-lg-3' align='left'> <a href='"+offer.getCompany().getCompany_name()+"' >"
					+ "<img src='static/images/Company_Logo/"+offer.getCompany().getCompany_name()+".jpg' "
					+ " alt='"+offer.getCompany().getCompany_name()+"' height='60' "
					+ " width='120' title='click to view all "+offer.getCompany().getCompany_name()+" offers'></a> </div>"
					+ "<div class='col-sm-9 col-md-9 col-lg-9' align='left'> <h4 class='coupon-details-title'>"+offer.getOffer_title()+"</h4>"
					+ "</div> <div class='col-xs-12 col-sm-12 col-md-12 col-lg-12 coupon-details-description'>"+offer.getOffer_description()+"</div>"
					+ "</div> </div> </div> ");
		}
		else{ 
			result.append("<div class='modal-dialog'><div class='modal-content' style='padding-bottom: 10px;'>"
					+ "<button type='button' class='close' data-dismiss='modal' aria-label='Close'><span aria-hidden='true'>X</span></button>"
					+ "<div class='modal-body'> <h3 class='heading-point' style='text-transform: none; text-align: center;"
					+ " margin-top: 0px;'>Your <i><b>"+offer.getCompany().getCompany_name()+"</b></i> deal is Activated</h3> "
					+ "<p>No code required. <a href='"+offer.getTracking_url()+"' target='_blank' title='"+offer.getCompany().getCompany_name()+"' "
					+ " rel='nofollow'> Click here to get this <b>"+offer.getCompany().getCompany_name()+"</b> deal</a></p> <div class='row coupon-details'>"
					+ "<div class='col-xm-12 col-sm-3 col-md-3 col-lg-3' align='left'> <a href='"+offer.getCompany().getCompany_name()+"' >"
					+ "<img src='static/images/Company_Logo/"+offer.getCompany().getCompany_name()+".jpg' "
					+ " alt='"+offer.getCompany().getCompany_name()+"' height='60' width='120' "
					+ " title='click to view all "+offer.getCompany().getCompany_name()+" offers'></a> </div> <div class='col-sm-9 col-md-9 col-lg-9' align='left'>"
					+ "<h4 class='coupon-details-title'>"+offer.getOffer_title()+"</h4>"
					+ "</div> <div class='col-xs-12 col-sm-12 col-md-12 col-lg-12 coupon-details-description'>"
					+ offer.getOffer_description()+"</div> </div> </div> </div> ");
		}
		
		return result.toString();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/fetchSearchOffers", method = RequestMethod.GET)
    public  @ResponseBody String fetchSearchOffers(@RequestParam String search, @RequestParam String pagenum, ModelMap model, HttpServletRequest request) {
		int pageno=Integer.parseInt(pagenum);

		System.out.println("Ajax recieved by fetchSearchOffers... Text-"+search);
		search=search.trim();
		
		List<Object> objects = offersService.getSearchOffers(search, pageno, PER_PAGE, 1);
		List<Offers> offers = (List<Offers>) objects.get(0);
		int offercount=(Integer) objects.get(1);
		System.out.println("Total Offers : "+offercount +" Showing on this page : "+offers.size());

		StringBuffer result=new StringBuffer();
		if(offercount==0){
			List<Offers> slideroffers = offersService.findSliderOffers(SLIDER_OFFER_LIMIT);
			result.append("<h3 class='heading-point'>Showing search results for <i><b>"+search+"</b></i></h3> <div align='center' >"
					+ "<img style='margin:15px 0px;' title='Empty Bag' src='static/images/EmptyBag.png'>"
					+ "<h4>Ayyayyo... looks like no offers matching with your search!</h4>"
					+ "<h4>Please try searching again or refresh page.</h4></div>"
					+ "<h3 style='margin-top:20px' class='heading-point'>Recommended offers for you</h3>"
					+ this.getMainOffersDone(slideroffers, request));
		}
		else{
			result.append("<h3 class='heading-point'>Showing search results for <i><b>"+search+"</b></i></h3>"
					+"<div id='recommended-item-carousel' class='carousel slide' data-ride='carousel'>");

			result.append(this.getMainOffersDone(offers, request));
			result.append(this.getPagingDone("getSearchOffersBtn(", offercount, pageno));

			result.append("</div>");
		}	
		searchService.findSearch(search);
		
		return result.toString();
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/{company}")
	 public String getOffersCompanywise(@PathVariable("company") String company, HttpServletRequest request, ModelMap model) {
	 String restOfTheUrl = (String) request.getAttribute(
	     HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
	     /*We can use UriTemplate to map the restOfTheUrl*/
	     UriTemplate template = new UriTemplate("/company}");   
	     
	     //Variable restOfTheUrl returns "/Company name" to remove "/"
	     String val = restOfTheUrl.replaceAll("/", "");
	     
	     boolean isTemplateMatched = template.matches(restOfTheUrl);
	     if(isTemplateMatched) {
	         Map<String, String> matchTemplate = new HashMap<String, String>();
	         matchTemplate = template.match(restOfTheUrl);
	         String value = matchTemplate.get("company");
	         System.out.println(value);
	     }

	     Company comp = companyService.getCompanyDetails(val);

	     if(comp!=null){
	    	 int pageno=1;
			List<Object> objects = offersService.findCompanyOffers(comp.getId_company(), pageno, PER_PAGE, 1);
			List<Offers> offers = (List<Offers>) objects.get(0);
			int offercount=(Integer) objects.get(1);
			System.out.println("Total Offers : "+offercount +" Showing on this page : "+offers.size());

			model.addAttribute("offers", offers);
			model.addAttribute("paging", this.getPagingDone("loadOffersByCompanyId("+comp.getId_company()+",", offercount, 1));		
	     }	     
	      
			List<MainCategory> maincategories = maincategoryService.findAllMainCategories();
		    List<Company> companies = companyService.findAllCompanies();
	        List<Offers[]> offerstypewise = offersService.findAllOffersTypewise();
	        List<Offers[]> offerscompanywise = offersService.findAllOffersCompanywise();
			List<Offers[]> offerscategorywise = offersService.findAllOffersCategorywise();
			List<Search> searhces = searchService.findAllSearches(SEARCH_LIMIT);

			model.addAttribute("maincategories", maincategories);
			model.addAttribute("company", comp);
			model.addAttribute("companies", companies);
			model.addAttribute("offerstypewise", offerstypewise);
			model.addAttribute("offerscompanywise", offerscompanywise);
			model.addAttribute("offerscategorywise", offerscategorywise);
			model.addAttribute("recentsearches", searhces);
			
	     return "showoffers";   
	 }
	 

	 @RequestMapping(value = "/companiesBySearch", method = RequestMethod.GET)
	    public  @ResponseBody   String getCompaniesBySearch(@RequestParam String search) {

		List<Offers[]> offerscompanywise = offersService.findAllOffersCompanywise();
		System.out.println(offerscompanywise);
		StringBuffer result = new StringBuffer();
		
			int flag=0;
			
			for(Object companyoffers[]:offerscompanywise){
				if(((Company)companyoffers[0]).getCompany_name().toUpperCase().startsWith(search.toUpperCase())){
					
					result.append("<a href='javascript:loadOffersByCompanyId("+((Company)companyoffers[0]).getId_company()+",1)'"
							+"class='list-group-item' title='view "+((Company)companyoffers[0]).getCompany_name()+" offers'"
							+"style='font-size: 16px; color: #313131; text-align: left;'> "
							+ "<span class='glyphicon glyphicon-hand-right'></span> "
							+((Company)companyoffers[0]).getCompany_name()+" <span class='badge'>"+companyoffers[1]+"</span>"
							+"</a>");
					flag++;
				}
			}
			
			for(Object companyoffers[]:offerscompanywise){
				if(!((Company)companyoffers[0]).getCompany_name().toUpperCase().startsWith(search.toUpperCase()) 
						&& ((Company)companyoffers[0]).getCompany_name().toUpperCase().contains(search.toUpperCase())){
					
					result.append("<a href='javascript:loadOffersByCompanyId("+((Company)companyoffers[0]).getId_company()+",1)'"
							+"class='list-group-item' title='view "+((Company)companyoffers[0]).getCompany_name()+" offers'"
							+"style='font-size: 16px; color: #313131; text-align: left;'> "
							+ "<span class='glyphicon glyphicon-hand-right'></span> "
							+((Company)companyoffers[0]).getCompany_name()+" <span class='badge'>"+companyoffers[1]+"</span>"
							+"</a>");
					flag++;
				}
			}
			
			if(flag==0){
				result.append("<a class='list-group-item' title='search not found'"
						+ "style='font-size: 15px; color: menutext; text-align: left;'>"
						+ "Match not found. Try again </a>");
			}

	    return result.toString();
	  }
	 
	 @RequestMapping(value = "/categoriesBySearch", method = RequestMethod.GET)
	    public  @ResponseBody   String getCategoriesBySearch(@RequestParam String search) {

		List<Offers[]> offerscategorywise = offersService.findAllOffersCategorywise();
		System.out.println(offerscategorywise);
		StringBuffer result = new StringBuffer();
			
			int flag=0;
			
			for(Object categoryoffers[]:offerscategorywise){
				if(((Category)categoryoffers[0]).getCategory_name().toUpperCase().startsWith(search.toUpperCase())){
					
					result.append("<a href='javascript:loadOffersByCategoryId("+((Category)categoryoffers[0]).getId_category()+",1)'"
							+"class='list-group-item' title='view "+((Category)categoryoffers[0]).getCategory_name()+" offers'"
							+"style='font-size: 15px; color: menutext; text-align: left;'> <span class='glyphicon glyphicon-share'></span> "
							+((Category)categoryoffers[0]).getCategory_name()+" <span class='badge'>"+categoryoffers[1]+"</span>"
							+"</a>");
					flag++;
				}
			}		

			for(Object categoryoffers[]:offerscategorywise){
				if(!((Category)categoryoffers[0]).getCategory_name().toUpperCase().startsWith(search.toUpperCase())
						&& ((Category)categoryoffers[0]).getCategory_name().toUpperCase().contains(search.toUpperCase())){
					
					result.append("<a href='javascript:loadOffersByCategoryId("+((Category)categoryoffers[0]).getId_category()+",1)'"
							+"class='list-group-item' title='view "+((Category)categoryoffers[0]).getCategory_name()+" offers'"
							+"style='font-size: 15px; color: menutext; text-align: left;'> <span class='glyphicon glyphicon-share'></span> "
							+((Category)categoryoffers[0]).getCategory_name()+" <span class='badge'>"+categoryoffers[1]+"</span>"
							+"</a>");
					flag++;
				}
			}		

			if(flag==0){
				result.append("<a class='list-group-item' title='search not found'"
						+ "style='font-size: 15px; color: menutext; text-align: left;'>"
						+ "Match not found. Try again </a>");
			}

	    return result.toString();
	  }

	 public String getMainOffersDone(List<Offers> offers, HttpServletRequest request){
		 
		 StringBuffer result=new StringBuffer();
		 
			for(Offers offer:offers)
			{
				result.append("<div class='col-sm-6 col-md-4 col-lg-3 newofferbox'>");
				
				if((offer.getOffertype().getOffertype_name().contains("Coupon")))
					result.append("<div class='text-center mainpage-offer-box sepOffer'>");
				else 
					result.append("<div class='text-center mainpage-offer-box sepDeal'>");

				Date dNow = new Date( );
				
				SimpleDateFormat sdt = new SimpleDateFormat("yyyyMMdd");
				sdt.setTimeZone(TimeZone.getTimeZone("IST"));
				String today_dt = sdt.format(dNow);
				String temp = offer.getCreated_date();
				String create_date = temp.substring(0, 8);
				
				Calendar cc=Calendar.getInstance();
				cc.set(Calendar.HOUR, -24);
				String yesterday_dt = sdt.format(cc.getTime());
				cc.set(Calendar.HOUR, -24);
				String b4yesterday_dt = sdt.format(cc.getTime());
			
				if (today_dt.matches(create_date) || yesterday_dt.matches(create_date) || b4yesterday_dt.matches(create_date)) {
					result.append("<div class='ribbon-wrapper'><div class='ribbon new'>New</div></div>");
				}

				result.append("<center>" 
						+"<h4 class='offer-off-title'>"+((offer.getSmall_title().length()>=15)?offer.getSmall_title().substring(0, 15):offer.getSmall_title())+"</h4>"
						+"<a href='javascript:loadOffersByCompanyId("+offer.getCompany().getId_company()+",1)' "
						+"title='view all offers of "+offer.getCompany().getCompany_name()+"'> "
						+"<img class='companylogo-box' alt='"+offer.getCompany().getCompany_name()+"' "
							+"src='static/images/Company_Logo/"+offer.getCompany().getCompany_name()+".jpg' "
							+"height='30' width='110'>"
						+"</a>"
						+"<h5 style='height: 55px; text-transform:capitalize;'><b>"+((offer.getOffer_title().length()>=80)?offer.getOffer_title().substring(0, 80):offer.getOffer_title())+"</b></h5>"

						+"<div style='width: 100%; height: 35px;' >");
				
				URI requestUri =null, contextUri = null;
				try {
					requestUri = new URI(request.getRequestURL().toString());
					contextUri = new URI(requestUri.getScheme(), 
					        requestUri.getAuthority(), 
					        request.getContextPath(), 
					        null, 
					        null);
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				
				if((offer.getOffertype().getOffertype_name().contains("Coupon"))){
					result.append("<a href='"+offer.getTracking_url()+"' class='btn-coupon' title='click to get Coupon Code for this offer' "
//							+"onclick='javascript:getCouponCode("+offer.getId_offers()+");' "
							+"onclick='javascript:window.open(&#39;"+contextUri.getPath()+"?getCouponCode("+offer.getId_offers()+")&#39;,&#39;_blank&#39;);'"
							+"> <span class='go-smooth'>Show Code</span>"
							+"<small>"+offer.getCoupon_code()+"</small>"
							+"</a>");
				}
				else {
					result.append("<a href='"+offer.getTracking_url()+"' class='btn-coupon' title='click to get this Deal' "
//							+"onclick='javascript:getCouponCode("+offer.getId_offers()+");' "
							+"onclick='javascript:window.open(&#39;"+contextUri.getPath()+"?getCouponCode("+offer.getId_offers()+")&#39;,&#39;_blank&#39;);'"
							+"> <big>Activate Deal</big></a>");
				}
				
				result.append("</div>"
						+"<div style='width: 100%; border-top: #09F thin solid; margin-top: 10px; padding-top: 5px; '>");

				
				SimpleDateFormat ft = new SimpleDateFormat ("MMM dd, yyyy");
				String today_date=ft.format(dNow);

				   if(today_date.matches(offer.getExpiry_date())){
					   Calendar calendar = Calendar.getInstance();
					   calendar.add(Calendar.DATE, 1);
					   calendar.set(Calendar.HOUR, 0);
					   calendar.set(Calendar.MINUTE, 00);
					   calendar.set(Calendar.AM_PM, Calendar.AM);

					   long diff = calendar.getTime().getTime() - dNow.getTime();//as given
					   
					   long minutes = diff / (60 * 1000); 
					   		minutes=(minutes>=60)?minutes%60:minutes;
					   long hours = diff / (60 * 60 * 1000);
					   if(hours==0)
						   result.append("<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "+minutes+" Mins </span>");
					   else
						   result.append("<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "+hours+" Hrs "+minutes+" Mins </span>");
				   }
				   else
					   result.append("<span class='glyphicon glyphicon-bell'></span> Expires on "+offer.getExpiry_date());

			   result.append("</div>"
			   		+ "</center>"
			   		+ "</div>"
			   		+ "</div>");

			}
			return result.toString();
	 }


	 public String getSliderOffersDone(List<Offers> offers, HttpServletRequest request){
		 
		 StringBuffer result=new StringBuffer();
		 result.append("<div class='jcarousel-wrapper'> <div class='jcarousel'> <ul>");

			for(Offers offer:offers)
			{				
				if((offer.getOffertype().getOffertype_name().contains("Coupon")))
					result.append("<li> <div class='text-center mainpage-offer-box sepOffer'>");
				else 
					result.append("<li> <div class='text-center mainpage-offer-box sepDeal'>");

				Date dNow = new Date( );
				
				SimpleDateFormat sdt = new SimpleDateFormat("yyyyMMdd");
				sdt.setTimeZone(TimeZone.getTimeZone("IST"));
				String today_dt = sdt.format(dNow);
				String temp = offer.getCreated_date();
				String create_date = temp.substring(0, 8);
				
				Calendar cc=Calendar.getInstance();
				cc.set(Calendar.HOUR, -24);
				String yesterday_dt = sdt.format(cc.getTime());
				cc.set(Calendar.HOUR, -24);
				String b4yesterday_dt = sdt.format(cc.getTime());
			
				if (today_dt.matches(create_date) || yesterday_dt.matches(create_date) || b4yesterday_dt.matches(create_date)) {
					result.append("<div class='ribbon-wrapper'><div class='ribbon new'>New</div></div>");
				}

				result.append("<center>" 
						+"<h4 class='offer-off-title'>"+((offer.getSmall_title().length()>=15)?offer.getSmall_title().substring(0, 15):offer.getSmall_title())+"</h4>"
						+"<a href='javascript:loadOffersByCompanyId("+offer.getCompany().getId_company()+",1)' "
						+"title='view all offers of "+offer.getCompany().getCompany_name()+"'> "
						+"<img class='companylogo-box' alt='"+offer.getCompany().getCompany_name()+"' "
							+"src='static/images/Company_Logo/"+offer.getCompany().getCompany_name()+".jpg' "
							+"height='30' width='110'>"
						+"</a>"
						+"<h5 style='height: 55px; text-transform:capitalize;'><b>"+((offer.getOffer_title().length()>=80)?offer.getOffer_title().substring(0, 80):offer.getOffer_title())+"</b></h5>"

						+"<div style='width: 100%; height: 35px;' >");
				
				URI requestUri =null, contextUri = null;
				try {
					requestUri = new URI(request.getRequestURL().toString());
					contextUri = new URI(requestUri.getScheme(), 
					        requestUri.getAuthority(), 
					        request.getContextPath(), 
					        null, 
					        null);
				} catch (URISyntaxException e) {
					e.printStackTrace();
				}
				
				if((offer.getOffertype().getOffertype_name().contains("Coupon"))){
					result.append("<a href='"+offer.getTracking_url()+"' class='btn-coupon' title='click to get Coupon Code for this offer' "
//							+"onclick='javascript:getCouponCode("+offer.getId_offers()+");' "
							+"onclick='javascript:window.open(&#39;"+contextUri.getPath()+"?getCouponCode("+offer.getId_offers()+")&#39;,&#39;_blank&#39;);'"
							+"> <span class='go-smooth'>Show Code</span>"
							+"<small>"+offer.getCoupon_code()+"</small>"
							+"</a>");
				}
				else {
					result.append("<a href='"+offer.getTracking_url()+"' class='btn-coupon' title='click to get this Deal' "
//							+"onclick='javascript:getCouponCode("+offer.getId_offers()+");' "
							+"onclick='javascript:window.open(&#39;"+contextUri.getPath()+"?getCouponCode("+offer.getId_offers()+")&#39;,&#39;_blank&#39;);'"
							+"> <big>Activate Deal</big></a>");
				}
				
				result.append("</div>"
						+"<div style='width: 100%; border-top: #09F thin solid; margin-top: 10px; padding-top: 5px; '>");

				
				SimpleDateFormat ft = new SimpleDateFormat ("MMM dd, yyyy");
				String today_date=ft.format(dNow);

				   if(today_date.matches(offer.getExpiry_date())){
					   Calendar calendar = Calendar.getInstance();
					   calendar.add(Calendar.DATE, 1);
					   calendar.set(Calendar.HOUR, 0);
					   calendar.set(Calendar.MINUTE, 00);
					   calendar.set(Calendar.AM_PM, Calendar.AM);

					   long diff = calendar.getTime().getTime() - dNow.getTime();//as given
					   
					   long minutes = diff / (60 * 1000); 
					   		minutes=(minutes>=60)?minutes%60:minutes;
					   long hours = diff / (60 * 60 * 1000);
					   if(hours==0)
						   result.append("<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "+minutes+" Mins </span>");
					   else
						   result.append("<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "+hours+" Hrs "+minutes+" Mins </span>");
				   }
				   else
					   result.append("<span class='glyphicon glyphicon-bell'></span> Expires on "+offer.getExpiry_date());

			   result.append("</div>"
			   		+ "</center>"
			   		+ "</div> </li>");
			}
			
			result.append("</ul> </div> "
					+ "<a href='#' class='jcarousel-control-prev'>&lsaquo;</a> "
					+ "<a href='#' class='jcarousel-control-next'>&rsaquo;</a> "
					+ "</div>");
			return result.toString();
	 }
	 
	 public String getPagingDone(String jsfunname, int totaloffers, int currpage){
		 
		 if(totaloffers<=PER_PAGE){
			 return "";
		 }
		 else{
		 
		 StringBuffer result=new StringBuffer();
		 
			result.append("<div class='col-xs-12 col-sm-12 col-md-12 col-lg-12' style='margin-top:20px'>"
					+"<div class='col-xs-12 col-sm-12 col-md-8 col-md-offset-2 col-lg-8 col-lg-offset-2'> <ul class='pager' style='margin-top:5px;'>");
			
			if(currpage<2)
				result.append("<li class='previous' style='display:none;'><a href='javascript:"+jsfunname+"0)'>&larr; Previous</a></li>");
			else
				result.append("<li class='previous'><a href='javascript:"+jsfunname+(currpage-1)+")'>&larr; Previous</a></li>");
			
			double offerscount=(double)totaloffers;
			
			int start=(currpage<=3)?1:currpage-2;
			int end=start+4;
			int lastpageno = (int) Math.ceil(offerscount/PER_PAGE);
			System.out.println("lastpageno "+lastpageno);
			System.out.println("ceil "+Math.ceil(offerscount/PER_PAGE));
			
			if(end>lastpageno)
				end=lastpageno;
			
//			String tip=currpage+"Showing "+(PER_PAGE*currpage)+"-"+((PER_PAGE*currpage)+PER_PAGE)+" offers out of "+totaloffers;

			for(int i=start; i<=end; i++){
				if(currpage==i)
					result.append("<li class='active'><a>"+i+"</a></li>");
				else
					result.append("<li><a href='javascript:"+jsfunname+i+")'>"+i+"</a></li>");
			}
			if(currpage==end)
				result.append("<li class='next' style='display:none;'><a href='javascript:"+jsfunname+(currpage+1)+")'>Next &rarr;</a></li>");
			else
				result.append("<li class='next'><a href='javascript:"+jsfunname+(currpage+1)+")'>Next &rarr;</a></li>");
	
			result.append("</ul> </div> </div>");
			
			return result.toString();
		 }
		}	

	@RequestMapping(value = "/subscribeMe", method = RequestMethod.GET)
	public  @ResponseBody   String subscribeMe(@RequestParam String email) {
		 System.out.println("Inside subscribeMe function for email:"+email);

		 String result=""; 
		 Subscribe subscriber=subscribeService.getSubscriber(email);
		 if (subscriber==null) {
			 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
				
			Subscribe new_subscriber=new Subscribe();
			new_subscriber.setSubscribe_email(email);
			new_subscriber.setSubscribed_at(dateFormat.format(date));		//2013/10/15 16:16:39
			new_subscriber.setSubscribe_status(1);
			subscribeService.save(new_subscriber);
			result="Thanks for subscribing CrazyShoppingDeals..";	// new subscription
		 }
		 else
			 result="You are already subscribed to us.";	// email present in db
		 System.out.println(result);
		return result;
	 }	 

	/**
	 * This method will be called on form submission, handling POST request for
	 * saving user in database. It also validates the user input
	@RequestMapping(value = { "/newuser" }, method = RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}

		/*
		 * Preferred way to achieve uniqueness of field [sso] should be implementing custom @Unique annotation 
		 * and applying it on field [sso] of Model class [User].
		 * 
		 * Below mentioned peace of code [if block] is to demonstrate that you can fill custom errors outside the validation
		 * framework as well while still using internationalized messages.
		 * 
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}
		
		userService.saveUser(user);

		model.addAttribute("success", "User " + user.getFirstName() + " "+ user.getLastName() + " registered successfully");
		//return "success";
		return "registrationsuccess";
	}


	/**
	 * This method will be called on form submission, handling POST request for
	 * updating user in database. It also validates the user input
	@RequestMapping(value = { "/edit-user-{ssoId}" }, method = RequestMethod.POST)
	public String updateUser(@Valid User user, BindingResult result,
			ModelMap model, @PathVariable String ssoId) {

		if (result.hasErrors()) {
			return "registration";
		}

		/*Uncomment below 'if block' if you WANT TO ALLOW UPDATING SSO_ID in UI which is a unique key to a User.
		if(!userService.isUserSSOUnique(user.getId(), user.getSsoId())){
			FieldError ssoError =new FieldError("user","ssoId",messageSource.getMessage("non.unique.ssoId", new String[]{user.getSsoId()}, Locale.getDefault()));
		    result.addError(ssoError);
			return "registration";
		}

		userService.updateUser(user);

		model.addAttribute("success", "User " + user.getFirstName() + " "+ user.getLastName() + " updated successfully");
		return "registrationsuccess";
	}

	
	/**
	 * This method will delete an user by it's SSOID value.
	 
	@RequestMapping(value = { "/delete-user-{ssoId}" }, method = RequestMethod.GET)
	public String deleteUser(@PathVariable String ssoId) {
		userService.deleteUserBySSO(ssoId);
		return "redirect:/list";
	}
	
*/
}
