package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SAKIKO</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body {\r\n");
      out.write("\tbackground-color: #CCC;\r\n");
      out.write("}\r\n");
      out.write("    </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<B><CENTER>\r\n");
      out.write("  <H1><B><img src=\"PICTURES/sakiko.png\" alt=\"\" width=\"130\" height=\"128\"></B> SAKIKO     <img src=\"PICTURES/sakiko.png\" width=\"130\" height=\"128\"></H1>\r\n");
      out.write("  </P></P> \r\n");
      out.write("</CENTER>\r\n");
      out.write("</B>\r\n");
      out.write("<table width=\"882\" height=\"377\" border=\"1\" align=\"center\">\r\n");
      out.write("  <tr></tr>\r\n");
      out.write("  <caption>\r\n");
      out.write("BIENVENIDO A SAKIKO\r\n");
      out.write("  </caption>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\"> <p><a href=\"CARTA.jsp\">CARTA</a></p></td>  \r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\"> <p><a href=\"ESTATUS.jsp\">ESTATUS</a></p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\"> <p><a href=\"FINANZAS.jsp\">FINANZAS</a></p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td align=\"center\"> <p><a href=\"RESERVACIONES.jsp\">RESERVACIONES</a></p></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
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
