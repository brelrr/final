package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CARTA_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>CARTA</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body {\r\n");
      out.write("\tbackground-color: #CCC;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1 align=\"center\">BIENVENIDO A SAKIKO   <img src=\"PICTURES/sakiko_menu.png\" width=\"151\" height=\"163\"></h1>\r\n");
      out.write("        <p align=\"center\"> FAVOR DE SELECCIONAR EL PEDIDO QUE DESEA ORDENAR,GRACIAS.</p>\r\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"PRINCIPAL.java\">\r\n");
      out.write("<table width=\"539\" height=\"636\" border=\"1\" align=\"center\" name=\"TABLA\">\r\n");
      out.write("  <tr>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"gyoza\" id=\"gyoza\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>GYOZA</strong> (EMPANADITAS  AL VAPOR) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><label for=\"uramaki\"></label>\r\n");
      out.write("              <div align=\"left\">\r\n");
      out.write("                <select name=\"uramaki\" id=\"uramaki\">\r\n");
      out.write("                  <option selected=\"selected\">0</option>\r\n");
      out.write("                  <option>1</option>\r\n");
      out.write("                  <option>2</option>\r\n");
      out.write("                  <option>3</option>\r\n");
      out.write("                  <option>4</option>\r\n");
      out.write("                  <option>5</option>\r\n");
      out.write("                  <option>6</option>\r\n");
      out.write("                  <option>7</option>\r\n");
      out.write("                  <option>8</option>\r\n");
      out.write("                  <option>9</option>\r\n");
      out.write("                  <option>10</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            <strong>URAMAKI</strong> (ARROLLADO DE ARROZ) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"sashimi\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"sashimi\" id=\"sashimi\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>SASHIMI</strong>(LAMINAS DE PESCADO FRESCO) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"nigiris\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"nigiris\" id=\"nigiris\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>NIGIRIS</strong> (SALMON ROSADO) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><label for=\"kakiage\"></label>\r\n");
      out.write("              <div align=\"left\">\r\n");
      out.write("                <select name=\"kakiage\" id=\"kakiage\">\r\n");
      out.write("                  <option selected=\"selected\">0</option>\r\n");
      out.write("                  <option>1</option>\r\n");
      out.write("                  <option>2</option>\r\n");
      out.write("                  <option>3</option>\r\n");
      out.write("                  <option>4</option>\r\n");
      out.write("                  <option>5</option>\r\n");
      out.write("                  <option>6</option>\r\n");
      out.write("                  <option>7</option>\r\n");
      out.write("                  <option>8</option>\r\n");
      out.write("                  <option>9</option>\r\n");
      out.write("                  <option>10</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            <strong>KAKIAGE</strong> (TEMPURA DE VEGETALES) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"ebi\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"ebi\" id=\"ebi\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>EBI FRIED</strong> (LANGOSTINOS CROCANTES CON ENSALADA) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"yakimeshi\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"yakimeshi\" id=\"yakimeshi\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>YAKIMESHI</strong> (ARROZ SALTEADO) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"pulpo\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"pulpo\" id=\"pulpo\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>PULPO</strong> (PULPO) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"langostino\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"langostino\" id=\"langostino\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>LANGOSTINO</strong> (LANGOSTINO) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"yakisoba\"></label>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <select name=\"yakisoba\" id=\"yakisoba\">\r\n");
      out.write("                <option selected=\"selected\">0</option>\r\n");
      out.write("                <option>1</option>\r\n");
      out.write("                <option>2</option>\r\n");
      out.write("                <option>3</option>\r\n");
      out.write("                <option>4</option>\r\n");
      out.write("                <option>5</option>\r\n");
      out.write("                <option>6</option>\r\n");
      out.write("                <option>7</option>\r\n");
      out.write("                <option>8</option>\r\n");
      out.write("                <option>9</option>\r\n");
      out.write("                <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>YAKISOBA</strong> (FIDEOS DE TRIGO) </div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr><label for=\"yakitori\"></label>\r\n");
      out.write("            <td><select name=\"yakitori\" id=\"yakitori\">\r\n");
      out.write("              <option selected=\"selected\">0</option>\r\n");
      out.write("              <option>1</option>\r\n");
      out.write("              <option>2</option>\r\n");
      out.write("              <option>3</option>\r\n");
      out.write("              <option>4</option>\r\n");
      out.write("              <option>5</option>\r\n");
      out.write("              <option>6</option>\r\n");
      out.write("              <option>7</option>\r\n");
      out.write("              <option>8</option>\r\n");
      out.write("              <option>9</option>\r\n");
      out.write("              <option>10</option>\r\n");
      out.write("              </select>\r\n");
      out.write("            <strong>YAKITORI</strong> (BROCHETTE DE POLLO AL JENGIBRE) </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><div align=\"left\">\r\n");
      out.write("              <input type=\"submit\" name=\"ENVIAR\" id=\"ENVIAR\" value=\"Enviar\">\r\n");
      out.write("*Al dar click aceptas los términos y condiciones de SAKIKO</div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("        </form>\r\n");
      out.write(" <p><a href=\"index.jsp\">REGRESAR A INICIO</a></p>\r\n");
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