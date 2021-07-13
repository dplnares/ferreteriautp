<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="/header3.jsp"%>
<link rel="stylesheet" href="css/estilos.css">
<div class="contenedor-form">
        <div class="toggle">
            <span> Ocultar </span>
        </div>
    
        <%
            String x="No se encontró el usuario, intente de nuevo";
            String a="";
            if(x!=null)
            a=x;
        %> 
        <div class="formulario">
            <h2>Iniciar Sesión - Empresas</h2>
            <form action="ControladorEmpresa">
                <span class="busqueda-etiqueta">Usuario :</span>
                <input type="text" name="txtUser" placeholder="Usuario" required>
                <span class="busqueda-etiqueta">Contraseña :</span>
                <input type="password" name="txtClave"  placeholder="&#128273;Contraseña" required>
                <input type="submit" name="accion" value="ingresar">
                <h7 align="center"><%=a %></h7>
            </form>
        </div>
       <div class="reset-password">
           ¿No tiene una cuenta? <a href="register.jsp">Registrese</a><br>
            <a href="loginEmp.jsp">Iniciar sesion como Empleado</a>
        </div>     
    </div>

   <script src="js/jquery-3.1.1.min.js"></script>    
   <script src="js/main.js"></script>

<%@include file="/footer.jsp"%>