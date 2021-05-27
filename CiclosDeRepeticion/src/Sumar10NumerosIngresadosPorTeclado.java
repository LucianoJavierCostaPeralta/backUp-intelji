import javax.swing.*;

public class Sumar10NumerosIngresadosPorTeclado {
    public static void main(String[] args) {
        int numero , contador , acumulador = 0 ;

        for (contador = 0 ; contador <10 ; contador++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            acumulador += numero;
        }
        JOptionPane.showMessageDialog(null,"El total es : "+acumulador);
    }
}
