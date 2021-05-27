import javax.swing.*;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float maxHoras = 40 , pagoxHora = 16 , pagoxHextra = 20 ;
        float horasTrabajadas = 0 , salarioSemanal = 0 ;

        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese las hotas trabajadas en la semana : "));

        if (horasTrabajadas <= maxHoras){
            salarioSemanal = horasTrabajadas * pagoxHora ;
        }
        else {
            salarioSemanal = (horasTrabajadas - maxHoras) * pagoxHextra + maxHoras * pagoxHora ;
        }
       JOptionPane.showMessageDialog(null,"El salario es $ "+salarioSemanal);









    }
}
