/*Pedir 2 numeros y ver cual es el mayor o ver si son iguales*/

import javax.swing.*;

public class NumeroMayorOIgual {
    public static void main(String[] args) {
        int numero1 , numero2;

        //El usuario ingresa 2 numeros por teclado
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero "));

        if (numero1 > numero2){
            JOptionPane.showMessageDialog(null,"El numero " +numero1+ " es mayor " );

        }
        else if (numero2 > numero1){
            JOptionPane.showMessageDialog(null,"El numero "+numero2+ " es mayor");
        }
        else if (numero1 == numero2) {

            JOptionPane.showMessageDialog(null,"Los 2 numeros son iguales");
        }


    }
}
