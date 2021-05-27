package MetodoRetorno;

import javax.swing.*;

public class MainRetorno {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));

        OperacionRetorno op = new OperacionRetorno();
        int suma = op.sumar(n1,n2);
        int reta = op.restar(n1,n2);
        int multiplicacion = op.multiplicar(n1,n2);
        int div= op.dividir(n1,n2);

        op.mostarResultado(suma,reta,multiplicacion,div );

       JOptionPane.showMessageDialog(null,"La otra forma de imprimir" +
               "\nSuma : "+op.sumar(n1,n2)+
               "\nResta : "+op.restar(n1,n2)+
               "\nMultiplicacion : "+op.multiplicar(n1,n2)+
               "\nDivision : "+op.dividir(n1,n2));


    }
}
