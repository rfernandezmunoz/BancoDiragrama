package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En esta clase lo que se haran seran las pruebas para la clase Cgestor.
 * @author Roberto
 * @version 1.0
 */
public class CgestorTest {
    
    /**
     * Le pasaremos un valor por parametro al metodo ComprobarUsuario, y nos saldra un mensaje indicando si existia ese usuario o no.
     * @Test ComprobarUsuario
     */
    @Test
    public void testComprobarUsuario() {
        System.out.println("---------------ComprobarUsuario---------------");
        int idnicliente = 2;
        Cgestor instance = new Cgestor();
        instance.ComprobarUsuario(idnicliente);
    }

    /**
     * En este test lo que vamos a hacer sera indicar una serie de variables para pasarlas por parametro y que cree el cliente.
     * @Test CrearUsuario
     */
    @Test
    public void testCrearUsuario() {
        System.out.println("---------------CrearUsuario---------------");
        int iDniCliente = 2;
        int iTelefonoCliente = 753286145;
        int iEdadCliente = 50;
        String sNombreCliente = "Lucia";
        String sApellidoCliente = "Hernández";
        Cgestor instance = new Cgestor();
        instance.CrearUsuario(iDniCliente, iTelefonoCliente, iEdadCliente, sNombreCliente, sApellidoCliente);
    }

    /**
     * En este test lo que vamos a hacer sera indicar una serie de variables para pasarlas por parametro y que modifique los valores
     * del cliente existente si son distintos.
     * @Test ModificarUsuario
     */
    @Test
    public void testModificarUsuario() {
        System.out.println("---------------ModificarUsuario---------------");
        int iDniCliente = 1;
        int iTelefonoCliente = 794254879;
        int iEdadCliente = 20;
        String sNombreCliente = "Manuel";
        String sApellidoCliente = "Carbajo";
        Cgestor instance = new Cgestor();
        instance.ModificarUsuario(iDniCliente, iTelefonoCliente, iEdadCliente, sNombreCliente, sApellidoCliente);
    }
    
}
