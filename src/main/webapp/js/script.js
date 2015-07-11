function checkMoverCarrito(idNameArticulo){
	var stockProducto = $("#stock_"+idNameArticulo).val();
	//alert("stockProducto: "+stockProducto);
	var cantidadSolicitada = $("#cantidad_"+idNameArticulo).val();
	
	$("#msjError00").addClass("hidden");
	$("#msjOK").addClass("hidden");
	//Controlo que la cantidad solicitada no sea mayor a la que hay en stock
	if(cantidadSolicitada>stockProducto){
		$("#msjError00Text").append("ATENCI&Oacute;N: Solo se podr&aacute;n cargar "+stockProducto+" unidades. Desea Continuar?");
		$("#msjError00").removeClass("hidden");
	}else{
		$("frm_"+idNameArticulo).submit();
	}
}//End function checkMoverCarrito