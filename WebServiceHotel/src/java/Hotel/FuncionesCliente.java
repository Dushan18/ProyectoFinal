/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author ADMIN
 */
public interface FuncionesCliente {
    public boolean login(String usuario, String contraseña);
    public boolean registrarse(String usuario, String nombre, String apellidoP, String apellidoM, String correo, String contraseña);
}
