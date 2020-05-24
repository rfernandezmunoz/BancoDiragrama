package Banco;

import Banco.Ccliente.*;
/**
 *
 * @author Roberto
 * @version 1.0
 */
public class Cgestor {
    int itelefonocliente, iedadcliente;
    String snombrecliente, sapellidocliente;
    
    public void ComprobarUsuario(int idnicliente){
        if(Ccliente.Cliente1.idni != idnicliente){
            CrearUsuario(idnicliente, itelefonocliente, iedadcliente, snombrecliente, sapellidocliente);
        }else{
            ModificarUsuario(idnicliente, itelefonocliente, iedadcliente, snombrecliente, sapellidocliente);
        }
    }
    
    public void CrearUsuario(int iDniCliente, int iTelefonoCliente, int iEdadCliente, String sNombreCliente, String sApellidoCliente){
        Ccliente Cliente2 = new Ccliente(iDniCliente, iTelefonoCliente, iEdadCliente, sNombreCliente, sApellidoCliente);
        System.out.println("Crear --> Se ha creado el cliente 2 correctamente.");
    }
    
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