package Ejercicio2;

//Realizar un procedimiento que imprima de manera recursiva la tabla del 9.

public class Ejercicio2 {

    public static void main(String[] args) {

        int numero = 9 , contador = 1;

        System.out.println("Tabla del 9 : ");

        tablaNueve(numero,contador);

    }

    public static void tablaNueve (int numero , int contador ){

        if ((numero >= 9 && numero <=90) && (contador >0 && contador <=10)){

            System.out.println(" 9 x " + contador + " = " + numero);

            tablaNueve(numero + 9 , contador + 1);
        }

    }
}
