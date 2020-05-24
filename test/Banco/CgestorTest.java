package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto
 * @version 1.0
 */
public class CgestorTest {
    
    /**
     * Test of ComprobarUsuario method, of class Cgestor.
     */
    @Test
    public void testComprobarUsuario() {
        System.out.println("---------------ComprobarUsuario---------------");
        int idnicliente = 2;
        Cgestor instance = new Cgestor();
        instance.ComprobarUsuario(idnicliente);
    }

    /**
     * Test of CrearUsuario method, of class Cgestor.
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
     * Test of ModificarUsuario method, of class Cgestor.
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
