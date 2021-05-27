import javax.swing.*;
import java.util.Scanner;
/*Crear y cargar una Matriz de tamaño N x M . Y decir si es simetrica o no*/

public class Ejercicio1Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][] , nFilas , nColumnas ;
        boolean simetrica = true ;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        matriz = new int[nFilas][nColumnas];

        //Cargamos la matriz

        System.out.println("Digite una matriz ");

        for (int i = 0 ; i < nFilas ; i ++){

            for (int j = 0 ; j < nColumnas ; j ++){

                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        //Si tiene igual numero de filas y columnas es cuadrada

        if (nFilas == nColumnas){
            int i , j ;
            i = 0 ;

            while (i < nFilas && simetrica == true){

                j = 0 ;

                while (j < nColumnas && simetrica == true){

                    if (matriz[i][j] != matriz[j][i]){
                        simetrica = false ;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true){

                JOptionPane.showMessageDialog(null,"La matriz es simetrica ");
            }
            else {
                JOptionPane.showMessageDialog(null,"La matriz no es simetrica ");
            }

        }
        else {
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica ");
        }


    }
}
