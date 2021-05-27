import java.util.Scanner;

public class Del1AlN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero , contador ;

        System.out.print("Digite el numero de iteraciones : ");
        numero = entrada.nextInt();
        System.out.println("Se mostraran los numeros del 1 al "+numero);

        for (contador = 1 ; contador <= numero ; contador++){
            System.out.println(contador);
        }

    }
}
