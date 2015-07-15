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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/small-business.css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\"/>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("\t<!-- Scripts -->\n");
      out.write("   \t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\" ></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/script.js\" ></script>\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.js\" ></script>\n");
      out.write("\t<!-- End Scripts -->\n");
      out.write("\n");
      out.write("\t<title>:: Supermercado ::</title>\n");
      out.write("</head>\n");
      out.write("<body  id=\"page-top\">\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"navbar-header page-scroll\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand page-scroll\" href=\"#page-top\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/css/img/logo.png\" style=\"height:30px;\" alt=\"logo principal\"/>Supermercado Online</a>\n");
      out.write("            </div>\n");
      out.write("           <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li class=\"hidden\">\n");
      out.write("                        <a href=\"#page-top\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" id=\"home\" href=\"");
      out.print(request.getContextPath());
      out.write("\">Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Carrito</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"page-scroll\" href=\"");
      out.print(request.getContextPath());
      out.write("/stock/ver\">Stock</a>\n");
      out.write("                    </li>\n");
      out.write("               </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("       <!-- Page Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <!-- Heading Row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <img class=\"img-responsive img-rounded\" src=\"");
      out.print(request.getContextPath());
      out.write("/css/img/index.png\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-8 -->\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h1>BIENVENIDO</h1>\n");
      out.write("                <h2>Supermercado</h2>\n");
      out.write("                <h5>compras on-line!</h5>\n");
      out.write("                <a class=\"btn btn-primary btn-lg\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Comprar   <span class=\"glyphicon glyphicon-hand-up\" aria-hidden=\"true\"></span></a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-4 -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("        <!-- Content Row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("            \t<h2>Agregar al carrito   <span class=\"glyphicon glyphicon-hand-up\" aria-hidden=\"true\"></span></h2>\n");
      out.write("                <p>Una pantalla para que se agreguen productos al carrito (que se descuentan del stock), y\n");
      out.write("\t\t\t\tva mostrando el precio total del carrito a medida que se agregan cosas al mismo.\n");
      out.write("\t\t\t\tAdemás se puede agregar descuentos que pueden ser monto o porcentaje de\n");
      out.write("\t\t\t\tdescuento. En este caso la pantalla muestra el total con descuento y el ahorro\n");
      out.write("\t\t\t\tacumulado en el carrito. Esta pantalla tiene dos botones: cancelar, que elimina todo lo\n");
      out.write("\t\t\t\tagregado al carrito y lo restituye al stock; y confirmar que lleva a una pantalla donde se\n");
      out.write("\t\t\t\tmuestra como queda el carrito y su precio final</p>\n");
      out.write("                <a class=\"btn btn-warning\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Comprar!</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-4 -->\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("            \n");
      out.write("                <h2>Administrar Stock   <span class=\"glyphicon glyphicon-object-align-bottom\" aria-hidden=\"true\"></span></h2>\n");
      out.write("                <p>Una pantalla que muestre el stock de todos los productos existentes\n");
      out.write("\t\t\t\t\tUna pantalla para dar de alta un producto\n");
      out.write("\t\t\t\t\tUna pantalla para agregar stock a determinado producto, es decir se suma a lo que\n");
      out.write("\t\t\t\t\ttiene\n");
      out.write("\t\t\t\t\tUna pantalla para eliminar el stock de un producto</p>\n");
      out.write("                <a class=\"btn btn-warning\" href=\"");
      out.print(request.getContextPath());
      out.write("/stock/ver\">Ingresar!</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-4 -->\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <h2>Más información   <span class=\"glyphicon glyphicon-plus-sign\" aria-hidden=\"true\"></span></h2>\n");
      out.write("                <p>Acerca del grupo de trabajo</p>\n");
      out.write("                <a class=\"btn btn-warning\" href=\"#\">More Info</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-4 -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("\t\t<footer class=\"footer\">\n");
      out.write("\t\t      <div class=\"container\">\n");
      out.write("\t\t        <h4 class=\"text-muted\">Grupo Taller Web 1 - Unlam</h4>\n");
      out.write("\t\t      </div>\n");
      out.write("\t    </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\t\n");
      out.write("</body>\n");
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
