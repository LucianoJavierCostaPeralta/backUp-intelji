import javax.swing.*;
import java.util.Scanner;

public class LlenarArreglo {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        int nElementos ,i;

        //El usario ingresa por teclado el tamaño del arreglo
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo "));

        char [] letra = new char[nElementos];

        //El usuario ingresa los elementos del arreglo por teclado

        System.out.println("Digite los elementos del arreglo :");

        for ( i = 0 ; i <nElementos ; i++){

            System.out.print((i+1)+".Digite un caracter :");

            letra [i] = entreda.next().charAt(0);

        }

        //Mostramos el contenido del arreglo

        for (i = 0 ;  i < nElementos ; i++){
            System.out.println(letra [i]+" ");

        }




    }



}
