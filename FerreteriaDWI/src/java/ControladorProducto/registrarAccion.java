package ControladorProducto;

import ControladorProducto.*;
import Modelo.ProductoDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidad.Producto;

public class registrarAccion extends AccionProducto {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Producto p = new Producto();
        ProductoDAO dao = new ProductoDAO();
        String des = request.getParameter("txtDes");
        double pre = Double.parseDouble(request.getParameter("txtPre"));
        int stockact = Integer.parseInt(request.getParameter("txtStockAct"));
        int codmar = Integer.parseInt(request.getParameter("txtCodMar"));
        p.setDescripcion(des);
        p.setPrecio(pre);
        p.setStockAct(stockact);
        p.setCodMarca(codmar);
        dao.add(p);
        request.getRequestDispatcher("/listarProducto.jsp").forward(request, response);
        
        return "";
    }
}
