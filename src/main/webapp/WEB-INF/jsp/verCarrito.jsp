<html>
<head>

	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
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
	<div>
		<legend>Productos en carrito</legend>
	</div>
	<div class="col-md-10 col-md-offset-1 center">
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

	<div class= "col-md-4 col-md-offset-1">
		<a  class="btn btn-success opcionesCarrito" href="<%=request.getContextPath()%>/carrito/listarProductos">Agregar producto</a>
		<a href="<%=request.getContextPath()%>/carrito/vaciar" class="btn btn-danger opcionesCarrito">Vaciar carrito</a>			
	    <form:form method="post" action="agregar/descuento">
	    <div class="col-md-12"><label>Descuentos</label></div>
   		<div class="col-md-7">
			<select name="tipo" class="form-control">
			  <option value="0">Porcentaje</option>
			  <option value="1">Monto</option>
			</select>
		</div>
		<div class="col-md-5">
			<input type="text" class="form-control" name="cantidad"/> 
		</div>
		<div class="col-md-12">
		<input class="btn btn-info " type="submit" value="Aplicar descuento">
		</div>
		</form:form>
	</div>
	<div class="col-md-4 col-md-offset-1 center">
		<table class="table">
		<tr>
			<td><h4>Total sin descuentos</h4></td>
			<td><h4>${totalSinDescuentos} $</h4></td>
		</tr>
		<tr>
			<td><h4 class="text-success">Descuentos</h4></td>
			<td><h4 class="text-success">${totalAhorro}  $</h4></td>
		</tr>
		<tr>
			<td><h4>Total a pagar</h4></td>
			<td><h4>${total} $</h4></td>
		</tr>
		</table>
	</div>

</div>



</body>
</html>