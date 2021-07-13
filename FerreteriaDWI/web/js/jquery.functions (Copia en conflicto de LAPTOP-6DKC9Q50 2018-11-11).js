function buscarClienteBoleta()
{
    alert('Buscar cliente');
	ape=$('#txt_ape').attr('value');
	$.ajax({
		url: 'ServletBoleta',
		type: "GET",
		data: "tipo=verCliente&ape="+ape,
		sucess: function(datos){
			$("#tablaCliente").html(datos);
		}
	});
}
function buscarProductoBoleta()
{
    alert('Buscar producto');
	des=$('#txt_des').attr('value');
	$.ajax({
		url: 'ServletProducto',
		type: "GET",
		data: "tipo=buscarProducto&des="+des,
		success: function(datos){
			$("#tablaProducto").html(datos);
		}
	});
}