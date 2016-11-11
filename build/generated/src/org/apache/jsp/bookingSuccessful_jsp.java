package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bookingSuccessful_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<!--\n");
      out.write("Design by TEMPLATED\n");
      out.write("http://templated.co\n");
      out.write("Released for free under the Creative Commons Attribution License\n");
      out.write("\n");
      out.write("Name       : Assembly \n");
      out.write("Description: A two-column, fixed-width design with dark color scheme.\n");
      out.write("Version    : 1.0\n");
      out.write("Released   : 20140330\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Booking Successful</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Didact+Gothic\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"loginStyle.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("<!--[if IE 6]><link href=\"default_ie6.css\" rel=\"stylesheet\" type=\"text/css\" /><![endif]-->\n");
      out.write("\n");

if(session.getAttribute("currentEmail")==null)
{
	response.sendRedirect("index.jsp");
}

      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("    <div id=\"menu\">\n");
      out.write("            <ul class =\"topbar\">\n");
      out.write("                    <li><a href=\"loginHome.jsp\" accesskey=\"1\" title=\"\">Homepage</a></li>\n");
      out.write("                    <li><a href=\"editProfile.jsp\" accesskey=\"2\" title=\"\">Edit Profile</a></li>\n");
      out.write("                    <li><a href=\"contactUS.jsp\" accesskey=\"5\" title=\"\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"logout.jsp\" accesskey=\"5\" title=\"\">Logout</a></li>\n");
      out.write("            </ul>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("    <div id=\"banner\" class=\"container\">\t\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <p class=\"failedMessage\">Booking Successful!! <br>Your Booking ID is ");
 
        String bookingID = (String) request.getSession().getAttribute("currentBookingID");
        out.println(bookingID);
        
    
      out.write(" and your Total Cost is ");
 
        String totalCost = (String) request.getSession().getAttribute("currentCost");
        out.println(totalCost);
        
        
      out.write(" !<br> Please save your booking ID for further use in the future.</p>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("        \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"copyright\" class=\"container\">\n");
      out.write("\t<p>&copy; CSEDU. All rights reserved.| Design by Abid, Rony, Saqib </a>.</p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
