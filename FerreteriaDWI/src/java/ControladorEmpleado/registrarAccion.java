package ControladorEmpleado;

import Modelo.EmpleadoDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidad.Empleado;

public class registrarAccion extends AccionEmpleado {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Empleado e = new Empleado();
        EmpleadoDAO dao = new EmpleadoDAO();
        String nom=request.getParameter("txtNom");
        String ape=request.getParameter("txtApe");
        String login=request.getParameter("txtLogin");
        String clave=request.getParameter("txtClave");
        e.setNombre(nom);
        e.setApellido(ape);
        e.setLogin(login);
        e.setClave(clave);
        dao.add(e);
        request.getRequestDispatcher("/listarEmpleado.jsp").forward(request, response);
        
        return "";
    }
}
