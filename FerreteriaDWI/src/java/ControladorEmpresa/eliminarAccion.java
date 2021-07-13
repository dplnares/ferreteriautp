package ControladorEmpresa;

import ControladorEmpresa.*;
import Entidad.Empresa;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.EmpresaDAO;

public class eliminarAccion extends AccionEmpresa {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Empresa em = new Empresa();
        EmpresaDAO dao = new EmpresaDAO();
        int id=Integer.parseInt(request.getParameter("id"));
        em.setCodigo(id);
        dao.eliminar(id);
        request.getRequestDispatcher("/listarEmpresa.jsp").forward(request, response);
        
        return "";
    }
}
