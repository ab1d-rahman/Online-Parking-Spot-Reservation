package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<!--\r\n");
      out.write("Design by TEMPLATED\r\n");
      out.write("http://templated.co\r\n");
      out.write("Released for free under the Creative Commons Attribution License\r\n");
      out.write("\r\n");
      out.write("Name       : Assembly \r\n");
      out.write("Description: A two-column, fixed-width design with dark color scheme.\r\n");
      out.write("Version    : 1.0\r\n");
      out.write("Released   : 20140330\r\n");
      out.write("\r\n");
      out.write("-->\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Home</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<link href=\"http://fonts.google2apis.com/css?family=Didact+Gothic\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<!--[if IE 6]><link href=\"default_ie6.css\" rel=\"stylesheet\" type=\"text/css\" /><![endif]-->\r\n");

if(session.getAttribute("currentEmail")!=null)
{
	response.sendRedirect("loginHome.jsp");
}

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"header-wrapper\">\r\n");
      out.write("\t<div id=\"header\" class=\"container\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id=\"menu\">\r\n");
      out.write("\t\t\t<ul class =\"topbar\">\r\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\" accesskey=\"1\" title=\"\">Homepage</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"carTypes.jsp\" accesskey=\"2\" title=\"\">Car Types</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"sites.jsp\" accesskey=\"4\" title=\"\">Sites</a></li>\r\n");
      out.write("                                <li><a href=\"costing.jsp\" accesskey=\"4\" title=\"\">Costing</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"contactUs.jsp\" accesskey=\"5\" title=\"\">Contact Us</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"banner\" class=\"container\">\r\n");
      out.write("\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t<h2>Welcome to CAR PARKER</h2>\r\n");
      out.write("\t\t\t<span class=\"byline\">We help you book your car without effort 24x7!</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t<li><a href=\"login.jsp\" class=\"button\">Login</a></li></ul>\r\n");
      out.write("\t\t<ul class=\"actions\">\r\n");
      out.write("\t\t\t<li><a href=\"signup.jsp\" class=\"button\">Sign Up</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("\t<div id=\"three-column\" class=\"container\">\r\n");
      out.write("\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t<h2>Your cars are kept safe in our highly-secured facilities.</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t<div class=\"boxA\">\r\n");
      out.write("\t\t\t<p>We have space for four different types of vehicles for you to park in our facility!</p>\r\n");
      out.write("\t\t\t<a href=\"carTypes.jsp\" class=\"button button-alt\">More Info</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"boxB\">\r\n");
      out.write("\t\t\t<p>We have three different sites around Dhaka city where you can park your vehicle safely!</p>\r\n");
      out.write("\t\t\t<a href=\"sites.jsp\" class=\"button button-alt\">More Info</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"boxC\">\r\n");
      out.write("\t\t\t<p>We are offering this amazing car parking facility at a reasonable price</p>\r\n");
      out.write("\t\t\t<a href=\"costing.jsp\" class=\"button button-alt\">More Info</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"copyright\" class=\"container\">\r\n");
      out.write("\t<p>&copy; CSEDU. All rights reserved.| Design by Abid, Rony, Saqib </a>.</p></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
