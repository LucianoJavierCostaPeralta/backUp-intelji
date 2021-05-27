package Ejercicio3;

import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static int indiceCocheBarato (Vehiculo coches[]){//Metodo Statico
        float precio ;
        int indice = 0;

        precio = coches[0].getPrecio();
        for (int i= 1 ; i < coches.length ; i ++){
            if (coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int numerovEHICULO,indiceBarato;
        String marca , modelo;
        float precio;

        System.out.print("Digite la cantidad de coches :  ");
        numerovEHICULO = entreda.nextInt();

        //Declaramos la cantidad de objetos
       Vehiculo coches[] = new Vehiculo[numerovEHICULO];

       for (int i = 0 ;i < coches.length ; i++){

           entreda.nextLine();
           System.out.println("\nDigite las caracteristicas del coche "+(i+1)+" ");
           System.out.print("La marca : ");
           marca = entreda.nextLine();
           System.out.print("El modelo :  ");
           modelo = entreda.nextLine();
           System.out.print("Precio $  ");
           precio = entreda.nextFloat();

           coches [i] = new Vehiculo(marca,modelo,precio);
       }


       indiceBarato = indiceCocheBarato(coches);

        System.out.println("\nEl coche mas barato es ");
        System.out.print(coches[indiceBarato].mostrarDatos());


    }
}
