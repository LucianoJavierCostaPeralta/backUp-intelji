import javax.swing.*;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int matriz [][] , nFilas , nColumnas ;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas "));

        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas "));

        matriz  = new int[nFilas][nColumnas];

        //Cargamos la matriz

        for (int i = 0 ; i < nFilas ; i++){

            for (int j = 0 ; j < nColumnas ; j++){

                System.out.print("Matriz ["+i+"] ["+j+"] : ");
                matriz[i][j] = entreda.nextInt();
            }
        }

        //Imprimimos la Matriz

        System.out.println("La matriz es ");

        for (int i = 0 ; i < nFilas ; i++){ // Numero de fila
            for (int j = 0 ; j < nColumnas ; j++){ //Numero de columna

                System.out.print(matriz[i][j]);

            }

            System.out.println();
        }
    }
}
