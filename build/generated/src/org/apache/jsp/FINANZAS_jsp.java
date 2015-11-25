package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FINANZAS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <title>FINANZAS</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body {\r\n");
      out.write("\tbackground-color: #CCC;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>FINANZAS  ESTATUS DE CONTROL FINANCIERO    <img src=\"PICTURES/sakiko_finanzas.png\" width=\"86\" height=\"102\"></h1>\r\n");
      out.write("    <table width=\"670\" height=\"332\" border=\"1\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"121\">PRODUCTO</td>\r\n");
      out.write("            <td width=\"121\">UNIDADES VENDIDAS</td>\r\n");
      out.write("            <td width=\"158\">COSTO PRODUCTO</td>\r\n");
      out.write("            <td width=\"136\"> TOTAL VENDIDO</td>\r\n");
      out.write("            <td width=\"100\">GANANCIA</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>GYOZA</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\"> 45</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>URAMAKI</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">36</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>SASHIMI</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">67</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>NIGIRIS</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">45</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>KAKIAGE</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">34</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>EBI FRIED</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">87</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>YAKIMESHI</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">54</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>PULPO</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">44</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>LANGOSTINO</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">76</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>YAKISOBA</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">54</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td><strong>YAKITORI</strong></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td align=\"center\">34</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    <table width=\"303\" height=\"4\" border=\"1\">\r\n");
      out.write("    </table>\r\n");
      out.write("    <table width=\"672\" border=\"1\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th width=\"123\" rowspan=\"2\" scope=\"col\">TOTAL</th>\r\n");
      out.write("        <th width=\"210\" scope=\"col\">&nbsp;</th>\r\n");
      out.write("        <th width=\"210\" scope=\"col\">&nbsp;</th>\r\n");
      out.write("        <th width=\"101\" scope=\"col\">&nbsp;</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td>UNIDADES VENDIDAS</td>\r\n");
      out.write("        <td align=\"center\">INGRESOS</td>\r\n");
      out.write("        <td align=\"center\">SALDO</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("        <p><a href=\"index.jsp\">REGRESAR A INICIO</a></p>\r\n");
      out.write("    </body>\r\n");
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
