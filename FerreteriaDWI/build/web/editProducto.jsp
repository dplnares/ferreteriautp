<%@page import="Entidad.Producto"%>
<%@page import="Modelo.ProductoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Editar Producto</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
              <%
              ProductoDAO dao=new ProductoDAO();
              int id=Integer.parseInt((String)request.getAttribute("idpro"));
              Producto p=(Producto)dao.list(id);
          %>
            <h1>Modificar Producto</h1>
            <form action="ControladorProducto">
                Descripcion:<br>
                <input class="form-control" type="text" name="txtDes" value="<%= p.getDescripcion() %>" required><br>
                Precio: <br>
                <input class="form-control" type="text" name="txtPre" value="<%= p.getPrecio() %>" required><br>
                Stock Activo: <br>
                <input class="form-control" type="text" name="txtStockAct" value="<%= p.getStockAct() %>" required><br>
                Codigo Marca: <br>
                <input class="form-control" type="text" name="txtCodMar" value="<%= p.getCodMarca() %>"  required><br>
                
                <input type="hidden" name="txtid" value="<%= p.getCodigo() %>">
                <input class="btn btn-primary" type="submit" name="accion" value="actualizar"> 
                <a href="ControladorProducto?accion=listar">Regresar</a>
            </form>
          </div>
          
        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
