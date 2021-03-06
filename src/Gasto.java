/* Heredamos de la clase Dinero */

public class Gasto extends Dinero {

    public Gasto(double gasto, String description) {
        /* Asignamos los parametros a las variables 
        de la clase Dinero */
        this.dinero = gasto;
        this.description = description;
    }

    // Sobreescribimos la funcion toString
    @Override
    public String toString() {

        return "Gasto en concepto de " + this.description + 
        ".importe total: " + this.dinero;
    }

}