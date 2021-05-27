/*Crear una matriz "Marco" de tamaño 5x5 .Todos sus elementos deben ser 0
* Salvo los de los bordes que deben ser  1 . Mostrarla  */

import java.io.FileOutputStream;

public class Ejercicio7Matriz {
    public static void main(String[] args) {

        int matriz [][] = new int[5][5];

        //Rellenamos la matriz

        for (int i = 0 ; i < 5 ; i ++){

            for (int j = 0 ; j < 5 ; j ++){

                if (i == 0 || i ==4){
                    matriz[i][j] = 1 ;
                }
                else if (j == 0 || j == 4){

                    matriz[i][j] = 1 ;
                }
                else {
                    matriz[i][j] = 0 ;
                }
            }
        }


        //La mastriz es la siguiente


        System.out.println("\nLa matriz es   ");

        for (int i = 0 ; i < 5 ; i ++){

            for (int j = 0 ; j < 5 ; j ++){

                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }







    }
}
