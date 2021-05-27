/*Utilizando 2 matrices de tamaño  5x9 Y 9X5
* Cargar la primera y transportarla a la siguiente */

import java.util.Scanner;

public class Ejercicio6Matriz {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
    int matriz1[][] , matriz2[][];
    matriz1 = new int[5][9];
    matriz2 = new int[9][5];

        System.out.println("\nDigite la Matriz ");

        for (int i= 0 ; i < 5 ; i ++){

            for (int j = 0 ; j < 9 ; j ++){

                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz1[i][j] = entreda.nextInt();
            }
        }
        //Mostramos la matriz

        System.out.println("\nLa matriz digitada es la siguiente ");

        for (int i = 0 ; i < 5 ; i ++){

            for (int j = 0 ; j < 9 ; j ++){

                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println();
        }

        //Transponemos

        for (int i = 0 ; i < 5 ; i ++){

            for (int j = 0 ; j < 9 ; j++){

                matriz2 [j][i] = matriz1[i][j];
            }
        }

        System.out.println("\nLa matriz Transpuesta es ");

        for (int i = 0 ; i < 9 ; i ++){

            for (int j = 0 ; j< 5 ; j ++){

                System.out.print(matriz2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
