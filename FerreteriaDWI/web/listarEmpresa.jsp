<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Empresa"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.EmpresaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Ver Clientes</title>
    </head>
    <body>
        <div class="container">
            <h1>Clientes Registrados</h1>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE</th>
                        <th class="text-center">DIRECCION</th>
                        <th class="text-center">EMAIL</th>
                        <th class="text-center">LOGIN</th>
                        <th class="text-center">CLAVE</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    EmpresaDAO dao=new EmpresaDAO();
                    List<Empresa>list=dao.listar();
                    Iterator<Empresa>iter=list.iterator();
                    Empresa emp=null;
                    while(iter.hasNext()){
                        emp=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= emp.getId()%></td>
                        <td class="text-center"><%= emp.getNombre()%></td>
                        <td class="text-center"><%= emp.getDireccion()%></td>
                        <td class="text-center"><%= emp.getEmail()%></td>
                        <td class="text-center"><%= emp.getUsuario()%></td>
                        <td><%= emp.getClave()%></td>
                        <td class="text-center">  
                            <a class="btn btn-warning" href="Controlador?accion=editar&id=<%= emp.getCodigo()%>">Editar</a>
                            <a class="btn btn-danger" href="Controlador?accion=eliminar&id=<%= emp.getCodigo()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
