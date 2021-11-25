import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean compruebaDNI = false;

        // Instanciamos la clase Usuario
        Usuario usuario = new Usuario();
        
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
        sc.close();            
    }  
    
}