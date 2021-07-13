
package Interface;

import Entidad.Producto;
import java.util.List;

public interface CRUDProd {
    public List listar();
    public List listar(int marca);
    public Producto list(int id);
    public boolean add(Producto pro);
    public boolean edit(Producto pro);
    public boolean eliminar(int id);
}
