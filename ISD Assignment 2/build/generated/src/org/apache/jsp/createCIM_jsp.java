package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import uts.isd.model.*;
import uts.isd.controller.*;

public final class createCIM_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Create </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
            String existErr = (String) session.getAttribute("existErr");
            String emailErr = (String) session.getAttribute("emailErr");
            String passErr = (String) session.getAttribute("passErr");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1> Create </h1> \n");
      out.write("        \n");
      out.write("        <form action =\"Test\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                  <td>First Name </td>\n");
      out.write("                  <td> <input type=\"text\" placeholder=\"\" name=\"fName\" required=\"true\" > </td>  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"lName\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"password\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"email\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone Number: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"phoneNo\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Date of Birth: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"dob\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Is Customer: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"isCustomer\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Active: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"active\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Street Number: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"streetNo\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Street Name: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"streetName\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Postcode: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"postcode\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"state\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Suburb: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"suburb\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Country: </td>\n");
      out.write("                    <td> <input type=\"text\" placeholder=\"\" name=\"country\" required=\"true\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"CIM.jsp\" class=\"button\"> Cancel</a>\n");
      out.write("                        <input class=\"button\" type=\"submit\" value=\"Create\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
