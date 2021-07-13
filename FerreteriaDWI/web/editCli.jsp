<%@page import="Entidad.Empresa"%>
<%@page import="Modelo.EmpresaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Editar Cliente</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              EmpresaDAO dao=new EmpresaDAO();
              int id=Integer.parseInt((String)request.getAttribute("idemp"));
              Empresa e=(Empresa)dao.list(id);
          %>
            <h1>Modificar Liente</h1>
            <form action="ControladorEmpresa">
                Documento:<br>
                <input class="form-control" type="text" name="txtNom" value="<%= e.getId()%>" required><br>
                Nombre: <br>
                <input class="form-control" type="text" name="txtApe" value="<%= e.getNombre()%>" required><br>
                Direccion: <br>
                <input class="form-control" type="text" name="txtLogin" value="<%= e.getDireccion()%>" required><br>
                Email: <br>
                <input class="form-control" type="text" name="txtClave" value="<%= e.getEmail()%>" required><br>
                Usuario: <br>
                <input class="form-control" type="text" name="txtClave" value="<%= e.getUsuario()%>" required><br>
                Clave: <br>
                <input class="form-control" type="text" name="txtClave" value="<%= e.getClave()%>" required><br>
                
                <input type="hidden" name="txtid" value="<%= e.getCodigo()%>">
                <input class="btn btn-primary" type="submit" name="accion" value="actualizar"> 
                <a href="Controlador?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
