<%-- 
    Document   : registro
    Created on : 17/10/2018, 10:35:16 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
        <div class="toggle">
            <span> </span>
        </div>
        <div class="formulario">
            <h2>Iniciar Sesión</h2>
            <form action="ControladorEmpleado">
                <span class="busqueda-etiqueta">Usuario :</span>
                <input type="text" name="txtUser" placeholder="Usuario" >
                <span class="busqueda-etiqueta">Contraseña :</span>
                <input type="password" name="txtClave"  placeholder="&#128273;Contraseña" >
                <input type="submit" name="accion" value="ingresar">
            </form>
        </div>
     
        <div class="reset-password">
            <a href="login.jsp">Iniciar sesion como Empresa</a>
        </div>
</div>

   <script src="js/jquery-3.1.1.min.js"></script>    
   <script src="js/main.js"></script>

<%@include file="/footer.jsp"%>
