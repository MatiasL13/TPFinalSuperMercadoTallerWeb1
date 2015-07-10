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

		 <div class= "col-md-6 col-md-offset-9">
			<a  class="btn btn-success col-md-3 opcionesCarrito" href="<%=request.getContextPath()%>/carrito/listarProductos">agregar Producto</a>
			<a href="<%=request.getContextPath()%>/carrito/vaciar" class="btn btn-danger col-md-3 opcionesCarrito">Cancelar</a>
		</div>
	</div>
</div>



</body>
</html>