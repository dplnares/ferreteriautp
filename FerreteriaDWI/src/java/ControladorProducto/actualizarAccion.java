package ControladorProducto;

import ControladorProducto.*;
import Entidad.Producto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.ProductoDAO;

public class actualizarAccion extends AccionProducto {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Producto p = new Producto();
        ProductoDAO dao = new ProductoDAO();
        int id = Integer.parseInt(request.getParameter("txtid"));
        String des = request.getParameter("txtDes");
        double pre = Double.parseDouble(request.getParameter("txtPre"));
        int stockact = Integer.parseInt(request.getParameter("txtStockAct"));
        int codmar = Integer.parseInt(request.getParameter("txtCodMar"));
        p.setCodigo(id);
        p.setDescripcion(des);
        p.setPrecio(pre);
        p.setStockAct(stockact);
        p.setCodMarca(codmar);
        dao.edit(p);
        request.getRequestDispatcher("/listarProducto.jsp").forward(request, response);
        
        return "";
    }
}
