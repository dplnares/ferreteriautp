<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Producto</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Producto</h1>
                <form action="ControladorProducto">
                    Descripcion:<br>
                    <input class="form-control" type="text" name="txtDes" required><br>
                    Precio: <br>
                    <input class="form-control" type="text" name="txtPre" required><br>
                    Stock Activo: <br>
                    <input class="form-control" type="number" name="txtStockAct" min="1" max="9999" required><br>
                    Codigo Categoria: <br>
                    <input class="form-control" type="text" name="txtCodMar" required><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="registrar">
                    <a href="ControladorProducto?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
