package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_d_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_d_out_value_nobody.release();
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
      out.write("<link rel=\"icon\" href=\"todo.png\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" >\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" >  \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/logo-nav.css\" > \n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" >\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("<!--    <div class=\"row\">\n");
      out.write("        <img style=\"margin: auto; display: block;\n");
      out.write("\n");
      out.write("        \" height=\"150px\" width=\"150px\" src=\"{{asset('loginicon.png')}}\" alt=\"LOGO\">\n");
      out.write("        <br>\n");
      out.write("    </div>-->\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">Login</div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"LoginServlet\" >\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"name\" class=\"col-md-4 control-label\">User Name</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"name\" type=\"name\" class=\"form-control\" required=\"\" name=\"name\" >\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"password\" class=\"col-md-4 control-label\">Password</label>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input id=\"password\" type=\"password\" class=\"form-control\" required=\"\" name=\"password\">\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group\" >\n");
      out.write("                            <div class=\"col-md-6 col-md-offset-6\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                    <i class=\"fa fa-btn fa-sign-in\"></i> Login\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                                <a class=\"btn btn-link\" href=\"register.jsp\">Register</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("<h4 style=\"text-align: center;\">Last Login at ( <span style=\"color: #08c\">");
      if (_jspx_meth_d_out_0(_jspx_page_context))
        return;
      out.write("</span> )</h4>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_d_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_d_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_d_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_d_out_0.setPageContext(_jspx_page_context);
    _jspx_th_d_out_0.setParent(null);
    _jspx_th_d_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastvisit}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_d_out_0 = _jspx_th_d_out_0.doStartTag();
    if (_jspx_th_d_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_0);
      return true;
    }
    _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_0);
    return false;
  }
}
