package Banco;

/**
 * Creacion de la clase Ctarjeta, en esta clase lo que vamos a realizar seran las acciones que hara la tarjeta; En esta clase lo que
 * haremos sera comprobar si una cuenta existe y si esta asociada al cliente que le indicamos; Tambien podremos ver el perfil de la
 * tarjeta, es decir, que numero tiene y a quien le pertenece.
 * @author Roberto
 * @version 1.0
 */
public class Ctarjeta {
    int iNumeroTarjeta;
    int iNumeroCuenta;
    int iNumeroCliente;
    
    /**
     * En este constructor lo que haremos sera pasarle tres parametros en los cuales va a hacer una serie de comprobaciones; 
     * Primero va a comprobar si el iNumeroCuenta pertenece a una Cuenta que este creada en Ccuenta, si es asi lo que hara sera
     * mandar un mensaje por pantalla e indicar que si existe y ahora comprobara si esta cuenta asociada pertence al cliente que le 
     * hemos pasado, si es asi lo que hara sera crear la tarjeta y mandara un mensaje por pantalla.
     * Si alguna de estas dos cosas no coincide se mandara un mensaje por pantalla y no se creara la tarjeta.
     * @param iNumeroTarjeta
     * @param iNumeroCuenta
     * @param iNumeroCliente 
     */
    public Ctarjeta(int iNumeroTarjeta, int iNumeroCuenta, int iNumeroCliente) {
        if(iNumeroCuenta == Ccuenta.Cuenta1.iNumerodeCuenta){
            System.out.println("La cuenta a la que se va a asociar si existe.");
            if(iNumeroCliente == Ccuenta.Cuenta1.idniCliente){
                System.out.println("El DNI que se ha indicado es el mismo que el de la cuenta y se creara la tarjeta correctamente.");
                this.iNumeroTarjeta = iNumeroTarjeta;
                this.iNumeroCuenta = iNumeroCuenta;
                this.iNumeroCliente = iNumeroCliente;
            }else{
                System.out.println("El DNI no esta asociado a esta cuenta bancaria");
            }
        }else{
            System.out.println("La cuenta no existe.");
        }
    }
    
    public static Ctarjeta Tarjeta1 = new Ctarjeta(111,101,1);
    /**
     * En este metodo lo que haremos sera ver la tarjeta creada a quien le pertenece y a que cuenta esta vinculada.
     * @param iNumeroTarjeta
     * @param iNumeroCuenta
     * @param iNumeroCliente 
     */
    public void VerPerfilTarjeta(int iNumeroTarjeta, int iNumeroCuenta, int iNumeroCliente){
        if(iNumeroTarjeta == Tarjeta1.iNumeroTarjeta){
            System.out.print("La tarjeta " + Tarjeta1.iNumeroTarjeta);
            if(Tarjeta1.iNumeroCliente == Ccliente.Cliente1.getIdni()){
                System.out.print(" le pertenece al usuario " + Ccliente.Cliente1.sNombre);
            }
            System.out.println(" y pertence al numero de cuenta " + Tarjeta1.iNumeroCuenta);
        }
    }
}
