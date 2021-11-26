
public class Usuario {

    //Declaracion de variables
    private String nombre;
    private int edad;
    private String DNI;

    // Constructor de clase
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

    public boolean setDNI(String DNI) {
        this.DNI = DNI;

        /*
         Hacemos uso de expresiones regulares, para 
         comprobar la validez del DNI introducido.
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
    
    // Sobreescribimos la funcion toString
    @Override
    public String toString() {

        return String.format(
                "Nombre: %s\nEdad: %d\nDNI: %s", 
                this.nombre, this.edad, this.DNI
                );
    }
}
