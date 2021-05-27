import java.util.Scanner;

/*Diseñar una aplicacion que declare una tabla de 10 elementos
* enteros . Leer por teclado 8 numeros .
* Luego se debe pedir un numero y una posicion .
* Insertar en la posicion indicada , desplazando los que esten debajo*/
public class Ejercicio8Arrreglos {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        //creamos el arreglo de 10 elementos
        int arreglo [] = new int[10];
        int numero , posiicon ;
        System.out.println("Llenamos el arreglo ");
        for (int i = 0 ; i <8 ; i++){
            System.out.print((i)+".Digite un numero : ");
            arreglo[i] = entreda.nextInt();
        }

        //El usario digita el numero a insertar
        System.out.print("Digite un numero : ");
        numero = entreda.nextInt();
        //El usuario ingresa la posicion por teclado
        System.out.print("Digite   una posicion : ");
        posiicon = entreda.nextInt();

        //Corremos los elementos una posicion atras

        for (int i = 7 ; i>=posiicon ; i--){
            arreglo[i+1] = arreglo[i];

        }
        //Insertamos el numero ingresado por el usuario
        //En la posicion deseada por el usuario

        arreglo[posiicon] = numero;

        //Mostramos el arreglo modificado
        System.out.println("El nuevo arreglo queda de la siguiente manera ");
        for (int i =0 ; i < 9 ; i++){

            System.out.println("Posicion "+i+" Numero : "+arreglo[i]);

        }
        System.out.println();

    }
}
