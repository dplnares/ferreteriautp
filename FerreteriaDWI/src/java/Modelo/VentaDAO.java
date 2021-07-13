/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Configuracion.Conexion;
import Entidad.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class VentaDAO {
    
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs; 
    
    public boolean agregar(Venta v) {
        String sql = "insert into tbventa(fechaVenta, idCliente) values('"+v.getFecha()+"','"+v.getDocumentCliente()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
        }
        String sql2 = "insert into tb_detalleventa(cantidad, total, nomCliente) values('"+v.getCantidad()+"','"+v.getTotal()+"','"+v.getNomCliente()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql2);
            ps.executeUpdate();
        }catch(Exception e){
        }
        return false;
    }
    
    public List listar() {
        ArrayList<Venta>list=new ArrayList<>();
        String sql="SELECT idVenta, fechaVenta, idCliente, nomCliente, cantidad, total FROM tbventa INNER JOIN tb_detalleventa on tbventa.idDetalle = tb_detalleventa.idDetalle";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Venta venta = new Venta();
                venta.setCodigo(rs.getInt("idVenta"));
                venta.setFecha(rs.getString("fechaVenta"));
                venta.setDocumentCliente(rs.getString("idCliente"));
                venta.setNomCliente(rs.getString("nomCliente"));
                venta.setCantidad(rs.getInt("cantidad"));
                venta.setTotal(rs.getDouble("total"));
                         
                list.add(venta);
            }
        } catch (Exception e) {
        }
        
        return list;
    }
}
