/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-10-30 08:08:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class wangzi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/createMe/common.jsp", Long.valueOf(1604043653153L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/blog/createMe/animation.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/blog/createMe/css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/blog/createMe/css/inputStyle.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"/blog/css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/blog/css/alert.css\">\r\n");
      out.write("<script src=\"/blog/js/alert.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/alert-api.js\"></script>\r\n");
      out.write("<script src='/blog/js/SyntaxHighlighter/shCore.js'></script>\r\n");
      out.write("<script src='/blog/js/SyntaxHighlighter/makeSy.js'></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/blog/js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/hplus.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("        src=\"/blog/js/flavr/flavr/js/flavr.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/blog/js/flavr/base.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/validation.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/plugins/toastr/toastr.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"/blog/js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/blog/js/jquery.MyDigitClock.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"/blog/js/laydate/laydate.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>后台-登录</title>\r\n");
      out.write("    <style>\r\n");
      out.write("   .form-input{\r\n");
      out.write("\r\n");
      out.write("       margin-top: 15px;\r\n");
      out.write("   }\r\n");
      out.write("\r\n");
      out.write(".buttonStyle{\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    background-color: #1ab394;\r\n");
      out.write("    border-color: #1ab394;\r\n");
      out.write("    color: #FFFFFF;\r\n");
      out.write("    display: block;\r\n");
      out.write("    width: 100% !important;\r\n");
      out.write("    margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"/blog/img/demo-1-bg.jpg\">\r\n");
      out.write("     <div class=\"login  animated  fadeInDown\">\r\n");
      out.write("         <div>\r\n");
      out.write("             <div>\r\n");
      out.write("                 <h2 style=\"color: white\">秋波的秘密空间 </h2>\r\n");
      out.write("             </div>\r\n");
      out.write("             <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("            <form id=\"form\" method=\"post\" class=\"form-input\" role=\"form\" action=\"/blog/wangzi\" onsubmit=\"return login()\">\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("                 <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"userName\" id=\"userName\" placeholder=\"用户名\" autofocus\r\n");
      out.write("                 class=\"form-control\">\r\n");
      out.write("             </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("             <div class=\"form-group\">\r\n");
      out.write("                 <input type=\"text\" name=\"password\" placeholder=\"密码\" class=\"form-control\">\r\n");
      out.write("             </div>\r\n");
      out.write("                <div class=\"form\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <label style=\"position: absolute ;left:200px;\">\r\n");
      out.write("                            <img src=\"/blog/code\" id=\"img\" type=\"image\" style=\"cursor: pointer\"/></label>\r\n");
      out.write("                        <input type=\"text\" name=\"authCode\" class=\"form-control\" id=\"autoCode\"\r\n");
      out.write("                        style=\"width: 150px \" placeholder=\"验证码\">\r\n");
      out.write("                    <script>\r\n");
      out.write("                        var img = document.getElementById(\"img\");\r\n");
      out.write("                        img.onclick = function (ev) {\r\n");
      out.write("                            this.src = \"/blog/code?time=\" + new Date();\r\n");
      out.write("                        }\r\n");
      out.write("                    </script>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                 <input type=\"submit\" value=\"登录\" class=\"btn btn-primary block full-width m-b\">\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("         </div>\r\n");
      out.write("     </div>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            //登录\r\n");
      out.write("            function login() {\r\n");
      out.write("                var username = $(\"#userName\").val();\r\n");
      out.write("                var password = $(\"#password\").val();\r\n");
      out.write("                var autoCode = $(\"#autoCode\").val();\r\n");
      out.write("\r\n");
      out.write("                if (username == \"\") {\r\n");
      out.write("                    alert(\"用户名不能为空\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (password == \"\") {\r\n");
      out.write("                    alert(\"密码不能为空\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (autoCode == \"\") {\r\n");
      out.write("                    alert(\"验证码不能为空\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
