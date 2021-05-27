/*Crear una matriz de tamaño 7x7 . Y llenarla de forma  que
* los elementos de la diagonal sean 1  y el resto 0*/

import java.util.Scanner;

public class Ejercicio4Matriz {
    public static void main(String[] args) {
        int matriz [][] = new int[7][7] ;

        //Determinamos la posiciones de los numeros en la matriz

        for (int i = 0 ; i < 7 ; i ++){

            for (int j = 0 ; j < 7 ; j++){

                if (i==j){

                    matriz[i][j] = 1 ;
                }
                else {
                    matriz[i][j] = 0 ;

                }
            }
        }


        //Mostramos la matriz

        for (int i = 0 ; i < 7 ; i ++){

            for (int j = 0 ; j < 7 ; j++){

                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
