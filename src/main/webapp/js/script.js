function checkMoverCarrito(idNameArticulo){
	var stockProducto = $("#stock_"+idNameArticulo).val();
	stockProducto = parseInt(stockProducto);
	//alert("stockProducto: "+stockProducto);
	var cantidadSolicitada = $("#cantidad_"+idNameArticulo).val();
	cantidadSolicitada = parseInt(cantidadSolicitada);
	
	$("#msjError00").addClass("hidden");
	$("#msjError00Text").empty();
	$("#msjOK").addClass("hidden");
	//Controlo que la cantidad solicitada no sea mayor a la que hay en stock
	if(cantidadSolicitada>stockProducto){
		$("#msjError00").append("<span class='glyphicon glyphicon-warning-sign'></span> ATENCI&Oacute;N: Solo se podr&aacute;n cargar "+stockProducto+" unidades. Desea Continuar?</span></br><input type='button' onclick='checkMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-success' value='aceptar'/>&nbsp;<input type='button' onclick='cancelaMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-danger' value='cancelar'/>");
		$("#msjError00").removeClass("hidden");
		$("#cantidad_"+idNameArticulo).val(stockProducto);
	}else{
		$("#frm_"+idNameArticulo).submit();
		//alert("realizo el submit")
	}
}//End function checkMoverCarrito

function cancelaMoverCarrito(){
	
}//End function cancelaMoverCarrito