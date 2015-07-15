<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
                        <a class="active" href="<%=request.getContextPath()%>/carrito/ver">Carrito</a>
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
			<h1>Agregar al carrito</h1>
		</div>
		<div class="col-md-12 ">
			<div id="msjError00" class="alert alert-danger hidden text-center mensajes" role="alert"></div>
			<div id="msjOK" class="alert alert-success ${status} text-center" role="alert">
				<p class="bg-success text-center ">
					<span class="glyphicon glyphicon-ok"></span>&nbsp;${msjCargaOk}
				 </p>
			</div>
		</div>
		<div class="col-md-12">
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
					    <form:form method="post" action="/carrito/agregar/ingresar" id="frm_${dato.key.nombre}" class="form-inline" >
					   		<div class="form-group">
		        				<input type="number" min="0" max="${dato.value}" class="form-control number" name="cantidad"  required id="cantidad_${dato.key.nombre}"/>
		   					 </div>
					        <form:input type="hidden"class="form-control" path="nombre" value="${dato.key.nombre}"></form:input>
					        <form:input type="hidden"class="form-control" path="precio"  value="${dato.key.precio}"></form:input>
							<input class="btn btn-success agregarProductoACarrito" type="submit" value="Mover a Carrito">
						</form:form>
				</td>
		
			</tr>
			</c:forEach>
		
			</table>
		<a class="btn btn-info "  href="<%=request.getContextPath()%>/carrito/ver">Volver al carrito</a> 
	
		</div>
	</div>
	<!-- Scripts -->
   	<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.js" ></script>
	<!-- End Scripts -->
</body>
</html>