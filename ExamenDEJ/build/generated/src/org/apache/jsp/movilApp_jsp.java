package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movilApp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>     \n");
      out.write("        <div id=\"login-page\" class=\"row\">\n");
      out.write("            <div class=\"col s12 z-depth-4 card-panel\">\n");
      out.write("                <form class=\"login-form\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12 center\">\n");
      out.write("                           <!-- <img src=\"images/login-logo.png\" alt=\"\" class=\"circle responsive-img valign profile-image-login\"> -->\n");
      out.write("                           <h1 class=\"black-text\">Auto Park Online</h1> \n");
      out.write("                           <p class=\"center\">Para la comodida de nuestro clientes, siempre y cuando lo necesite</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row margin\">\n");
      out.write("                        <i class=\"material-icons left\">person_outline</i>\n");
      out.write("                        <div class=\"input-field col s12\">                                \n");
      out.write("                             <input id=\"rut\" type=\"text\" required=\"\">\n");
      out.write("                            <label for=\"rut\" class=\"center-align\">Rut Cliente</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                 \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s12\">\n");
      out.write("                            <a href=\"index.html\" class=\"btn waves-effect waves-light col s12\">Acceder</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"input-field col s6 m6 l6\">\n");
      out.write("                            <p class=\"margin medium-small\"><a href=\"index.jsp\">Registrate Ahora</a></p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"input-field col s6 m6 l6\">\n");
      out.write("                            <p class=\"margin right-align medium-small\"><a href=\"ayuda.jsp\">¿Has olvidad tu clave?</a></p>\n");
      out.write("                        </div>          \n");
      out.write("                    </div>\n");
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
