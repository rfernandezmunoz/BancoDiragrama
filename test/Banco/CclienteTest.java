package Banco;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * En esta clase lo que se haran seran las pruebas para la clase Ccliente.
 * @author Roberto
 * @version 1.0
 */
public class CclienteTest {
    
    Ccliente Cliente1 = new Ccliente(0001, 654789214, 20, "Manuel", "Carvallo");
    
    /**
     * Se ha creado un constructor anteriormente y lo que vamos a ver que se recogen bien los datos, Segun el valor que nos de si 
     * es igual o no nos saldra un mensaje por pantalla indicandolo.
     * @Test GetIdni
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
     * Indicamos un valor a la variable idni y ejecutamos el metodo setIdni para ver si se modifica en el Cliente1.
     * @Test SetIdni
     */
    @Test
    public void testSetIdni() {
        int idni = 0001;
        System.out.println("DNI --> Se ha introducido el valor " + idni);
        Cliente1.setIdni(idni);
    }

    /**
     * En este test lo que haremos sera si el telefono que le hemos pasado por el siguiente testSetiTelefono es igual que al del
     * Cliente1.
     * @Test GetiTelefono
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
     * En este test lo que haremos sera pasar un valor a la variable iTelefono, lo que haremos sera comprobar que la longitud del
     * telefono es valida para que pase a ejecutar el metodo setiTelefono.
     * @Test setiTelefono
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
     * Vamos a comprobar en este test si la edad que hemos recogido con el metodo getiEdad es igual al que tiene el Cliente1.
     * @Test GetiEdad
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
     * En este test lo que vamos a comprobar es si la edad que le estamos indicando es mayor que 17 años, esto lo haremos porque
     * si es menor de edad no puede ser cliente.
     * @Test SetiEdad
     */
    @Test
    public void testSetiEdad() {
        int iEdad = 40;
        Cliente1.setiEdad(iEdad);
        if(iEdad > 17){
            System.out.println("EDAD --> El valor introducido para la EDAD es mayor a 0 y es valido");
        }else{
            System.out.println("EDAD --> El valor introducido para la EDAD no es mayor a 0 por lo tanto no es valido");
        }
    }

    /**
     * En este test lo que haremos sera comprobar si el nombre es igual que el del Cliente1.
     * @Test GetsNombre
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
     * En este test lo que haremos sera pasarle un valor por a la variable sNombre y va a ejecutar el metodo setsNombre.
     * @Test setsNombre
     */
    @Test
    public void testSetsNombre() {
        String sNombre = "Lucia";
        Cliente1.setsNombre(sNombre);
    }

    /**
     * En este test lo que haremos sera comprobar si el nombre es igual que el del Cliente1.
     * @Test GetsApellido
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
     * En este test lo que haremos sera pasarle un valor por a la variable sApellido y va a ejecutar el metodo setsApellido.
     * @Test setsApellido
     */
    @Test
    public void testSetsApellido() {
        String sApellido = "Carvallo";
        Cliente1.setsApellido(sApellido);
    }

    /**
     * En este test lo que haremos sera comprobar si se imprime bien por pantalla todos los valores del Cliente 1.
     * @Test VerPerfil
     */
    @Test
    public void testVerPerfil() {
        Cliente1.VerPerfil();
    }
    
}
