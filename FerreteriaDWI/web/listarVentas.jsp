<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Venta"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.VentaDAO"%>
<%@page import="ControladorVenta.ControladorVenta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Ver Ventas</title>
    </head>
    <body>
        <div class="container">
            <h1>Ventas</h1>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">CODIGO</th>
                        <th class="text-center">FECHA</th>
                        <th class="text-center">CLIENTE</th>
                        <th class="text-center">DOCUMENTO</th>
                        <th class="text-center">CANTIDAD</th>
                        <th class="text-center">TOTAL</th>
                    </tr>
                </thead>
                <%
                    VentaDAO dao=new VentaDAO();
                    List<Venta>list=dao.listar();
                    Iterator<Venta>iter=list.iterator();
                    Venta ven = null;
                    while(iter.hasNext()){
                        ven=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= ven.getCodigo() %></td>
                        <td class="text-center"><%= ven.getFecha() %></td>
                        <td class="text-center"><%= ven.getNomCliente() %></td>
                        <td class="text-center"><%= ven.getDocumentCliente() %></td>
                        <td class="text-center"><%= ven.getCantidad() %></td>
                        <td class="text-center"><%= ven.getTotal() %></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
