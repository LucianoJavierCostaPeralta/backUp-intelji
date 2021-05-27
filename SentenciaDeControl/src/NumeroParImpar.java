import javax.swing.*;

public class NumeroParImpar {
    public static void main(String[] args) {
        int numero1 , numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero")) ;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
        if ((numero1 % 2 == 0)&& (numero2 %2 ==0)){

            JOptionPane.showMessageDialog(null,"Son pares ");

        }
        else {
            JOptionPane.showMessageDialog(null,"No son pares ");

        }
    }
}
