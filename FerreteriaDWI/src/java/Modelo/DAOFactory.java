package Modelo;

import Modelo.EmpleadoDAO;
import Modelo.ProductoDAO;
import Modelo.EmpresaDAO;
import Modelo.VentaDAO;

public abstract class DAOFactory {
    public static final int MYSQL = 1;

	public abstract ProductoDAO getProducto();
        public abstract EmpleadoDAO getEmpleado();
        public abstract EmpresaDAO getEmpresa();
        public abstract VentaDAO getVenta();
	
	public static  DAOFactory getDAOFactory(int tipo)
        {
                    switch (tipo) 
                    {
			case MYSQL:
				return new FactoryDAO();
                    }
		return null;
	}
}
