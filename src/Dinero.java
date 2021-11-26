/* La clase dinero al ser abstracta 
no se crearan instancias en otras clases del él,
 La clase Gasto e Ingreso heredan de ella.*/
public abstract class Dinero {

    protected double dinero;
    protected String description;

    //Setters and getters
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getDinero() {
        return dinero;
    }
}