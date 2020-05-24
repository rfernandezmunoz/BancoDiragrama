package Banco;

/**
 * Creacion de la clase Ccuenta, en esta clase lo que vamos a realizar seran las acciones que hara la cuenta, como por ejemplo, 
 * Retirar e Ingresar Saldo.
 * @author Roberto
 * @version 1.0
 */
public class Ccuenta {
    int iNumerodeCuenta;
    int iSaldo;
    String fecha;
    int idniCliente;

    public static Ccuenta Cuenta1 = new Ccuenta(101, 2820, "20/05/2020", Ccliente.Cliente1.getIdni());
    
    /**
     * En este constructor lo que se hara sera pasarle una clase de parametros en donde vamos a crear un objeto nuevo de cuenta.
     * @param iNumerodeCuenta
     * @param iSaldo
     * @param fecha
     * @param idniCliente 
     */
    public Ccuenta(int iNumerodeCuenta, int iSaldo, String fecha, int idniCliente) {
        this.iNumerodeCuenta = iNumerodeCuenta;
        this.iSaldo = iSaldo;
        this.fecha = fecha;
        this.idniCliente = idniCliente;
    }
    
    /**
     * En este metodo lo que haremos sera pasarle un parametro para indicar cuanto queremos retirar; lo que vamos a hacer sera
     * comprobar que el saldo es mayor que 0 y si es asi vamos a llamar al metodo RetirarDinero y lo retiramos; y si no es mas mayor
     * que 0 lo que hara sera mandar un mensaje e indicar que no se puede retirar el dinero de la cuenta.
     * @param Dinero 
     */
    public void ComprobarRetiradaSaldo(int Dinero){
        if(iSaldo > 0){
            RetirarDinero(Dinero);
        }else{
            System.out.println("No se puede retirar el dinero de la cuenta");
        }
    }
    
    /**
     * En este metodo lo que haremos sera ver cuanto es el iSueldoMedio de todo el año; Para ello lo que haremos sera sumar todos los
     * meses, todo esto se guardara en la variable iSueldoTotal y lo que haremos despues de tener todo el iSueldoTotal lo dividimos
     * entre 12 que son los meses y esto se guardara en iSueldoMedio.
     * @return iSueldoMedio
     */
    public int MediaUltimosMeses(){
        int[] aiMeses = new int[12];
        for(int i=0; i < aiMeses.length; i++){
            aiMeses[i] = (int) Math.random();
        }
        
        int iSueldoTotal = 0, iSueldoMedio;
        for(int i = 0; i < aiMeses.length; i++){
            iSueldoTotal = iSueldoTotal + aiMeses[i];
        }
        
        iSueldoMedio = (iSueldoTotal / 12);
        return iSueldoMedio;
    }
    
    /**
     * En este metodo lo que haremos sera pasarle un parametro donde indicaremos cuanto queremos ingresar en la cuenta, esto lo
     * sumaremos al iSaldo y lo devolvemos.
     * @param Dinero
     * @return iSaldo
     */
    public int IngresarDinero(int Dinero){
        iSaldo = iSaldo + Dinero;
        return iSaldo;
    }
    
    /**
     * En este metodo lo que haremos sera pasarle un parametro donde indicaremos cuanto queremos retirar en la cuenta, esto lo
     * restaremos al iSaldo y lo devolvemos.
     * @param Dinero
     * @return iSaldo
     */
    public int RetirarDinero(int Dinero){
        iSaldo = iSaldo - Dinero;
        return iSaldo;
    }
}
