package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verCarrito_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fclass_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fclass_005faction.release();
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
      out.write("<link rel=\"shortcut icon\" href=\"/supermercado/css/img/logo.png\">\n");
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
      out.write("\n");
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
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("\t\t<div>\n");
      out.write("\t\t\t<h1>Productos en carrito</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\t\t<!-- COMIENZO MENSAJES -->\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div id=\"msjAlert00\" class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden\">\n");
      out.write("\t\t\t\t<p><span class=\"glyphicon glyphicon-warning-sign\"></span>&nbsp; ATENCI&Oacute;N: Est&aacute; seguro de querer cancelar su compra? Esta operación vaciar&aacute; su carrito de compras.</p>\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/vaciar\" class=\"btn btn-warning\">Aceptar</a>&nbsp;\n");
      out.write("\t\t\t\t<input type=\"button\" onclick=\"cancelarVaciarCarrito()\" class=\"btn btn-warning\" value=\"cancelar\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"msjAlert01\" class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden\">\n");
      out.write("\t\t\t\t<p><span class=\"glyphicon glyphicon-warning-sign\"></span>&nbsp; Por favor ingrese un descuento.</p>\n");
      out.write("\t\t\t\t<input type=\"button\" onclick=\"hideMsj('msjAlert01')\" class=\"btn btn-warning\" value=\"Aceptar\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- FIN MENSAJES -->\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("        <!-- Heading Row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("               <div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<td>Nombre</td>\n");
      out.write("\t\t\t\t\t\t<td>Precio</td>\n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("            \t</div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-8 -->\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("\t            <div class=\"row\">\n");
      out.write("\t\t            <div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t<a  class=\"btn btn-success btn-block opcionesCarrito\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/listarProductos\">agregar producto</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t <div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t <h4>Descuentos</h4>\n");
      out.write("\t\t\t\t\t\t ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"separador\"></div>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label label-warning\">Total Sin Descuento</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"numeric\"  disabled class=\"form-control\" name=\"\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalSinDescuentos}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/> \n");
      out.write("\t\t\t\t\t\t<span class=\"label label-success\">Ahorro</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" min=\"1\"  disabled class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalAhorro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"name=\"cantidad\"/> \n");
      out.write("\t\t\t\t\t\t<span class=\"label label-primary\">Total</span>\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" min=\"1\"  disabled class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"cantidad\"/> \n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/confirmarCompra\" class=\"btn btn-primary btn-block opcionesCarrito\">Confirmar</a>\n");
      out.write("\t\t\t\t \t\t<input type=\"button\" onclick=\"vaciarCarritoCompras()\" class=\"btn btn-danger btn-block opcionesCarrito\" value=\"Cancelar\"/>\n");
      out.write("\t\t\t\t \t</div>\n");
      out.write("\t            </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.col-md-4 -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.row -->\n");
      out.write("\t\n");
      out.write("\t</div>\n");
      out.write("\t\t<!-- Scripts -->\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/verCarrito.jsp(76,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/verCarrito.jsp(76,5) '${productos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${productos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/verCarrito.jsp(76,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("dato");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dato.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dato.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\n");
          out.write("\t\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fclass_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/verCarrito.jsp(95,7) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/verCarrito.jsp(95,7) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("frmCalculoDescuento");
    // /WEB-INF/jsp/verCarrito.jsp(95,7) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("/carrito/agregar/descuento");
    // /WEB-INF/jsp/verCarrito.jsp(95,7) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "class", new String("form-inline"));
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t<select name=\"tipo\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t\t\t  <option value=\"0\">Porcentaje</option>\n");
          out.write("\t\t\t\t\t\t\t\t  <option value=\"1\">Monto</option>\n");
          out.write("\t\t\t\t\t\t\t\t</select>\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t<input type=\"number\" min=\"1\" class=\"form-control number\" id=\"cantidadDescuento\" name=\"cantidad\"/> \n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t\t\t\t\t<input onclick=\"validarDescuento()\" class=\"btn btn-primary  \" type=\"button\" value=\"Aplicar descuento\">\n");
          out.write("\t\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005fclass_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
