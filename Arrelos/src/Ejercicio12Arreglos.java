import java.util.Scanner;

/*Leer por teclado una tabla de 10 elementos numericos enteros
* Y una posicion entre (0 y 9)
* Eliminar el elemento situado en la posicion dada sin dejar huecos*/
public class Ejercicio12Arreglos {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int arreglo [] = new int[10];
        int posicion ;
        //El usuario ingresa numeros por teclado
        System.out.println("Llenamos el arreglo ");
        for (int i =  0 ; i < 10 ; i ++){
            System.out.print(i+".Digite un numero : ");
            arreglo[i] = entreda.nextInt();
        }

        //Pedimos la posicion al usuario entre 0 y 9

        do {
            System.out.print("Digite una posicion entre (0 - 9) : ");
            posicion = entreda.nextInt();
        }while (posicion<0 || posicion>9);

        //Eliminando el elemento de la posicion indicada

        for (int i = posicion ; i < 9 ; i++){
            arreglo[i] = arreglo[i+1];
        }
        //Mostramos el arreglo

        System.out.println("El arreglo queda de lasiguiente forma ");

        for (int i = 0 ; i  < 9 ; i++){
            System.out.println("Elemento "+i+" Numero : "+arreglo[i]);
        }
        System.out.println();

    }
}
