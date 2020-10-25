package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ficha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <form action=\"fichaC\" method=\"get\">\n");
      out.write("        <div>\n");
      out.write("            <div></div>\n");
      out.write("            <div>\n");
      out.write("                <figure></figure>\n");
      out.write("\n");
      out.write("                <input type=\"submit\" value=\"Guardad\">\n");
      out.write("                <input type=\"button\" value=\"Cancelar\">\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <label for=\"nombre\"><p>Nombre:</p></label>\n");
      out.write("                <input type=\"text\" name=\"nombre\" id=\"nombre\" class=\"nombre\">\n");
      out.write("                <label for=\"codigo\"><p>Codigo:</p></label>\n");
      out.write("                <input type=\"number\" name=\"codigo\" id=\"codigo\" class=\"codigo\">\n");
      out.write("            </div>\n");
      out.write("            <div></div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <label for=\"tomo\"><p>Tomo:</p></label><br>\n");
      out.write("            <input type=\"number\" name=\"tomo\" id=\"tomo\" class=\"tomo\">\n");
      out.write("            <label for=\"origen\"><p>Origen:</p></label><br>\n");
      out.write("            <input type=\"text\" name=\"origen\" id=\"origen\" class=\"origen\">\n");
      out.write("            <label for=\"editorial\"><p>Editorial:</p></label>\n");
      out.write("            <input type=\"text\" name=\"editorial\" id=\"editorial\" class=\"editorial\">\n");
      out.write("            <label for=\"idioma\"><p>Idioma:</p></label>\n");
      out.write("            <input type=\"text\" name=\"idioma\" id=\"idioma\" class=\"idioma\">\n");
      out.write("            <label for=\"caracteristicas\"><p>Caracteristicas:</p></label>\n");
      out.write("            <input type=\"text\" name=\"caracteristicas\" id=\"caracteristicas\" class=\"caracteristicas\">\n");
      out.write("        </div>\n");
      out.write("        <div></div>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
