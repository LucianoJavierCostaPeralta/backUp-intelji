import javax.swing.*;
import java.util.Scanner;

public class InprimirArregloAlReves {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       float numeros [] = new float[5];

        System.out.println("Guardando los datos del arreglo ");

        //El usuario ingresa 5 numeros por teclado
        for (int i = 0 ; i < 5 ; i++){
            System.out.print((i+1)+(". Digite un numero : "));
            numeros [i] = entrada.nextFloat();
        }

        //Elementos del arreglo en orden inversa

        System.out.println("Los elementos del arreglo en orden inverso son ");

        for (int i = 4 ; i >= 0 ; i--){
            System.out.println(numeros[i]);

        }




    }
}
