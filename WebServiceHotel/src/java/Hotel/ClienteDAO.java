/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ADMIN
 */
public class ClienteDAO implements FuncionesCliente{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Statement stn;
    Conexion conex = new Conexion();
    int respuesta;
    boolean mensaje;
    Cliente cliente = new Cliente();
    @Override
    public boolean login(String usuario, String contrasenia) {
        String sql = "select * from cliente where usuarioC=? and contraseniaC=?";
        try {
            con = conex.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contrasenia);
            rs = ps.executeQuery();
            
            if(rs.absolute(1)){
                mensaje = true;
            }
            else
            {
                mensaje = false;   
            }

        } catch (Exception e) {
        }
        return mensaje;
    }
    

    @Override
    public boolean registrarse(String usuario, String nombre, String apellidoP, String apellidoM, String correo, String contraseña) {
        String sql = "insert into cliente(usuarioC,nombreC,apellidoPC,apellidoMC,correoC,contraseniaC) values(?,?,?,?,?,?)";
        try {
            con = conex.getCon();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, nombre);
            ps.setString(3, apellidoP);
            ps.setString(4, apellidoM);
            ps.setString(5, correo);
            ps.setString(6, contraseña);
            respuesta = ps.executeUpdate();
            if(respuesta == 1){
                mensaje = true;
            }
            else{
                mensaje = false;
            }
        } catch (Exception e) {
        }
        return mensaje;
    }
    
}
