//Determinae si una letra es mayuscula o no

import javax.swing.*;

public class LetraEsMayuscula {
    public static void main(String[] args) {
        char letra ;
        letra = JOptionPane.showInputDialog("Digite una letra ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null,"Es una mayuscula ");

        }
        else {
            JOptionPane.showMessageDialog(null,"No es una mayuscula");

        }
    }
}
