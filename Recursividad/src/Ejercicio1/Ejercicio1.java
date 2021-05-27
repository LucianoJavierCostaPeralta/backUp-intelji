package Ejercicio1;
//Realizar un procedimiento que imprima de manera recursiva los números del 1 al 10.
public class Ejercicio1 {

    public static void main(String[] args) {

        int numero = 1 ;
        factorial(numero);
    }

    public static  void factorial (int numero ){

        if (numero > 0 && numero <= 10){
            System.out.println(numero);
            factorial(numero +1);
        }
    }
}
