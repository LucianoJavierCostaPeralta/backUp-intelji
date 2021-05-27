//Determinar si un numero es multiplo de 10

import javax.swing.*;

public class NumeroMUltiploDe10 {
    public static void main(String[] args) {

        int numero ;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

        if (numero%10 == 0) {
            JOptionPane.showMessageDialog(null,"El numero "+numero+" es multiplo de 10");

        }
        else {
            JOptionPane.showMessageDialog(null,"El numero no es multiplo de 10 ");

        }
 }
}
