package Ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println(recursivef(10));
    }

    private static int recursivef (int number ){

        if (number == 1) {

            return 1 ;
        } else {

            return recursivef(number - 1) * number ;
        }

    }
}
