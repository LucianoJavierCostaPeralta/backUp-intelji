import java.util.Scanner;

//LEER DATOS DESDE EL TECLADO EN JAVA
public class LeerDatos {
    public static void main(String[] args) {
//Usamos la clase scaner.
// El usuario ingresa sus datos personales por teclado


        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.println("¿Cual es tu edad?");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su numero de telefono sin espacio :");
        long telefono = entrada.nextLong();
        System.out.println("Tu nombre es : "+nombre);
        System.out.println("Tu edad es : "+edad);
        System.out.println("Tu numero de telefono : "+telefono);







    }
}
