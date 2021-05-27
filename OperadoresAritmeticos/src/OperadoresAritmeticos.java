import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Importamos la clase Scaner
        Scanner entrada = new Scanner(System.in);
        //Declaracion de variables
        float numero1,numero2,suma,resta,divicion,resto,producto;

        //El usuario ingresa datos por teclado
        System.out.print("Digite 2 numeros : ");
        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        //Operaciones Aritmeticas
        suma = numero1 + numero2 ;
        resta = numero1 - numero2 ;
        producto = numero1 * numero2 ;
        divicion = numero1 / numero2 ;
        resto = numero1 % numero2 ;

        //Mostramos los resultados
        System.out.println("El resultado de las Operaciones Aritmeticas es : ");
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicacion es : "+producto);
        System.out.println("La divicion es : "+divicion);
        System.out.println("El resto es : "+resto);


    }
}
