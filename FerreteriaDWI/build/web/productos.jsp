<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Producto"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.ProductoDAO"%>
<%@page import="ControladorProducto.ControladorProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="fonts/estilos.css">
	<link rel="stylesheet" href="fonts/font-awesome.css">

	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="fonts/main2.js"></script>
        <title>Catalogo de Productos</title>
    </head>
    <body>
        <div class="wrap2">
		<ul class="tabs2">
			<li><a href="#tab1"><span class="tab-text2">Todos los productos</span></a></li>
                        <li><a href="#tab2"><span class="tab-text2">Herramientas</span></a></li>
			<li><a href="#tab3"><span class="tab-text2">Baños</span></a></li>
			<li><a href="#tab4"><span class="tab-text2">Cocinas</span></a></li>
                        <li><a href="#tab5"><span class="tab-text2">Muebles</span></a></li>
                        <li><a href="#tab6"><span class="tab-text2">Decoracion</span></a></li>
		</ul>

		<div class="secciones2">
			<article id="tab1">
                                    <div class="container">

                                        <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th class="text-center">DESCRIPCION DEL PRODUCTO</th>
                                                <th class="text-center">PRECIO</th>
                                                <th class="text-center">CARRITO</th>
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
                                                <td class="text-center"><%= pro.getDescripcion() %></td>
                                                <td class="text-center"><%= pro.getPrecio() %></td>
                                                <td class="text-center">  
                                                    <a class="btn btn-warning" href="ControladorCarrito?opcion=agrega&id=<%=pro.getCodigo() %>">Agregar</a>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                        </table>
                                    </div>
			</article>
                                        <article id="tab2">
                                    <div class="container">
                                        <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th class="text-center">DESCRIPCION DEL PRODUCTO</th>
                                                <th class="text-center">PRECIO</th>
                                                <th class="text-center">CARRITO</th>
                                            </tr>
                                        </thead>
                                        <%
                                            ProductoDAO dao2=new ProductoDAO();
                                            List<Producto>list2=dao2.listar(1);
                                            Iterator<Producto>iter2=list2.iterator();
                                            Producto pro2 = null;
                                            while(iter2.hasNext()){
                                                pro2=iter2.next();

                                        %>
                                        <tbody>
                                            <tr>

                                                <td class="text-center"><%= pro2.getDescripcion() %></td>
                                                <td class="text-center"><%= pro2.getPrecio() %></td>
                                                <td class="text-center">  
                                                    <a class="btn btn-warning" href="ControladorCarrito?opcion=agrega&id=<%=pro2.getCodigo() %>">Agregar</a>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                        </table>
                                    </div>
			</article>
			<article id="tab3">
                            <div class="container">

                                        <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th class="text-center">DESCRIPCION DEL PRODUCTO</th>
                                                <th class="text-center">PRECIO</th>
                                                <th class="text-center">CARRITO</th>
                                            </tr>
                                        </thead>
                                        <%
                                            ProductoDAO dao3=new ProductoDAO();
                                            List<Producto>list3=dao3.listar(2);
                                            Iterator<Producto>iter3=list3.iterator();
                                            Producto pro3 = null;
                                            while(iter3.hasNext()){
                                                pro3=iter3.next();

                                        %>
                                        <tbody>
                                            <tr>

                                                <td class="text-center"><%= pro3.getDescripcion() %></td>
                                                <td class="text-center"><%= pro3.getPrecio() %></td>
                                                <td class="text-center">  
                                                    <a class="btn btn-warning" href="ControladorCarrito?opcion=agrega&id=<%=pro3.getCodigo() %>">Agregar</a>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                        </table>
                                    </div>
			</article>
			<article id="tab4">
                            <div class="container">
                                        <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th class="text-center">DESCRIPCION DEL PRODUCTO</th>
                                                <th class="text-center">PRECIO</th>
                                                <th class="text-center">CARRITO</th>
                                            </tr>
                                        </thead>
                                        <%
                                            ProductoDAO dao4=new ProductoDAO();
                                            List<Producto>list4=dao4.listar(3);
                                            Iterator<Producto>iter4=list4.iterator();
                                            Producto pro4 = null;
                                            while(iter4.hasNext()){
                                                pro4=iter4.next();

                                        %>
                                        <tbody>
                                            <tr>

                                                <td class="text-center"><%= pro4.getDescripcion() %></td>
                                                <td class="text-center"><%= pro4.getPrecio() %></td>
                                                <td class="text-center">  
                                                    <a class="btn btn-warning" href="ControladorCarrito?opcion=agrega&id=<%=pro4.getCodigo() %>">Agregar</a>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                        </table>
                            </div>
			</article>
                                        
                        <article id="tab5">
                            <div class="container">
                                        <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th class="text-center">DESCRIPCION DEL PRODUCTO</th>
                                                <th class="text-center">PRECIO</th>
                                                <th class="text-center">CARRITO</th>
                                            </tr>
                                        </thead>
                                        <%
                                            ProductoDAO dao5=new ProductoDAO();
                                            List<Producto>list5=dao5.listar(4);
                                            Iterator<Producto>iter5=list5.iterator();
                                            Producto pro5 = null;
                                            while(iter5.hasNext()){
                                                pro5=iter5.next();

                                        %>
                                        <tbody>
                                            <tr>
                                                <td class="text-center"><%= pro5.getDescripcion() %></td>
                                                <td class="text-center"><%= pro5.getPrecio() %></td>
                                                <td class="text-center">  
                                                    <a class="btn btn-warning" href="ControladorCarrito?opcion=agrega&id=<%=pro5.getCodigo() %>">Agregar</a>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                        </table>
                                </div>
			</article>  
                        <article id="tab6">
                            <div class="container">
                                        <table class="table table-bordered">
                                        <thead>
                                            <tr>
                                                <th class="text-center">DESCRIPCION DEL PRODUCTO</th>
                                                <th class="text-center">PRECIO</th>
                                                <th class="text-center">CARRITO</th>
                                            </tr>
                                        </thead>
                                        <%
                                            ProductoDAO dao6=new ProductoDAO();
                                            List<Producto>list6=dao6.listar(5);
                                            Iterator<Producto>iter6=list6.iterator();
                                            Producto pro6 = null;
                                            while(iter6.hasNext()){
                                                pro6=iter6.next();

                                        %>
                                        <tbody>
                                            <tr>
                                                <td class="text-center"><%= pro6.getDescripcion() %></td>
                                                <td class="text-center"><%= pro6.getPrecio() %></td>
                                                <td class="text-center">  
                                                    <a class="btn btn-warning" href="ControladorCarrito?opcion=agrega&id=<%=pro6.getCodigo() %>">Agregar</a>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                        </table>
                                </div>
			</article>
             
		</div>
	</div>
    </body>
<%@include file="/footer.jsp"%>
</html>
