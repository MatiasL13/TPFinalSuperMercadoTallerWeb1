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
		$("#msjError00").append("<div id='error' class=''><span  class='glyphicon glyphicon-warning-sign col-md-12'>ATENCI&Oacute;N: Solo se podr&aacute;n cargar "
				+stockProducto
				+" unidades. Desea Continuar?</span>" 
				+"<div class='text-center col-md-offset-5 '><input type='button' onclick='checkMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-success col-md-2 marginTop10' value='aceptar'/><input type='button' onclick='cancelaMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-danger col-md-2 marginTop10' value='cancelar'/></div></div>");
		$("#msjError00").removeClass("hidden");
		$("#cantidad_"+idNameArticulo).val(stockProducto);
		$('.agregarProductoACarrito').attr("disabled",true)
	}else{
		$('.agregarProductoACarrito').attr("disabled",false)
		$("#frm_"+idNameArticulo).submit();
		//alert("realizo el submit")
	}
}//End function checkMoverCarrito

function cancelaMoverCarrito(){
	$("#msjError00").addClass("hidden");
	$('.agregarProductoACarrito').attr("disabled",false)
	$("#error").remove();
}//End function cancelaMoverCarrito