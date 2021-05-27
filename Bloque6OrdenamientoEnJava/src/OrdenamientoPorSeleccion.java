import javax.swing.*;
import java.util.Scanner;

public class OrdenamientoPorSeleccion {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);

        int arreglo [] , nElemento ,minimo , aux ;

        nElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del arreglo "));
        arreglo = new  int[nElemento];

        System.out.println("Digite el arreglo ");

        for (int i = 0 ; i < nElemento ; i ++){
            System.out.print((i+1)+".Digite un numero : ");
            arreglo[i] = entreda.nextInt();
        }


        //Ordenamiento Por Seleccion


        for (int i = 0 ; i < nElemento ; i ++){
            minimo = i ;

            for (int j = i+1 ; j < nElemento ; j++){

                if (arreglo[j] < arreglo[minimo] ){
                    minimo = j ;
                }
            }

            aux = arreglo[i];
            arreglo [i] = arreglo[minimo];
            arreglo[minimo] = aux;
        }


        //Imprimimos el arreglo

        System.out.println("\nEl arreglo ordenado es ");

        for (int i = 0 ; i < nElemento ; i ++){

            System.out.println(arreglo[i]);
        }
        System.out.println();
    }
}
