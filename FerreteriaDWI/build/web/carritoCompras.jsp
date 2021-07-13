<%@page import="java.util.List"%>
<%@page import="Entidad.Item"%>

<%@include file="/header3.jsp"%>

	<div class="container">
            <h1>Carrito de Compras</h1>
            <div class="cartcontent">
                <div class="myitems">
                    <table width="600px" cellpadding="0" cellspacing="0">
                        <tr>
                            <th>Id</th> 
                            <th>Item</th>
                            <th>Precio</th>
                            <th>Cantidad</th>
                            <th>Accion</th>
                        </tr>
                        <%if (session.getAttribute("shoppingCart") != null) 
                        {
                            double total=0;
                            int cantidad = 0;
                            List<Item> carritoCompras = (List<Item>) session.getAttribute("shoppingCart");
                            for (int i = 0; i < carritoCompras.size(); i++) 
                                {
                                    Item item = (Item) carritoCompras.get(i);
                                    total= total + carritoCompras.get(i).getPrecio();
                                    cantidad = cantidad + item.getCantidad();
                        %>
                        <tr>
                            <td align="center"><%out.print(item.getId());%></td>
                            <td align="center"><% out.print(item.getNombre());%></td> 
                            <td align="center"><% out.print(item.getPrecio());%></td>
                            <td align="center"><% out.print(item.getCantidad());%></td>                           
                            <td align="center">
                                <a href="ControladorCarrito?opcion=elimina&nro=<%out.print(i);%>">
                                    <img alt="Eliminar" title="Eliminar" src="images\delete.jpg" width="15" height="15">
                                </a>
                            </td>
                        </tr>
                        
                    <%          }%> 
                    </table>
                    <a href="productos.jsp">Seguir Comprando</a>
                    <div class="col-sm-4">
                        <form action="ControladorCarrito">
                    <div class="card">
                        <div class="card-header">
                            <h3>Generar Pedido</h3>
                        </div>
                        <div class="card-body">
                            Nombre Completo del Cliente/Empresa<br>
                            <input type="text" placeholder="${login}" name="txtNomCliente" class="form-control" required><br>
                            Documento del Cliente/Empresa<br>
                            <input type="text" name="txtDocumentoCliente" class="form-control" required ><br> 
                            Cantidad de Productos<br>
                            <input type="text" name="txtCantidad" class="form-control" value="<%out.print(cantidad);%>" readonly><br>
                            Total a pagar: <br>
                            <input type="text" name="txtTotal" value="${total}" readonly="" class="form-control"  ><br>
                        </div>
                        <div class="card-footer">
                            <input class="btn btn-primary" type="submit" name="opcion" value="venta">
                        </div>
                    </div>
                        </form>
                </div>
                </div>
                <%   }%> 

            </div>
        </div>

<%@include file="/footer.jsp"%>