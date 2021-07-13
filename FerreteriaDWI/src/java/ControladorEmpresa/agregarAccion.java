package ControladorEmpresa;

import ControladorEmpresa.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class agregarAccion extends AccionEmpresa {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/register.jsp").forward(request, response);
        
        return "";
        
        
    }
}
