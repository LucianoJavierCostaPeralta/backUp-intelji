/*Para verificar si el usuario ingrese 1000 horas debe dar
 semnas   dias 6  horas 16 */
import java.util.Scanner;


public class CalcularSemanasDiasHoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTotales , semanas , dias ,horas ;

        //El usuario ingresa por teclado el total de hotas
        System.out.print("Ingrese el total de horas : ");
        horasTotales = entrada.nextInt();

        //Calculamos las semanas , dias y horas
        semanas = horasTotales / 168 ;
        dias = horasTotales % 168 / 24 ;
        horas = horasTotales % 24 ;

        System.out.println("Los resultados son . ");
        System.out.println("Semanas :  "+semanas);
        System.out.println("Dias :  "+dias);
        System.out.println("Horas :  "+horas);

    }
}
