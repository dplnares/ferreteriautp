




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