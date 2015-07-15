
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
			<h1>Agregar a Stock</h1>
		</div>

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
				        <form:input autofocus="true" class="form-control alphaonly" id="nombreProducto"  path="nombre" required="true"></form:input> 
				    </div>
				        
				        
				    <div class="form-group"><form:label path="precio">precio</form:label>
				        <form:input  class="form-control number"  type="number" min="1" required="true" id="precioProducto" path="precio"></form:input>
				    </div>
				   
		            <input class="btn btn-success" type="submit"  value="Agregar Producto">  
				</form:form>
		 </div>
	</div>
		<!-- Scripts -->
   	<script src="<%=request.getContextPath()%>/js/jquery.js" ></script>
	<script src="<%=request.getContextPath()%>/js/script.js" ></script>
	<script src="<%=request.getContextPath()%>/js/bootstrap.js" ></script>
	<!-- End Scripts -->
 </body>
 </html>
 
