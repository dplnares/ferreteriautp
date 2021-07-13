
package Modelo;

import Configuracion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interface.CRUDProd;
import Entidad.Producto;

public class ProductoDAO implements CRUDProd{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Producto pro = new Producto();
@Override
    public List listar() {
        ArrayList<Producto>list=new ArrayList<>();
        String sql="select * from tb_producto";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pro= new Producto();
                pro.setCodigo(rs.getInt("cod_pro"));
                pro.setDescripcion(rs.getString("des_pro"));
                pro.setPrecio(rs.getDouble("pre_pro"));
                pro.setStockAct(rs.getInt("stock_act_pro"));
                pro.setCodMarca(rs.getInt("marca_cod_mar"));
                           
                list.add(pro);
            }
        } catch (Exception e) {
        }
        return list;
    }
    @Override
    public List listar(int categoria) {
        ArrayList<Producto>list=new ArrayList<>();
        String sql="select * from tb_producto where marca_cod_mar="+categoria;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pro= new Producto();
                pro.setCodigo(rs.getInt("cod_pro"));
                pro.setDescripcion(rs.getString("des_pro"));
                pro.setPrecio(rs.getDouble("pre_pro"));
                pro.setStockAct(rs.getInt("stock_act_pro"));
                pro.setCodMarca(rs.getInt("marca_cod_mar"));
                           
                list.add(pro);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Producto list(int id) {
        String sql="select * from tb_producto where cod_pro="+id;
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pro.setCodigo(rs.getInt("cod_pro"));
                pro.setDescripcion(rs.getString("des_pro"));
                pro.setPrecio(rs.getDouble("pre_pro"));
                pro.setStockAct(rs.getInt("stock_act_pro"));
                pro.setCodMarca(rs.getInt("marca_cod_mar"));
            }
        }catch (Exception e){
            
        }
        return pro;
    }

    @Override
    public boolean add(Producto pro) {
        String sql = "insert into tb_producto(des_pro, pre_pro, stock_act_pro, marca_cod_mar) values('"+pro.getDescripcion()+"','"+pro.getPrecio()+"','"+pro.getStockAct()+"','"+pro.getCodMarca()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }

    @Override
    public boolean edit(Producto pro) {
        String sql="update tb_producto set des_pro='"+pro.getDescripcion()+"',pre_pro='"+pro.getPrecio()+"',stock_act_pro='"+pro.getStockAct()+"',marca_cod_mar='"+pro.getCodMarca()+"'where cod_pro="+pro.getCodigo();
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
        }
        return false;
    }

    @Override
    public boolean eliminar(int id) {
        String sql="delete from tb_producto where cod_pro="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    
    
}
