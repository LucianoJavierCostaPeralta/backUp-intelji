package Ejercicio2;
/*Construir un programa que permita dirigir el movimiento de un objeto
dentor  de un tablero y actualice su posicion dentro del mismo .
Las posiciones posibles son : ARRIBA , ABAJO , IZQUIERDA , DERECHA.
Tras cada movimiento el programa mostrara la nueva direccion
elegida y las cordenadas de situacion del objeto dentro del
 tablero*/

import java.util.Scanner;

//CLase Principal - Ejecutable
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t1;//Objeto de la clase "Tablero"
        int x,y,opcion,incremento = 0;

        System.out.print("\nDigite la cordenada inicial de X : ");
          x = entrada.nextInt();
        System.out.print("Digite la cordenada inicial de Y : ");
        y = entrada.nextInt();

        t1 = new Tablero(x,y);//Posicion inicial del objeto


        do {
            System.out.println("\n\t:MENU:" +
                    "\n1.Mover Arriba" +
                    "\n2.Mover Abajo " +
                    "\n3.Mover Derecha" +
                    "\n4.Mover Izquierda" +
                    "\n5.Salir");
            System.out.print("Opcion : ");
            opcion = entrada.nextInt();
            if (opcion !=5){
                System.out.print("\nDigite cuantas posiciones desea moverse : ");
                incremento = entrada.nextInt();
            }
            switch (opcion){
                case 1 : t1.moverArriba(incremento); break;
                case 2 : t1.moverAbajo(incremento); break;
                case 3 : t1.moverDerecha(incremento); break;
                case 4 : t1.moverIzquierda(incremento);break;
                case 5 : break;
                default:
                    System.out.println("ERROR .\nOpcion no valida , vuelva a digitar ."); break;

            }

            System.out.println("\nLa posicion actual es : X : "+t1.getX()+" Y : "+t1.getY());
            System.out.println(" ");
        }while (opcion != 5);
    }
}
