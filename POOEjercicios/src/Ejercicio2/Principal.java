package Ejercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        Tablero t1;//Creo mi objeto
        int x,y,opcion,incremento=0;

        System.out.print("Digite la cordenada inicial de x : ");
        x = entreda.nextInt();
        System.out.print("Digite la cordenada inicial de y : ");
        y = entreda.nextInt();

        //Posicion inicial del objeto
        t1 = new Tablero(x,y);

        do {
            System.out.println("\n MENU ." +
                    "\n 1 : Mover arriba ." +
                    "\n 2 : Mover abajo ." +
                    "\n 3 : Mover derecha ." +
                    "\n 4 : Mover izquierda ." +
                    "\n 5 : Salir .");
            System.out.print("\nDigite una opcion : ");
            opcion = entreda.nextInt();

            if (opcion != 5){

                System.out.print("\nDiginte la cantidad de espacios a moverse : ");
                incremento = entreda.nextInt();
            }

            switch (opcion){

                case 1 : t1.moverArriba(incremento); break;
                case 2 : t1.moverAbajo(incremento); break;
                case 3 : t1.moverDerecha(incremento); break;
                case 4 : t1.moverIzquierda(incremento); break;
                case 5 : break;
                default: System.out.println("\nError se equivoco de opcion del menu"); break;
            }

            System.out.println("La posicion Actual de X : "+t1.getX()+" Y : "+t1.getY());

        }while (opcion != 5 );


    }
}
