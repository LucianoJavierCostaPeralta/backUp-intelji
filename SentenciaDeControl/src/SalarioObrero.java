import javax.swing.*;

public class SalarioObrero {
    public static void main(String[] args) {
        int horasTrabajadas ;
        float salarioSemanal;

        //El usuario ingresa por teclado las horas trabajadas

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de horas trabajadas "));

        if (horasTrabajadas <= 40){
            salarioSemanal = horasTrabajadas * 16 ;
        }
        else {
            salarioSemanal = (40*16) +((horasTrabajadas-40)*20);

        }
        JOptionPane.showMessageDialog(null,"El salario a cobrar es  $ "+salarioSemanal);

    }
}
