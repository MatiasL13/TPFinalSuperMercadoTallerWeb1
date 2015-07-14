package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verCarrito_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005faction;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005faction.release();
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\"/>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\" ></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/script.js\" ></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<title></title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("   <div class=\"header col-md-12\">      \r\n");
      out.write("  \r\n");
      out.write("   </div> \r\n");
      out.write(" \r\n");
      out.write("  <ul class=\"nav navbar-nav\" >\r\n");
      out.write("      <li style=\"display: inline;\" ><a href=\"");
      out.print(request.getContextPath());
      out.write("\">HOME</a></li>\r\n");
      out.write("      <li style=\"display: inline;\" class=\"active\" ><a href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/ver\">Carrito</a></li>     \r\n");
      out.write("      <li style=\"display: inline;\" ><a href=\"");
      out.print(request.getContextPath());
      out.write("/stock/ver\">stock</a></li>\r\n");
      out.write("    </ul>  \r\n");
      out.write("</nav>\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("\t<legend>Productos en carrito</legend>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\t<div id=\"msjAlert00\" class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden\">\r\n");
      out.write("\t\t<p><span class=\"glyphicon glyphicon-warning-sign\"></span>&nbsp; ATENCI&Oacute;N: Est&aacute; seguro de querer cancelar su compra? Esta operación vaciar&aacute; su carrito de compras.</p>\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/vaciar\" class=\"btn btn-warning\">Aceptar</a>&nbsp;\r\n");
      out.write("\t\t<input type=\"button\" onclick=\"cancelarVaciarCarrito()\" class=\"btn btn-warning\" value=\"cancelar\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"msjAlert01\" class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden\">\r\n");
      out.write("\t\t<p><span class=\"glyphicon glyphicon-warning-sign\"></span>&nbsp; Por favor ingrese un descuento.</p>\r\n");
      out.write("\t\t<input type=\"button\" onclick=\"hideMsj('msjAlert01')\" class=\"btn btn-warning\" value=\"Aceptar\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"col-md-6 col-md-offset\">\r\n");
      out.write("\t<table class=\"table\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>Nombre</td>\r\n");
      out.write("\t\t<td>Precio</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t<a  class=\"btn btn-success btn-block opcionesCarrito\" href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/listarProductos\">agregar Producto</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t   \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"col-md-12 margin20 center\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<span class=\"label label-warning\">Total Sin Descuento</span>\r\n");
      out.write("\t\t\t\t<input type=\"numeric\"  disabled class=\"form-control\" name=\"\" value= \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalSinDescuentos}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<span class=\"label label-success\">Ahorro</span>\r\n");
      out.write("\t\t\t\t<input type=\"numeric\"  disabled class=\"form-control\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${totalAhorro}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"name=\"cantidad\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<span class=\"label label-primary\">Total</span>\r\n");
      out.write("\t\t\t\t<input type=\"numeric\"  disabled class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" name=\"cantidad\"/> \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t <div class= \"col-md-12 margin20\">\r\n");
      out.write("\t\t \t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/carrito/comprar\" class=\"btn btn-primary btn-block opcionesCarrito\">Confirmar</a>\r\n");
      out.write("\t\t \t</div>\r\n");
      out.write("\t\t \t<div class=\"col-md-6\">\r\n");
      out.write("\t\t \t\t<input type=\"button\" onclick=\"vaciarCarritoCompras()\" class=\"btn btn-danger btn-block opcionesCarrito\" value=\"Cancelar\"/>\r\n");
      out.write("\t\t \t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.js\" ></script>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/script.js\" ></script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/verCarrito.jsp(48,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/verCarrito.jsp(48,1) '${productos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${productos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/verCarrito.jsp(48,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("dato");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<tr>\r\n");
          out.write("\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dato.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dato.precio}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("\t</tr>\r\n");
          out.write("\t");
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
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/verCarrito.jsp(66,5) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/verCarrito.jsp(66,5) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("frmCalculoDescuento");
    // /WEB-INF/jsp/verCarrito.jsp(66,5) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("/carrito/agregar/descuento");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t   \t\t<div class=\"col-md-7\">\r\n");
          out.write("\t\t\t\t\t\t<select name=\"tipo\" class=\"form-control\">\r\n");
          out.write("\t\t\t\t\t\t  <option value=\"0\">Porcentaje</option>\r\n");
          out.write("\t\t\t\t\t\t  <option value=\"1\">Monto</option>\r\n");
          out.write("\t\t\t\t\t\t</select>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div class=\"col-md-5\">\r\n");
          out.write("\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" id=\"cantidadDescuento\" name=\"cantidad\"/> \r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t<div class=\"col-md-12\">\r\n");
          out.write("\t\t\t\t\t<input onclick=\"validarDescuento()\" class=\"btn btn-info btn-block \" type=\"button\" value=\"Aplicar descuento\">\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t");
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
      _005fjspx_005ftagPool_005fform_005fform_0026_005fmethod_005fid_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }
}
