import javax.swing.*;

public class VentanaEmergente {
    public static void main(String[] args) {
        String cadema ;
        int entero ;
        char letra ;
        double decimal ;

        //El usuario ingresa los datos por teclado
        cadema = JOptionPane.showInputDialog("Digite una frase :");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero :"));
        letra = JOptionPane.showInputDialog("Digite una letra ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal :"));

        //Mostramos los datos ingresados por el usuario

        JOptionPane.showMessageDialog(null,"La cadena es : "+cadema);
        JOptionPane.showMessageDialog(null,"El numero es : "+entero);
        JOptionPane.showMessageDialog(null,"La letra  es : "+letra);
        JOptionPane.showMessageDialog(null,"El decimal es : "+decimal);



    }
}
