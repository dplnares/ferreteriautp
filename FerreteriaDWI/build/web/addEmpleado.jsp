<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header2.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Empleado</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-6">
                <h1>Agregar Empleado</h1>
                <form action="ControladorEmpleado">
                    Nombres:<br>
                    <input class="form-control" type="text" name="txtNom" required><br>
                    Apellidos: <br>
                    <input class="form-control" type="text" name="txtApe" required><br>
                    Login: <br>
                    <input class="form-control" type="text" name="txtLogin" required><br>
                    Clave: <br>
                    <input class="form-control" type="text" name="txtClave" required><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="registrar">
                    <a href="ControladorEmpleado?accion=listar">Regresar</a>
                </form>
            </div>

        </div>
    </body>
    <%@include file="/footer.jsp"%>
</html>
