package Banco;

/**
 * Creacion de la clase Ccliente, en esta clase lo que vamos a realizar seran una serie de setters y getters para poder crear clientes
 * y para poder modificar un usuario ya creado cuando se quiera modificar; tambien podremos ver el perfil de un cliente.
 * @author Roberto
 * @version 1.0
 */

public class Ccliente {
    int idni, iTelefono, iEdad;
    String sNombre, sApellido;
    
    public static Ccliente Cliente1 = new Ccliente(0001, 654789214, 20, "Manuel", "Carvallo");
    
    /**
     * En este constructor lo que haremos sera pasarle una serie de parametros para crear un usuario, estos parametros se pueden
     * hacer comprobaciones como en el telefono.
     * @param idni
     * @param iTelefono
     * @param iEdad
     * @param sNombre
     * @param sApellido 
     */
    public Ccliente(int idni, int iTelefono, int iEdad, String sNombre, String sApellido) {
        this.idni = idni;
        this.iTelefono = iTelefono;
        this.iEdad = iEdad;
        this.sNombre = sNombre;
        this.sApellido = sApellido;
    }

    /**
     * Cogeremos el nuevo valor de la variable idni.
     * @return idni
     */
    public int getIdni() {
        return idni;
    }

    /**
     * Le pasamos un nuevo valor para idni y este lo cambiara en la variable idni.
     * @param idni 
     */
    public void setIdni(int idni) {
        this.idni = idni;
    }

    /**
     * Cogeremos el nuevo valor de la variable iTelefono.
     * @return iTelefono
     */
    public int getiTelefono() {
        return iTelefono;
    }

    /**
     * Le pasamos un nuevo valor para iTelefono y este lo cambiara en la variable iTelefono.
     * @param iTelefono 
     */
    public void setiTelefono(int iTelefono) {
        this.iTelefono = iTelefono;
    }

    /**
     * Cogeremos el nuevo valor de la variable iEdad.
     * @return iEdad
     */
    public int getiEdad() {
        return iEdad;
    }

    /**
     * Le pasamos un nuevo valor para iEdad y este lo cambiara en la variable iEdad.
     * @param iEdad 
     */
    public void setiEdad(int iEdad) {
        this.iEdad = iEdad;
    }

    /**
     * Cogeremos el nuevo valor de la variable sNombre.
     * @return sNombre
     */
    public String getsNombre() {
        return sNombre;
    }

    /**
     * Le pasamos un nuevo valor para sNombre y este lo cambiara en la variable sNombre.
     * @param sNombre 
     */
    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    /**
     * Cogeremos el nuevo valor de la variable sApellido.
     * @return sApellido
     */
    public String getsApellido() {
        return sApellido;
    }

    /**
     * Le pasamos un nuevo valor para sApellido y este lo cambiara en la variable sApellido.
     * @param sApellido 
     */
    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }
    /**
     * En este metodo lo que haremos sera coger el usuario creado anteriormente coger sus valores con los getters y escribirlo
     * por pantalla.
     */
    public void VerPerfil() {
        System.out.println("El cliente con DNI " + Cliente1.getIdni() + ", se llama " + Cliente1.getsNombre() + " " + Cliente1.getsApellido() + " con telefono " + Cliente1.getiTelefono() + " y tiene una edad de " + Cliente1.getiEdad() + " años.");
    }
        
}
