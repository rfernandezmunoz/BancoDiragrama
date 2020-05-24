package Banco;

/**
 *
 * @author Roberto
 * @version 1.0
 */
public class Ctarjeta {
    int iNumeroTarjeta;
    int iNumeroCuenta;
    int iNumeroCliente;
    
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
    
    public void VerPerfilTarjeta(int iNumeroTarjeta, int iNumeroCuenta, int iNumeroCliente){
        System.out.println("La tarjeta " + iNumeroTarjeta + " le pertenece al usuario " + Ccliente.Cliente1.sNombre + 
                " y al numero de cuenta " + iNumeroCuenta);
    }
}
