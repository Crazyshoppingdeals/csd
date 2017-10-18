<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Crazy Shopping Deals - Coupons, Deals & Offers</title>

<link href="<c:url value='/static/images/CrazySD_Icon.png' />"
	rel="icon"></link>
<link href="<c:url value='/static/css/bootstrap.min.css' />"
	rel="stylesheet"></link>
<link href="<c:url value='/static/css/CSD.css' />" rel="stylesheet"></link>

<link href="<c:url value='/static/css/jcarousel.responsive.css' />"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<!-- The #page-top ID is part of the scrolling feature - the data-spy and data-target are part of the built-in Bootstrap scrollspy function -->
<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top"
	background="<c:url value='/static/images/bg.jpg' />">
	<!-- Navigation -->
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation"
		style="background-color:#313131;"">
	<div class="container">
		<div class="navbar-header page-scroll" style="float: left;">
			<a href="index.html" class="logo"> <img
				src="<c:url value='/static/images/Crazy Shopping Deals Logo.png' />"
				alt="Crazy Shopping Deals">
			</a>
		</div>
		<div>
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!--    <a class="navbar-brand" href="#">Menus</a> 
-->
		</div>

		<!-- Top Menu -->
		<div
			class="collapse navbar-collapse navbar-ex1-collapse navbar-header"
			id="bs-example-navbar-collapse-1 " style="float: right">

			<div class="top-searchbar">
				<div class="input-group ">
					<div class="input-group-btn search-panel dropdown mega-dropdown">
						<button type="button"
							style="height: 40px; padding-left: 50px; padding-right: 50px"
							class="btn btn-default dropdown-toggle dropdown-toggle topmenu"
							data-toggle="dropdown">
							<span id="search_concept"
								style="font-weight: bold; font-size: 17px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif">
								Categories </span> <span class="glyphicon glyphicon-menu-hamburger"></span>
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
					<input type="hidden" name="search_param" value="all"
						id="search_param" style="height: 40px;"> <input
						type="text" class="form-control" name="x"
						placeholder="Search term..." style="height: 40px;"> <span
						class="input-group-btn">
						<button class="btn btn-default" type="button"
							style="height: 40px; padding-left: 25px; padding-right: 25px; background-color: #09A5E8; color: #FFF; font-weight: bold; font-size: 17px; font-family: 'Trebuchet MS', Arial, Helvetica, sans-serif">Search</button>
					</span>
				</div>
			</div>



		</div>
		<!-- Top Menu bar -->

		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>
	<!-- Intro Section -->


	<section id="projects" class="padding-top">



	<div class="container" style="margin-top: 100px;">
		<!-- Nav tabs -->
		<ul class="nav nav-tabs" role="tablist">
			<li class="active"><a href="#home" role="tab" data-toggle="tab">
					<span class="glyphicon glyphicon-thumbs-up"></span> Top Brands
			</a></li>
			<li><a href="#profile" role="tab" data-toggle="tab"> <span
					class="glyphicon glyphicon-phone"></span> Mobile Recharges
			</a></li>
			<li><a href="#messages" role="tab" data-toggle="tab"> <span
					class="glyphicon glyphicon-sunglasses"></span> Fashion & Grossary
			</a></li>
			<li><a href="#settings" role="tab" data-toggle="tab"> <i
					class="fa fa-cog"></i> Pata Nahi
			</a></li>
		</ul>

		<!-- Tab panes -->
		<div class="tab-content">
			<div class="tab-pane fade active in" id="home">
				<a href="Amazon India"><img src="static/images/Company_Logo/Amazon India.jpg"
					height="45px" width="100px" /></a> <a href="Ebay"><img
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
			<div class="tab-pane fade" id="profile">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-hp.png" /></a> <a href="#"><img
					src="images/logo-youtube.png" /></a> <a href="#"><img
					src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
			<div class="tab-pane fade" id="messages">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-hp.png" /></a> <a href="#"><img
					src="images/logo-youtube.png" /></a> <a href="#"><img
					src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
			<div class="tab-pane fade" id="settings">
				<a href="#"><img src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a> <a href="#"><img
					src="images/logo-hp.png" /></a> <a href="#"><img
					src="images/logo-youtube.png" /></a> <a href="#"><img
					src="images/logo-nyt.png" /></a> <a href="#"><img
					src="images/logo-microsoft.png" /></a> <a href="#"><img
					src="images/logo-ebay.png" /></a>
			</div>
		</div>

	</div>




	<div class="container contentarea">
		<div class="row">
			<div class="col-md-3 col-sm-4">
				<div class="sidebar portfolio-sidebar">
					<div class="sidebar-item categories">

						<div class="ipage-minor-section">
							<h3>Company wise Deals</h3>

							<div class="ipage-search form-group has-feedback">
								<input type="text" id="searchCompany"
									class="form-control ipage-filter-search"
									placeholder="Search companies"
									onkeyup="javascript:loadCompaniesAjax()" />
							</div>

							<div class="ipage-filters">
								<ul class="list-unstyled filters-list" id="companiesFilter">
									<c:forEach items="${offerscompanywise}" var="companyoffers">
										<li class="list-group-item"><span class="badge">${companyoffers[1]}</span>
											<a
											href="javascript:loadOffersAjax(${companyoffers[0].id_company})">${companyoffers[0].company_name}</a></li>
									</c:forEach>
								</ul>
							</div>

							<h3>Category wise Deals</h3>
							<div class="ipage-filters">
								<ul class="list-unstyled filters-list" id="companiesFilter">
									<c:forEach items="${offerscategorywise}" var="categoryoffers">
										<li class="list-group-item"><span class="badge">${categoryoffers[1]}</span>
											<!-- 
<label class="go-checkbox"><input type="checkbox" name="filterBy" data-catid=
                    "23" data-type="cat" class="coupon-filter-check" />							
 --> <a
											href="javascript:loadOffersAjax(${categoryoffers[0].id_category})">${categoryoffers[0].category_name}</a></li>

									</c:forEach>
								</ul>
							</div>


						</div>


						<!-- 
						<ul class="list-group">
					<c:forEach items="${offerscompanywise}" var="companyoffers">
							<li class="list-group-item"><span class="badge">${companyoffers[1]}</span> 
							<a href="javascript:loadOffersAjax(${companyoffers[0].id_company})">${companyoffers[0].company_name}</a></li>
					</c:forEach>

						<li class="list-group-item"><span class="badge">2</span> <a
								href="#">Paytm Coupons</a></li>
 -->
					</div>
					<div style="margin-top: 20px" class="sidebar-item  recent">
						<div class="panel panel-primary">
							<div class="panel-heading">Recent Searches</div>
							<div class="panel-body">
								<a href="#" style="margin: 5px 0px;">Paytm </a><br> <a
									href="#" style="margin: 5px 0px;">Paytm </a>
							</div>
						</div>
					</div>
					<div class="sidebar-item popular">
						<div class="list-group">
							<a href="#" class="list-group-item active"> Popular Items </a> <a
								href="#" class="list-group-item">Paytm </a> <a href="#"
								class="list-group-item">Snap Deal </a>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-9 col-sm-8">
				<div class="recommended_items">




					

					<!--recommended_items-->
					<h3>Top Offers</h3>
					<div id="recommended-item-carousel" class="carousel slide"
						data-ride="carousel">
						<div id="offersFilter">

							<!--  New Offers  
	<c:forEach items="${offers}" var="offer">
       <div class="col-sm-4 col-lg-4 col-md-4">
        <div class="thumbnail"> 
          <div class="caption">
            <h4 class="pull-right">${offer.expiry_date}</h4>
            <h4><a href="getoffer/${offer.id_offers}">${offer.offer_title}</a> </h4>
            <p>${offer.offer_description} <a target="_blank" href="getcouponcode/${offer.id_offers}">See more</a>.</p>
          </div>
          <div class="ratings">
            <p class="pull-right">${offer.coupon_code}</p>
            <p> <span class="glyphicon glyphicon-star"></span> <span class="glyphicon glyphicon-star"></span> <span class="glyphicon glyphicon-star"></span> <span class="glyphicon glyphicon-star-empty"></span> <span class="glyphicon glyphicon-star-empty"></span> </p>
          </div>
        </div>
      </div>
	</c:forEach>
-->

							<c:forEach items="${offers}" var="offer">
								<!-- 
            <div class="col-sm-6 col-md-4 col-lg-3" style="padding:0px; margin:0px;">
                <div class="thumbnail text-center mainpage-offers-box-all" >
                        <h4 class="offer-off-title" >100% OFF</h4>
	                    <img src="<c:url value='/static/images/Company_Logo/Paytm-Logo.png' />" style="border:#09F thin solid;" height="30" width="110">
                        <h5 style="height:45px;"><b><a href="getoffer/${offer.id_offers}">${offer.offer_title}</a> </b></h5>
                    	<img src="<c:url value='/static/images/Show_Coupon.png' />" class="coupon-bk-main" height="30" width="120" style="position:relative;">
                        <div align="center" style="width:100%; border-top:#09F thin solid; margin-top:10px; padding-top:5px;">
                        <a href="#" class="add-to-cart"><i class="fa fa-shopping-cart"> All Recharge offers</i></a> 
                        </div>
                </div>
			</div>
 -->

								<div class="col-sm-6 col-md-4 col-lg-3 newofferbox">
									<div class="thumbnail text-center mainpage-offers-box-all">
										<h4 class="offer-off-title"></h4>
										<img class="companylogo-box"
											src="<c:url value='/static/images/Company_Logo/${offer.getCompany().getCompany_name()}.jpg' />"
											height="30" width="110">
										<h5>${offer.offer_title}</h5>
										<c:choose>
											<c:when
												test="${fn:containsIgnoreCase(offer.offertype.offertype_name,'Coupon')}">
												<a href="${offer.tracking_url}"
													onclick="javascript:getCouponCode(${offer.id_offers})"
													data-toggle="modal" data-target="#lightbox"
													data-link="http://www.crazysd.com" target="_blank"> <img
													src="<c:url value='/static/images/Get_Offer.png' />"
													height="30" width="120">
												</a>
											</c:when>
											<c:when
												test="${fn:containsIgnoreCase(offer.offertype.offertype_name,'Deal')}">
												<a href="${offer.tracking_url}" target="_blank"
													onclick="javascript:getDealDetails(${offer.id_offers})">
													<img src="<c:url value='/static/images/Get_Deal.png' />"
													height="30" width="120">
												</a>
											</c:when>
											<c:otherwise>
												<h2>Click to get Offer</h2>
											</c:otherwise>
										</c:choose>

										<div class="showalloffers">
											<a href="#" class="add-to-cart"><i
												class="fa fa-shopping-cart"> Expires on
													${offer.expiry_date}</i></a>
										</div>
									</div>
								</div>


							</c:forEach>
							
						</div>
						<!-- 
	<div class="col-md-3 col-sm-12 col-lg-3 col-xl-3 text-center offer-box" style="height: 245px">
        <div class="col-md-12 col-sm-12 col-lg-12 col-xl-12 thumbnail text-center mainpage-offer-box-company">
		    <h4 style="font-family:Arial, Helvetica, sans-serif">100% OFF</h4>
		    <img src="<c:url value='/static/images/Company_Logo/Paytm-Logo.png' />" style="border:#09F thin solid;" height="40" width="110">
		</div>
		    <h5><a href="getoffer/${offer.id_offers}">${offer.offer_title}</a> </h5>
		<div class="col-md-12 col-sm-12 col-lg-12 col-xl-12">
	        <img class="coupon-bk-main" src="<c:url value='/static/images/coupon_back.png' />" height="40" width="130" style="position:relative;">
	        <img class="coupon-bk-extra" src="<c:url value='/static/images/coupon_back.png' />" height="40" width="130" style="position:absolute;bottom:0px;right:50px; ">
	        <h4 style="position:absolute;bottom:0px;right:40px; text-align:center">${offer.coupon_code}</h4>
        	<a href="getcouponcode/${offer.id_offers}"  >
        		<img src="<c:url value='/static/images/coupon_front.png' />" height="48" width="130" style="position:absolute;top:-10px;right:35px;">
        	</a>
		</div>
		<div class="col-md-12 col-sm-12 col-lg-12 col-xl-12" style="border-top:#09F thin solid; margin-top:10px; padding-top:5px;">
    	<a href="#" class="add-to-cart"><i class="fa fa-shopping-cart">Show all Paytm offers</i></a> 
	    </div>
	</div>
-->




						<!-- 
	<c:forEach items="${offers}" var="offer">
			<div class="col-md-12 col-sm-12 col-lg-12 col-xl-12  offer-box">
            
                <div class="col-md-3 col-sm-12 col-lg-2 col-xl-2  thumbnail text-center offer-box-company">
                    <img src="<c:url value='/static/images/Company_Logo/Paytm-Logo.png' />" style="border:#09F thin outset;" height="30" width="110">
                    <h4>100% OFF</h4>
                </div>
                <div class="col-md-9 col-sm-12 col-lg-8 offer-box-details">
		            <h4><a href="getoffer/${offer.id_offers}">${offer.offer_title}</a> </h4>
		            <p>${offer.offer_description}</p>
                </div>
                <div class="col-md-12 col-sm-12 col-lg-2 offer-box-coupon" align="center">
                    <img class="coupon-bk-main" src="<c:url value='/static/images/coupon_back.png' />" height="40" width="130" style="position:relative;">
                    <img class="coupon-bk-extra" src="<c:url value='/static/images/coupon_back.png' />" height="40" width="130" style="position:absolute;top:2px;right:10px; ">
					<h4 style="position:absolute;top:2px;right:10px; text-align:center">${offer.coupon_code}</h4>
                    <a href="getcouponcode/${offer.id_offers}" >
                    <img src="<c:url value='/static/images/coupon_front.png' />" height="48" width="120" style="position:absolute;top:-11px;right:12px; ">
					</a>
                    <h6 class="coupon-ends" style="margin-top:10px; font-weight:bold"><span class="glyphicon glyphicon-bell"></span> Ends on 12 Oct 15</h6>
                    <h6 class="coupon-verified" style="margin-top:10px;font-weight:bold; color:#390; font-style:italic"><span class="glyphicon glyphicon-ok"></span> Verified</h6>
                </div>
            </div>     
	</c:forEach>
 -->
					</div>
				</div>
				
			</div>
		</div>
	</div>
	</div>
	</section>
	<!-- Contact Section -->
	<!--
for Menu  
-->
<footer>
	<div class="section group">
		<div class="col span_1_of_4"></div>
		<div class="col span_1_of_4"></div>
		<div class="col span_1_of_4"></div>
		<div class="col span_1_of_4"></div>
		<!---start-copy-right----->
		<div class="copy-tight">
			<p>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				Developed & Designed by <a href="">Mr. Bharat Shelke & Mr.
					Saudagar Narayankar.</a>

				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


				</a>
			</p>

		</div>
		<!---End-copy-right----->
	</div>
	</footer>


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
	    function loadOffersAjax(compid) {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/offersByCompanyId',
	            data: ({companyid : compid}),
	            success : function(data) {
	                $('#offersFilter').html(data);
	            }
	        });
//	    	alert("hi "+compid);
	    }
	    
	    function loadCompaniesAjax() {
	        $.ajax({
	            url : '${pageContext.request.contextPath}/companiesBySearch',
	            data: ({search : document.getElementById("searchCompany").value}),
	            success : function(data) {
	                $('#companiesFilter').html(data);
	            }
	        });
	        
//	    	alert("Text "+searchVal);
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
</script>
</body>
</html>
