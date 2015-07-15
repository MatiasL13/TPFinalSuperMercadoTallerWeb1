<html>
<head>

<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@	taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!-- CSS -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/small-business.css"/>
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
	
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
       <!-- Page Content -->
    <div class="container">

        <!-- Heading Row -->
        <div class="row">
            <div class="col-md-8">
                <img class="img-responsive img-rounded" src="<%=request.getContextPath()%>/css/img/index.png" alt="">
            </div>
            <!-- /.col-md-8 -->
            <div class="col-md-4">
                <h1>BIENVENIDO</h1>
                <h2>Supermercado</h2>
                <h5>compras on-line!</h5>
                <a class="btn btn-primary btn-lg" href="<%=request.getContextPath()%>/carrito/ver">Comprar   <span class="glyphicon glyphicon-hand-up" aria-hidden="true"></span></a>
            </div>
            <!-- /.col-md-4 -->
        </div>
        <!-- /.row -->

        <!-- Content Row -->
        <div class="row">
            <div class="col-md-4">
            	<h2>Agregar al carrito   <span class="glyphicon glyphicon-hand-up" aria-hidden="true"></span></h2>
                <p>Una pantalla para que se agreguen productos al carrito (que se descuentan del stock), y
				va mostrando el precio total del carrito a medida que se agregan cosas al mismo.
				Además se puede agregar descuentos que pueden ser monto o porcentaje de
				descuento. En este caso la pantalla muestra el total con descuento y el ahorro
				acumulado en el carrito. Esta pantalla tiene dos botones: cancelar, que elimina todo lo
				agregado al carrito y lo restituye al stock; y confirmar que lleva a una pantalla donde se
				muestra como queda el carrito y su precio final</p>
                <a class="btn btn-warning" href="<%=request.getContextPath()%>/carrito/ver">Comprar!</a>
            </div>
            <!-- /.col-md-4 -->
            <div class="col-md-4">
            
                <h2>Administrar Stock   <span class="glyphicon glyphicon-object-align-bottom" aria-hidden="true"></span></h2>
                <p>Una pantalla que muestre el stock de todos los productos existentes
					Una pantalla para dar de alta un producto
					Una pantalla para agregar stock a determinado producto, es decir se suma a lo que
					tiene
					Una pantalla para eliminar el stock de un producto</p>
                <a class="btn btn-warning" href="<%=request.getContextPath()%>/stock/ver">Ingresar!</a>
            </div>
            <!-- /.col-md-4 -->
            <div class="col-md-4">
                <h2>Más información   <span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span></h2>
                <p>Acerca del grupo de trabajo</p>
                <a class="btn btn-warning" href="#">More Info</a>
            </div>
            <!-- /.col-md-4 -->
        </div>
        <!-- /.row -->

        <!-- Footer -->
		<footer class="footer">
		      <div class="container">
		        <h4 class="text-muted">Grupo Taller Web 1 - Unlam</h4>
		      </div>
	    </footer>

    </div>
    <!-- /.container -->
	
</body>
</html>