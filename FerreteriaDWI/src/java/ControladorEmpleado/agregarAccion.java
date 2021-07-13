package ControladorEmpleado;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class agregarAccion extends AccionEmpleado {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/addEmpleado.jsp").forward(request, response);
        
        return "";
        
        
    }
}
