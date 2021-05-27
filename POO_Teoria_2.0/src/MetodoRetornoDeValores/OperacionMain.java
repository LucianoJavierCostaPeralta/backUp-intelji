package MetodoRetornoDeValores;

import javax.swing.*;

public class OperacionMain {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero : "));
        Operacion op = new Operacion();

        int suma = op.sumar(numero1, numero2);
        int resta = op.restar(numero1, numero2);
        int multiplicacion = op.multiplicar(numero1, numero2);
        int division = op.dividir(numero1, numero2);

        op.mostrarDatos(suma, resta, multiplicacion, division);

    }
}
