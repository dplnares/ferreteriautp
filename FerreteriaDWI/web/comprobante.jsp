<%@page import="Modelo.VentaDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Item"%>
<%@page import="Entidad.Venta"%>

<head>
<title>FERRETERIA</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
<style>
    @media print{
        .card-footer{
            display: none;
        }
    }
</style>
</head>
    

    <body>
	<div class="container">
            <h1>Comprobante</h1>
            <div class="cartcontent">
                <div class="myitems">
                    <%if (session.getAttribute("shoppingCart") != null) 
                        { VentaDAO dao = new VentaDAO();
                          List<Venta> lista = dao.listar();
                          Iterator<Venta>iter=lista.iterator();
                          
                          %>
                    <div class="col-sm-4">
                        <form action=ControladorCarrito>
                    <div class="card">
                        <div class="card-header">
                            <h3>Sus datos</h3>
                        </div>
                        <div class="card-body">
                            Nombre del Cliente<br>
                            <input type="text" name="txtNomCliente" value="${nom}" readonly="" class="form-control" required><br>
                            Documento del Cliente<br>
                            <input type="text" name="txtDniCliente" value="${dni}" readonly="" class="form-control" required ><br>
                            Total a pagar: <br>
                            <input type="text" name="txtTotal" value="${total}" readonly="" class="form-control"  ><br>
                        </div>
                        
                    </div>
                        </form>
                </div>
                    <table width="600px" cellpadding="0" cellspacing="0">
                        <tr>
                            <th>Id</th> 
                            <th>Item</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                           
                        </tr>
                        <%
                            double total=0;
                            List<Item> carritoCompras = (List<Item>) session.getAttribute("shoppingCart");
                            for (int i = 0; i < carritoCompras.size(); i++) 
                                {
                                    Item item = (Item) carritoCompras.get(i);
                                    total= total + carritoCompras.get(i).getPrecio();
                        %>
                        <tr>
                            <td align="center"><%out.print(item.getId());%></td>
                            <td align="center"><% out.print(item.getNombre());%></td> 
                            <td align="center"><% out.print(item.getPrecio());%></td>
                            <td align="center"><% out.print(item.getCantidad());%></td>
                            <!-- <td align="center">
                                <input type="hidden" id="nro" value="<%out.print(item.getId());%>" >
                                <input type="number" id="Cantidad" value="<% out.print(item.getCantidad());%>" class="form-control text-center" min="1">
                            </td>
                            -->
                        </tr>
                        
                    <%          }%> 
                    </table>
                    <div class="card-footer">
                        <button type="button" onclick="javascript:window.print()">Imprimir</button><br>
                        <a href="index.html">Volver a Inicio</a>
                    </div>
                </div>
                <%   }%> 

            </div>
        </div>
</div>
</body>
