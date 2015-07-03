<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
 

 <html>
 <head>
     <title>Cargar Producto a Stock</title>
 <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css"/>
 </head>
 <body>
 
 <legend>Contact Manager</legend>
 <div class="col-md-5 col-md-offset-3 center">
    <form:form method="post" action="/stock/agregar/ingresar" class="">
 
   <div class="form-group">
   <form:label path="nombre">nombre</form:label>
        <form:input  class="form-control"path="nombre"></form:input> 
    </div>
        
        
    <div class="form-group"><form:label path="precio">precio</form:label>
        <form:input  class="form-control"path="precio"></form:input>
    </div>
   
    <form:input type="hidden"class="form-control" path="id" value="${dato.id}"></form:input>
            <input class="btn btn-success" type="submit" value="Agregar Producto">
      
     
</form:form>
 </div>

 </body>
 </html>
 
