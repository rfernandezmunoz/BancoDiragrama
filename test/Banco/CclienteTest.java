package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto
 * @version 1.0
 */
public class CclienteTest {
    
    Ccliente Cliente1 = new Ccliente(0001, 654789214, 20, "Manuel", "Carvallo");
    
    /**
     * Test of getIdni method, of class Ccliente.
     */
    @Test
    public void testGetIdni() {
        int expResult = Cliente1.idni;
        int result = Cliente1.getIdni();
        if(expResult == result){
            System.out.println("DNI --> El valor introducido para el DNI es igual al valor del cliente 1");
        }else{
           System.out.println("DNI --> El valor introducido para el DNI no es igual al valor del cliente 1");
        }
    }

    /**
     * Test of setIdni method, of class Ccliente.
     */
    @Test
    public void testSetIdni() {
        int idni = 0001;
        System.out.println("DNI --> Se ha introducido el valor " + idni);
        Cliente1.setIdni(idni);
    }

    /**
     * Test of getiTelefono method, of class Ccliente.
     */
    @Test
    public void testGetiTelefono() {
        int expResult = Cliente1.iTelefono;
        int result = Cliente1.getiTelefono();
        if(expResult == result){
            System.out.println("TELEFONO --> El valor introducido para el TELEFONO es igual al valor del cliente 1");
        }else{
            System.out.println("TELEFONO --> El valor introducido para el TELEFONO no es igual al valor del cliente 1");
        }
    }

    /**
     * Test of setiTelefono method, of class Ccliente.
     */
    @Test
    public void testSetiTelefono() {
        int iTelefono = 741269748;
        if(9 == Integer.toString(iTelefono).length()){
            System.out.println("TELEFONO --> La longitud introducida para el telefono es valida");
            Cliente1.setiTelefono(iTelefono);
        }else{
            System.out.println("TELEFONO --> La longitud introducida para el telefono no es valida");
        }
    }

    /**
     * Test of getiEdad method, of class Ccliente.
     */
    @Test
    public void testGetiEdad() {
        int expResult = Cliente1.iEdad;
        int result = Cliente1.getiEdad();
        if(expResult == result){
            System.out.println("EDAD --> El valor introducido para la EDAD es igual al valor del cliente 1");
        }else{
            System.out.println("EDAD --> El valor introducido para la EDAD no es igual al valor del cliente 1");
        }
    }

    /**
     * Test of setiEdad method, of class Ccliente.
     */
    @Test
    public void testSetiEdad() {
        int iEdad = 40;
        Cliente1.setiEdad(iEdad);
        if(iEdad > 0){
            System.out.println("EDAD --> El valor introducido para la EDAD es mayor a 0 y es valido");
        }else{
            System.out.println("EDAD --> El valor introducido para la EDAD no es mayor a 0 por lo tanto no es valido");
        }
    }

    /**
     * Test of getsNombre method, of class Ccliente.
     */
    @Test
    public void testGetsNombre() {
        String expResult = Cliente1.sNombre;
        String result = Cliente1.getsNombre();
        if(expResult.equals(result)){
            System.out.println("NOMBRE --> El valor introducido para el NOMBRE es igual al valor del cliente 1");
        }else{
            System.out.println("NOMBRE --> El valor introducido para la NOMBRE no es igual al valor del cliente 1");
        }
    }

    /**
     * Test of setsNombre method, of class Ccliente.
     */
    @Test
    public void testSetsNombre() {
        String sNombre = "Lucia";
        Cliente1.setsNombre(sNombre);
    }

    /**
     * Test of getsApellido method, of class Ccliente.
     */
    @Test
    public void testGetsApellido() {
        String expResult = Cliente1.sApellido;
        String result = Cliente1.getsApellido();
        if(expResult.equals(result)){
            System.out.println("APELLIDO --> El valor introducido para el APELLIDO es igual al valor del cliente 1");
        }else{
            System.out.println("APELLIDO --> El valor introducido para la APELLIDO no es igual al valor del cliente 1");
        }
    }

    /**
     * Test of setsApellido method, of class Ccliente.
     */
    @Test
    public void testSetsApellido() {
        String sApellido = "Carvallo";
        Cliente1.setsApellido(sApellido);
    }

    /**
     * Test of VerPerfil method, of class Ccliente.
     */
    @Test
    public void testVerPerfil() {
        Cliente1.VerPerfil();
    }
    
}
