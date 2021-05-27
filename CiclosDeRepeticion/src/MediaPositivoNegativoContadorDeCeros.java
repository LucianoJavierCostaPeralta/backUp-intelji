import javax.swing.*;

public class MediaPositivoNegativoContadorDeCeros {
    public static void main(String[] args) {
        int numero , sumaPositivo =0 , conteoPositivo =0 , sumaNegativo =0 , conteoNegativo =0 , conteoCeros =0 ;
        float mediaPositivos ,mediaNegativos ;

        //El usuario digita 10 numeros por teclado
        for (int i = 1 ; i <= 10 ; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

            //Contador de ceros
            if (numero == 0){
                conteoCeros ++;
            }

            //Acumulacion de numeros positivos / Contador de positivos
            else if ( numero > 0){
                sumaPositivo += numero ;
                conteoPositivo ++;
            }
            //Acumulador de numeros negativos / Contador de numeros negativos
            else{
                sumaNegativo += numero ;
                conteoNegativo ++;
            }

        }

        //Media de Numeros Positivos
        if (conteoPositivo == 0){
            JOptionPane.showMessageDialog(null,"No se encontraron numeros positivos ");

        }
        else {
            mediaPositivos = (float) sumaPositivo / conteoPositivo ;
            JOptionPane.showMessageDialog(null,"Se encontraron "+conteoPositivo+" numeros positivos ");


        }

        //Media de Numeros Negativos
        if (conteoNegativo == 0 ){
            JOptionPane.showMessageDialog(null,"No se encontraron numeros negativos ");

        }
        else {
            mediaNegativos = (float) sumaNegativo / conteoNegativo ;
            JOptionPane.showMessageDialog(null,"Se encontraron "+conteoNegativo+" numeros negativos ");

        }

        //Contador de ceros
        if (conteoCeros == 0 ){
            JOptionPane.showMessageDialog(null,"No se encontraro el numero cero ");

        }
        else {
            JOptionPane.showMessageDialog(null,"Se ingreso  "+conteoCeros+" veces el numero 0 ");

        }
    }
}
