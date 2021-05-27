import java.util.Scanner;

/*Leer 10 numeros enteros , guardarlos en el arreglo .
Debemos mostrar en el siguiente orden :
El primero , el ultimo , el segundo , el penultimo , el tercero , etc */
public class Ejercicio4Arreglo {
    public static void main(String[] args) {

        Scanner entreda = new Scanner(System.in);

        int numero [] = new int[10];

        //El usuario ingresa por teclado 10 elementos en el arreglo
        System.out.println("Guardamos los elementos en el arreglo ");

        for (int i = 0 ; i < 10 ; i ++){

            System.out.print((i+1)+".Digite un numero  : ");
            numero[i] = entreda.nextInt();
        }

        //Imprimimos los valores ingresados
        System.out.print("El resultado es : ");

        for (int i = 0 ; i < 5 ; i ++){

            System.out.print(numero[i]+ " ");//Imprime el primer elemento
            System.out.print(numero[9-i]+" ");//Imprime el ultimo elemento

        }
        System.out.println();
    }
}
