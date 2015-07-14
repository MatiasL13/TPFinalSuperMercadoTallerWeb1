<html>
<head>

	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	<script src="<%=request.getContextPath()%>/js/bootstrap.js" ></script>
	

	<title></title>
</head>
<body>
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top"><img src="<%=request.getContextPath()%>/img/logo.png" class="logoResponsive" alt="logo principal"/></a>
            </div>

            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="<%=request.getContextPath()%>">HOME</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="<%=request.getContextPath()%>/carrito/ver">Carrito</a>
                    </li>
                    <li>
                        <a class="page-scroll active" href="<%=request.getContextPath()%>/stock/ver">Stock</a>
                    </li>
               </ul>
            </div>
        </div>
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
		<td>Manejo de Stock</td>
	</tr>
	<c:forEach  items="${stock}" var="dato">
	<tr>
		<td>${dato.key.nombre}</td>
		<td>${dato.key.precio}</td>
		<td>${dato.value}</td>
		<td>
			    <form:form method="post" action="eliminarProductoStock" class="col-md-12" >
			        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
					<input class="btn btn-danger col-md-12 " type="submit" value="Eliminar">
				</form:form>
		</td>
		<td>
			  
			    <form:form method="post" action="agregarStock" class="manejoStock" >
			    	<div class="form-group col-md-2">
        				<input  class="form-control number"name="cantidad" required/>
   					 </div>
			        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
					<input class="btn btn-info col-md-1" type="submit" value="+">
			    </form:form>
			    <form:form method="post" action="eliminarStock" class="manejoStock" >
			    	<div class="form-group col-md-2">
        				<input  class="form-control number"name="cantidad" required/>
   					 </div>
			        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
					<input class="btn btn-danger col-md-1" type="submit" value="-">
			    </form:form>
		</td>
	</tr>
	</c:forEach>

	</table>


<a  class="btn btn-success col-md-2 col-md-offset-9 " href="<%=request.getContextPath()%>/stock/agregar">agregar Producto</a>
	</div>
</div>


<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
</body>
</html>