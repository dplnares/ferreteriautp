function buscarClienteBoleta()
{
	ape=$('#txt_ape').attr('value');
	$.ajax({
		url: 'ServletBoleta',
		type: "GET",
		data: "tipo=buscarCliente&ape="+ape,
		sucess: function(datos){
			$("#tablaCliente").html(datos);
		}
	});
}
function buscarProductoBoleta()
{
	des=$('#txt_des').attr('value');
	$.ajax({
		url: 'ServletBoleta',
		type: "GET",
		data: "tipo=buscarProducto&des="+des,
		success: function(datos){
			$("#tablaProducto").html(datos);
		}
	});
}
$("tr #Cantidad").click(function (){
    var nro=$(this).parent().find("#nro").val();
    var cantidad=$(this).parent().find("#Cantidad").val();
    var url="ControladorCarrito?opcion=ActualizarCantidad";
    $.ajax({
       type: 'POST',
       url: url,
       data: "nro"+nro+"&Cantidad" + cantidad,
       succes: function (data, textStatus, jqXHR){
           location.href="ControladorCarrito";
       }
    });
});