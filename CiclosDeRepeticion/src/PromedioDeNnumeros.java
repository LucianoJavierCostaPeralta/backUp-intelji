import javax.swing.*;

public class PromedioDeNnumeros {
    public static void main(String[] args) {

        int numero , contador = 0, acumulador =0;
        float promedio ;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

        while ( numero >= 0){
            acumulador += numero ;
            contador ++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));


        }
        if (contador == 0){
            JOptionPane.showMessageDialog(null,"Se encontro un numero negativo . Finalizo el programa ");

        }
        else {

            promedio = (float) acumulador / contador ;
            JOptionPane.showMessageDialog(null,"El promedio es "+promedio);



        }
    }
}
