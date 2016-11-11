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
<title>Car Types</title>
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
	
</div>
<div id="wrapper">
	<div id="three-column" class="container">
		<div class="title">
                    <h2>If you face any problem regarding our system then contact us!</h2><br>
                        <p class="contactNo"> Abid - 01634545454 </p>
                        <p class="contactNo"> Saqib - 01635555555</p>
                        <p class="contactNo"> Rony - 01636565656 </p>
                </div>		
	</div>
</div>

<div id="copyright" class="container">
	<p>&copy; CSEDU. All rights reserved.| Design by Abid, Rony, Saqib </a>.</p></div>
</body>
</html>
