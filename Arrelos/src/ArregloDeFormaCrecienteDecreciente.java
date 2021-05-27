import java.util.Scanner;

public class ArregloDeFormaCrecienteDecreciente {

    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);

        int arreglo [] = new int[10]; //Arreglo de 10 elementos
        boolean creciente = false , decreciente = false;


        //El usuario ingresa por teclado 10 numeros al arreglo ;
        System.out.println("Llenamos el arreglo con numeros ");

        for (int i = 0 ; i < arreglo.length ; i ++){
            System.out.print((i+1)+".Digite un numero :  ");
            arreglo[i] = entreda.nextInt();

        }

        for (int i = 0 ; i<9 ; i ++){

            if (arreglo[i] < arreglo[i+1]){
                creciente = true ;
            }

            if (arreglo[i] > arreglo[i+1]){
                decreciente = true ;
            }

        }

        if (creciente == true && decreciente == false){
            System.out.println("El arreglo este en forma creciente");
        }
        else if (creciente == false && decreciente == true){
            System.out.println("El arreglo esta en forma decreciente  ");
        }
        else if (creciente == true && decreciente == true){
            System.out.println("El arreglo esta desordenado ");
        }
        else if (creciente == false && decreciente == false ){
            System.out.println("Todos los numeros del arreglo son iguales ");
        }

    }
}
