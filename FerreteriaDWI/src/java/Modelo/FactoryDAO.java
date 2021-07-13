package Modelo;

import Interface.CRUDEmpleado;
import Interface.CRUDProd;

public class FactoryDAO extends DAOFactory{
    @Override
    public ProductoDAO getProducto()
    {
        return new ProductoDAO();
    }
    @Override
    public EmpleadoDAO getEmpleado()
    {
        return new EmpleadoDAO();
    }

    @Override
    public EmpresaDAO getEmpresa() {
        return new EmpresaDAO();
    }

    @Override
    public VentaDAO getVenta() {
        return new VentaDAO();
    }
}
