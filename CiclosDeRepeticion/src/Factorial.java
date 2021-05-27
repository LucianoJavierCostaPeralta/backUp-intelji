import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1 ,numero , i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea optener el factorial "));

        for (i = 1 ; i<= numero ; i++){
            factorial *= i ;
        }
        JOptionPane.showMessageDialog(null,"El numero ingresado es "+numero+ "\nSu factorial es "+factorial);

    }
}
