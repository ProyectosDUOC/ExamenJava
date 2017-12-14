package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mobileAppWeb_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <!-- CSS  -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/materialize.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("        <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>        \n");
      out.write("        <link href=\"css/login.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("        <div id=\"login-page\" class=\"row\">\n");
      out.write("            <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                <form class=\"login-form\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12 center\">\n");
      out.write("                           <!-- <img src=\"images/login-logo.png\" alt=\"\" class=\"circle responsive-img valign profile-image-login\"> -->\n");
      out.write("                           <h1 class=\"black-text blue\">AutoPark</h1> \n");
      out.write("                           <p class=\"center login-form-text\">Auto Park 2017</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row margin\">\n");
      out.write("                        <div class=\"input-field col s12\">                            \n");
      out.write("                             <i class=\"material-icons left\">person_outline</i>\n");
      out.write("                            <input id=\"username\" type=\"text\">\n");
      out.write("                            <label for=\"username\" class=\"center-align\">Username</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row margin\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                             <i class=\"material-icons left\">lock_outline</i>\n");
      out.write("                            <input id=\"password\" type=\"password\">\n");
      out.write("                            <label for=\"password\">Password</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">          \n");
      out.write("                        <div class=\"input-field col s12 m12 l12  login-text\">\n");
      out.write("                            <input type=\"checkbox\" id=\"remember-me\" />\n");
      out.write("                            <label for=\"remember-me\">Remember me</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <a href=\"index.html\" class=\"btn waves-effect waves-light col s12\">Login</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s6 m6 l6\">\n");
      out.write("                            <p class=\"margin medium-small\"><a href=\"page-register.html\">Register Now!</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6 m6 l6\">\n");
      out.write("                            <p class=\"margin right-align medium-small\"><a href=\"page-forgot-password.html\">Forgot password ?</a></p>\n");
      out.write("                        </div>          \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/materialize.js\"></script>\n");
      out.write("        <script src=\"js/init.js\"></script> \n");
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
