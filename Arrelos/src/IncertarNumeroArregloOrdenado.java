import java.util.Scanner;

public class IncertarNumeroArregloOrdenado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo [] = new int[10];

        int numero , sitioNumero = 0 , j = 0  ;
        boolean creciente = true ;

//Ingresa 5 elementos  en el arreglo de 10 elementos
        System.out.println("Digite 5 numeros . ");

        do {

            for (int i = 0 ; i<5 ; i++){
                System.out.print((i+1)+".Digite un numero : ");
                arreglo[i] = entrada.nextInt();
            }

            //Determinar si el arreglo esta ordenado de forma creciente

            for (int i = 0 ; i <4 ; i++){

                if (arreglo [i] < arreglo[i+1]){

                    creciente = true ;
                }
                else if (arreglo [i] > arreglo[i+1]){
                    creciente = false ;
                    break;
                }

            }
            if (creciente == false){
                System.out.println("El arreglo no esta ordenado en forma creciente . Vuelva a dijitar ");

            }

        }while (creciente == false);

        //Insertar un numero en el arreglo

        System.out.print("Digite el elemento a insetar  : ");
        numero = entrada.nextInt();

        //En que posicion va el numero

        while (arreglo[j] < numero && j < 5 ){

            sitioNumero++ ;
            j++;

        }

        //Trasladamos una posicion en el arreglo los elementos debajo del numero

        for (int i = 4 ; i >=sitioNumero ; i--){
            arreglo[i+1] = arreglo[i];


        }

        //Insertamos el numero que el usuari ingreso

        arreglo[sitioNumero] = numero ;

        //Mostramos el arreglo
        System.out.println("El arreglo queda de la siguiente manera ");

        for (int i = 0 ; i<6 ; i++){
            System.out.println("Elemento "+i+ " . Numero : "+arreglo[i]);



        }
    }
}
