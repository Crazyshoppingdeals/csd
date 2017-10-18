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

<meta name="keywords"
	content="coupons, coupon codes, deal, offer, top offers, today offers, online shopping, free shopping, discount, paytm, amazon, flipkart, snapdeal, crazy, shopping, deals, crazy shopping deals, recharge, off, india coupons, promotion codes, coupon codes, coupons, coupons, deals, offers, online shopping, online shop, online clothes shopping, online shopping for women, online shopping clothes, online shopping fashion, fashion online shop, fashion online shopping, online shopping deals, women online shopping, online shop fashion, online women shopping, shopping, discounts, flipkart, paytm, amazon, ebay, crazy shopping deals, crazy, online shopping sites, deal, coupon, deal of the day, daily deals, best deals, daily deal, coupon codes, discount coupons, online deals, coupon deals, bargains, great deals, today offers" />
<meta name="description"
	content="We provides latest coupons, deals and offers information of all top brands in India, Visit us to stay updated and enjoy discounts on online shopping. Happy Online Shopping!!!" />

<meta property="og:locale" content="en_US" />
<meta property="og:type" content="Website" />
<meta property="og:site_name" content="CrazyShoppingDeals" />
<meta property="og:url" content="http://www.crazyshoppingdeals.in/" />
<meta property="og:image"
	content="http://www.crazyshoppingdeals.in/static/images/Crazy%20Shopping%20Deals%20Logo.png" />
<meta property="og:title"
	content="CrazyShoppingDeals - Coupons, Deals & Offers" />
<meta property="og:description"
	content="We provides latest coupons, deals and offers information of all top brands in India, Visit us to stay updated and enjoy discounts on online shopping. Happy Online Shopping!!!" />
<meta property="og:keywords"
	content="coupons, coupon codes, deal, offer, top offers, today offers, online shopping, free shopping, discount, paytm, amazon, flipkart, snapdeal, crazy, shopping, deals, crazy shopping deals, recharge, off, india coupons, promotion codes, coupon codes, coupons, coupon codes, india coupon codes, online shopping coupons, coupons, deals, offers, online shopping, online shop, online clothes shopping, online shopping for women, online shopping clothes, online shopping fashion, fashion online shop, fashion online shopping, online shopping deals, women online shopping, online shop fashion, online women shopping, shopping, discounts, flipkart, paytm, amazon, ebay, crazy shopping deals, crazy, online shopping sites, deal, coupon, deal of the day, daily deals, best deals, daily deal, coupon codes, discount coupons, online deals, coupon deals, bargains, great deals" />

<meta name="mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-capable" content="yes" />

<meta name="viewport" id="viewport"
	content="width=device-width,minimum-scale=1.0,maximum-scale=1.0,initial-scale=1.0,user-scalable=no" />

<meta name="twitter:site" content="@CrazyShoppingDeals" />
<meta name="twitter:creator" content="@CrazyShoppingDeals" />
<meta name="geo.placename"
	content="Pune, Hyderabad, Delhi, Mumbai, Chennai, India" />
<meta name="geo.position" content="17.4411480;78.3910690" />
<meta name="geo.region" content="IN-Maharashtra" />

<meta name="revisit-after" content="daily" />
<meta name="robots" content="noodp,noydir" />

<link rel="canonical" href="http://www.crazyshoppingdeals.in/">

<link href="images/LoadingImages/CrazySD_Icon.png" rel="icon">

<link href="<c:url value='/static/images/CrazySD_Icon.png' />"
	rel="icon" />
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet" />


<link href="<c:url value='/static/css/Style.css' />" rel="stylesheet" />
<link href="<c:url value='/static/css/Slider.css' />" rel="stylesheet" />


<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- Go to www.addthis.com/dashboard to customize your tools -->
<script type="text/javascript"
	src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-55bb426dc337d634"
	async="async"></script>
</head>
<!-- The #page-top ID is part of the scrolling feature - the data-spy and data-target are part of the built-in Bootstrap scrollspy function -->
<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation"
		style="background-color:#313131;"">
	<div class="container">
		<div class="navbar-header page-scroll" style="float: left;">
			<a href="http://crazyshoppingdeals.in" class="logo"> <img
				src="<c:url value='/static/images/Crazy Shopping Deals Logo.png' />"
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
					<input type="text" class="form-control" name="SearchBox"
						title="Search company, category, etc" id="SearchBox"
						placeholder="Search company, category, etc" style="height: 40px;"
						onkeypress="javascript:getSearchOffers(event, 1)"> <span
						class="input-group-btn">
						<button onclick="javascript:getSearchOffersBtn(1)"
							title="click to get Search results"
							class="btn btn-default headerSearchButton" type="button"
							style="height: 40px; padding-left: 25px; padding-right: 25px; background-color: #09A5E8; color: #FFF; font-weight: bold; font-size: 17px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif">Search</button>
					</span>
				</div>
			</div>



		</div>
	</div>
	</nav>
	<!-- Intro Section -->


	<section id="projects" class="padding-top">

	<div class="container" style="margin-top: 100px;">
		<ul class="nav nav-tabs responsive" role="tablist">

			<c:forEach items="${maincategories}" var="maincategory">
				<c:choose>
					<c:when
						test="${fn:containsIgnoreCase(maincategory.maincate_name,'top')}">
						<li class="active">
					</c:when>
					<c:otherwise>
						<li>
					</c:otherwise>
				</c:choose>
				<a href="#${maincategory.id_maincate}" role="tab" data-toggle="tab"
					title="${maincategory.maincate_name}"> <span
					class="glyphicon ${maincategory.maincate_glyphicon}"></span>
					${maincategory.maincate_name}
				</a>
				</li>
			</c:forEach>
		</ul>

		<div class="tab-content responsive mainpage-tab-content">

			<c:forEach items="${maincategories}" var="maincategory">
				<c:choose>
					<c:when
						test="${fn:containsIgnoreCase(maincategory.maincate_name,'top')}">
						<div class="tab-pane top-tabs fade active in"
							id="${maincategory.id_maincate}">
					</c:when>
					<c:otherwise>
						<div class="tab-pane top-tabs fade in"
							id="${maincategory.id_maincate}">
					</c:otherwise>
				</c:choose>
				<c:forEach items="${maincategory.companies}" var="company">
					<a href="${company.company_name}"> <img
						src="<c:url value='/static/images/Company_Logo/${company.company_name}.jpg' />"
						height="45px" width="100px" title="${company.company_name}"
						alt="${company.company_name}" /></a>
				</c:forEach>
		</div>
		</c:forEach>

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
								<li><a data-toggle="tab" href="#brands">Brands</a></li>
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
										<div class="list-group" id="categoriesFilter">
											<c:choose>
												<c:when test="${empty offerscategorywise}">
													<a href="" class="list-group-item" title="search not found"
														style="font-size: 15px; color: menutext; text-align: left;">
														Search not found. Try again. </a>
												</c:when>
												<c:otherwise>
													<c:forEach items="${offerscategorywise}"
														var="categoryoffers">
														<a
															href="javascript:loadOffersByCategoryId(${categoryoffers[0].id_category},1)"
															class="list-group-item"
															title="view ${categoryoffers[0].category_name} offers"
															style="font-size: 15px; color: menutext; text-align: left;">
															<span class="glyphicon glyphicon-share"></span>
															${categoryoffers[0].category_name} <span class="badge">${categoryoffers[1]}</span>
														</a>
													</c:forEach>
												</c:otherwise>
											</c:choose>

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
												<a 
													href="javascript:loadOffersByCompanyId(${companyoffers[0].id_company},1)"
													class="list-group-item"
													title="view ${companyoffers[0].company_name} offers"
													style="font-size: 16px; color: #313131; text-align: left;">
													<span class="glyphicon glyphicon-hand-right"></span>
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
								<a
									href="javascript:getSearchOffersByRecentOffers('${search.search_words}')"
									class="list-group-item" style="font-size: 15px;"
									title="search for ${search.search_words}"> <span
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
			<div class="col-md-9 col-sm-8">
				<div class="recommended_items">

					<div id="offersFilter">
						<h3 class="heading-point">Recommended Offers and Deals</h3>
						${slideroffers}

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


					<ul class="nav nav-tabs applymargin  responsive" role="tablist">
						<li class="active"><a href="#featured"
							title="get Featured offers" role="tab" data-toggle="tab"> Featured </a></li>
						<li><a href="#new" title="get New Arrival offers" role="tab"
							data-toggle="tab" > New Arrival </a></li>
						<li><a href="#mostclick" title="get Most clicked offers"
							role="tab" data-toggle="tab" > Most Clicked </a></li>
						<li><a href="#popular" title="get Popular offers" role="tab"
							data-toggle="tab" > Popular </a></li>
						<li class="rightside" role="tab" > 
<%
// Total ${fn:length(offers)} offers
//	Showing 1-${fn:length(offers)} offers out of 280
//	String tip="Showing "+((PER_PAGE*(currpage-1))+1)+" - "+((PER_PAGE*(currpage-1))+PER_PAGE)+" offers out of "+totaloffers;

	int currpage=2, PER_PAGE=16, totaloffers=18;
	String tip="Showing "+(totaloffers%(PER_PAGE*(currpage-1)))+" - "+(totaloffers%(PER_PAGE*(currpage)))+" offers out of "+totaloffers;
//	out.print(tip);
%>						
						</li>
					</ul>

					<div class="tab-content">
						<div class="tab-pane offer-tabs fade active in" id="featured">

							<c:forEach items="${offers}" var="offer">
								<div class="col-xs-12 col-sm-6 col-md-4 col-lg-3 newofferbox">

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
											sdt.setTimeZone(TimeZone.getTimeZone("IST"));
											String today_dt = sdt.format(TodayDate);
											String temp = ((String) pageContext.getAttribute("created_date"));
											String create_date = temp.substring(0, 8);

											Calendar cc = Calendar.getInstance();
											cc.set(Calendar.HOUR, -24);
											String yesterday_dt = sdt.format(cc.getTime());
											cc.set(Calendar.HOUR, -24);
											String b4yesterday_dt = sdt.format(cc.getTime());

											if (today_dt.matches(create_date) || yesterday_dt.matches(create_date)
													|| b4yesterday_dt.matches(create_date)) {
												out.print("<div class='ribbon-wrapper'><div class='ribbon new'>New</div></div>");
											}
									%>
									<center>
										<h4 class="offer-off-title">${fn:substring(offer.small_title,0,15)}</h4>
										<a href="javascript:loadOffersByCompanyId(${offer.company.id_company},1)"
											title="view all offers of ${offer.company.company_name}">
										
<!-- 										onerror="this.src=&#39;<c:url value='/static/images/Company_Logo/DefaultLogo.png' />&#39;" 	 -->	  
											<img class="companylogo-box" alt='${offer.company.company_name}' 
											src="<c:url value='/static/images/Company_Logo/${offer.company.company_name}.jpg' />"
											height="30" width="110" />
										</a>
										<h5 style="height: 55px; text-transform: capitalize;">
											<b>${fn:substring(offer.offer_title,0,80)}</b>
										</h5>

										<div style="width: 100%; height: 35px;">

											<c:choose>
												<c:when
													test="${fn:containsIgnoreCase(offer.offertype.offertype_name,'Coupon')}">
													<a href="${offer.tracking_url}" class="btn-coupon"
														title="click to get Coupon Code for this offer"
														onclick="javascript:getCouponCode(${offer.id_offers}); window.open('${offer.tracking_url}');"
														data-toggle="modal" > <span
														class="go-smooth">Show Code</span> <small>${offer.coupon_code}</small>
													</a>

												</c:when>
												<c:otherwise>
													<a href="${offer.tracking_url}" class="btn-coupon"
														title="click to get this Deal"
														onclick="javascript:getCouponCode(${offer.id_offers}); window.open('${offer.tracking_url}');"
														data-toggle="modal" data-target="#lightbox"
														data-link="${offer.tracking_url}" target="_blank"> <big>Activate
															Deal</big>

													</a>
												</c:otherwise>
											</c:choose>

										</div>
										<div
											style="width: 100%; border-top: #09F thin solid; margin-top: 10px; padding-top: 5px;">


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
														minutes = (minutes >= 60) ? minutes % 60 : minutes;
														long hours = diff / (60 * 60 * 1000);
														if (hours == 0)
															out.print(
																	"<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "
																			+ minutes + " Mins </span>");
														else
															out.print(
																	"<span style='color:red;'> <span class='glyphicon glyphicon-hourglass'></span> Expires in "
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
					<div class="tab-pane offers-content fade" id="new" style="color: black;">
						${newoffers}
					</div>
					<div class="tab-pane offers-content fade" id="mostclick" style="color: black;">
						${mostclickedoffers}
					</div>
					<div class="tab-pane offers-content fade" id="popular" style="color: black;">
						${popularoffers}
					</div>
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
						<h4 class="widget-title">Like us on Facebook</h4>
						<div id="beta-instagram-feed">
							<div id="fb-root"></div>
							<script>(function(d, s, id) {
 var js, fjs = d.getElementsByTagName(s)[0];
 if (d.getElementById(id)) return;
 js = d.createElement(s); js.id = id;
 js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&version=v2.5";
 fjs.parentNode.insertBefore(js, fjs);
}(document, 'script', 'facebook-jssdk'));</script>

							<div class="fb-page"
								data-href="https://www.facebook.com/Crazy-Shopping-Deals-789903394453202"
								data-width="300px" data-height="200px" data-small-header="false"
								data-adapt-container-width="true" data-hide-cover="false"
								data-show-facepile="true" data-show-posts="false"></div>
							<!-- 
<script type='text/javascript' charset='utf-8'>
 window.liveSiteAsyncInit = function() {
   LiveSite.init({
     id : 'WI-QNNVE8N24WOOD1IJX1I6'
   });
 };
 (function(d, s, id){
   var js, fjs = d.getElementsByTagName(s)[0],
       p = (('https:' == d.location.protocol) ? 'https://' : 'http://'),
       r = Math.floor(new Date().getTime() / 1000000);
   if (d.getElementById(id)) {return;}
   js = d.createElement(s); js.id = id;
   js.src = p + "www.vcita.com/assets/livesite.js?" + r;
   fjs.parentNode.insertBefore(js, fjs);
 }(document, 'script', 'livesite-jssdk'));
</script>
 -->
						</div>
					</div>
				</div>
				<div class="col-sm-2">
					<div class="widget">
						<h4 class="widget-title">Site Map</h4>
						<ul>
							<li><a href="http://crazyshoppingdeals.in">
								Homepage </a></li>
							<li><a href="#new" onclick="javascript:myClick()" data-toggle="tab" >
								Fresh Offers </a></li>
							<li><a href="#mostclick" onclick="javascript:myClick()" data-toggle="tab" >
								Most Clicked Offers </a></li>
							<li><a href="#popular" onclick="javascript:myClick()" data-toggle="tab" >
								Top Trending Offers </a></li>

						</ul>
					</div>
				</div>
				<div class="col-sm-4">
					<div class="col-sm-10">
						<div class="widget">
							<h4 class="widget-title">About Us</h4>
							<div>
								<div class="contact-info">
									<p>Crazy Shopping Deals provides latest coupons, offers and deals information of all shopping brands in India</p>
									<p>Visit us to stay updated and enjoy maximum discounts on online shopping.</p>
									<p>Happy Online Shopping!!!</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="widget">
						<h4 class="widget-title">Newsletter Subscribe</h4>
						<input type="email" placeholder="Email Address" name="your_email"
							id="your_email" class="subscribe"
							onkeypress="javascript:subscribeMe(event)">
						<button class="pull-right" type="submit"
							onclick="javascript:subscribeMeBtn()">Subscribe</button>
					</div>
				</div>
			</div>
			<!-- .row -->
		</div>
		<!-- .container -->
	</div>

	<div class="copyright">
		<div class="container">
			<p class="pull-left">
				Developed by <i>Saudagar Narayankar &amp; Bharat Shelke</i>
			</p>
			<p class="pull-right pay-options">
				© 2016 CrazyShoppingDeals. All Rights Reserved
			</p>
			<div class="clearfix"></div>
		</div>
		<!-- .container -->
	</div>
	<!-- .copyright -->

	<!-- 

<a href="" class="btn-coupon" title="click to get this Deal"
							data-toggle="modal" data-target="#lightbox" >
							Click to view Dialog</a>
 -->
	<!-- /.nav-collapse -->

	<div id="lightbox" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel" aria-hidden="true"></div>




	<!-- 
<div class="modal-dialog"><div class="modal-content" style="padding-bottom: 10px;">
<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">X</span></button>
<div class="modal-body"> 
<h3 class="heading-point" style="text-transform: none; text-align: center;margin-top: 0px;">Your <i><b>PayTM</b></i> deal is Activated</h3>
<p>No code required. <a href="offer.getTracking_url()" target="_blank" title="offer.getCompany().getCompany_name()" rel="nofollow">
Click here to get this <b>PayTM</b> deal</a></p>

<div class="row coupon-details">
	<div class="col-xm-12 col-sm-3 col-md-3 col-lg-3" align="left">
		<a href="CHNAGE IT" >
		<img src="<c:url value='/static/images/Company_Logo/PayTM.jpg' />" alt="PayTM" height="60" width="120" title="click to view all PAYTM offers"></a>
	</div>
	<div class="col-sm-9 col-md-9 col-lg-9" align="left">
		<h4 class="coupon-details-title">Get Rs.100 Cashback On DTH Recharges Of Rs.500 And Above</h4>
	</div>
	<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 coupon-details-description">
	Get Rs.100 Cashback On DTH Recharges Of Rs.500 And Abov Get Rs.100 Cashback On DTH Recharges Of Rs.500 And AbovGet Rs.100 Cashback On DTH Recharges Of Rs.500 And Abov
	</div>
</div>
</div>
</div>
 -->



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
	<script type="text/javascript"
		src="<c:url value='/static/js/responsive-tabs.js' />"></script>

<script type="text/javascript">
if (fakewaffle === undefined) {
    var fakewaffle = {};
}

fakewaffle.responsiveTabs = function (collapseDisplayed) {
    "use strict";
    fakewaffle.currentPosition = 'tabs';

    var tabGroups = $('.nav-tabs.responsive'),
        hidden    = '',
        visible   = '';

    if (collapseDisplayed === undefined) {
        collapseDisplayed = ['xs', 'sm'];
    }

    $.each(collapseDisplayed, function () {
        hidden  += ' hidden-' + this;
        visible += ' visible-' + this;
    });

    $.each(tabGroups, function () {
        var $tabGroup   = $(this),
            tabs        = $tabGroup.find('li a'),
            collapseDiv = $("<div></div>", {
                "class" : "panel-group responsive" + visible,
                "id"    : 'collapse-' + $tabGroup.attr('id')
            });

        $.each(tabs, function () {
            var $this          = $(this),
                active         = '',
                oldLinkClass   = $this.attr('class') === undefined ? '' : $this.attr('class'),
                newLinkClass   = 'accordion-toggle',
                oldParentClass = $this.parent().attr('class') === undefined ? '' : $this.parent().attr('class'),
                newParentClass = 'panel panel-default';

            if (oldLinkClass.length > 0) {
                newLinkClass += ' ' + oldLinkClass;
            };

            if (oldParentClass.length > 0) {
                oldParentClass = oldParentClass.replace(/\bactive\b/g, '');
                newParentClass += ' ' + oldParentClass;
                newParentClass = newParentClass.replace(/\s{2,}/g, ' ');
                newParentClass = newParentClass.replace(/^\s+|\s+$/g, '');
            };

            if ($this.parent().hasClass('active')) {
                active = ' in';
            }
            $this.click(function (e) {
              e.preventDefault()
              $this.tab('show')
           });

            collapseDiv.append(
                $('<div>').attr('class', newParentClass).html(
                    $('<div>').attr('class', 'panel-heading').html(
                        $('<h4>').attr('class', 'panel-title').html(
                            $('<a>', {
                                'class' : newLinkClass,
                                'data-toggle': 'collapse',
                                'data-parent' : '#collapse-' + $tabGroup.attr('id'),
                                'href' : '#collapse-' + $this.attr('href').replace(/#/g, ''),
                                'html': $this.html()
                            })
                        )
                    )
                ).append(
                    $('<div>', {
                        'id' : 'collapse-' + $this.attr('href').replace(/#/g, ''),
                        'class' : 'panel-collapse collapse' + active
                    }).html(
                        $('<div>').attr('class', 'panel-body').html('')
                    )
                )
            );
        });

        $tabGroup.next().after(collapseDiv);
        $tabGroup.addClass(hidden);
        $('.tab-content.responsive').addClass(hidden);
    });

    fakewaffle.checkResize();
    fakewaffle.bindTabToCollapse();
};

fakewaffle.checkResize = function () {
    "use strict";
    if ($(".panel-group.responsive").is(":visible") === true && fakewaffle.currentPosition === 'tabs') {
        fakewaffle.toggleResponsiveTabContent();
        fakewaffle.currentPosition = 'panel';
    } else if ($(".panel-group.responsive").is(":visible") === false && fakewaffle.currentPosition === 'panel') {
        fakewaffle.toggleResponsiveTabContent();
        fakewaffle.currentPosition = 'tabs';
    }

};

fakewaffle.toggleResponsiveTabContent = function () {
    "use strict";
    var tabGroups = $('.nav-tabs.responsive');

    $.each(tabGroups, function () {
        var tabs = $(this).find('li a');

        $.each(tabs, function () {
            var href         = $(this).attr('href').replace(/#/g, ''),
                tabId        = "#" + href,
                panelId      = "#collapse-" + href,
                tabContent   = $(tabId).html(),
                panelContent = $(panelId + " div:first-child").html();

            $(tabId).html(panelContent);
            $(panelId + " div:first-child").html(tabContent);
        });

    });
};

fakewaffle.bindTabToCollapse = function () {
    "use strict";
    var tabs     = $('.nav-tabs.responsive').find('li a'),
        collapse = $(".panel-group.responsive").find('.panel-collapse');

    tabs.on('shown.bs.tab', function (e) {
        var $current  = $($(e.target)[0].hash.replace(/#/, '#collapse-'));
        $current.collapse('show');

        if(e.relatedTarget){
            var $previous = $($(e.relatedTarget)[0].hash.replace(/#/, '#collapse-'));
            $previous.collapse('hide');
        }
    });

    collapse.on('show.bs.collapse', function (e) {
        var current = $(e.target).context.id.replace(/collapse-/g, '#');

        $('a[href="' + current + '"]').tab('show');
    });
}

$(window).resize(function () {
    "use strict";
    fakewaffle.checkResize();
});
(function($) {
fakewaffle.responsiveTabs(['xs', 'sm']);
})(jQuery);
</script>


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
	            },
		        complete: function() {
	        	$('html, body').animate({
	        	    scrollTop: $("#offersFilter").offset().top-100
	        	}, 500);
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
	            },
		        complete: function() {
		        	$('html, body').animate({
		        	    scrollTop: $("#offersFilter").offset().top-100
		        	}, 500);
		        }
	        });
//	    	alert("hi "+compid);
	    }

	    function getCouponCode(offerid) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/getCouponById',
	            data: ({offer_id : offerid}),
	            success : function(data) {
	                $('#lightbox').html(data);
//		    		$('.modal').modal('show');
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
		            },
			        complete: function() {
			        	$('html, body').animate({
			        	    scrollTop: $("#offersFilter").offset().top-100
			        	}, 500);
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
			            	alert(data); 
			            },
				        complete: function() {
				        	$('html, body').animate({
				        	    scrollTop: $("body").offset().top-200
				        	}, 500);
				        }
			        });
				}		        
			}		        
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
	            data: ({div_num : divno, sort_order : sortorder, pagenum : pageno}),
	            success : function(data) {
	                $('#'+divname).html(data);
	            },
		        complete: function() {
//		        		window.scrollTo(0, 0);
//		        	document.location.href = "#offersFilter";
//		        	$('html, body').animate({ scrollTop: 0 }, callback);
		        	$('html, body').animate({
		        	    scrollTop: $("#offersFilter").offset().top+250
		        	}, 500);
		         }
	        });
//	    	alert(sortorder);
	    }

	    function myClick(){
	    	$('a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
	    	    var target = this.href.split('#');
	    	    $('.nav a').filter('a[href="#'+target[1]+'"]').tab('show');
	        	$('html, body').animate({
	        	    scrollTop: $("#offersFilter").offset().top+250
	        	}, 500);
	    	})
    	}

</script>
</body>
</html>
