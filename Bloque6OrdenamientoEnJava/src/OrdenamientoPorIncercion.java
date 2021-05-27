import javax.swing.*;
import java.util.Scanner;

public class OrdenamientoPorIncercion {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int arreglo [] , nElementos ,posicion , aux ;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo "));

        arreglo = new int[nElementos];

        System.out.println("Digite el arreglo ");

        for (int i = 0 ; i < nElementos ; i ++){
            System.out.print((i+1)+".Digite un numero : ");
            arreglo[i] = entreda.nextInt();
        }

        //Ordenamiento por Incercion

        for (int i = 0 ; i < nElementos ; i ++){

            posicion = i ;
            aux = arreglo[i];

            while ( (posicion > 0 ) && (arreglo[posicion-1]>aux)){

                arreglo[posicion] = arreglo[posicion-1];
                posicion --;
            }

            arreglo [posicion] = aux;
        }

        //Imprimimos el arreglo

        System.out.println("\nArreglo Ordenado ");

        for (int i = 0 ; i < nElementos ; i ++){

            System.out.println(arreglo[i]);
        }

        System.out.println();
    }
}
