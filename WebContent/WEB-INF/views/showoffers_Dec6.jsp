<%@page import="org.apache.taglibs.standard.tag.common.xml.ForEachTag"%>
<%@ page import="java.io.*,java.util.*,java.util.concurrent.TimeUnit"%>
<%@ page import="javax.servlet.*,java.text.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Crazy Shopping Deals - Coupons, Deals &amp; Offers</title>

	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="author" content="Bharat Shelke, Saudagar Narayankar">
	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <meta name="keywords" content="coupons, coupon codes, deal, offer, top offers, today offers, online shopping, free shopping, discount, paytm, amazon, flipkart, snapdeal, crazy, shopping, deals, crazy shopping deals, recharge, off, india coupons, promotion codes, coupon codes, coupons, coupons, deals, offers, online shopping, online shop, online clothes shopping, online shopping for women, online shopping clothes, online shopping fashion, fashion online shop, fashion online shopping, online shopping deals, women online shopping, online shop fashion, online women shopping, shopping, discounts, flipkart, paytm, amazon, ebay, crazy shopping deals, crazy, online shopping sites, deal, coupon, deal of the day, daily deals, best deals, daily deal, coupon codes, discount coupons, online deals, coupon deals, bargains, great deals, today offers" />
    <meta name="description" content="We provides latest coupons, deals and offers information of all top brands in India, Visit us to stay updated and enjoy discounts on online shopping. Happy Online Shopping!!!" />

    <meta property="og:locale" content="en_US" />
    <meta property="og:type" content="Website" />
    <meta property="og:site_name" content="CrazyShoppingDeals" />
    <meta property="og:url" content="http://www.crazyshoppingdeals.in/" />
    <meta property="og:image" content="http://www.crazyshoppingdeals.in/static/images/Crazy%20Shopping%20Deals%20Logo.png" />
    <meta property="og:title" content="CrazyShoppingDeals - Coupons, Deals & Offers" />
    <meta property="og:description" content="We provides latest coupons, deals and offers information of all top brands in India, Visit us to stay updated and enjoy discounts on online shopping. Happy Online Shopping!!!" />
    <meta property="og:keywords" content=
    "coupons, coupon codes, deal, offer, top offers, today offers, online shopping, free shopping, discount, paytm, amazon, flipkart, snapdeal, crazy, shopping, deals, crazy shopping deals, recharge, off, india coupons, promotion codes, coupon codes, coupons, coupon codes, india coupon codes, online shopping coupons, coupons, deals, offers, online shopping, online shop, online clothes shopping, online shopping for women, online shopping clothes, online shopping fashion, fashion online shop, fashion online shopping, online shopping deals, women online shopping, online shop fashion, online women shopping, shopping, discounts, flipkart, paytm, amazon, ebay, crazy shopping deals, crazy, online shopping sites, deal, coupon, deal of the day, daily deals, best deals, daily deal, coupon codes, discount coupons, online deals, coupon deals, bargains, great deals" />

    <meta name="mobile-web-app-capable" content="yes" />
    <meta name="apple-mobile-web-app-capable" content="yes" />

    <meta name="viewport" id="viewport" content=
    "width=device-width,minimum-scale=1.0,maximum-scale=1.0,initial-scale=1.0,user-scalable=no" />

    <meta name="twitter:site" content="@CrazyShoppingDeals" />
    <meta name="twitter:creator" content="@CrazyShoppingDeals" />
    <meta name="geo.placename" content="Pune, Hyderabad, Delhi, Mumbai, Chennai, India" />
    <meta name="geo.position" content="17.4411480;78.3910690" />
    <meta name="geo.region" content="IN-Maharashtra" />

    <meta name="revisit-after" content="daily" />
    <meta name="robots" content="noodp,noydir" />

    <link rel="canonical" href="http://www.crazyshoppingdeals.in/">

	<link href="images/LoadingImages/CrazySD_Icon.png" rel="icon">

	<link href="<c:url value='/static/images/CrazySD_Icon.png' />" rel="icon" />
	<link href="<c:url value='/static/css/bootstrap.min.css' />" rel="stylesheet" />


	<link href="<c:url value='/static/css/Style.css' />" rel="stylesheet" />
	<link href="<c:url value='/static/css/Slider.css' />" rel="stylesheet" />


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- Go to www.addthis.com/dashboard to customize your tools -->
<script type="text/javascript" src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-55bb426dc337d634" async="async"></script>
</head>
<!-- The #page-top ID is part of the scrolling feature - the data-spy and data-target are part of the built-in Bootstrap scrollspy function -->
<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top" >
	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation"
		style="background-color:#313131;"">
	<div class="container">
		<div class="navbar-header page-scroll" style="float: left;">
			<a href="http://crazyshoppingdeals.in" class="logo"> 
			<img src="<c:url value='/static/images/Crazy Shopping Deals Logo.png' />"
				alt="Crazy Shopping Deals" title="CrazyShoppingDeals.in">
			</a>
		</div>
		<div>
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
		</div>

		<!-- Top Menu -->
		<div
			class="collapse navbar-collapse navbar-ex1-collapse navbar-header"
			id="bs-example-navbar-collapse-1 " style="float: right">

			<div class="top-searchbar">
				<div class="input-group ">
					<div class="input-group-btn search-panel dropdown mega-dropdown">
						<button type="button" title="Crazy Shopping Deals Brands Store"
							style="height: 40px; padding-left: 50px; padding-right: 50px"
							class="btn btn-default dropdown-toggle dropdown-toggle topmenu"
							data-toggle="dropdown">
							<span id="search_concept"
								style="font-weight: bold; font-size: 17px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif">
								STORE </span> <span class="glyphicon glyphicon-menu-hamburger"></span>
						</button>

						<ul class="dropdown-menu mega-dropdown-menu">

							<li class="col-sm-3">
								<ul>
									<li class="dropdown-header"></li>
									<li><a href="American Swan">American Swan</a></li>
									<li><a href="Askmebazaar">Askmebazaar</a></li>
									<li><a href="BabyOye">BabyOye</a></li>

									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="Basics Life">Basics Life</a></li>
									<li><a href="Dailyobjects">Dailyobjects</a></li>
									<li><a href="DogSpot">DogSpot</a></li>

									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="McDonalds">McDonalds</a></li>
									<li><a href="PayTM">PayTM</a></li>
									<li><a href="Pepperfry">Pepperfry</a></li>
									<li><a href="Voxpop">Voxpop</a></li>

								</ul>
							</li>

							<li class="col-sm-3">
								<ul>
									<li class="dropdown-header"></li>
									<li><a href="Dominos">Dominos</a></li>
									<li><a href="Ebay">Ebay</a></li>
									<li><a href="Expedia">Expedia</a></li>
									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="Fabfurnish">Fabfurnish</a></li>
									<li><a href="Fashion Equation">Fashion Equation</a></li>
									<li><a href="Fashionara">Fashionara</a></li>
									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="Pizza Hut India">Pizza Hut India</a></li>
									<li><a href="Printland">Printland</a></li>
									<li><a href="PrintVenue">PrintVenue</a></li>
									<li><a href="Voxpopclothing">Voxpopclothing</a></li>
								</ul>
							</li>

							<li class="col-sm-3">
								<ul>
									<li class="dropdown-header"></li>
									<li><a href="FirstCry">FirstCry</a></li>
									<li><a href="Flipkart">Flipkart</a></li>
									<li><a href="FoodPanda">FoodPanda</a></li>
									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="Giftease">Giftease</a></li>
									<li><a href="High5Store">High5Store</a></li>
									<li><a href="Hopscotch">Hopscotch</a></li>
									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="Purplle">Purplle</a></li>
									<li><a href="Shop Nineteen">Shop Nineteen</a></li>
									<li><a href="Shopclues">Shopclues</a></li>
									<li><a href="Yepme">Yepme</a></li>
								</ul>
							</li>

							<li class="col-sm-3">
								<ul>
									<li class="dropdown-header"></li>
									<li><a href="Indiatimes Shopping">Indiatimes Shopping</a></li>
									<li><a href="Jabong">Jabong</a></li>
									<li><a href="KFC">KFC</a></li>

									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="KFC Online">KFC Online</a></li>
									<li><a href="Koovs">Koovs</a></li>
									<li><a href="Limeroad">Limeroad</a></li>

									<li class="divider"></li>
									<li class="dropdown-header"></li>
									<li><a href="Snapdeal">Snapdeal</a></li>
									<li><a href="Trendin">Trendin</a></li>
									<li><a href="VistaPrint">VistaPrint</a></li>
									<li><a href="Zivame">Zivame</a></li>

								</ul>
							</li>
						</ul>
					</div>
					<input type="text" class="form-control" name="SearchBox" title="Search company, category, etc"
						id="SearchBox" placeholder="Search company, category, etc"
						style="height: 40px;"
						onkeypress="javascript:getSearchOffers(event, 1)"> 
						<span class="input-group-btn">
						<button onclick="javascript:getSearchOffersBtn(1)" title="click to get Search results"
							class="btn btn-default headerSearchButton" type="button"
							style="height: 40px; padding-left: 25px; padding-right: 25px; background-color: #09A5E8; color: #FFF; font-weight: bold; font-size: 17px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif">Search</button>
					</span>
				</div>
			</div>



		</div>
	</div>
	</nav>
	<!-- Intro Section -->


	<section id="projects" class="padding-top" >
 
	<div class="container" style="margin-top: 100px;">
		<ul class="nav nav-tabs" role="tablist">
			<li class="active"><a href="#topbrands" role="tab" data-toggle="tab" title="Top Brands"> 
					<span class="glyphicon glyphicon-thumbs-up"></span> Top Brands
			</a></li>
			<li><a href="#recharge" role="tab" data-toggle="tab" title="Recharges"> <span
					class="glyphicon glyphicon-phone"></span> Mobile Recharges
			</a></li>
			<li><a href="#fashion" role="tab" data-toggle="tab" title="Fashion"> <span
					class="glyphicon glyphicon-sunglasses"></span> Fashion
			</a></li>
			<li><a href="#food" role="tab" data-toggle="tab" title="Food & Beverages"> <span
					class="glyphicon glyphicon-cutlery"></span> Food & Beverages
			</a></li>
			<li><a href="#travel" role="tab" data-toggle="tab" title="Tours & Travels"> <span
					class="glyphicon glyphicon-road"></span> Tours & Travels
			</a></li>
			<li><a href="#electonics" role="tab" data-toggle="tab" title="Electronics"> <span
					class="glyphicon glyphicon-camera"></span> Electronics
			</a></li>
		</ul>
		 
		<div class="tab-content mainpage-tab-content">
			<div class="tab-pane top-tabs fade active in" id="topbrands">
				<a href="Amazon India"><img
					src="static/images/Company_Logo/Amazon India.jpg" height="45px"
					width="100px" /></a> <a href="Ebay"><img
					src="static/images/Company_Logo/Ebay.jpg" height="45px"
					width="100px" /></a> <a href="FoodPanda"><img
					src="static/images/Company_Logo/FoodPanda.jpg" height="45px"
					width="100px" /></a> <a href="Jabong"><img
					src="static/images/Company_Logo/Jabong.jpg" height="45px"
					width="100px" /></a> <a href="Lenskart"><img
					src="static/images/Company_Logo/Lenskart.jpg" height="45px"
					width="100px" /></a> <a href="PayTM"><img
					src="static/images/Company_Logo/PayTM.jpg" height="45px"
					width="100px" /></a> <a href="ShopClues"><img
					src="static/images/Company_Logo/ShopClues.jpg" height="45px"
					width="100px" /></a> <a href="Snapdeal"><img
					src="static/images/Company_Logo/Snapdeal.jpg" height="45px"
					width="100px" /></a>
			</div>
			<div class="tab-pane top-tabs fade" id="recharge">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
			<div class="tab-pane top-tabs fade" id="fashion">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
			<div class="tab-pane top-tabs fade" id="food">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
			<div class="tab-pane top-tabs fade" id="travel">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
			<div class="tab-pane top-tabs fade" id="electonics">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
		</div>

	</div>


	<div class="container contentarea">
		<div class="row">
			<div class="col-md-3 col-sm-4">
				<div class="sidebar portfolio-sidebar">
					<div class="sidebar-item categories">

						<div class="brands_products">
						
<ul class="nav nav-tabs">
  <li class="active"><a data-toggle="tab" href="#category">Categories</a></li>
  <li><a data-toggle="tab" href="#brands" >Brands</a></li>
</ul>

<div class="tab-content">
  <div id="category" class="tab-pane fade in active">
							<div class="ipage-search">
								<input type="text" id="searchCategory"
									class="form-control ipage-filter-search"
									placeholder="Search categories"
									onkeyup="javascript:loadCategoriesBySearch()" />
							</div>

							<div class="ipage-filters">
								<div class="list-group"  id="categoriesFilter">
									<c:forEach items="${offerscategorywise}" var="categoryoffers">
										<a href="javascript:loadOffersByCategoryId(${categoryoffers[0].id_category},1)"
											class="list-group-item" title="view ${categoryoffers[0].category_name} offers"
											style="font-size: 15px; color: menutext; text-align: left;"> <span
											class="glyphicon glyphicon-share"></span>
											${categoryoffers[0].category_name} <span class="badge">${categoryoffers[1]}</span>
										</a>
									</c:forEach>
								</div>
							</div>
  </div>
  <div id="brands" class="tab-pane fade">
								<div class="ipage-search">
								<input type="text" id="searchCompany"
									class="form-control ipage-filter-search"
									placeholder="Search brands"
									onkeyup="javascript:loadCompaniesBySearch()" />
							</div>

							<div class="ipage-filters">
								<div class="list-group" id="companiesFilter">
									<c:forEach items="${offerscompanywise}" var="companyoffers">
										<a href="javascript:loadOffersByCompanyId(${companyoffers[0].id_company},1)"
											class="list-group-item" title="view ${companyoffers[0].company_name} offers"
											style="font-size: 16px; color: #313131; text-align: left;"> <span
											class="glyphicon glyphicon-hand-right"></span>
											${companyoffers[0].company_name} <span class="badge">${companyoffers[1]}</span>
										</a>
									</c:forEach>
								</div>
							</div>
	
  </div>
</div>


						</div>

					</div>
					<div style="margin-top: 20px" class="sidebar-item  recent">
						<div class="list-group">
							<a class="list-group-item active"> Top Searches </a>
							<c:forEach items="${recentsearches}" var="search">
								<a href="javascript:getSearchOffersByRecentOffers('${search.search_words}')"
									class="list-group-item" style="font-size: 15px;" title="search for ${search.search_words}"> <span
									class="glyphicon glyphicon-edit"></span> ${search.search_words}
								</a>
							</c:forEach>
						</div>
						<!-- 						
						<div>
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>

<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-4708073082575024"
     data-ad-slot="5090931390"
     data-ad-format="auto"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
						</div>
 -->

					</div>
				</div>
			</div>
			<div class="col-md-9 col-sm-8" style="margin-bottom: 20px;">
			
			<div id="offersFilter">

				<div class="col-xm-12 col-sm-12 col-md-12 col-lg-12" style="padding:10px 10px; margin-bottom: 15px;">
					<div class="col-xm-12 col-sm-12 col-md-3 col-lg-3">
						<img class="companylogo-seppage" src="<c:url value='/static/images/Company_Logo/${company.company_name}.jpg' />">
					</div>
					<div class="col-sm-12 col-md-9 col-lg-9" >
						<h4 style="padding-left: 15px;"><b>${company.company_name}</b></h4>
						<h4 style="padding-left: 15px; font-weight: 100;">${company.company_description}</h4>
					</div>
				</div>
<!--
<div>
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>

<ins class="adsbygoogle"
     style="display:inline-block;width:728px;height:90px"
     data-ad-client="ca-pub-4708073082575024"
     data-ad-slot="3614198198"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
-->

					<!--recommended_items-->
				<h3 class="heading-point">Showing top offers of <i><b>${company.company_name}</b></i></h3>
					<div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">

							<c:forEach items="${offers}" var="offer">

								<div class="col-sm-6 col-md-4 col-lg-3 newofferbox">



<c:choose>
	<c:when
		test="${fn:containsIgnoreCase(offer.offertype.offertype_name,'Coupon')}">
						<div class="text-center mainpage-offer-box sepOffer">
	</c:when>
	<c:otherwise>
						<div class="text-center mainpage-offer-box sepDeal">
	</c:otherwise>
</c:choose>

<c:set var="created_date" value="${offer.created_date}" />
<%
	Date TodayDate = new Date();
		SimpleDateFormat sdt = new SimpleDateFormat("yyyyMMdd");
		String today_dt = sdt.format(TodayDate);
		String temp = ((String) pageContext.getAttribute("created_date"));
		String create_date = temp.substring(0, 8);

		if (today_dt.matches(create_date)) {
			out.print("<div class='ribbon-wrapper'><div class='ribbon new'>New</div></div>");
		}
%>
									<center> 
									<h4 class="offer-off-title">${fn:substring(offer.small_title,0,15)}</h4>
										<a href="javascript:loadOffersByCompanyId(${offer.company.id_company},1)" title="view all offers of ${offer.company.company_name}">
											<img class="companylogo-box"
												alt='${offer.company.company_name}'
												src="<c:url value='/static/images/Company_Logo/${offer.company.company_name}.jpg' />"
												height="30" width="110">
										</a>
										<h5 style="height: 55px; text-transform:capitalize;"><b>${offer.offer_title}</b></h5>

		<div style="width: 100%; height: 35px;" >

		<c:choose>
			<c:when
				test="${fn:containsIgnoreCase(offer.offertype.offertype_name,'Coupon')}">
		<a href="${offer.tracking_url}" class="btn-coupon" title="click to get Coupon Code for this offer"
					onclick="javascript:getCouponCode(${offer.id_offers}); window.open('${offer.tracking_url}');"
					data-toggle="modal" data-target="#lightbox"
					data-link="${offer.tracking_url}" target="_blank">
			<span class="go-smooth">Show Code</span>
			<small>${offer.coupon_code}</small>
		</a>
				
			</c:when>
			<c:otherwise>
				<a href="${offer.tracking_url}" class="btn-coupon" title="click to get this Deal"
					onclick="javascript:getCouponCode(${offer.id_offers}); window.open('${offer.tracking_url}');"
					data-toggle="modal" data-target="#lightbox"
					data-link="${offer.tracking_url}" target="_blank">
			<big>Activate Deal</big>
			
		</a>
			</c:otherwise>
		</c:choose>

		</div>
					<div style="width: 100%; border-top: #09F thin solid; margin-top: 10px; padding-top: 5px; ">


											<c:set var="exp_date" value="${offer.expiry_date}" />
											<%
												Date dNow = new Date();
													SimpleDateFormat ft = new SimpleDateFormat("MMM dd, yyyy");
													String today_date = ft.format(dNow);

													if (today_date.matches((String) pageContext.getAttribute("exp_date"))) {
														Calendar calendar = Calendar.getInstance();
														calendar.add(Calendar.DATE, 1);
														calendar.set(Calendar.HOUR, 0);
														calendar.set(Calendar.MINUTE, 00);
														calendar.set(Calendar.AM_PM, Calendar.AM);

														long diff = calendar.getTime().getTime() - dNow.getTime();//as given

														long minutes = diff / (60 * 1000);
														minutes=(minutes>=60)?minutes%60:minutes;
														long hours = diff / (60 * 60 * 1000);
														if (hours == 0)
															out.print("<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "
																	+ minutes + " Mins </span>");
														else
															out.print("<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "
																	+ hours + " Hrs " + minutes + " Mins </span>");
													} else
														out.print("<span class='glyphicon glyphicon-bell'></span> Valid till "
																+ (String) pageContext.getAttribute("exp_date"));
											%>

										</div>
									</center>
									</div>
								</div>


							</c:forEach>

							${paging}

						</div>
						<div class="tab-pane offers-content fade" id="new" style="color: black;"></div>
						<div class="tab-pane offers-content fade" id="mostclick" style="color: black;"></div>
						<div class="tab-pane offers-content fade" id="popular" style="color: black;"></div>
					</div>
				</div>
				
			</div>
		</div>
	</section>
	<!-- Contact Section -->
	<!--
<div>
<script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<ins class="adsbygoogle"
     style="display:inline-block;width:728px;height:90px"
     data-ad-client="ca-pub-4708073082575024"
     data-ad-slot="6567664592"></ins>
<script>
(adsbygoogle = window.adsbygoogle || []).push({});
</script>
</div>
-->

<div id="footer">
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					<div class="widget">
						<h4 class="widget-title">Instagram Feed</h4>
						<div id="beta-instagram-feed">
							<a href="https://instagram.com/p/-HgI_CjDly/" target="_blank">
								<img src="12230781_1657845637807802_1986859450_n.jpg">
							</a>
							<a href="https://instagram.com/p/-HgB2kjDlV/" target="_blank">                  <img src="12071068_877861708995940_808893081_n.jpg">                </a>                            <a href="https://instagram.com/p/-Hed6jDDgo/" target="_blank">                  <img src="12231038_142333822791709_1001449859_n.jpg">                </a>                            <a href="https://instagram.com/p/-HQ3YvDDgt/" target="_blank">                  <img src="12145144_169209376765491_194920631_n.jpg">                </a>                            <a href="https://instagram.com/p/9X1-XNDDuO/" target="_blank">                  <img src="12107431_1487126491590601_329750496_n.jpg">                </a>                            <a href="https://instagram.com/p/9T08vcDDsv/" target="_blank">                  <img src="11374442_1241176022566654_1398942007_n.jpg">                </a>            </div>
					</div>
				</div>
				<div class="col-sm-2">
					<div class="widget">
						<h4 class="widget-title">Information</h4>
						<div>
							<ul>
								<li><a href="http://webredox.net/demo/html/betadesign/blog_fullwidth_2col.html"><i class="fa fa-chevron-right"></i> Web Design</a></li>
								<li><a href="http://webredox.net/demo/html/betadesign/blog_fullwidth_2col.html"><i class="fa fa-chevron-right"></i> Web development</a></li>
								<li><a href="http://webredox.net/demo/html/betadesign/blog_fullwidth_2col.html"><i class="fa fa-chevron-right"></i> Marketing</a></li>
								<li><a href="http://webredox.net/demo/html/betadesign/blog_fullwidth_2col.html"><i class="fa fa-chevron-right"></i> Tips</a></li>
								<li><a href="http://webredox.net/demo/html/betadesign/blog_fullwidth_2col.html"><i class="fa fa-chevron-right"></i> Resources</a></li>
								<li><a href="http://webredox.net/demo/html/betadesign/blog_fullwidth_2col.html"><i class="fa fa-chevron-right"></i> Illustrations</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-sm-4">
				 <div class="col-sm-10">
					<div class="widget">
						<h4 class="widget-title">Contact Us</h4>
						<div>
							<div class="contact-info">
								<i class="fa fa-map-marker"></i>
								<p>30 South Park Avenue San Francisco, CA 94108 Phone: +78 123 456 78</p>
								<p>Nemo enim ipsam voluptatem quia voluptas sit asnatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.</p>
							</div>
						</div>
					</div>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="widget">
						<h4 class="widget-title">Newsletter Subscribe</h4>
							<input type="email" placeholder="Email Address" name="your_email" id="your_email" class="subscribe" onkeypress="javascript:subscribeMe(event)">
							<button class="pull-right" type="submit" onclick="javascript:subscribeMeBtn()">Subscribe</button>
					</div>
				</div>
			</div> <!-- .row -->
		</div> <!-- .container -->
	</div>

	<div class="copyright">
		<div class="container">
			<p class="pull-left">Developed by <i>Mr. Bharat Shelke &amp; Mr. Saudagar Narayankar</i></p>
			<p class="pull-right pay-options">
				<a href="http://webredox.net/demo/html/betadesign/#"><img src="master.jpg" alt=""></a>
				<a href="http://webredox.net/demo/html/betadesign/#"><img src="pay.jpg" alt=""></a>
				<a href="http://webredox.net/demo/html/betadesign/#"><img src="visa.jpg" alt=""></a>
				<a href="http://webredox.net/demo/html/betadesign/#"><img src="paypal.jpg" alt=""></a>
			</p>
			<div class="clearfix"></div>
		</div> <!-- .container -->
	</div> <!-- .copyright -->



	<!-- /.nav-collapse -->

	<div id="lightbox" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel" aria-hidden="true"></div>



	<!-- jQuery -->
	<script src="<c:url value='/static/js/jquery.js' />"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value='/static/js/bootstrap.min.js' />"></script>
	<!-- Scrolling Nav JavaScript -->
	<script src="<c:url value='/static/js/jquery.easing.min.js' />"></script>
	<script src="<c:url value='/static/js/scrolling-nav.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/js/jquery.jcarousel.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/static/js/jcarousel.responsive.js' />"></script>

	<script type="text/javascript">
	    function loadCompaniesBySearch() {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/companiesBySearch',
	            data: ({search : document.getElementById("searchCompany").value}),
	            success : function(data) {
	                $('#companiesFilter').html(data);
	            }
	        });
//	    	alert("Text "+searchVal);
	    }

	    function loadOffersByCompanyId(compid,pageno) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/offersByCompanyId',
	            data: ({companyid : compid, pagenum : pageno}),
	            success : function(data) {
	                $('#offersFilter').html(data);
	            }
	        });
//	    	alert("hi "+compid);
	    }
	    
	    function loadCategoriesBySearch() {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/categoriesBySearch',
	            data: ({search : document.getElementById("searchCategory").value}),
	            success : function(data) {
	                $('#categoriesFilter').html(data);
	            }
	        });
	        
	    	alert("Text "+searchVal);
	    }

	    function loadOffersByCategoryId(cateid,pageno) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/offersByCategoryId',
	            data: ({categoryid : cateid, pagenum : pageno}),
	            success : function(data) {
	                $('#offersFilter').html(data);
	            }
	        });
//	    	alert("hi "+compid);
	    }
	    
	    function redirectToPage(pageno) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/fetchOffersByPage',
	            data: ({pagenum : pageno}),
	            success : function(data) {
	                $('#offersFilter').html(data);
	            }
	        });
	        
	    }

	    function getCouponCode(offerid) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/getCouponById',
	            data: ({offer_id : offerid}),
	            success : function(data) {
	                $('#lightbox').html(data);
	            }
	        });
		        
//	    	alert("Text "+offerid);
	    }

	    function getDealDetails(offerid) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/getDealDetails',
	            data: ({offer_id : offerid}),
	            success : function(data) {
//	                $('#lightbox').html(data);
	            }
	        });
		        
//	    	alert("Text "+offerid);
	    }

	    function getSearchOffers(event, pageno) {
			if(event.keyCode==13){	
				
				getSearchOffersBtn(pageno);
//		    	alert("Textbox text : "+searchbox.value);
			}
	    }
	    
	    function getSearchOffersBtn(pageno) {
			var searchbox=document.getElementById("SearchBox");
			
			if(searchbox.value.trim()!="")
			{
		        $.ajax({
		            url : '${pageContext.request.contextPath}/fetchSearchOffers',
		            data: ({search : searchbox.value.trim(), pagenum : pageno}),
		            success : function(data) {
		                $('#offersFilter').html(data);
		            }
		        });
			}		        
//		    	alert("Textbox text : "+searchbox.value);
	    }
	    
	    function getSearchOffersByRecentOffers(search) {
			var searchbox=document.getElementById("SearchBox");
			searchbox.value=search;
			getSearchOffersBtn(1);
//		    	alert("Textbox text : "+searchbox.value);
	    }

	    function copyCouponCode()
	    {
			var copyBtn = document.querySelector('#copy_btn');
			var urlField = document.querySelector('#url_field');
			// select the contents
			urlField.select();
			  
			document.execCommand('copy'); // or 'cut'<br/><br/>
			copyBtn.value="copied";  
			copyBtn.focus();
	    }	

	    function subscribeMe(event) {
			if(event.keyCode==13){
				subscribeMeBtn();			
			}
	    }
	    
	    function validateEmail(email) {
	        var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
	        return re.test(email);
	    }

	    function subscribeMeBtn() {
			var your_email=document.getElementById("your_email");
			
			if(your_email.value.trim()!="")
			{
				var response=validateEmail(your_email.value.trim()) ;
				
				if(response == false){
					alert("Please enter valid Email Address");
					your_email.focus();
				}
				else{
			        $.ajax({
			            url : '${pageContext.request.contextPath}/subscribeMe',
			            data: ({email : your_email.value.trim()}),
			            success : function(data) {
			            	your_email.value='';
			            	alert(eval(data)); 
			            }
			        });
				}		        
			}		        
//		    	alert("Textbox text : "+searchbox.value);
	    }
	    
	    function loadSortingOffers(divno, sortorder, pageno) {
	    	var divname;
	    	if(divno=="0")
	    		divname="featured";
	    	else if(divno=="1")
	    		divname="new";
	    	else if(divno=="2")
	    		divname="mostclick";
	    	else if(divno=="3")
	    		divname="popular";
	    		
	        $.ajax({
	            url : '${pageContext.request.contextPath}/loadSortingOffers',
	            data: ({sort_order : sortorder, pagenum : pageno, div_name : divno}),
	            success : function(data) {
	                $('#'+divname).html(data);
	            }
	        });
//	    	alert(sortorder);
	    }


</script>
</body>
</html>
