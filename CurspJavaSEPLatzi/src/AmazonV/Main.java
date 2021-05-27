package AmazonV;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        

    }

    public static void showMenu (){
        int exit = 0 ;

        do {

            System.out.println(":: Platzi ZON ENTERTAINMENT ::" +
                    "\n");

            System.out.println("Selecciona el numero de la opción deseada " +
            "\n0. Exit"+
            "\n1. Movie"+
            "\n2. Serie"+
            "\n3. Boock"+
            "\n4. Magazina" +
            "\n5. Maque Report" +
            "\n6. Maque Report Today"+
            "\n");//Vemos las fechas


           //Leer
            Scanner sc = new Scanner(System.in);
            int response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0 :  break;

                case 1 :  break;

                case 2 :  break;

                case 3 :  break;

                case 4 :  break;

                case 5 :
                     break;

                case 6 :
                     break;

                default:
                    System.out.println("\n" +
                            "\n....¡¡Seleccione una opción!!...." +
                            "\n");
                    break;
            }


        }while (exit != 0 );
    }
}
