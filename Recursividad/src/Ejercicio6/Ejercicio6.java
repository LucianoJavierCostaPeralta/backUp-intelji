package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {


        System.out.println(bunnyearsr(6));

    }

    private static int  bunnyearsr (int bunny){

        if (bunny == 0) {
            return 0 ;
        }

        if (bunny % 2 == 0) {
            return bunnyearsr(bunny - 1 ) + 3 ;
        } else {

            return bunnyearsr(bunny - 1 ) + 2 ;
        }
    }

}
