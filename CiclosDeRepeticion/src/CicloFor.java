import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i  , contador ;
        System.out.print("Digite la cantidad de iteraciones : ");
        contador = entrada.nextInt();

        for (i =1 ; i<= contador ; i++){
            System.out.println(i);
        }
    }
}
