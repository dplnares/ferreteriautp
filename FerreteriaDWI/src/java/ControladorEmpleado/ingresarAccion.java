package ControladorEmpleado;

import Entidad.Empleado;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.EmpleadoDAO;

public class ingresarAccion extends AccionEmpleado {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        int r = 0;
        Empleado e = new Empleado();
        EmpleadoDAO dao = new EmpleadoDAO();
        String login=request.getParameter("txtUser");
        String clave=request.getParameter("txtClave");
        e.setLogin(login);
        e.setClave(clave);
        r=dao.validar(e);
        if(r==1){
            request.getSession().setAttribute("login", login);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }else{ 
            request.getRequestDispatcher("loginEmp.jsp").forward(request, response);
        }
        
        return "";
    }
}
