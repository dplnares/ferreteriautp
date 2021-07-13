package ControladorEmpleado;

import Entidad.Empleado;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.EmpleadoDAO;

public class actualizarAccion extends AccionEmpleado {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Empleado e = new Empleado();
        EmpleadoDAO dao = new EmpleadoDAO();
        int id=Integer.parseInt(request.getParameter("txtid"));
        String nom=request.getParameter("txtNom");
        String ape=request.getParameter("txtApe");
        String login=request.getParameter("txtLogin");
        String clave=request.getParameter("txtClave");
        e.setId(id);
        e.setNombre(nom);
        e.setApellido(ape);
        e.setLogin(login);
        e.setClave(clave);
        dao.edit(e);
        request.getRequestDispatcher("/listarEmpleado.jsp").forward(request, response);
        
        return "";
    }
}
