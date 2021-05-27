import javax.swing.*;
import java.util.Scanner;

public class MetodoBurbuja {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int arreglo [] , nElementos,aux;

        //El usuaio ingresa por teclado la cantidad de elemtos del arreglo

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos que contendra el arreglo "));

        //Asignamos el numero de elementos digitado por el usuario al arreglo
        arreglo = new int[nElementos];

        //El usuario carga el arreglo por teclado

        for (int i = 0 ; i < nElementos ; i ++){
            System.out.print((i+1)+".Digite un numero : ");
            arreglo[i] = entreda.nextInt();
        }

        //METODO BURBUJA
        for (int i = 0 ; i <(nElementos - 1) ; i++){

            for (int j = 0 ; j<(nElementos - 1 ); j++){

                if (arreglo[j] > arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;

                }
            }
        }

        //Mostrando el arreglo ordenado crecientemente

        System.out.println("\nArreglo Ordenado de forma Creciente : ");

        for (int i = 0 ; i < nElementos ; i ++){

            System.out.println(arreglo[i]);
        }
    }
}
