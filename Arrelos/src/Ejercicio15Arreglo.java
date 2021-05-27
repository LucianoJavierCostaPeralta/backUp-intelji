/*Leer 10 enteros ordenados crecientemente - Leer N y buscar en la tabla
* Se debe mostrar en la posicion que se encuentra . Si no esta ,
* mostrarlo con un mensaje */

import java.util.Scanner;

public class Ejercicio15Arreglo {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int arreglo [] = new int[10],numero;
        boolean creciente = true;

        //Digitamos el arreglo
        System.out.println("Digite el arreglo ");
        do {
            //Pedimos el arreglo
            for (int i = 0 ; i < 10 ; i ++){
                System.out.print((i+1)+".Digite un numero : ");
               arreglo [i] = entreda.nextInt();
            }
            //Verificamos si el arreglo esta Ordenado Crecientemente
            for (int i = 0 ; i < 9 ; i ++){
                //Verificar si esta Creciente
                if (arreglo[i] < arreglo[i+1]){
                    creciente = true ;
                }
                else if (arreglo [i] > arreglo[i+1]){
                    creciente = false ;
                    break;
                }
            }
            if (creciente == false){
                System.out.println("El arreglo esta desordenado . vuelva a digitar ");
            }


        }while (creciente == false);

        //Pedimos el numero a buscar
        System.out.print("\nDigite un numero :  ");
        numero = entreda.nextInt();

        //Buscamos el numero en el arreglo
        int i = 0 ;

        while (i<10 && arreglo[i] < numero){
            i++;
        }

        if (i == 10 ){ //Hemos recorrido todo el arreglo
            System.out.println("\nNumero no encontrado ");
        }
        else{
            if (arreglo[i] == numero){
                System.out.println("\nNumero encontrado . En la posicion : "+(i+1));
            }
            else{
                System.out.println("\nNumero no encontrado");
            }
        }


    }
}
