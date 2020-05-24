package Banco;

import Banco.Ccliente.*;
/**
 * Creacion de la clase Cgestor, en esta clase lo que vamos a realizar seran las acciones del Gestor del banco cuando reciba una
 * llamada para la creacion de un usuario o modificacion.
 * @author Roberto
 * @version 1.0
 */
public class Cgestor {
    int itelefonocliente, iedadcliente;
    String snombrecliente, sapellidocliente;
    
    /**
     * En este metodo lo que haremos sera comprobar si un usuario existe a traves de un parametro; Si el DNI del cliente creado
     * no existe se va a proceder a crear el cliente llamando al metodo CrearUsuario; Si el DNI del cliente creado ya existe se va
     * a proceder a llamar al metodo ModificarUsuario.
     * @param idnicliente 
     */
    public void ComprobarUsuario(int idnicliente){
        if(Ccliente.Cliente1.idni != idnicliente){
            CrearUsuario(idnicliente, itelefonocliente, iedadcliente, snombrecliente, sapellidocliente);
        }else{
            ModificarUsuario(idnicliente, itelefonocliente, iedadcliente, snombrecliente, sapellidocliente);
        }
    }
    
    /**
     * En este metodo lo que haremos sera crear un usuario con todos los parametros que le hemos pasado y creara el cliente correctamente.
     * @param iDniCliente
     * @param iTelefonoCliente
     * @param iEdadCliente
     * @param sNombreCliente
     * @param sApellidoCliente 
     */
    public void CrearUsuario(int iDniCliente, int iTelefonoCliente, int iEdadCliente, String sNombreCliente, String sApellidoCliente){
        Ccliente Cliente2 = new Ccliente(iDniCliente, iTelefonoCliente, iEdadCliente, sNombreCliente, sApellidoCliente);
        System.out.println("Crear --> Se ha creado el cliente 2 correctamente.");
    }
    
    /**
     * En este metodo lo que hara sera modificar el usuario, para modificar el usuario ya existente, nos tienen que pasar una serie
     * de parametros para que se pueda igualar a los del cliente ya existente y si algun parametro no es igual al del cliente
     * tendremos que cambiarlo.
     * @param iDniCliente
     * @param iTelefonoCliente
     * @param iEdadCliente
     * @param sNombreCliente
     * @param sApellidoCliente 
     */
    public void ModificarUsuario(int iDniCliente, int iTelefonoCliente, int iEdadCliente, String sNombreCliente, String sApellidoCliente){
        if(iDniCliente != Ccliente.Cliente1.idni){
            Ccliente.Cliente1.setIdni(iDniCliente);
            System.out.println("Se ha modificado el DNI del cliente");
        }
        if(iTelefonoCliente != Ccliente.Cliente1.iTelefono){
            Ccliente.Cliente1.setiTelefono(iTelefonoCliente);
            System.out.println("Se ha modificado el Telefono del cliente");
        }
        if(iEdadCliente != Ccliente.Cliente1.iEdad){
            Ccliente.Cliente1.setiEdad(iEdadCliente);
            System.out.println("Se ha modificado la edad del cliente");
        }
        if(!sNombreCliente.equals(Ccliente.Cliente1.sNombre)){
            Ccliente.Cliente1.setsNombre(sNombreCliente);
            System.out.println("Se ha modificado el Nombre del cliente");
        }
        if(!sApellidoCliente.equals(Ccliente.Cliente1.sApellido)){
            Ccliente.Cliente1.setsApellido(sApellidoCliente);
            System.out.println("Se ha modificado el Apellido del cliente");
        }
        System.out.println("Modificar --> Se modificado el cliente 1 correctamente.");
    }    
}