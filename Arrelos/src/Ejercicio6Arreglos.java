/*Leer los datos  correspondiente a 2 tablas de 12 elemntos
 numericos . Y mesclarlas en una tercera de la forma :
 3 de la tabla A , 3 de la tabla B , otras 3 de la tabla A
 Otras 3 de la tabla B , ETC */

import java.util.Scanner;

public class Ejercicio6Arreglos {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int a [] = new int[12];
        int b [] = new int[12];
        int c [] = new int[24];
        int i ,j;

        //Llenamos el primer arreglo

        System.out.println("Guardamos los elementos de la primera tabla");

        for ( i = 0 ;  i  < 12 ; i ++){

            System.out.print((i+1)+".Digite un numero : ");
            a [i] = entreda.nextInt();
        }

        //Llenamos el segundo arreglo

        System.out.println("Guardamos los elementos de la segunda tabla");
        for (i = 0 ; i < 12 ; i ++){
            System.out.print((i+1)+".Digite un numero : ");
            b[i] = entreda.nextInt();
        }

        //Ahora vamos a mesclar los arreglos A y B

        //El iterador 'i' se utiliza para los arregloa A y B
        //El iteradoe 'j' se utiliza para el arreglo C (contine a A y B)

        i =0 ;
        j = 0 ;

        //Utilizamos ciclo while

        while (i < 12 ){

            //Copiamos los 3 elementos de a[]
            for (int k = 0 ; k < 3 ; k++){//El iterador K es para almacenar 3 elementos
                c[j] = a [i+k];
                j++;//El iterador 'j' Nos sirve de contaodr
            }
            //Copuamos los 3 elementos de b[]
            for (int k = 0 ; k<3 ;  k++){

                c[j] = b[i+k];
                j++;
            }

            i+=3;//Para que el iterador aumente en 3 cada vuelta


        }

        //Mostramos el arreglo C


        System.out.println("La tabla 'C' queda de la siguiente manera  ");

        for (i = 0 ; i < c.length ; i++){

            System.out.print(c[i]+" - ");
        }
        System.out.println();
    }
}
