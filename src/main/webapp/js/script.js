function checkMoverCarrito(idNameArticulo){
	//Primero oculto y vacio los cuadros de mensaje
	$("#msjError00").addClass("hidden");
	$("#msjError00").empty();
	$("#msjOK").addClass("hidden");


	//Obtengo el stock del producto
	var stockProducto = $("#stock_"+idNameArticulo).val();
	stockProducto = parseInt(stockProducto);
	//Obtengo la cantidad solicitada
	var cantidadSolicitada = $("#cantidad_"+idNameArticulo).val();
	cantidadSolicitada = parseInt(cantidadSolicitada);

	if(cantidadSolicitada != '' && !isNaN(cantidadSolicitada) ){//Si lacantidad solicitada esta vacia o no es un numero 
		if(stockProducto>0){//Si el articulo tiene stock sigo controlando
			
			if(cantidadSolicitada>stockProducto){//Controlo que la cantidad solicitada no sea mayor a la que hay en stock
				//cargo el mensaje en el cuadro de mensajes
				$("#msjError00").append("<div id='error' class=''><span  class='glyphicon glyphicon-warning-sign col-md-12'>ATENCI&Oacute;N: Solo se podr&aacute;n cargar "
						+stockProducto
						+" unidades. Desea Continuar?</span>" 
						+"<div class='text-center col-md-offset-5 '><input type='button' onclick='checkMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-success col-md-2 marginTop10' value='aceptar'/><input type='button' onclick='cancelaMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-danger col-md-2 marginTop10' value='cancelar'/></div></div>");
				//lo muestro
				$("#msjError00").removeClass("hidden");
				//Cargo la nueva cantidad en el input
				$("#cantidad_"+idNameArticulo).val(stockProducto);
				
				$('.agregarProductoACarrito').attr("disabled",true)
			}else{
				$('.agregarProductoACarrito').attr("disabled",false)
				$("#frm_"+idNameArticulo).submit();
				//alert("realizo el submit")
			}
		}else{
			//cargo el mensaje en el cuadro de mensajes
			$("#msjError00").append("<div id='error' class='text-center'><span  class='glyphicon glyphicon-warning-sign'></span>&nbsp;ATENCI&Oacute;N: El art&iacute;culo que intenta cargar no posee stock." 
					+"</br><input type='button' onclick='cancelaMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-danger' value='aceptar'/></div>");
			//lo muestro
			$("#msjError00").removeClass("hidden");
			
		}//End if stockProducto>0
		
	}else{
		//cargo el mensaje en el cuadro de mensajes
		$("#msjError00").append("<div id='error' class='text-center'><span  class='glyphicon glyphicon-warning-sign'></span>&nbsp;ATENCI&Oacute;N: Por favor revise que la cantidad a cargar sea un n&uacute;mero v&aacute;lido." 
				+"</br><input type='button' onclick='cancelaMoverCarrito(\""+idNameArticulo+"\")' class='btn btn-danger' value='aceptar'/></div>");
		//lo muestro
		$("#msjError00").removeClass("hidden");
		
	}

}//End function checkMoverCarrito

function cancelaMoverCarrito(){
	$("#msjError00").addClass("hidden");
	$('.agregarProductoACarrito').attr("disabled",false)
	$("#error").remove();
}//End function cancelaMoverCarrito


function vaciarCarritoCompras(){
	$("#msjAlert00").removeClass("hidden");
}

function validarDescuento(){
	//Obtengo el valor del descuento
	var dto = $("#cantidadDescuento").val();
	var submit=true;
	//Controlo que no sea nulo
	if(dto == "" || dto.lenght==0){
		showMsj("msjAlert01");
		submit=false;
	}//End if
	//Si cargo descuento submiteo
	if(submit==true){
		$("#frmCalculoDescuento").submit();
	}	
}

function hideMsj(idMsj){
	$("#"+idMsj).addClass("hidden");
}

function showMsj(idMsj){
	$("#"+idMsj).removeClass("hidden");
}

function cancelarVaciarCarrito(){
	$("#msjAlert00").addClass("hidden");
}

function validaAgregaStock(idElemento){
	var cantidad = $("#cantAdd_"+idElemento).val();
	var submit=true;
	
	//Controlo que la cantidad sea un numero
	if(isNaN(cantidad)){
		submit=false;
	}

	//Controlo que la cantidad no sea nula
	if(cantidad == "" || cantidad.lenght==0){
		submit=false;
	}

	//Controlo que la cantidad no sea negativa
	if(cantidad<0){
		submit=false;
	}

	//Si no hubo problemas hago el submit
	if(submit==true){
		$("#frmAgregaStock_"+idElemento).submit();
	}
	
}//End function validaAgregaStock

function validaQuitaStock(idElemento){
	var cantidad = $("#cantRemove_"+idElemento).val();
	var submit=true;
	
	//Controlo que la cantidad sea un numero
	if(isNaN(cantidad)){
		submit=false;
	}

	//Controlo que la cantidad no sea nula
	if(cantidad == "" || cantidad.lenght==0){
		submit=false;
	}

	//Controlo que la cantidad no sea negativa
	if(cantidad<0){
		submit=false;
	}

	//Si no hubo problemas hago el submit
	if(submit==true){
		$("#frmQuitaStock_"+idElemento).submit();
	}
	
}//End function validaQuitaStock


$('.number').keydown(function(event) {
               // Allow special chars + arrows 
               if (event.keyCode == 46 || event.keyCode == 8 || event.keyCode == 9 
                   || event.keyCode == 27 || event.keyCode == 13                 
                   || event.keyCode == 190 || event.keyCode == 110  //punto y punto
                   || (event.keyCode == 65 && event.ctrlKey === true) 
                   || (event.keyCode == 67 && event.ctrlKey === true) //control c
                   || (event.keyCode == 86 && event.ctrlKey === true) // control v 
                   || (event.keyCode > 35 && event.keyCode <= 39)){
                       return;
               }else {
                   // If it's not a number stop the keypress
                   if (event.shiftKey || (event.keyCode < 48 || event.keyCode > 57) && (event.keyCode < 96 || event.keyCode > 105 )) {
                       event.preventDefault(); 
                   }   
               }
           });
