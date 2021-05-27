package ClasesyObjetos;

import javax.swing.*;

public class MainParametroArgumento {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

        //Creamos un objeto
        OperacionParametroArgumento ap = new OperacionParametroArgumento();
        //Se muestra los argumentos
        ap.sumars(n1,n2);
        ap.restars(n1,n2);
        ap.productors(n1,n2);
        ap.dividirs(n1,n2);
        ap.Resultadors();

    }
}
