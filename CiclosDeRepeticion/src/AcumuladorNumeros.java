import javax.swing.*;

public class AcumuladorNumeros {
    public static void main(String[] args) {
        int numero , acumulador = 0  , contador = 0;

      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

      while (numero !=0){
          acumulador += numero ;
          contador++;
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero "));
      }
      if (contador == 0){
          JOptionPane.showMessageDialog(null,"Ingreso el numero 0 . Por lo tanto el programa finalizo");

      }
      else {
          JOptionPane.showMessageDialog(null,"El total acumulado de los numeros ingresados es "+acumulador+" \nEl total de numeros ingresados es "+contador);

      }

    }
}
