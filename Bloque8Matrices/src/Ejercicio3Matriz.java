/*Crear y cargar una matriz 3x3
* Transponerla y Mostrarla */

import java.util.Scanner;

public class Ejercicio3Matriz {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int matriz [][] = new int[3][3] ;

        System.out.println("Digite la matriz ");

        for (int i = 0 ; i < 3 ; i ++){

            for (int j = 0 ; j < 3 ; j++){

                System.out.print("Matriz ["+i+"] ["+i+"] : ");
                matriz[i][j] = entreda.nextInt();
            }
        }

        //Matriz Original
        System.out.println("\nMatriz Original ");

        for (int i = 0 ; i < 3 ; i ++){

            for (int j = 0 ; j < 3 ; j ++){

                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        //Transponiendo la Matriz

        int aux ;
        for (int i = 0 ; i < 3 ; i ++ ){

            for (int j = 0 ; j < i ; j++){

                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux ;
            }
        }

        //Mostramos la matriz Transpuesta

        System.out.println("\nLa matriz Transpuesta es ");

        for (int i = 0 ; i < 3 ; i ++){
            for (int j = 0 ; j < 3 ; j++){

                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

}
