<%@page import="Entidad.Empleado"%>
<%@page import="Modelo.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Editar Empleado</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              EmpleadoDAO dao=new EmpleadoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idemp"));
              Empleado e=(Empleado)dao.list(id);
          %>
            <h1>Modificar Empleado</h1>
            <form action="ControladorEmpleado">
                Nombres:<br>
                <input class="form-control" type="text" name="txtNom" value="<%= e.getNombre()%>" required><br>
                Apellidos: <br>
                <input class="form-control" type="text" name="txtApe" value="<%= e.getApellido()%>" required><br>
                Login: <br>
                <input class="form-control" type="text" name="txtLogin" value="<%= e.getLogin()%>" required><br>
                Clave: <br>
                <input class="form-control" type="text" name="txtClave" value="<%= e.getClave()%>" required><br>
                
                <input type="hidden" name="txtid" value="<%= e.getId()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="actualizar"> 
                <a href="ControladorEmpleado?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
