package ControladorEmpleado;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public abstract class AccionEmpleado {
    public abstract String Comando(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
    
    public static AccionEmpleado getAccion(String valor){
        AccionEmpleado accion = null;
        
        if(valor.equals("registrar")){
            accion = new registrarAccion();
        }
        else{
            if(valor.equals("listar")){
                accion = new listarAccion();
            }
            else{
                if(valor.equals("actualizar")){
                    accion = new actualizarAccion();
                }
                else{
                    if(valor.equals("eliminar")){
                        accion = new eliminarAccion();
                    }
                    else{
                        if(valor.equals("ingresar")){
                            accion = new ingresarAccion();
                        }
                        else{
                            if(valor.equals("agregar")){
                                accion = new agregarAccion();
                            }
                        }
                    }
                }
            }
        }
        return accion;
    }
}
