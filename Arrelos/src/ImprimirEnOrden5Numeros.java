import java.util.Scanner;

public class ImprimirEnOrden5Numeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        float [] numeros = new float[5];

        //Guarda los elementos ingresadps por el usuario
        System.out.println("Guarde los datos en el arreglo ");

        for (int i = 0 ; i < 5 ; i++){
            System.out.print((i+1)+".Digite un numero : ");
            numeros [i] = entrada.nextFloat();
        }
        System.out.println("Los elementos son :");

        for (float  i : numeros){
            System.out.println(i);
        }



    }
}
