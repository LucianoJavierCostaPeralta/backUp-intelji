//Ingresar un nuemro entre 1 a 5 . Si no esta en el rango mostrar un mensaje , quen no se encuentra
//UTILIZAR SENTENCIA SWITCH
import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        int dato ;

        //El usuario ingresa un numero
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 5 "));

        //usamos SWITCH

        switch (dato){
            case 1 : JOptionPane.showMessageDialog(null,"Es el numero 1 "); break;
            case 2 : JOptionPane.showMessageDialog(null,"Es el numero 2 "); break;
            case 3 : JOptionPane.showMessageDialog(null,"Es el numero 3 "); break;
            case 4 : JOptionPane.showMessageDialog(null,"Es el numero 4 "); break;
            case 5 : JOptionPane.showMessageDialog(null,"Es el numero 5 "); break;
            default:JOptionPane.showMessageDialog(null,"El numero ingresado no se encuentra en el rango de 1 a 5"); break;



        }

    }
}
