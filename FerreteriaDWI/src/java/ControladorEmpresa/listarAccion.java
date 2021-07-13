package ControladorEmpresa;

import ControladorEmpresa.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class listarAccion extends AccionEmpresa {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/listarEmpresa.jsp").forward(request, response);
        
        return "";
        
        
    }
}
