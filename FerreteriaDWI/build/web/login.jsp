<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
        <div class="toggle">
            <span> Ocultar</span>
        </div>
    <%
            String x="No se encontró el usuario, intente de nuevo";
            String a="";
            if(x!=null)
            a=x;
        %>
        <div class="formulario">
            <h2>Iniciar Sesión - Empleados</h2>
            <form action="ControladorEmpleado">
                <span class="busqueda-etiqueta">Usuario :</span>
                <input type="text" name="txtUser" placeholder="Usuario" >
                <span class="busqueda-etiqueta">Contraseña :</span>
                <input type="password" name="txtClave"  placeholder="&#128273;Contraseña" >
                <input type="submit" name="accion" value="ingresar">
                <h7 align="center"><%=a %></h7>
            </form>
        </div>
    <div class="reset-password">
            <a href="login2.jsp">Iniciar sesion como Empresa</a>
        </div> 
</div>

   <script src="js/jquery-3.1.1.min.js"></script>    
   <script src="js/main.js"></script>

<%@include file="/footer.jsp"%>
