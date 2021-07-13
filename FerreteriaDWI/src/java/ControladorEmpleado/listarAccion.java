package ControladorEmpleado;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class listarAccion extends AccionEmpleado {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/listarEmpleado.jsp").forward(request, response);
        
        return "";
        
        
    }
}
