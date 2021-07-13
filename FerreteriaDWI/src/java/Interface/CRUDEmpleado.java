
package Interface;

import Entidad.Empleado;
import java.util.List;



public interface CRUDEmpleado {
    public List listar();
    public Empleado list(int id);
    public boolean add(Empleado emp);
    public boolean edit(Empleado emp);
    public boolean eliminar(int id);
    
}
