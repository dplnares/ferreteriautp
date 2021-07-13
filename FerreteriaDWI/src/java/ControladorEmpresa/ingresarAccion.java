package ControladorEmpresa;

import ControladorEmpresa.*;
import Entidad.Empresa;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.EmpresaDAO;

public class ingresarAccion extends AccionEmpresa {
    public String Comando(HttpServletRequest request, HttpServletResponse
                response) throws ServletException, IOException 
    {
        int r = 0;
        Empresa em = new Empresa();
        EmpresaDAO dao = new EmpresaDAO();
        String login=request.getParameter("txtUser");
        String clave=request.getParameter("txtClave");
        em.setUsuario(login);
        em.setClave(clave);
        r=dao.validar(em);
        if(r==1){
        request.getSession().setAttribute("login", login);
        request.getRequestDispatcher("index2.jsp").forward(request, response);
        }else{ 
            request.getRequestDispatcher("login2.jsp").forward(request, response);
        }
        
        return "";
    }
}
