package ControladorEmpresa;

import ControladorEmpresa.*;
import Modelo.EmpresaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Entidad.Empresa;

public class registrarAccion extends AccionEmpresa {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        Empresa em = new Empresa();
        EmpresaDAO dao = new EmpresaDAO();
        String idc = request.getParameter("txtRuc");
        String nom = request.getParameter("txtNom");
        String dir = request.getParameter("txtDire");
        String email = request.getParameter("txtEmail");
        String login = request.getParameter("txtLogin");
        String clave = request.getParameter("txtClave");
        em.setId(idc);
        em.setNombre(nom);
        em.setDireccion(dir);
        em.setEmail(email);
        em.setUsuario(login);
        em.setClave(clave);
        dao.add(em);
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        
        return "";
    }
}
