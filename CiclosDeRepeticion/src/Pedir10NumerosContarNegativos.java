import javax.swing.*;
import java.nio.file.LinkOption;

public class Pedir10NumerosContarNegativos {
    public static void main(String[] args) {
        int numero ;
        boolean numero_negativo = false ;

        for (int i = 1 ; i<=10 ; i ++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Numero "+i+" \nDigite un numero "));

            if ( numero < 0 ){
                numero_negativo = true ;
            }
        }

        if (numero_negativo == true ){
            JOptionPane.showMessageDialog(null,"Se encontro almenos 1 numero negativo ");

        }
        else {
            JOptionPane.showMessageDialog(null,"No se encontraron numeros negativos ");

        }

    }
}
