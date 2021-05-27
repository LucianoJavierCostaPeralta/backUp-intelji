import java.util.Scanner;

public class PormediosEnUnArreglo {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);
        float numeros [] = new float[5];
        float sumaPositivos = 0  , sumaNegativo = 0 , mediaPositivo , mediaNegativo ;
        int contadorPositivo = 0 , contadorNegativo = 0 , contadorCeros = 0 ;

        //Introduce 5 numeros por teclado al arreglo
        for (int i = 0 ; i< numeros.length;i++){
            System.out.print((i+1)+".Digite un numero : ");
            numeros[i] = entreda.nextFloat();

           //Conteo de Ceros
            if (numeros[i]==0){
                contadorCeros ++ ;
            }
            //Conteo Positivos
            else if (numeros[i] > 0 ){
                sumaPositivos += numeros[i];
                contadorPositivo++;
            }
            //Conteo Negativos
            else {
                sumaNegativo += numeros[i];
                contadorNegativo++;
            }

        }

        //Media positivos

        if (contadorPositivo == 0 ){
            System.out.println("No se encontraron numeros negativos ");
        }
        else {
            mediaPositivo =  (sumaPositivos/ contadorPositivo);
            System.out.println("La media de positivos es :  "+mediaPositivo);
        }
        //Media Negativos

        if (contadorNegativo == 0 ){
            System.out.println("No se encontraron numeros Negativos");
        }
        else {
            mediaNegativo =   (sumaNegativo/ contadorNegativo);
            System.out.println("La media de numeros Negativos es : "+mediaNegativo);
        }

        if (contadorCeros == 0 ){
            System.out.println("No se encontraron Ceros ");
        }
        else {
            System.out.println("El total de ceros encontrados es : "+contadorCeros);

        }



    }
}
