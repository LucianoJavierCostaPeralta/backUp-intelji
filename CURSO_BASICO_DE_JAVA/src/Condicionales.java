import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("CALCULADORA DE PROPINAS");
        System.out.printf("Ingresa el monto a pagar : $ ");
        double valor = entrada.nextDouble();
        System.out.println("Ingresa el % de propina :  ");
        int propina = entrada.nextInt();

        //Utilizamos condicional IF
        if (propina <= 15){
            System.out.println("El servicio no fue bueno");

        }
        else if (propina <= 15 && propina < 30) {
            System.out.println("El servicio fue bueno");
        }
        else System.out.println("El servicio fue exelente ");


        double total = valor + (valor * propina / 100) ;
        System.out.printf("El valor a pagar + propina es  : $ %.2f",total);



    }
}
