<html>
<head>

	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>


	<title></title>
</head>
<body>
	<nav class="navbar navbar-default" role="navigation">
   <div class="header col-md-12">      
  
   </div> 
 
  <ul class="nav navbar-nav" >
      <li style="display: inline;" ><a href="<%=request.getContextPath()%>">HOME</a></li>
      <li style="display: inline;" class="active" ><a href="<%=request.getContextPath()%>/carrito/ver">Carrito</a></li>     
      <li style="display: inline;" ><a href="<%=request.getContextPath()%>/stock/ver">stock</a></li>
    </ul>  
</nav>
<div>

	<legend>Productos en carrito</legend>
</div>
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
				 <form:form method="post" action="/carrito/agregar/descuento" >
			   		<div class="col-md-7">
						<select name="tipo" class="form-control">
						  <option value="0">Porcentaje</option>
						  <option value="1">Monto</option>
						</select>
					</div>
					<div class="col-md-5">
						<input type="number" class="form-control" name="cantidad"/> 
					</div>
					<div class="col-md-12">
					<input class="btn btn-info btn-block " type="submit" value="Aplicar descuento">
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
				<a href="<%=request.getContextPath()%>/carrito/vaciar" class="btn btn-danger btn-block opcionesCarrito">Cancelar</a>
		 	</div>
		</div>

</div>
	


		<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
</body>
</html>