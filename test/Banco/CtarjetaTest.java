package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En esta clase lo que se haran seran las pruebas para la clase Ctarjeta.
 * @author Roberto
 * @version 1.0
 */
public class CtarjetaTest {
    
    public static Ctarjeta Tarjeta1 = new Ctarjeta(111,101,1);
    
    /**
     * En este test lo que haremos sera pasarle unos valores por parametro y lo que hara sera ejecutar el metodo VerPerfilTarjeta.
     * @Test VerPerfilTarjeta
     */
    @Test
    public void testVerPerfilTarjeta() {
        System.out.println("----------VerPerfilTarjeta----------");
        Tarjeta1.VerPerfilTarjeta(Tarjeta1.iNumeroTarjeta, Tarjeta1.iNumeroCuenta, Tarjeta1.iNumeroCliente);
    }
    
}
