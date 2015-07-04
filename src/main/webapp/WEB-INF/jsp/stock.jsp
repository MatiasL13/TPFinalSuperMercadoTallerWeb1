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
      <li style="display: inline;"  ><a href="<%=request.getContextPath()%>/carrito/ver">Carrito</a></li>     
      <li style="display: inline;" class="active"><a href="<%=request.getContextPath()%>/stock/ver">stock</a></li>
    </ul>  
</nav>
<div>
<div>
	<legend>Productos en Stock</legend>
</div>
	<div class="col-md-10 col-md-offset-1 center">
	<table class="table">
	<tr>
		<td>Nombre</td>
		<td>Precio</td>
		<td>Cantidad</td>
		<td>Controles</td>
		<td>Agregar Stock</td>
	</tr>
	<c:forEach  items="${stock}" var="dato">
	<tr>
		<td>${dato.key.nombre}</td>
		<td>${dato.key.precio}</td>
		<td>${dato.value}</td>
		<td>
			    <form:form method="post" action="eliminarProductoStock" class="col-md-12" >
			        <form:input type="hidden"class="form-control" path="id" value="${dato.key.id}"></form:input>
					<input class="btn btn-danger col-md-12 " type="submit" value="Eliminar">
				</form:form>
		</td>
		<td>
			  
			    <form:form method="post" action="agregarStock" class="col-md-12" >
			    	<div class="form-group col-md-5">
        				<input  class="form-control"name="cantidad"/>
   					 </div>
			        <form:input type="hidden"class="form-control" path="id" value="${dato.key.id}"></form:input>
					<input class="btn btn-info col-md-3" type="submit" value="+">
			    </form:form>
		</td>
	</tr>
	</c:forEach>

	</table>


<button class="btn btn-success col-md-2 col-md-offset-9 "><a href="<%=request.getContextPath()%>/stock/agregar">agregar Producto</a></button>
	</div>
</div>



</body>
</html>