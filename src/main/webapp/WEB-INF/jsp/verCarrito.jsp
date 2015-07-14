<html>
<head>

<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@	taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/small-business.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.js" ></script>


	<title>:: Supermercado ::</title>
</head>
<body  id="page-top">

    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top"><img src="<%=request.getContextPath()%>/css/img/logo.png" style="height:30px;" alt="logo principal"/>Supermercado Online</a>
            </div>
           <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="<%=request.getContextPath()%>">Inicio</a>
                    </li>
                    <li>
                        <a class="page-scroll active" href="<%=request.getContextPath()%>/carrito/ver">Carrito</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="<%=request.getContextPath()%>/stock/ver">Stock</a>
                    </li>
               </ul>
            </div>
        </div>
    </nav>
<div>
	<legend>Productos en carrito</legend>
</div>
<!-- COMIENZO MENSAJES -->
<div class="row">
	<div id="msjAlert00" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden">
		<p><span class="glyphicon glyphicon-warning-sign"></span>&nbsp; ATENCI&Oacute;N: Est&aacute; seguro de querer cancelar su compra? Esta operación vaciar&aacute; su carrito de compras.</p>
		<a href="<%=request.getContextPath()%>/carrito/vaciar" class="btn btn-warning">Aceptar</a>&nbsp;
		<input type="button" onclick="cancelarVaciarCarrito()" class="btn btn-warning" value="cancelar"/>
	</div>
	<div id="msjAlert01" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden">
		<p><span class="glyphicon glyphicon-warning-sign"></span>&nbsp; Por favor ingrese un descuento.</p>
		<input type="button" onclick="hideMsj('msjAlert01')" class="btn btn-warning" value="Aceptar"/>
	</div>
</div>
<!-- FIN MENSAJES -->

	<div class="col-md-6 col-md-offset">
	<table class="table">
	<tr>
		<td>Nombre</td>
		<td>Precio</td>
	</tr>
	<c:forEach  items="${productos}" var="dato">
	<tr>
		<td>${dato.nombre}</td>
		<td>${dato.precio}</td>

	</tr>
	</c:forEach>

	</table>
</div>
	<div class="col-md-6">
		
		<div class="col-md-12">
			<div class="col-md-6">
							<a  class="btn btn-success btn-block opcionesCarrito" href="<%=request.getContextPath()%>/carrito/listarProductos">agregar Producto</a>
			</div>

			<div class="col-md-6">
				 <form:form method="post" id="frmCalculoDescuento" action="/carrito/agregar/descuento" >
			   		<div class="col-md-7">
						<select name="tipo" class="form-control">
						  <option value="0">Porcentaje</option>
						  <option value="1">Monto</option>
						</select>
					</div>
					<div class="col-md-5">
						<input type="number" class="form-control" id="cantidadDescuento" name="cantidad"/> 
					</div>
					<div class="col-md-12">
					<input onclick="validarDescuento()" class="btn btn-info btn-block " type="button" value="Aplicar descuento">
					</div>
				</form:form>
			</div>
		   
		</div>
		<div class="col-md-12 margin20 center">
			<div class="col-md-4">
				<span class="label label-warning">Total Sin Descuento</span>
				<input type="numeric"  disabled class="form-control" name="" value= "${totalSinDescuentos}"/> 
			</div>
			<div class="col-md-4">
				<span class="label label-success">Ahorro</span>
				<input type="numeric"  disabled class="form-control"  value="${totalAhorro}"name="cantidad"/> 
			</div>
			<div class="col-md-4">
				<span class="label label-primary">Total</span>
				<input type="numeric"  disabled class="form-control" value="${total}" name="cantidad"/> 
			</div>
		</div>
		 <div class= "col-md-12 margin20">
		 	<div class="col-md-6">
				<a href="<%=request.getContextPath()%>/carrito/comprar" class="btn btn-primary btn-block opcionesCarrito">Confirmar</a>
		 	</div>
		 	<div class="col-md-6">
		 		<input type="button" onclick="vaciarCarritoCompras()" class="btn btn-danger btn-block opcionesCarrito" value="Cancelar"/>
		 	</div>
		</div>

</div>
	


		<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
</body>
</html>