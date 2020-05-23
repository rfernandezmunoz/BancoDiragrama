package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto
 */
public class CcuentaTest {
    Ccuenta Cuenta1 = new Ccuenta(101, 2820, "20/05/2020", 1);
    
    /**
     * Test of ComprobarRetiradaSaldo method, of class Ccuenta.
     */
    @Test
    public void testComprobarRetiradaSaldo() {
        int Dinero = 20;
        if(Cuenta1.iSaldo > 0){
            Cuenta1.ComprobarRetiradaSaldo(Dinero);
            if(Cuenta1.iSaldo == 2800){
                System.out.println("COMPROBAR --> El saldo es mayor a 0 y se ha retirado correctamente");
            }else{
                System.out.println("COMPROBAR --> El saldo es mayor a 0 pero no se ha retirado correctamente");
            }
        }else{
            System.out.println("COMPROBAR --> El saldo es 0 o menos y no se ha retirado nada.");
        }
    }

    /**
     * Test of MediaUltimosMeses method, of class Ccuenta.
     */
    @Test
    public void testMediaUltimosMeses() {
        int expResult = Cuenta1.MediaUltimosMeses();
        int result = 875;
        if(expResult == result){
            System.out.println("MEDIA --> El valor medio de todo el año es igual al valor esperado del test");
        }else{
            System.out.println("MEDIA --> El valor medio de todo el año no es igual al valor esperado del test");
        }
    }

    /**
     * Test of IngresarDinero method, of class Ccuenta.
     */
    @Test
    public void testIngresarDinero() {
        int Dinero = 220;
        int expResult = Cuenta1.IngresarDinero(Dinero);
        int result = 3040;
        if(expResult == result){
            System.out.println("INGRESAR --> El valor total ingresado es igual al valor esperado del test.");
        }else{
            System.out.println("INGRESAR --> El valor total ingresado no es igual al valor esperado del test.");
        }
    }

    /**
     * Test of RetirarDinero method, of class Ccuenta.
     */
    @Test
    public void testRetirarDinero() {
        int Dinero = 115;
        int expResult = Cuenta1.RetirarDinero(Dinero);
        int result = 2500;
        if(expResult == result){
            System.out.println("RETIRAR --> El valor total retirado es igual al valor esperado del test.");
        }else{
            System.out.println("RETIRAR --> El valor total ingresado no es igual al valor esperado del test.");
        }
    }
    
}
