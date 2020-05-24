package Banco;

/**
 *
 * @author Roberto
 * @version 1.0
 */

public class Ccliente {
    int idni, iTelefono, iEdad;
    String sNombre, sApellido;
    
    public static Ccliente Cliente1 = new Ccliente(0001, 654789214, 20, "Manuel", "Carvallo");
    
    public Ccliente(int idni, int iTelefono, int iEdad, String sNombre, String sApellido) {
        this.idni = idni;
        this.iTelefono = iTelefono;
        this.iEdad = iEdad;
        this.sNombre = sNombre;
        this.sApellido = sApellido;
    }

    public int getIdni() {
        return idni;
    }

    public void setIdni(int idni) {
        this.idni = idni;
    }

    public int getiTelefono() {
        return iTelefono;
    }

    public void setiTelefono(int iTelefono) {
        this.iTelefono = iTelefono;
    }

    public int getiEdad() {
        return iEdad;
    }

    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
    
    public void VerPerfil() {
        System.out.println("El cliente con DNI " + idni + ", se llama " + sNombre + " " + sApellido + " con telefono " + iTelefono + " y tiene una edad de " + iEdad + " años.");
    }
        
}
