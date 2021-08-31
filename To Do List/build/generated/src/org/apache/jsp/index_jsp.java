package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/master.jsp");
    _jspx_dependants.add("/navbar.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_d_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_d_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_d_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_d_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_d_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_d_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_d_otherwise.release();
    _jspx_tagPool_d_out_value_nobody.release();
    _jspx_tagPool_d_when_test.release();
    _jspx_tagPool_d_choose.release();
    _jspx_tagPool_d_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <title>To Do</title>\n");
      out.write("        <link rel=\"icon\" href=\"todo.png\">\n");
      out.write("        <!-- <link href=\"https://fonts.googleapis.com/css?family=Lato:100\" rel=\"stylesheet\" type=\"text/css\"> -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\" >\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\" >  \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/logo-nav.css\" > \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
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
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/dropdown_menu.css\" >\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("                <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"/To_Do_List/\">\n");
      out.write("                <img height=\"55px\" width=\"60px\" src=\"todo.png\" alt=\"LOGO\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("            <!--                    <ul class=\"nav navbar-nav\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('student') }}\">Students</a>\n");
      out.write("                                </li>\n");
      out.write("                                 <li class=\"dropdown\">\n");
      out.write("                                     <a class=\"dropbtn\">Student</a>\n");
      out.write("                                     <div class=\"dropdown-content\">\n");
      out.write("                                          <a href=\"{{ url ('addstudent') }}\">Add Student</a>\n");
      out.write("                                          <a href=\"#\">Link 2</a>\n");
      out.write("                                          <a href=\"#\">Link 3</a>\n");
      out.write("                                     </div>\n");
      out.write("                                </li> \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('teacher') }}\">Teachers</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('courses_names') }}\">Courses</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('expense') }}\">Expenses</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('result') }}\">Results</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('report') }}\">Reports</a>\n");
      out.write("                                </li>\n");
      out.write("            \n");
      out.write("                                \n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"{{ url ('about') }}\">About</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"pull-right\" href=\"LogoutServlet\">Logout</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.navbar-collapse -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"content\">\n");
      out.write("<!--            @yield('content')-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/app-ajax.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h2 style=\"text-align: center;\">Welcome back  # <span style=\"color: #08c\">");
      if (_jspx_meth_d_out_0(_jspx_page_context))
        return;
      out.write("</span> #</h2>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div id=\"metual\" class=\"col-md-6 \" style=\"margin-left: 0;\">\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">To Do</div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"HomeServlet\" >\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"title\" class=\"col-md-4 control-label\">Title</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <input id=\"title\" type=\"text\" class=\"form-control\" required=\"\" name=\"title\" >\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"content\" class=\"col-md-4 control-label\">Content</label>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <textarea id=\"content\" style=\"height: 240px;width: 247px;\" \n");
      out.write("                                              type=\"text\" class=\"form-control\" required=\"\" name=\"content\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <div class=\"col-md-4 col-md-offset-6\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">\n");
      out.write("                                        <i class=\"fa fa-btn fa-user\"></i> Save\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\" >\n");
      out.write("                <div class=\"panel panel-success\" style=\"\n");
      out.write("                     height: 440px;\n");
      out.write("                     overflow: scroll;\n");
      out.write("                     overflow-x: hidden \" >\n");
      out.write("                    <div class=\"panel-heading \"><h3>To Do Lists</h3></div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                    ");
      if (_jspx_meth_d_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"hi\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
    _jspx_th_d_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_d_out_0 = _jspx_th_d_out_0.doStartTag();
    if (_jspx_th_d_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_0);
      return true;
    }
    _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_0);
    return false;
  }

  private boolean _jspx_meth_d_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_d_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_d_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_d_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_d_forEach_0.setParent(null);
    _jspx_th_d_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.todoList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_d_forEach_0.setVar("list");
    int[] _jspx_push_body_count_d_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_d_forEach_0 = _jspx_th_d_forEach_0.doStartTag();
      if (_jspx_eval_d_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        ");
          if (_jspx_meth_d_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_forEach_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
            return true;
          out.write("\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_d_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_d_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_d_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_d_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_d_forEach_0.doFinally();
      _jspx_tagPool_d_forEach_var_items.reuse(_jspx_th_d_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_d_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_d_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_d_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_d_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_d_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_d_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_forEach_0);
    int _jspx_eval_d_choose_0 = _jspx_th_d_choose_0.doStartTag();
    if (_jspx_eval_d_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_choose_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_d_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_choose_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_d_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_d_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_choose.reuse(_jspx_th_d_choose_0);
      return true;
    }
    _jspx_tagPool_d_choose.reuse(_jspx_th_d_choose_0);
    return false;
  }

  private boolean _jspx_meth_d_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_d_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_d_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_d_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_d_when_0.setPageContext(_jspx_page_context);
    _jspx_th_d_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_choose_0);
    _jspx_th_d_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.completed ==false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_d_when_0 = _jspx_th_d_when_0.doStartTag();
    if (_jspx_eval_d_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"col-sm-6\">\n");
        out.write("                                    <div class=\"panel panel-inverse-primary\">\n");
        out.write("                                        <div class=\"panel-heading\">\n");
        out.write("                                            <div class=\"row\">\n");
        out.write("                                                <h3>\n");
        out.write("                                                    <div class=\"col-xs-12 \">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                        <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                               value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\n");
        out.write("                                                        <div class=\"\">");
        if (_jspx_meth_d_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_when_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
          return true;
        out.write("\n");
        out.write("                                                            </div> \n");
        out.write("                                                        </div>\n");
        out.write("                                                    </h3> \n");
        out.write("                                                    <div class=\"col-xs-12 \">");
        if (_jspx_meth_d_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_when_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
          return true;
        out.write("</div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("\n");
        out.write("                                            <div class=\"panel-footer\">\n");
        out.write("                                                <div class=\"row\" class=\"col-xs-12 \">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    <form class=\"col-xs-12\" style=\"width: 31%;\" action=\"GoToUpdateServlet\" method=\"post\">\n");
        out.write("                                                        <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                               value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><button type=\"submit\" class=\"btn btn-warning\">\n");
        out.write("                                                        Edit\n");
        out.write("                                                    </button></form>\n");
        out.write("\n");
        out.write("                                                <form class=\"col-xs-12\" style=\"width: 31%;\" action=\"CompletedServlet\" method=\"post\">\n");
        out.write("                                                    <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                           value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><button type=\"submit\"  class=\"btn btn-success\">\n");
        out.write("                                                        <i class=\"fa fa-btn fa-user\"></i> Done\n");
        out.write("                                                    </button>\n");
        out.write("                                                </form>\n");
        out.write("                                                <form class=\"col-xs-12\" style=\"width: 31%;\" action=\"DeleteServlet\" method=\"post\">\n");
        out.write("                                                    <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                           value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><button type=\"submit\" class=\"btn btn-danger\">\n");
        out.write("                                                        Delete\n");
        out.write("                                                    </button></form>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_d_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_d_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_when_test.reuse(_jspx_th_d_when_0);
      return true;
    }
    _jspx_tagPool_d_when_test.reuse(_jspx_th_d_when_0);
    return false;
  }

  private boolean _jspx_meth_d_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_d_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_d_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_d_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_d_out_1.setPageContext(_jspx_page_context);
    _jspx_th_d_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_when_0);
    _jspx_th_d_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_d_out_1 = _jspx_th_d_out_1.doStartTag();
    if (_jspx_th_d_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_1);
      return true;
    }
    _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_1);
    return false;
  }

  private boolean _jspx_meth_d_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_d_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_d_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_d_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_d_out_2.setPageContext(_jspx_page_context);
    _jspx_th_d_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_when_0);
    _jspx_th_d_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.content}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_d_out_2 = _jspx_th_d_out_2.doStartTag();
    if (_jspx_th_d_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_2);
      return true;
    }
    _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_2);
    return false;
  }

  private boolean _jspx_meth_d_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_d_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_d_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_d_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_d_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_d_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_choose_0);
    int _jspx_eval_d_otherwise_0 = _jspx_th_d_otherwise_0.doStartTag();
    if (_jspx_eval_d_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"col-sm-6\">\n");
        out.write("                                    <div class=\"panel panel-inverse-primary\">\n");
        out.write("                                        <div class=\"panel-heading\">\n");
        out.write("                                            <div class=\"row\">\n");
        out.write("                                                <h3>\n");
        out.write("                                                    <div class=\"col-xs-12 \">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                        <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                               value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("\n");
        out.write("                                                        <div class=\"\"><strike>");
        if (_jspx_meth_d_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_otherwise_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
          return true;
        out.write("</strike>\n");
        out.write("                                                            </div> \n");
        out.write("                                                        </div>\n");
        out.write("                                                    </h3> \n");
        out.write("                                                    <div class=\"col-xs-12 \"><strike>");
        if (_jspx_meth_d_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_d_otherwise_0, _jspx_page_context, _jspx_push_body_count_d_forEach_0))
          return true;
        out.write("</strike></div>\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("\n");
        out.write("                                            <div class=\"panel-footer\">\n");
        out.write("                                                <div class=\"row\" class=\"col-xs-12 \">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                    <form class=\"col-xs-12\" style=\"width: 31%;\" action=\"GoToUpdateServlet\" method=\"post\">\n");
        out.write("                                                        <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                               value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><button type=\"submit\" class=\"btn btn-warning\">\n");
        out.write("                                                        Edit\n");
        out.write("                                                    </button></form>\n");
        out.write("\n");
        out.write("                                                <form class=\"col-xs-12\" style=\"width: 31%;\" action=\"DeleteServlet\" method=\"post\">\n");
        out.write("                                                    <input hidden=\"hidden\" id=\"task_id\" name=\"task_id\"\n");
        out.write("                                                           value=\" ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"><button type=\"submit\" class=\"btn btn-danger\">\n");
        out.write("                                                        Delete\n");
        out.write("                                                    </button></form>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_d_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_d_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_otherwise.reuse(_jspx_th_d_otherwise_0);
      return true;
    }
    _jspx_tagPool_d_otherwise.reuse(_jspx_th_d_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_d_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_d_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_d_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_d_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_d_out_3.setPageContext(_jspx_page_context);
    _jspx_th_d_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_otherwise_0);
    _jspx_th_d_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_d_out_3 = _jspx_th_d_out_3.doStartTag();
    if (_jspx_th_d_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_3);
      return true;
    }
    _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_3);
    return false;
  }

  private boolean _jspx_meth_d_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_d_otherwise_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_d_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  d:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_d_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_d_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_d_out_4.setPageContext(_jspx_page_context);
    _jspx_th_d_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_d_otherwise_0);
    _jspx_th_d_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.content}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_d_out_4 = _jspx_th_d_out_4.doStartTag();
    if (_jspx_th_d_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_4);
      return true;
    }
    _jspx_tagPool_d_out_value_nobody.reuse(_jspx_th_d_out_4);
    return false;
  }
}
