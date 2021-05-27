import javax.swing.*;

public class Calculadora {
    public static void main(String[] args) {

        int numero1 , numero2 ,suma,resta,producto,division;
        char operacion ;

        JOptionPane.showMessageDialog(null,"Bienvenido a la calculadora ");

        //El usuario ingresa 2 numeros por teclado
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        JOptionPane.showMessageDialog(null,"Para seleccionar una opcion precione : \nS o s Suma \nR o r Resta \nP o p, M o m Multiplicacion / Producto \nD o d Division ");

        //El usuario ingresa por teclado la letra inicial de la operacion que desea realizar
        operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar ").charAt(0);

        switch (operacion){

            case 's': case 'S': suma = numero1 + numero2 ;
                JOptionPane.showMessageDialog(null,"La suma es : "+suma); break;

            case 'r': case 'R': resta= numero1 - numero2 ;
                JOptionPane.showMessageDialog(null,"La resta es : "+resta); break;

            case 'p': case 'P': case 'M': case 'm' : producto = numero1 * numero2 ;
                JOptionPane.showMessageDialog(null,"La multiplicacion es : "+producto); break;

            case 'd': case 'D': division = numero1 / numero2 ;
                JOptionPane.showMessageDialog(null,"La division es : "+division); break;
            default:
                JOptionPane.showMessageDialog(null,"La opcion ingresada no es valida"); break;
        }


    }
}
