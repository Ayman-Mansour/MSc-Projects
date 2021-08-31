package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" >\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" >  \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/logo-nav.css\" > \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" >\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">Register</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"RegisterServlet\" >\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                            <label for=\"name\" class=\"col-md-4 control-label\">Name</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"name\" type=\"text\" class=\"form-control\" required=\"\" name=\"name\" >\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password\" class=\"col-md-4 control-label\">Password</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"password\" type=\"password\" class=\"form-control\" required=\"\" name=\"password\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password-confirm\" class=\"col-md-4 control-label\">Confirm Password</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"password-confirm\" type=\"password\" class=\"form-control\" required=\"\" name=\"password_confirmation\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <div class=\"col-md-6 col-md-offset-6\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                    <i class=\"fa fa-btn fa-user\"></i> Register\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
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
