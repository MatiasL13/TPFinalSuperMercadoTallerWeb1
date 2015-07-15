<html>
<head>
<link rel="shortcut icon" href="/supermercado/css/img/logo.png">
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@	taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!-- CSS -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/small-business.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<!-- Scripts -->
   	<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.js" ></script>
	<!-- End Scripts -->

	<title>:: Supermercado ::</title>
</head>
<body  id="page-top">
    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
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
                        <a class="page-scroll" id="home" href="<%=request.getContextPath()%>">Inicio</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="<%=request.getContextPath()%>/carrito/ver">Carrito</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="<%=request.getContextPath()%>/stock/ver">Stock</a>
                    </li>
               </ul>
            </div>
        </div>
    </nav>
    
    <div class="container">
		<div>
			<h1>Stock de productos</h1>
		</div>

		<!-- COMIENZO MENSAJES -->
		<div class="row">
			<div id="msjAlert00" class="col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center bg-warning hidden">
				<p><span class="glyphicon glyphicon-warning-sign"></span>&nbsp; Se ha ingresado una cantidad incorrecta. Por favor rev&iacute;sela</p>
				<input type="button" onclick="hideMsj('msjAlert00')" class="btn btn-warning" value="Aceptar"/>
			</div>
		</div>
		<!-- FIN MENSAJES -->
      <div class="row">
            <div class="col-md-10">
            	<div class="col-md-12">
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
								    <form:form method="post" action="eliminarProductoStock" >
								        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
										<input class="btn btn-danger col-md-12 " type="submit" value="Eliminar">
									</form:form>
							</td>
							<td>
								  
								    <form:form method="post" action="agregarStock" class="form-inline" id="frmAgregaStock_${dato.key.nombre}" >
								    	<div class="form-group">
					        				<input  class="form-control number"name="cantidad" id="cantAdd_${dato.key.nombre}" required/>
					   					 </div>
								        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
										<input class="btn btn-info " type="button" onclick="validaAgregaStock('${dato.key.nombre}')" value="+">
								    </form:form>
								    
								    <form:form method="post" action="eliminarStock" class="form-inline" id="frmQuitaStock_${dato.key.nombre}" >
								    	<div class="form-group">
					        				<input  class="form-control number"name="cantidad" id="cantRemove_${dato.key.nombre}" required/>
					   					 </div>
								        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
										<input class="btn btn-danger " type="button" onclick="validaQuitaStock('${dato.key.nombre}')" value="-">
								    </form:form>
							</td>
						</tr>
						</c:forEach>
					</table>
				</div>
			</div>
			<div class="col-md-2">
				<a  class="btn btn-success btn-block " href="<%=request.getContextPath()%>/stock/agregar">agregar Producto</a>
			</div>
		</div>
	</div>

</body>
</html>