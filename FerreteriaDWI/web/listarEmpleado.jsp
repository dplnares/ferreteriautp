<%@page import="java.util.Iterator"%>
<%@page import="Entidad.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Empleados</title>
    </head>
    <body>
        <div class="container">
            <h1>Empleados</h1>
            <a class="btn btn-success" href="ControladorEmpleado?accion=agregar">Agregar Nuevo</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRES</th>
                        <th class="text-center">APELLIDOS</th>
                        <th class="text-center">LOGIN</th>
                        <th class="text-center">CLAVE</th>
                        <th class="text-center">ACCIONES</th>
                    </tr>
                </thead>
                <%
                    EmpleadoDAO dao=new EmpleadoDAO();
                    List<Empleado>list=dao.listar();
                    Iterator<Empleado>iter=list.iterator();
                    Empleado emp=null;
                    while(iter.hasNext()){
                        emp=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= emp.getId()%></td>
                        <td class="text-center"><%= emp.getNombre()%></td>
                        <td class="text-center"><%= emp.getApellido()%></td>
                        <td class="text-center"><%= emp.getLogin()%></td>
                        <td><%= emp.getClave()%></td>
                        <td class="text-center">  
                            <a class="btn btn-warning" href="ControladorEmpleado?accion=editar&id=<%= emp.getId()%>">Editar</a>
                            <a class="btn btn-danger" href="ControladorEmpleado?accion=eliminar&id=<%= emp.getId()%>">Remove</a>
                        </td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>