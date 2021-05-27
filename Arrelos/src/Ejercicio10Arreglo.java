import java.util.Scanner;
/*Crear un programa que lea por teclado una tabla de 10
* numeros enteros . Y desplazar N posiciones en el arreglo
* (N es ingresado por el usuario )*/
public class Ejercicio10Arreglo {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int arreglo [] = new int[10];
        int  nPosicion ,ultimo;

        System.out.println("Llenamos el arreglo ");

        for (int i = 0 ; i < 10 ; i ++){
            System.out.print((i)+".Digite un numero : ");
            arreglo [i] = entreda.nextInt();
        }

        System.out.print("Digite la cantidad de posiciones a desplazar :");
        nPosicion = entreda.nextInt();

        for (int vueltas = 1 ; vueltas<=nPosicion ; vueltas++){
            //Guardamos el ultimo elemento
            ultimo = arreglo[9];
            //Desplazando una posicion en el arreglo
            for (int i = 8 ; i >=0 ; i--){
                arreglo[i+1] = arreglo[i];
            }
            //Ponemos el ultimo elemento en la primera posicion
            arreglo[0] = ultimo;
        }
        //Mostramos el arreglo modificado

        System.out.println("El arreglo queda de la siguiente forma");

        for (int i = 0 ; i <10 ; i++){
            System.out.println(i+".Elmento : "+arreglo[i]);
        }
    }
}
