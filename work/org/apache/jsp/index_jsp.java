package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Inicio</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
<<<<<<< HEAD
      out.write("/css/style.css\"/>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\" ></script>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/script.js\" ></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("   <div class=\"header col-md-12\">      \r\n");
      out.write("  \r\n");
      out.write("   </div> \r\n");
      out.write(" \r\n");
      out.write("  <ul class=\"nav navbar-nav\" >\r\n");
=======
      out.write("/css/style.css\"/>\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\" ></script>\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/script.js\" ></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("   <div class=\"header col-md-12\">      \n");
      out.write("  \n");
      out.write("   </div> \n");
      out.write(" \n");
      out.write("  <ul class=\"nav navbar-nav\" >\n");
>>>>>>> 110dadb41c704cc051332c36ad1c59e7bda14ad9
      out.write("      <li style=\"display: inline;\" class=\"active\" ><a href=\"");
      out.print(request.getContextPath());
      out.write("\">HOME</a></li>\r\n");
      out.write("      <li style=\"display: inline;\"  ><a href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Carrito</a></li>     \r\n");
      out.write("      <li style=\"display: inline;\" ><a href=\"");
      out.print(request.getContextPath());
      out.write("/stock/ver\">stock</a></li>\r\n");
      out.write("    </ul>  \r\n");
      out.write("</nav>\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("\t\t<div class=\"col-md-12\">Inicio</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
