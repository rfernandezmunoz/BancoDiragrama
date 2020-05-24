package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En este test lo que haremos sera hacer una serie de comprobaciones de los metodos de la clase de Ccuenta, vamos a crear un objeto
 * llamado Cuenta1.
 * @author Roberto
 * @version 1.0
 */
public class CcuentaTest {
    Ccuenta Cuenta1 = new Ccuenta(101, 2820, "20/05/2020", 1);
    
    /**
     * En este test lo que haremos sera comprobar si se puede retirar el dinero y si se ha retirado correctamente o no, segun estos 
     * casos se pasaran unos mensajes por pantalla indicando si se ha ejecutado correctamente o no, o si no hay saldo para quitar.
     * @test ComprobarRetiradaSaldo
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
     * En este test lo que haremos sera saber si nos da bien la Media del ultimo año.
     * @test MediaUltimosMeses
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
     * En este test podremos ver si se ha realizado bien la operacion de ingresar.
     * @test IngresarDinero
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
     * En este test podremos ver si se ha realizado bien la operacion de retirar.
     * @test RetirarDinero
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
