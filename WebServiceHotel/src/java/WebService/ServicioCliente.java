/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Hotel.ClienteDAO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ADMIN
 */
@WebService(serviceName = "ServicioCliente")
public class ServicioCliente {
    ClienteDAO CDao = new ClienteDAO();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Login")
    public boolean Login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasenia") String contrasenia) {
        //TODO write your implementation code here:
        boolean datos = CDao.login(usuario, contrasenia);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrar")
    public boolean registrar( @WebParam(name = "usuario") String usuario, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellidoP") String apellidoP, @WebParam(name = "apelliidoM") String apelliidoM, @WebParam(name = "correo") String correo, @WebParam(name = "contrasenia") String contrasenia) {
        //TODO write your implementation code here:
        boolean datos = CDao.registrarse(usuario, nombre, apellidoP, apelliidoM, correo, contrasenia);
        return datos;
    }
}
