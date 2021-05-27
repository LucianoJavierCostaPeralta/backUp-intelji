import javax.swing.*;

public class AdivinarNumeroAleatorio {
    public static void main(String[] args) {
        int numero , aleatorio , contador = 0 ;

        aleatorio = (int)(Math.random()*100);

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

            if (aleatorio > numero){
                JOptionPane.showMessageDialog(null,"Digite un numero mayor ");
            }
            else {
                JOptionPane.showMessageDialog(null,"Digite un numero menor ");
            }

            contador++;
        }while (numero != aleatorio);

        JOptionPane.showMessageDialog(null,"Adivinaste el numero felicitaciones .\nLo adivinaste en  "+contador+ " intentos");


    }
}
