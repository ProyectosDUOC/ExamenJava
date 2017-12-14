package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pagarCuentas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"blue darken-4\" role=\"navigation\">\n");
      out.write("            <div class=\"nav-wrapper container\"><a id=\"logo-container\" href=\"index.jsp\" class=\"brand-logo yellow-text\"><i class=\"large material-icons left\">directions_car</i>Auto Park</a>\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\n");
      out.write("                    <li><a href=\"index.jsp\">Inicio</a></li>                    \n");
      out.write("                    <li><a href=\"pagarCuentas.jsp\">Pagar</a></li>\n");
      out.write("                    <li><a href=\"buscarPagos.jsp\">Ver Pagos</a></li>\n");
      out.write("                    <li><a href=\"ayuda.jsp\">Ayuda</a></li>\n");
      out.write("                    <li><a href=\"verEstacionamientos.jsp\">Ver Estacionamientos</a></li>               \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>   \n");
      out.write("\n");
      out.write("        <div class=\"section\" id=\"acceso\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col s4 offset-s6\">\n");
      out.write("                    <div class=\"card  cyan darken-2\">\n");
      out.write("                        <div class=\"card-content white-text\">\n");
      out.write("                            <span class=\"card-title\">Datos Personales</span>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                                <input id=\"rut\" type=\"text\" maxlength=\"9\" name=\"rut\" required=\"requered\" /> \n");
      out.write("                                <label for=\"rut\" class=\"white-text\" >Rut  ejemplo 190000008</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">people</i>\n");
      out.write("                                <input id=\"nombre\" type=\"text\" name=\"Nombre\" required=\"requered\"/>\n");
      out.write("                                <label for=\"nombre\" class=\"white-text\">Nombre Completo</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">local_phone</i>\n");
      out.write("                                <input id=\"tel\" type=\"text\" maxlength=\"12\" required=\"requered\" />\n");
      out.write("                                <label for=\"tel\" class=\"white-text\">Telefono +569XXXXXXXX</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">email</i>\n");
      out.write("                                <input id=\"correo\" type=\"email\" name=\"correo\" required=\"requered\" />\n");
      out.write("                                <label for=\"correo\" class=\"white-text\">Correo Electronico @...</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"section\" id=\"Estacionamientos\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col s6 \">\n");
      out.write("                    <div class=\"card orange darken-1\">\n");
      out.write("                        <div class=\"card-content white-text\">\n");
      out.write("                            <span class=\"card-title center-align\">Estacionamientos</span>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <select name=\"etacionamientos\">\n");
      out.write("\n");
      out.write("                                    <option value=\"\" disabled selected>Estacionamientos</option>\n");
      out.write("                                    ");
for (Estacionamiento esta : listaEsta) {
                                            locacion = (new EstacionamientoLocalidadDAO()).Leer(esta.getIdEstacionamiento());
                                            comuna = (new ComunaDAO()).Leer(locacion.getIdComuna());
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(esta.getIdEstacionamiento());
      out.write('"');
      out.write('>');
      out.print(esta.getNombreEstacionamiento());
      out.write(" - ");
      out.print(comuna.getNombreComuna());
      out.write("</option>\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                    <option value=\"Calera de Tango\">Calera de Tango</option>\n");
      out.write("                                </select>\n");
      out.write("                                <label class=\"black-text\">Selecciones un Estacionamiento</label>\n");
      out.write("                                <button class=\"btn waves-effect waves-light center-align\" type=\"submit\" name=\"action\">Agregar\n");
      out.write("                                    <i class=\"material-icons right\">send</i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">people</i>\n");
      out.write("                                <input id=\"nombre\" type=\"text\" name=\"Nombre\" required=\"requered\"/>\n");
      out.write("                                <label for=\"nombre\" class=\"white-text\">Nombre Completo</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">local_phone</i>\n");
      out.write("                                <input id=\"tel\" type=\"text\" maxlength=\"12\" required=\"requered\" />\n");
      out.write("                                <label for=\"tel\" class=\"white-text\">Telefono +569XXXXXXXX</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <i class=\"material-icons prefix\">email</i>\n");
      out.write("                                <input id=\"correo\" type=\"email\" name=\"correo\" required=\"requered\" />\n");
      out.write("                                <label for=\"correo\" class=\"white-text\">Correo Electronico @...</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>                   \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"section\">\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"card blue-grey darken-1\">\n");
      out.write("\n");
      out.write("                        <div class=\"col s12 m8 l9\">                  \n");
      out.write("                            <p>\n");
      out.write("                                <input name=\"group1\" type=\"radio\" id=\"test1\" />\n");
      out.write("                                <label for=\"test1\">Red</label>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <input name=\"group1\" type=\"radio\" id=\"test2\" />\n");
      out.write("                                <label for=\"test2\">Yellow</label>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <input class=\"with-gap\" name=\"group1\" type=\"radio\" id=\"test3\" />\n");
      out.write("                                <label for=\"test3\">Green</label>\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                <input name=\"group1\" type=\"radio\" id=\"test4\" disabled=\"disabled\" />\n");
      out.write("                                <label for=\"test4\">Brown</label>\n");
      out.write("                            </p>                  \n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"#\" method=\"POST\">    \n");
      out.write("                <div class=\"input-field col s2 \">\n");
      out.write("                    <div class=\"input-field col s12\">\n");
      out.write("                        <select name=\"etacionamientos\">\n");
      out.write("\n");
      out.write("                            <option value=\"\" disabled selected>Estacionamientos</option>\n");
      out.write("                            ");
for (Estacionamiento esta : listaEsta) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(esta.getIdEstacionamiento());
      out.write('"');
      out.write('>');
      out.print(esta.getNombreEstacionamiento());
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            <option value=\"Calera de Tango\">Calera de Tango</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label>Comuna</label>\n");
      out.write("                    </div>\n");
      out.write("                    <input id=\"btnAgregar\" type=\"button\" value=\"Agrebar\" />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-field col s2 \">\n");
      out.write("                    Opciones de Pago:\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <p>\n");
      out.write("                        <input name=\"grupPago\" id=\"Radio1\" type=\"radio\" value=\"T\" checked/>\n");
      out.write("                        <label for=\"Radio1\">Transferencia</label>\n");
      out.write("                    </p>\n");
      out.write("                    <p>\n");
      out.write("                        <input name=\"grupoPago\" id=\"Radio2\" type=\"radio\" value=\"PL\"/>\n");
      out.write("                        <label for=\"Radio2\">Pago en Linea</label>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-field col s2 \">\n");
      out.write("                    Opciones de Envio de Boleta\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <input id=\"Radio4\" type=\"radio\" />Correo Eléctronico\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <input id=\"Radio5\" type=\"radio\" />Direccion Particular\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-field col s2 \">\n");
      out.write("                    lblPago\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <input id=\"btnPagar\" type=\"button\" value=\"Pagar\" />\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("    <script src=\"js/materialize.js\"></script>\n");
      out.write("    <script src=\"js/init.js\"></script> \n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('select').material_select();\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
