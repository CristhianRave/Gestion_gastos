/* Heredamos de la clase Dinero */

public class Ingreso extends Dinero {
    /*
    Asignamos los parametros a las variables 
    de la clase Dinero
     */
    public Ingreso(double ingreso, String description) {
        this.dinero = ingreso;
        this.description = description;
    }

    // Sobreescribimos la funcion toString
    @Override
    public String toString() {
        return "Ingreso a su favor en concepto de " + 
                this.description + " .Importe total: " + this.dinero;
    }
    
}