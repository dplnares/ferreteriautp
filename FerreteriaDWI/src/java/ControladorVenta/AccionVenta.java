package ControladorVenta;

import ControladorVenta.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;

public abstract class AccionVenta {
    public abstract String Comando(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException;
    
    public static AccionVenta getAccion(String valor){
        AccionVenta accion = null;
        
        if(valor.equals("listar")){
            accion = new listarAccion();
        }
        else{
            if(valor.equals("registrar")){
                accion = new listarAccion();
            }
//            else{
//                if(valor.equals("actualizar")){
//                    accion = new registrarAccion();
//                }
//                else{
//                    if(valor.equals("eliminar")){
//                        accion = new eliminarAccion();
//                    }
//                    else{
//                            if(valor.equals("agregar")){
//                                accion = new agregarAccion();
//                            }
//                            else{
//                                if(valor.equals("listarP"))
//                                    accion = new listarAccion();
//                            }
//                        }
//                }
//            }
        }
        return accion;
    }
}
