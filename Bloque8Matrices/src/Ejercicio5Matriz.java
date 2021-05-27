/*Crear y cargar una matriz nxm  . Mostrar la suma de cada fila y de cada  columna*/

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio5Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][] , nFilas , nColumna , sumaFila , sumaColumna ;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas "));
        nColumna = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas "));
        matriz = new int[nFilas][nColumna] ;

        //Cargamos la matriz

        JOptionPane.showMessageDialog(null,"Digite la matriz ");
        for (int i  = 0 ; i < nFilas ; i++){

            for (int j = 0 ; j < nColumna ; j ++){

                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }


        //Mostramos la matriz
        System.out.println("\nLa matriz es la siguiente ");

        for (int i = 0 ; i < nFilas ; i ++){

            for ( int j = 0 ; j < nColumna ; j ++){

                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        //Realizamos la suma de filas

        System.out.println("");
        for ( int i = 0 ; i < nFilas ; i ++){
            sumaFila = 0 ;
            for ( int j = 0 ; j < nColumna ; j ++){

                sumaFila += matriz[i][j] ;

            }

            System.out.println("La suma de la fila ["+i+"] es : "+sumaFila);
        }
        System.out.println("");

        //Realiuzamos la suma de las columnas

        for (int j = 0 ; j < nColumna ; j ++){
            sumaColumna = 0 ;
            for (int i = 0 ; i < nFilas ; i ++){
                sumaColumna += matriz[i][j];
            }
            System.out.println("La suma de la columna ["+j+"] es  : "+sumaColumna);
        }
        System.out.println();





    }
}
