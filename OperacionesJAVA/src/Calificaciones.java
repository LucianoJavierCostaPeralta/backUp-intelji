import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        //EJERCICIO 1
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,suma;

        //Se le pide al usuario introducir sus notas por teclado
        System.out.println("Las calificaciones deben ser numeros decimales");
        System.out.print("Digite 3 notas  numerias : ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        //Sumamos las calificaciones
        suma = nota1 + nota2 + nota3 ;

        System.out.println("La suma de las notas es : "+suma);

    }
}
