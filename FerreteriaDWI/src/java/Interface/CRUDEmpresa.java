package Interface;

import Entidad.Empresa;
import java.util.List;

public interface CRUDEmpresa {
    public List listar();
    public Empresa list(int id);
    public boolean add(Empresa emp);
    public boolean edit(Empresa emp);
    public boolean eliminar(int id);
}
