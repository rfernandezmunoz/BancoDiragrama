package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto
 */
public class CtarjetaTest {
    
    public static Ctarjeta Tarjeta1 = new Ctarjeta(111,101,1);
    
    /**
     * Test of VerPerfilTarjeta method, of class Ctarjeta.
     */
    @Test
    public void testVerPerfilTarjeta() {
        System.out.println("----------VerPerfilTarjeta----------");
        Tarjeta1.VerPerfilTarjeta(Tarjeta1.iNumeroTarjeta, Tarjeta1.iNumeroCuenta, Tarjeta1.iNumeroCliente);
    }
    
}
