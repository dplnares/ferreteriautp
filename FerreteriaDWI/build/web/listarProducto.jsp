<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.ProductoDAO"%>
<%@page import="ControladorProducto.ControladorProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Productos</title>
    </head>
    <body>
        <div class="container">
            <h1>Productos</h1>
            <a class="btn btn-success" href="ControladorProducto?accion=agregar">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">CODIGO</th>
                        <th class="text-center">DESCRIPCION</th>
                        <th class="text-center">PRECIO</th>
                        <th class="text-center">STOCK ACTIVO</th>
                        <th class="text-center">CODIGO CATEGORIA</th>
                    </tr>
                </thead>
                <%
                    ProductoDAO dao=new ProductoDAO();
                    List<Producto>list=dao.listar();
                    Iterator<Producto>iter=list.iterator();
                    Producto pro = null;
                    while(iter.hasNext()){
                        pro=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= pro.getCodigo() %></td>
                        <td class="text-center"><%= pro.getDescripcion() %></td>
                        <td class="text-center"><%= pro.getPrecio() %></td>
                        <td class="text-center"><%= pro.getStockAct() %></td>
                        <td class="text-center"><%= pro.getCodMarca() %></td>
                        <td class="text-center">  
                            <a class="btn btn-warning" href="ControladorProducto?accion=editar&id=<%= pro.getCodigo() %>">Editar</a>
                            <a class="btn btn-danger" href="ControladorProducto?accion=eliminar&id=<%= pro.getCodigo() %>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
