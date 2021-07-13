package ControladorProducto;

import ControladorProducto.*;
import Entidad.Producto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.ProductoDAO;

public class eliminarAccion extends AccionProducto {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Producto p = new Producto();
        ProductoDAO dao = new ProductoDAO();
        int id = Integer.parseInt(request.getParameter("id"));
        p.setCodigo(id);
        dao.eliminar(id);
        request.getRequestDispatcher("/listarProducto.jsp").forward(request, response);
        
        return "";
    }
}
