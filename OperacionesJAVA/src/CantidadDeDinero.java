import java.util.Scanner;

public class CantidadDeDinero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float guillermo , luis  , juan , total ;

        System.out.print("Cuanto dinero tiene guilelrmo :");
        guillermo = entrada.nextFloat();
        luis = guillermo / 2;
        juan = (guillermo + luis)/2;
        total = guillermo + luis + juan;

        System.out.println("El total de dinero es : "+total);

    }
}
