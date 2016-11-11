<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by TEMPLATED
http://templated.co
Released for free under the Creative Commons Attribution License

Name       : Assembly 
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20140330

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Home</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.google2apis.com/css?family=Didact+Gothic" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />

<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->
<%
if(session.getAttribute("currentEmail")!=null)
{
	response.sendRedirect("loginHome.jsp");
}
%>
</head>
<body>
<div id="header-wrapper">
	<div id="header" class="container">
		
		<div id="menu">
			<ul class ="topbar">
				<li><a href="index.jsp" accesskey="1" title="">Homepage</a></li>
				<li><a href="carTypes.jsp" accesskey="2" title="">Car Types</a></li>
				<li><a href="sites.jsp" accesskey="4" title="">Sites</a></li>
                                <li><a href="costing.jsp" accesskey="4" title="">Costing</a></li>
				<li><a href="contactUs.jsp" accesskey="5" title="">Contact Us</a></li>
			</ul>
		</div>
	</div>
	<div id="banner" class="container">
		<div class="title">
			<h2>Welcome to CAR PARKER</h2>
			<span class="byline">We help you book your car without effort 24x7!</span>
		</div>
		<ul class="actions">
			<li><a href="login.jsp" class="button">Login</a></li></ul>
		<ul class="actions">
			<li><a href="signup.jsp" class="button">Sign Up</a></li>
		</ul>
	</div>
</div>
<div id="wrapper">
	<div id="three-column" class="container">
		<div class="title">
			<h2>Your cars are kept safe in our highly-secured facilities.</h2>
                </div>
		<div class="boxA">
			<p>We have space for four different types of vehicles for you to park in our facility!</p>
			<a href="carTypes.jsp" class="button button-alt">More Info</a>
		</div>
		<div class="boxB">
			<p>We have three different sites around Dhaka city where you can park your vehicle safely!</p>
			<a href="sites.jsp" class="button button-alt">More Info</a>
		</div>
		<div class="boxC">
			<p>We are offering this amazing car parking facility at a reasonable price</p>
			<a href="costing.jsp" class="button button-alt">More Info</a>
		</div>
	</div>
</div>

<div id="copyright" class="container">
	<p>&copy; CSEDU. All rights reserved.| Design by Abid, Rony, Saqib </a>.</p></div>
</body>
</html>
