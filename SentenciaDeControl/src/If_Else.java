import javax.swing.*;
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        int numero , dato = 5 ;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero   "));

        //Usamos if
        if (numero == 5 ){
            JOptionPane.showMessageDialog(null,"El numero es igual a 5");

        }
        else {
            JOptionPane.showMessageDialog(null,"El numero es distinto a 5");

        }
    }
}
