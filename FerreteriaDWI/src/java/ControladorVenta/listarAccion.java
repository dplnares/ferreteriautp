package ControladorVenta;

import ControladorVenta.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class listarAccion extends AccionVenta {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/listarVentas.jsp").forward(request, response);
        
        return "";
        
        
    }
}
