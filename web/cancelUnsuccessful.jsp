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
<title>Cancel Unsuccessful</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Didact+Gothic" rel="stylesheet" />
<link href="loginStyle.css" rel="stylesheet" type="text/css" media="all" />
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
	
    <div id="menu">
            <ul class ="topbar">
                    <li><a href="loginHome.jsp" accesskey="1" title="">Homepage</a></li>
                    <li><a href="editProfile.jsp" accesskey="2" title="">Edit Profile</a></li>
                    <li><a href="contactUs.jsp" accesskey="5" title="">Contact Us</a></li>
                    <li><a href="logout.jsp" accesskey="5" title="">Logout</a></li>
            </ul>
    </div>
	
    <div id="banner" class="container">	
    </div>
    
    <p class="failedMessage">Booking Cancel Unsuccessful!<br>Invalid Booking ID!<br><a class="tryAgain" href="cancelBooking.jsp">Try Again</a></p>



<div id="copyright" class="container">
	<<p>&copy; CSEDU. All rights reserved.| Design by Abid, Rony, Saqib </a>.</p>
</div>
</body>
</html>
