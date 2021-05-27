package Ejercicio4;

//Fibonacci

import javax.swing.*;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println(fibonacci(30 ));
    }

    public static int fibonacci (int numero ) {

        if (numero == 0 ){

            return 0;
        }
        else if (numero <= 2){

            return 1;
        }
        else {
            return fibonacci(numero - 1 ) + fibonacci(numero - 2 );

        }

    }
}
