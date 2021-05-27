/*Crear y cargar 2 matrices de 3x3 , sumarlas y mostrar su suma */

import java.util.Scanner;

public class Ejercicio2Matrices {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz1 [][] , matriz2 [][] , suma [][] ;
        matriz1 = new int[3][3];
        matriz2 = new int[3][3];

        //El usuario carga la primer matriz

        System.out.println("Digite la primer matriz ");

        for (int i = 0 ; i < 3 ; i ++){

            for (int j = 0 ; j < 3 ; j++){

                System.out.print("Matriz ["+i+"]["+j+"] :  ");
                matriz1[i][j] = entrada.nextInt();
            }
        }

        //El usuario carga la segunda matriz

        System.out.println("Digite la segunda matriz ");

        for (int i = 0 ; i < 3 ; i ++){

            for (int j = 0 ; j < 3 ; j++){

                System.out.print("Matriz ["+i+"]["+j+"] :  ");
                matriz2[i][j] = entrada.nextInt();
            }
        }


        //Sumamos las matrices

        suma = new int[3][3] ;

        for (int i = 0 ; i < 3 ; i ++){

            for (int j = 0 ; j < 3 ; j++){
                suma [i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\nEl resultado de la suma es ");


        for (int i = 0 ; i < 3 ; i ++){

            for (int j = 0 ; j < 3 ; j++){

                System.out.print(suma[i] [j] +"   " );
            }
            System.out.println();
        }


    }
}
