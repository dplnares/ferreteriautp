package Modelo;

import Configuracion.Conexion;
import Entidad.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interface.Validar;
import Interface.CRUDEmpleado;


public class EmpleadoDAO implements CRUDEmpleado, Validar{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Empleado emp=new Empleado();
    
    @Override
    public List listar() {
        ArrayList<Empleado>list=new ArrayList<>();
        String sql="select * from tb_empleado";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Empleado emp=new Empleado();
                emp.setId(rs.getInt("cod_emp"));
                emp.setNombre(rs.getString("nom_emp"));
                emp.setApellido(rs.getString("ape_emp"));
                emp.setLogin(rs.getString("login_emp"));
                emp.setClave(rs.getString("clave_emp"));
                           
                list.add(emp);
            }
        } catch (Exception e) {
        }
        return list;
    }
 
   @Override
    public Empleado list(int id) {
        String sql="select * from tb_empleado where cod_emp="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);  
            rs=ps.executeQuery();
            while(rs.next()){                
                emp.setId(rs.getInt("cod_emp"));
                emp.setNombre(rs.getString("nom_emp"));
                emp.setApellido(rs.getString("ape_emp"));
                emp.setLogin(rs.getString("login_emp"));
                emp.setClave(rs.getString("clave_emp"));
                
            }
        } catch (Exception e) {
        }
        return emp;
    }

    @Override
    public boolean add(Empleado emp) {
       String sql="insert into tb_empleado(nom_emp, ape_emp, login_emp, clave_emp)values('"+emp.getNombre()+"','"+emp.getApellido()+"','"+emp.getLogin()+"','"+emp.getClave()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Empleado emp) {
        String sql="update tb_empleado set nom_emp='"+emp.getNombre()+"',ape_emp='"+emp.getApellido()+"',login_emp='"+emp.getLogin()+"',clave_emp='"+emp.getClave()+"'where cod_emp="+emp.getId();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from tb_empleado where cod_emp="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public int validar(Empleado emp) {
        int r=0;
        String sql="Select * from tb_empleado where login_emp=? and clave_emp=? ";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, emp.getLogin());
            ps.setString(2, emp.getClave());
            rs=ps.executeQuery();
            while (rs.next()) {      
                r=r+1;
                emp.setLogin(rs.getString("login_emp"));
                emp.setClave(rs.getString("clave_emp"));
            }
            if(r==1){
                return 1;
            }else{
                return 0;
            }
        } catch (Exception e) {
            return 0;
        }
    }
}

    
    
    

