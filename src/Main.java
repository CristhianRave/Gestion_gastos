import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean compruebaDNI = false;
        boolean salir = false;

        // Instanciamos la clase Usuario
        Usuario usuario = new Usuario();
        Cuenta cuenta = new Cuenta(usuario);


        /* 
        Solicitamos los datos para la creacion del usuario
        y los pasamos como parametros a los setters de la 
        instancia usuario.
        */
         System.out.println("Introduce el nombre del usuario: ");
        usuario.setNombre(sc.nextLine());

        System.out.println("Introduce la edad del usuario: ");
        usuario.setEdad(sc.nextInt()); 
        sc.nextLine();
        
        //Comprobamos hasta que el DNI sea correcto
        while (compruebaDNI != true) {

            System.out.println("Introduce el DNI del usuario: ");
            compruebaDNI = usuario.setDNI(sc.nextLine());

            if (compruebaDNI == false) {
                System.out.println("DNI incorrecto");
            } else {
                System.out.println("Usuario creado correctamente");
            }
        }
        
        do {
            System.out.println("Realiza una nueva acción");
            System.out.println("1 Introduce un nuevo gasto");
            System.out.println("2 Introduce un nuevo ingreso");
            System.out.println("3 Mostrar gastos");
            System.out.println("4 Mostrar ingresos");
            System.out.println("5 Mostrar saldo");
            System.out.println("0 Salir");
            
            String opcionElegida = sc.nextLine();
            byte opcionNumero = Byte.parseByte(opcionElegida);

            if (opcionNumero == 0) {
                salir = true;
            }
            else if (opcionNumero == 5) {

                System.out.println
                (String.format("El saldo actual de la cuenta es: %s €", 
                                cuenta.getSaldo()));
                salir = false;
            }


        } while (salir == false);
                
    }  
    
}