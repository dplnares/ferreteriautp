<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Ferreteria</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">

</head>
<body id="top">
<div class="wrapper row0">
  <div id="topbar" class="hoc clear"> 
    <div class="fl_left">
      <ul>
        <li><i class="fa fa-phone"></i> +51 (01) 456 7890</li>
        <li><i class="fa fa-envelope-o"></i> ferreteriautp@gmail.com</li>
      </ul>
    </div>
    <div class="fl_right">
      <ul>
        
      </ul>
    </div>
  </div>
</div>
<div class="wrapper row1">
 <header id="header" class="hoc clear">
    <div id="logo"> 
      <h1><a href="index.jsp">FERRETERIA</a></h1>
    </div>
    <nav id="mainav" class="clear"> 
      <ul class="clear">
        <li><a href="index.jsp">Inicio</a></li>
        <li><a href="ControladorEmpleado?accion=listar">Ver Empleados</a></li>
        <li><a href="ControladorProducto?accion=listarP">Ver Productos</a></li>
        <li><a href="ControladorEmpresa?accion=listar">Ver Clientes</a></li>
        <li><a href="ControladorVenta?accion=listar">Ver Ventas</a></li>
        <li><a style="color: white" href="#" class="nav-link dropdown-toggle" data-toggle="dropdown">Usuario</a>
        <div class="dropdown-menu text-center">
            <a><img src="img/user.jpg" height="80" width="80"> </a>
            <a>${login}</a>
            <div class="dropdown-divider"></div>
            <a href="index.html" class="drodown-item">Salir</a>
        </div>
        </li> 
            
        
      </ul>
      
    </nav>
  </header>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</html>