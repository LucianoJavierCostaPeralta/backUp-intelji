import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CICLO FOR");
        System.out.println("¿Cuantos datos quiere procesar?");
        int cantidad = entrada.nextInt();
        System.out.printf("Ingrese %d datos \nLuego de ingresar el dato , se  mostrara su duplo\n",cantidad);
        //Utilizamos ciclo FOR
        for (int i=1;i<=cantidad;i++){
            System.out.printf("Dato %d : ",i);
            int numero = entrada.nextInt();
            int resultado = numero * 2 ;
            System.out.printf("El dato %d su duplo es %d\n",numero,resultado);

        }
        //Ciclo WHILE
        System.out.println("CICLO WHILE");
        System.out.println("¿Cuantos datos quiere procesar?");
        int total  = entrada.nextInt();
        //Utilizamos ciclo WHILE
        System.out.printf("Ingrese %d datos \nLuego de ingresar el dato , se  mostrara su duplo\n",total);
        int cont=1;
                while(cont<=total){
                    System.out.printf("Dato %d : ",cont);
                    int numero = entrada.nextInt();
                    int resultado = numero * 2 ;
                    System.out.printf("El dato %d su duplo es %d\n",numero,resultado);
                    cont++;
                }

    }
}
