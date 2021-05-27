import javax.swing.*;

public class CajeroAutomatico {
    public static void main(String[] args) {
        final int saldoInicial = 1000;
        int opcion ;
        float ingreso , retiro ,saldoActual;
         opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su Cajero Automatico \n"
         + "1 - Ingresar dinero a la cuenta \n"
         + "2 - Retirar dinero de la cuenta \n"
         + "3 - Salir \n"));

         switch (opcion){
             case 1 : ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar a la cuenta "));
             saldoActual = saldoInicial + ingreso ;
             JOptionPane.showMessageDialog(null,"Dinero en cuenta  $ "+saldoActual);
             break;
             case  2 : retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar de la cuenta"));
             if (retiro>saldoInicial){
                 JOptionPane.showMessageDialog(null,"Saldo insuficiente ");
             }
             else {
                 saldoActual = saldoInicial - retiro ;
                 JOptionPane.showMessageDialog(null,"Dinero en cuenta $ "+saldoActual);
             } break;
             case 3 : JOptionPane.showMessageDialog(null,"Gracias , nos vemos la proxima");
             break;
             default: JOptionPane.showMessageDialog(null,"Opcion ingresada no valida");
             break;
         }
    }
}
