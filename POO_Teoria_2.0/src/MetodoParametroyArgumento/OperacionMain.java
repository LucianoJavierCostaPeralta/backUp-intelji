package MetodoParametroyArgumento;

import javax.swing.*;
import java.nio.charset.IllegalCharsetNameException;

public class OperacionMain {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un nuemro "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.mostrarDatos();
    }
}
