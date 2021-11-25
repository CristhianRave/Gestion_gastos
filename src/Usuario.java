
public class Usuario {

    //Declaracion de variables
    private String nombre;
    private int edad;
    private String DNI;

    // Constructor 
    public Usuario() {
        nombre = "";
        edad = 0;
        DNI = "";
    }

    //getters and setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return this.DNI;
    }

    //
    public boolean setDNI(String DNI) {
        this.DNI = DNI;

        /*
         comprobamos los caracteres del dni introducido 
         si los primeros 8 son numeros y el ultimo es 
         una letra entonces el DNI sera valido(true).
         */

        if (DNI.matches("^[0-9]{8}[a-zA-Z]$")
            || DNI.matches("^[0-9]{8}[-][a-zA-Z]$")) {

            this.DNI = DNI;
            return true;
        }

        else {
            return false;
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /*
    Sobreescribimos el metodo toString para mostrar 
    por pantalla los datos del usuario.
     */
    @Override
    public String toString() {

        return String.format(
                "Nombre: %s\nEdad: %d\nDNI: %s", 
                this.nombre, this.edad, this.DNI
                );
    }
}
