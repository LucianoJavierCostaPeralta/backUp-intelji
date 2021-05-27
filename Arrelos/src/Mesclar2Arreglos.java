import java.util.Scanner;

public class Mesclar2Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a[] , b[] , c[];
        a = new int[10];
        b = new int[10];
        c = new int[20];

        //Guardamos elementos en el primer arraglo
        System.out.println("Digite los elementos del primer arreglo : ");
        for (int i = 0 ; i< a.length ; i++){
            System.out.print((i+1)+".Digite un numero : ");
            a[i] = entrada.nextInt();
        }

        //Guardamos elementos en el segundo arreglo
        System.out.println("\nDigite los elementos del segundo arreglo : ");
        for (int i = 0 ; i < b.length ; i++){
            System.out.print((i+1)+".Digite un numero : ");
            b[i] = entrada.nextInt();
        }
        //Mesclamos los 2 arreglos en un tercer arreglo
        int j = 0;

        for (int i = 0 ; i<10 ; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        //Mostramos el contenido del arreglo tres
        System.out.println("El contenido del tercer arreglo es ");

        for (int i = 0 ; i < c.length ; i ++){
            System.out.println(c[i]);



        }



    }
}
