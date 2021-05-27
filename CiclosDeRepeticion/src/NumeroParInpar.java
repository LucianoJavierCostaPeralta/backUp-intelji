import javax.swing.*;

public class NumeroParInpar {
    public static void main(String[] args) {
        int numero ;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero != 0){
            if (numero %2 ==0){
                JOptionPane.showMessageDialog(null,"El numero "+numero+" es positivo");

            }
            else {

                JOptionPane.showMessageDialog(null,"El numero "+numero+" es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro  numero"));
        }
    }
}
