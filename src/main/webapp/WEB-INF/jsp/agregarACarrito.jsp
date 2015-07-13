<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
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
	<legend>Productos </legend>
</div>

	

		<div class="col-md-12 ">
			<div id="msjError00" class="alert alert-danger hidden text-center mensajes" role="alert">
			</div>
			<div   id="msjOK" class="alert alert-success ${status} text-center" role="alert">
				<p class="bg-success text-center ">
					<span class="glyphicon glyphicon-warning-sign">${msjCargaOk}</span>
				 </p>
			</div>
		</div>
	<div class="col-md-10 col-md-offset-1 center">
	<table class="table">
	<tr>
		<td>Nombre</td>
		<td>Precio</td>
	</tr>
	<c:forEach  items="${stock}" var="dato">
	<tr>
		<td>${dato.key.nombre}</td>
		<td>${dato.key.precio}</td>
		<td>${dato.value}<input type="hidden" id="stock_${dato.key.nombre}" value="${dato.value}"/></td>
		<td>
			    <form:form method="post" action="/carrito/agregar/ingresar" class="col-md-12" id="frm_${dato.key.nombre}" >
			   		<div class="form-group col-md-2">
        				<input  class="form-control" name="cantidad" id="cantidad_${dato.key.nombre}"/>
   					 </div>
			        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
			        <form:input type="hidden"class="form-control" path="precio" value="${dato.key.precio}"></form:input>
					<input class="btn btn-success col-md-2 agregarProductoACarrito" onclick="checkMoverCarrito('${dato.key.nombre}')" type="button" value="Mover a Carrito">
				</form:form>
		</td>

	</tr>
	</c:forEach>

	</table>
		<a class="btn btn-info "  href="<%=request.getContextPath()%>/carrito/ver">Volver</a> 

	</div>
</div>



</body>
</html>