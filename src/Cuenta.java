import java.util.ArrayList;
import java.util.List;

public class Cuenta {

    //Declaracion de variables
    private double saldo;
    private Usuario usuario;
    private List<Gasto> gastos;
    private List<Ingreso> ingresos;

    
    //Constructor de clase con valores por defecto
    public Cuenta(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0;
        this.gastos = new ArrayList<Gasto>();
        this.ingresos = new ArrayList<Ingreso>();
    }

    // Getters and setters
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    /* 
    Funcion que realiza ingresos de dinero y los suma a 
    la variable saldo 
    */
    public double addIngresos(String description, double cantidad) {
        Ingreso nuevoIngreso = new Ingreso(cantidad, description);
        this.ingresos.add(nuevoIngreso);
        this.saldo = this.saldo + cantidad;
        return this.saldo;
        //retur this.getSaldo();
    }
    
    //Funcion que se encarga de restar los gastos al saldo total
    public double addGastos(String description, double cantidad) {

        if (this.saldo > cantidad) {
            //Instanciamos Gasto y lo añadimos si cumple la condicion.
            Gasto nuevoGasto = new Gasto(cantidad, description);
            this.gastos.add(nuevoGasto);
            this.saldo = this.saldo - cantidad;
            return this.saldo;
            // retur this.getSaldo();
        }
        //Si la cantidad ingresada es mayor al saldo devolvemos la excepcion
        else {
            new GastoException();
            return this.saldo;
            // retur this.getSaldo();
        }
    }


    public List<Gasto> getGastos() {
        return this.gastos;
    }


    public List<Ingreso> getIngresos() {
        return this.ingresos;
    }
    
    @Override
    public String toString() {

        return String.format(
                "Usuario: %s  \nSaldo actual: %s", 
                this.usuario, this.saldo
                );
    }

}
    
