<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
 

 <html>
 <head>
	<title>Cargar Producto a Stock</title>
 	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	<script src="<%=request.getContextPath()%>/js/bootstrap.js" ></script>
 </head>
 <body>
 
 <legend>Contact Manager</legend>

<!-- COMIENZO MENSAJES -->
<div class="row">
	<div id="msjAlert00" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden">
		<p><span class="glyphicon glyphicon-warning-sign"></span>&nbsp; Se ha ingresado un nombre incorrecto. Por favor, rev&iacute;selo.</p>
		<input type="button" onclick="hideMsj('msjAlert00')" class="btn btn-warning" value="Aceptar"/>
	</div>
	<div id="msjAlert01" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden">
		<p><span class="glyphicon glyphicon-warning-sign"></span>&nbsp; Se ha ingresado un precio incorrecto. Por favor, rev&iacute;selo.</p>
		<input type="button" onclick="hideMsj('msjAlert01')" class="btn btn-warning" value="Aceptar"/>
	</div>
</div>
<!-- FIN MENSAJES -->

 <div class="col-md-5 col-md-offset-3 center">
    <form:form method="post" action="/stock/agregar/ingresar" id="frmAgregarProducto" class="">
 
   <div class="form-group">
   <form:label path="nombre">nombre</form:label>
        <form:input autofocus="true" class="form-control" id="nombreProducto"  path="nombre" required="true"></form:input> 
    </div>
        
        
    <div class="form-group"><form:label path="precio">precio</form:label>
        <form:input  class="form-control number" required="true" id="precioProducto" path="precio"></form:input>
    </div>
   
            <input class="btn btn-success" type="button" onclick="validaAgregarProducto()" value="Agregar Producto">
      
     
</form:form>
 </div>
       <script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
    <script src="<%=request.getContextPath()%>/js/script.js" ></script>
 </body>
 </html>
 
