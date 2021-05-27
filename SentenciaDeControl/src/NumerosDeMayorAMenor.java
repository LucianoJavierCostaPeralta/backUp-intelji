import javax.swing.*;

public class NumerosDeMayorAMenor {
    public static void main(String[] args) {
        int numero1 , numero2 , numero3 ;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

        if ((numero1>numero2) && (numero2>numero3)){
            JOptionPane.showMessageDialog(null,"Orden "+numero1+ " - "+numero2+ " - "+numero3);

        }
        else if ((numero1>numero2)&& (numero3>numero2)){
            JOptionPane.showMessageDialog(null,"Orden "+numero1+ " - "+numero3+ " - "+numero2);
        }
        else  if ((numero2>numero1)&&(numero1>numero3)){
            JOptionPane.showMessageDialog(null,"Orden "+numero2+ " - "+numero1+ " - "+numero3);

        }
        else if ((numero2>numero1)&&(numero3>numero1)){
            JOptionPane.showMessageDialog(null,"Orden "+numero2+ " - "+numero3+ " - "+numero1);
        }
        else if ((  numero3>numero1)&&(numero1>numero2)){
            JOptionPane.showMessageDialog(null,"Orden "+numero3+ " - "+numero1+ " - "+numero2);

        }
        else {
            JOptionPane.showMessageDialog(null,"Orden "+numero3+ " - "+numero2+ " - "+numero1);

        }
    }
}
