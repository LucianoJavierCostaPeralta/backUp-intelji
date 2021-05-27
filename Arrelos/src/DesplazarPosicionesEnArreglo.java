import java.util.Scanner;

public class DesplazarPosicionesEnArreglo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         int arreglo [] = new int[10];
       int ultimo ;

        System.out.println("Llenamos el arreglo ");

        //Llenamos el arreglo
        for (int i = 0 ; i < 10 ; i ++){
            System.out.print(i+".Digite un numero : ");
            arreglo[i] = entrada.nextInt();
        }

        ultimo = arreglo[9]; //Guardamos el ultimo elemento

        //Elementos avanzan una posicion hacia abajo ;

        for (int i = 8 ; i >=0 ; i--){
            arreglo[i+1] = arreglo[i];

        }

        arreglo [0] = ultimo ; //EL ultimo elemento pasa a ser el primer elemento

        //Mostramos el arreglo
        System.out.println("El arreglo queda de la siguiente forma");

        for (int i = 0 ; i < 10 ; i ++){
            System.out.println(i+" .Numero : "+arreglo[i]);
        }

    }
}
