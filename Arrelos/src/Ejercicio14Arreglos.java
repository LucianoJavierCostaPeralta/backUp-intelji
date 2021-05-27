/*Leer 2 series de 10 enteros , que estaran ordenados crecientemente
* Copiar (Fusionar)  Las 2 tablas en una tercera de forma que
* sigan ordenados */

import java.util.Scanner;

public class Ejercicio14Arreglos {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int a [] = new int[10];
        int b [] = new int[10];
        int c [] = new int[20];
        boolean creciente = true ;
        //Llenamos el primer arreglo
        System.out.println("Digite el primer arreglo");

        do {
            //Pedimos el arreglo
            for (int i = 0 ; i < 10 ; i ++){
                System.out.print((i+1)+".Digite un numero : ");
                a [i] = entreda.nextInt();
            }
            //Verificamos si el arreglo esta Ordenado Crecientemente
            for (int i = 0 ; i < 9 ; i ++){
                //Verificar si esta Creciente
                if (a[i] < a[i+1]){
                    creciente = true ;
                }
                else if (a [i] > a[i+1]){
                    creciente = false ;
                    break;
                }
            }
            if (creciente == false){
                System.out.println("El arreglo esta desordenado . vuelva a digitar ");
            }


        }while (creciente == false);

        //Llenamos el segundo arreglo

        System.out.println("Digite el segundo arreglo ");
        do {
            //Pedimos el arreglo
            for (int i = 0 ; i < 10 ; i ++){
                System.out.print((i+1)+".Digite un numero : ");
                b [i] = entreda.nextInt();
            }
            //Verificamos si el arreglo esta Ordenado Crecientemente
            for (int i = 0 ; i < 9 ; i ++){
                //Verificar si esta Creciente
                if (b[i] < b[i+1]){
                    creciente = true ;
                }
                else if (b [i] > b[i+1]){
                    creciente = false ;
                    break;
                }
            }
            if (creciente == false){
                System.out.println("El arreglo esta desordenado . vuelva a digitar ");
            }


        }while (creciente == false);

        int i = 0 ; //Iterador i para el arreglo a
        int j = 0 ; //Iterador j para el arreglo b
        int k = 0 ; //Iterador k para el arreglo c

        //Se cumple mientras I & J sean menores a 10
        while (i < 10 && j < 10){
            if (a[i] < b[j]){
                c[k] = a[i]; //Copiamos el elemento de a
                i++; //Avanzamos una posicion en el arreglo a
            }
            else {
                c[k] = b[j]; //Copiamos el elemento de b
                j++; //Avanzamos una posicion mas en b
            }
            k++; //Avanzamos una posicion en c

        }
        //Salimos del white .Cuando se termina de copiar un array completo (AoB)

        if (i == 10 ){ //Copiamos todo el arreglo a

            while (j < 10){//Mientras que j sea menor a 10
                c[k] = b[j];//Copiamos los elementos de b[] en c[]
                j++; //Avanzamos una posicion en b[]
                k++; //Avanzamos una posicion en c[]
            }
        }
        else { //Copiamos todo el arreglo b [] falta el arreglo a[]

            while (i<10){//Mientras i sea menor a 10
                c[k] = a [i]; //Copiamos los elementos de a[] en c[]
                i++;//Avanzamos una posicion en a[]
                k++;//Avanzamos una posicion en c[]
            }
        }

        //Mostramos c[] que comprende a[] Y b[]

        System.out.println("\nEl tercer arreglo es : ");

        for (k=0 ; k < 20 ; k++){
            System.out.println(c[k]);
        }



    }
}
