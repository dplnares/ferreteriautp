package ControladorEmpresa;

import ControladorEmpresa.*;
import Entidad.Empresa;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.EmpresaDAO;

public class actualizarAccion extends AccionEmpresa {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Empresa em = new Empresa();
        EmpresaDAO dao = new EmpresaDAO();
        int id=Integer.parseInt(request.getParameter("txtCod"));
        String idc = request.getParameter("txtID");
        String nom = request.getParameter("txtNom");
        String dir = request.getParameter("txtDir");
        String email = request.getParameter("txtEmail");
        String login = request.getParameter("txtUser");
        String clave = request.getParameter("txtClave");
        em.setCodigo(id);
        em.setId(idc);
        em.setNombre(nom);
        em.setDireccion(dir);
        em.setEmail(email);
        em.setUsuario(login);
        em.setClave(clave);
        dao.edit(em);
        request.getRequestDispatcher("/listarEmpresa.jsp").forward(request, response);
        
        return "";
    }
}
