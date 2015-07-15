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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/small-business.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Scripts -->\r\n");
      out.write("   \t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\" ></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/script.js\" ></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.js\" ></script>\r\n");
      out.write("\t<!-- End Scripts -->\r\n");
      out.write("\r\n");
      out.write("\t<title>:: Supermercado ::</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body  id=\"page-top\">\r\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"navbar-header page-scroll\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"#page-top\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/css/img/logo.png\" style=\"height:30px;\" alt=\"logo principal\"/>Supermercado Online</a>\r\n");
      out.write("            </div>\r\n");
      out.write("           <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                    <li class=\"hidden\">\r\n");
      out.write("                        <a href=\"#page-top\"></a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" id=\"home\" href=\"");
      out.print(request.getContextPath());
      out.write("\">Inicio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Carrito</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"page-scroll\" href=\"");
      out.print(request.getContextPath());
      out.write("/stock/ver\">Stock</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("               </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("       <!-- Page Content -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Heading Row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-8\">\r\n");
      out.write("                <img class=\"img-responsive img-rounded\" src=\"");
      out.print(request.getContextPath());
      out.write("/css/img/index.png\" alt=\"\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-md-8 -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h1>BIENVENIDO</h1>\r\n");
      out.write("                <h2>Supermercado</h2>\r\n");
      out.write("                <h5>compras on-line!</h5>\r\n");
      out.write("                <a class=\"btn btn-primary btn-lg\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Comprar   <span class=\"glyphicon glyphicon-hand-up\" aria-hidden=\"true\"></span></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-md-4 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Content Row -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("            \t<h2>Agregar al carrito   <span class=\"glyphicon glyphicon-hand-up\" aria-hidden=\"true\"></span></h2>\r\n");
      out.write("                <p>Una pantalla para que se agreguen productos al carrito (que se descuentan del stock), y\r\n");
      out.write("\t\t\t\tva mostrando el precio total del carrito a medida que se agregan cosas al mismo.\r\n");
      out.write("\t\t\t\tAdemás se puede agregar descuentos que pueden ser monto o porcentaje de\r\n");
      out.write("\t\t\t\tdescuento. En este caso la pantalla muestra el total con descuento y el ahorro\r\n");
      out.write("\t\t\t\tacumulado en el carrito. Esta pantalla tiene dos botones: cancelar, que elimina todo lo\r\n");
      out.write("\t\t\t\tagregado al carrito y lo restituye al stock; y confirmar que lleva a una pantalla donde se\r\n");
      out.write("\t\t\t\tmuestra como queda el carrito y su precio final</p>\r\n");
      out.write("                <a class=\"btn btn-warning\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Comprar!</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-md-4 -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("            \r\n");
      out.write("                <h2>Administrar Stock   <span class=\"glyphicon glyphicon-object-align-bottom\" aria-hidden=\"true\"></span></h2>\r\n");
      out.write("                <p>Una pantalla que muestre el stock de todos los productos existentes\r\n");
      out.write("\t\t\t\t\tUna pantalla para dar de alta un producto\r\n");
      out.write("\t\t\t\t\tUna pantalla para agregar stock a determinado producto, es decir se suma a lo que\r\n");
      out.write("\t\t\t\t\ttiene\r\n");
      out.write("\t\t\t\t\tUna pantalla para eliminar el stock de un producto</p>\r\n");
      out.write("                <a class=\"btn btn-warning\" href=\"");
      out.print(request.getContextPath());
      out.write("/stock/ver\">Ingresar!</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-md-4 -->\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <h2>Más información   <span class=\"glyphicon glyphicon-plus-sign\" aria-hidden=\"true\"></span></h2>\r\n");
      out.write("                <p>Acerca del grupo de trabajo</p>\r\n");
      out.write("                <a class=\"btn btn-warning\" href=\"#\">More Info</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.col-md-4 -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("\t\t<footer class=\"footer\">\r\n");
      out.write("\t\t      <div class=\"container\">\r\n");
      out.write("\t\t        <h4 class=\"text-muted\">Grupo Taller Web 1 - Unlam</h4>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t    </footer>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.container -->\r\n");
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
