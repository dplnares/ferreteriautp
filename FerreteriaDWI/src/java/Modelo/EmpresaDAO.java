package Modelo;

import Configuracion.Conexion;
import Entidad.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Interface.CRUDEmpresa;
import Interface.ValidarEmpresa;

public class EmpresaDAO implements CRUDEmpresa, ValidarEmpresa{

    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    Empresa empr = new Empresa();
    
    @Override
    public List listar() {
        ArrayList<Empresa>list=new ArrayList<>();
        String sql="select * from tb_cliente";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Empresa empr=new Empresa();
                empr.setCodigo(rs.getInt("cod_cli"));
                empr.setId(rs.getString("id_cli"));
                empr.setNombre(rs.getString("nom_cli"));
                empr.setDireccion(rs.getString("dir_cli"));
                empr.setEmail(rs.getString("email_cli"));
                empr.setUsuario(rs.getString("user_cli"));
                empr.setClave(rs.getString("pass_cli"));
                list.add(empr);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Empresa list(int id) {
        String sql="select * from tb_cliente where cod_cli="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);  
            rs=ps.executeQuery();
            while(rs.next()){                
                empr.setCodigo(rs.getInt("cod_cli"));
                empr.setId(rs.getString("id_cli"));
                empr.setNombre(rs.getString("nom_cli"));
                empr.setDireccion(rs.getString("dir_cli"));
                empr.setEmail(rs.getString("email_cli"));
                empr.setUsuario(rs.getString("user_cli"));
                empr.setClave(rs.getString("pass_cli"));
            }
        } catch (Exception e) {
        }
        return empr;
    }

    @Override
    public boolean add(Empresa empr) {
        String sql="insert into tb_cliente(id_cli, nom_cli, dir_cli, email_cli, user_cli, pass_cli) values('"+empr.getId()+"','"+empr.getNombre()+"','"+empr.getDireccion()+"','"+empr.getEmail()+"','"+empr.getUsuario()+"','"+empr.getClave()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
    }

    @Override
    public boolean edit(Empresa empr) {
        String sql="update tb_cliente set nom_cli='"+empr.getNombre()+"',dir_cli='"+empr.getDireccion()+"',email_cli='"+empr.getEmail()+"',user_cli='"+empr.getUsuario()+"', pass_cli='"+empr.getClave()+"where cod_cli="+empr.getCodigo();
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
        String sql="delete from tb_cliente where cod_cli="+id;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public int validar(Empresa empr) {
        int r=0;
        String sql="Select * from tb_cliente where user_cli=? and pass_cli=? ";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, empr.getUsuario());
            ps.setString(2, empr.getClave());
            rs=ps.executeQuery();
            while (rs.next()) {      
                r=r+1;
                empr.setUsuario(rs.getString("user_cli"));
                empr.setClave(rs.getString("pass_cli"));
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
