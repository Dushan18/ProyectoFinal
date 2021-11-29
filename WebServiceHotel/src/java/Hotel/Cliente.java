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
public class Cliente {
    private String usuario;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String correo;
    private String contrasenia;

    public Cliente() {
    }

    public Cliente(String usuario, String nombre, String apellidoP, String apellidoM, String correo, String contrasenia) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContraseña(String contrasenia) {
        this.contrasenia= contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
