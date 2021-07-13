package ControladorProducto;

import ControladorProducto.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class agregarAccion extends AccionProducto {

    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        request.getRequestDispatcher("/addProducto.jsp").forward(request, response);
        
        return "";
        
        
    }
}
