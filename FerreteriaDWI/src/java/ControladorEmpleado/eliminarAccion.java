package ControladorEmpleado;

import Entidad.Empleado;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.EmpleadoDAO;

public class eliminarAccion extends AccionEmpleado {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Empleado e = new Empleado();
        EmpleadoDAO dao = new EmpleadoDAO();
        int id=Integer.parseInt(request.getParameter("id"));
        e.setId(id);
        dao.eliminar(id);
        request.getRequestDispatcher("/listarEmpleado.jsp").forward(request, response);
        
        return "";
    }
}
