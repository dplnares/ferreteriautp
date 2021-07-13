<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header3.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
        <div class="toggle">
            <span href="">Registro</span>
        </div>
        <div class="formulario">
            <h2>Registro de Empresa</h2>
            <form action="ControladorEmpresa">
                    RUC:<br>
                    <input class="form-control" type="text" name="txtRuc" required><br>
                    Nombre de la Empresa:<br>
                    <input class="form-control" type="text" name="txtNom" required><br>
                    Direccion: <br>
                    <input class="form-control" type="text" name="txtDire" required><br>
                    Email:<br>
                    <input class="form-control" type="text" name="txtEmail" required><br>
                    Cuenta:<br>
                    <input class="form-control" type="text" name="txtLogin" required><br>
                    Contraseña:<br>
                    <input class="form-control" type="password" name="txtClave" required><br>
                    <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
            </form>
        </div>
     
        <div class="reset-password">
            <a href="index.html">Volver al Inicio</a>
        </div>
        
    </div>

   <script src="js/jquery-3.1.1.min.js"></script>    
   <script src="js/main.js"></script>

<%@include file="/footer.jsp"%>
