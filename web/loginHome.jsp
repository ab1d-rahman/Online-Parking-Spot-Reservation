<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="javax.servlet.http.HttpSession"%>
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
if(session.getAttribute("currentEmail")==null)
{
	response.sendRedirect("index.jsp");
}
%>

</head>
<body>
<div id="header-wrapper">
	<div id="header" class="container">
		
                <%
                    String email = (String) session.getAttribute("currentEmail"); 
                    out.println("Welcome, " + email);
                %>
                
		<div id="menu">
			<ul class ="topbar">
				<li><a href="loginHome.jsp" accesskey="1" title="">Homepage</a></li>
                                <li><a href="editProfile.jsp" accesskey="2" title="">Edit Profile</a></li>
                                <li><a href="contactUs.jsp" accesskey="5" title="">Contact Us</a></li>
                                <li><a href="logout.jsp" accesskey="5" title="">Logout</a></li>
			</ul>
		</div>
	</div>
	<div id="banner" class="container">
		<div class="title">
			<h2>Welcome to CAR PARKER</h2>
			<span class="byline">We help you book your car without effort 24x7!</span>
		</div>
		<ul class="actions">
			<li><a href="makeBooking.jsp" class="button">Make Booking</a></li></ul>
		<ul class="actions">
			<li><a href="cancelBooking.jsp" class="button">Cancel Booking</a></li>
		</ul>
	</div>
</div>

<div id="copyright" class="container">
	<p>&copy; CSEDU. All rights reserved.| Design by Abid, Rony, Saqib </a>.</p>
</div>
</body>
</html>
