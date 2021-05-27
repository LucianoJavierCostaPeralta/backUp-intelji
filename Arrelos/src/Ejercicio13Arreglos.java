import java.util.Scanner;
/*Leer 10 enteros en una tabla .Guardar en otra tabla
* Los elementos pares de la primera y a continuacion
* los elementos impares */

public class Ejercicio13Arreglos {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int arreglo [] = new int[10];
        int cPares = 0 , cImpares = 0 ;
        //Llenamos el arreglo
        System.out.println("Llenamos el arreglo ");

        for (int i = 0 ; i < 10 ; i++){
            System.out.print((i+1)+".Digite un numero : ");
            arreglo[i] = entreda.nextInt();

            //Determinamos la cantidad de numeros pares

            if (arreglo[i] % 2 == 0){
                cPares++;
            }
            else {
                cImpares++;
            }
        }
        //Creamos los siguientes arreglos

        int par [] = new int[cPares];
        int impar [] = new int[cImpares];

        //Reutili<amos los contadores
        cPares = 0 ;
        cImpares = 0 ;

        for (int i = 0 ; i < 10 ; i++){

            //Si el numero es par
            if (arreglo[i] % 2 == 0 ){
                par[cPares] = arreglo[i];
                cPares++;
            }
            else {
                impar[cImpares] = arreglo[i];
                cImpares++;
            }
        }
        //Mostramos los arreglos PAR e IMPAR

        System.out.println("Arreglo de Pares");

        for (int i = 0 ; i < cPares ; i ++){
            System.out.println(par[i]);
        }
        System.out.println();

        System.out.println("Arreglo de Impares ");

        for (int i = 0 ; i < cImpares ; i ++){
            System.out.println(impar[i]);
        }
        System.out.println();
    }
}
