import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        // del 1 al 10 / 10 al 1
        Scanner entreda = new Scanner(System.in);
        int i = 1 , contador;



        System.out.print("Digite cuantos numeros desea ver en pantalla :");
        contador = entreda.nextInt();
        System.out.println("Los numeros son :");
        while (i<=contador){
            System.out.println(i);
            i++;
        }
    }

}
