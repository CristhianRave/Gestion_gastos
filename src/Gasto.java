/* Heredamos de la clase Dinero */

public class Gasto extends Dinero {

    public Gasto(double gasto, String description) {
        /* Asignamos los parametros a las variables 
        de la clase Dinero */
        this.dinero = gasto;
        this.description = description;
    }

    @Override
    public String toString() {
        /* 
        Sobreescribimos el metodo toString para imprimir 
        los parametros instroducidos en el constructor.
        */
        return "Gasto en concepto de " + this.description + 
        ".importe total: " + this.dinero;
    }

}