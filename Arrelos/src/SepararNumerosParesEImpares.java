import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;
import java.util.Scanner;

public class SepararNumerosParesEImpares {
    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
      int array [] = new int[10];
      int conteoPares = 0 , conteoImpares = 0 ;

      //Llenamos el arreglo
        System.out.println("Llenamos el arreglo ");

        for (int i = 0 ; i < 10 ; i++){
            System.out.print((i+1)+".Digite un numero ");
            array[i] = entrada.nextInt();

            if (array[i] % 2 == 0 ){
                conteoImpares++;
            }
            else {
                conteoImpares++;
            }
        }

        int par [] = new int[conteoPares];
        int impar [] = new int[conteoImpares];

        conteoPares = 0 ;
        conteoImpares = 0 ;

        for (int i = 0 ; i < 10 ; i ++){

            if (array[i] % 2 ==  0 ){
                par[conteoPares] = array[i];
                conteoPares++;
            }
            else {
                impar[conteoImpares] = array[i];
                conteoImpares++;
            }
        }

        System.out.println("Los numeros pares son ");
        for (int i = 0 ; i < conteoPares ; i ++){
            System.out.println(par[i]);
        }

        System.out.println("Los numeros Impares son ");

        for (int i = 0 ; i < conteoImpares ; i ++){
            System.out.println(impar[i]);
        }




    }
}
