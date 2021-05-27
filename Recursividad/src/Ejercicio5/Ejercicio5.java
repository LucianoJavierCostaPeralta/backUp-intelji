package Ejercicio5;

import javax.print.DocFlavor;

//Tenemos un número de conejitos y cada conejito tiene dos grandes orejas. Se quiere calcular el número
//total de orejas en todos los conejos recursivamente (sin bucles o multiplicación). Escriba una función
//recursiva para obtener dicho total.
public class Ejercicio5 {

    public static void main(String[] args) {

        System.out.println(orejasRecursivas(5000));
    }

    public static int  orejasRecursivas  (int conejos ) {

        if (conejos == 0) {

            return 0 ;
        }
        else {
            return orejasRecursivas(conejos - 1 ) + 2 ;
        }
    }
}
