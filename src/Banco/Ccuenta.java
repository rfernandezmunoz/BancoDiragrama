package Banco;

/**
 *
 * @author Roberto
 * @version 1.0
 */
public class Ccuenta {
    int iNumerodeCuenta;
    int iSaldo;
    String fecha;
    int idniCliente;

    public static Ccuenta Cuenta1 = new Ccuenta(101, 2820, "20/05/2020", Ccliente.Cliente1.getIdni());
    
    public Ccuenta(int iNumerodeCuenta, int iSaldo, String fecha, int idniCliente) {
        this.iNumerodeCuenta = iNumerodeCuenta;
        this.iSaldo = iSaldo;
        this.fecha = fecha;
        this.idniCliente = idniCliente;
    }
    
    public void ComprobarRetiradaSaldo(int Dinero){
        if(iSaldo > 0){
            RetirarDinero(Dinero);
        }else{
            System.out.println("No se puede retirar el dinero de la cuenta");
        }
    }
    
    public int MediaUltimosMeses(){
        int[] aiMeses = new int[12];
        for(int i=0; i < aiMeses.length; i++){
            aiMeses[i] = (int) Math.random();
        }
        
        int iSueldoTotal = 0, iSueldoMedio = 0;
        for(int i = 0; i < aiMeses.length; i++){
            iSueldoTotal = iSueldoTotal + aiMeses[i];
            iSueldoMedio = (iSueldoTotal / 12);
        }
        return iSueldoMedio;
    }
    
    public int IngresarDinero(int Dinero){
        iSaldo = iSaldo + Dinero;
        return iSaldo;
    }
    
    public int RetirarDinero(int Dinero){
        iSaldo = iSaldo - Dinero;
        return iSaldo;
    }
}
