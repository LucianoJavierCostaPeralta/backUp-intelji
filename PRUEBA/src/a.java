import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        byte numero = 127 ;
        short s=32000;
        int entero=100000;
        float decimal=3.15f;
        char caracter = 'a';
        boolean desicion = true ;
Integer dato = null;
String frase  ;
final  int n = 10; // CONSTANTE
 float nro ; // DATO POR CONSOLA
        char letra ; //CARACTER



        //Mi primer programa
        //Ejemplificamos datos PRIMITIVOS
        System.out.println("Ejemplificamos las distintas variables ");
        System.out.println("BITE  : "+numero);
        System.out.println("SHORT : "+s);
        System.out.println("INT : "+entero);
        System.out.println("FLOAT : "+decimal);
        System.out.println("CARACTER : "+caracter);
        System.out.println("LA DESICION ES : "+desicion);
        //Ejemplificamos datos NO PRIMITIVOS
        System.out.println("DATO : "+dato);

        System.out.println("CONSTANTE  : "+n);
        System.out.print("Digite un numero :  ");
        nro = entreda.nextFloat();
        System.out.println("El numero digitado es : "+nro);
        System.out.printf("Digite una letra : ");
        letra = entreda.next().charAt(0);
        System.out.println("La letra digitada es : "+letra);
        System.out.println("Digite una palabra : ");
        palabra = entreda.nextLine();
        System.out.println(palabra);







    }
}
