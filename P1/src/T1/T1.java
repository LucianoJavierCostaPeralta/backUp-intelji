package T1;

import javax.swing.*;
import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 , numero2 , nuemro3 , numero4 ;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        nuemro3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        numero4 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));


        if ((numero1 % 2 == 0)&&(numero2%2 == 0)&&(nuemro3%2 ==0)&&(numero4%2==0)){


            if ((numero1>numero2)&&(numero2>nuemro3)&&(nuemro3>numero4)) {

                JOptionPane.showMessageDialog(null, "Orden de mayor a menor " + numero1 +
                        "\n" + numero2 +
                        "\n" + nuemro3 +
                        "\n" + numero4);
            }else if((numero2>nuemro3)&&(nuemro3>numero4)&&(numero4>numero1)){
                JOptionPane.showMessageDialog(null,+numero2+nuemro3+numero4+numero1);
            }else if ((nuemro3>numero4)&&(numero4>numero1)&&(numero1>numero2)){
                JOptionPane.showMessageDialog(null,+nuemro3+numero4+numero1+numero2);
            }else if ((numero4>numero1)&&(numero1>numero2)&&numero2>nuemro3){
                JOptionPane.showMessageDialog(null,+numero4+numero1+numero2+nuemro3);
            }
        }
        else if ((numero1%2!=0)&&(numero2%2!=0)&&(nuemro3%2 !=0)&&(numero4%2!=0)){
            JOptionPane.showMessageDialog(null,"Todos son impares ");
            if ((numero1<numero2)&&(numero2<nuemro3)&&(nuemro3<numero4)) {

                JOptionPane.showMessageDialog(null, "Orden de mayor a menor " + numero1 +
                        "\n" + numero2 +
                        "\n" + nuemro3 +
                        "\n" + numero4);
            }else if((numero2<nuemro3)&&(nuemro3<numero4)&&(numero4<numero1)){
                JOptionPane.showMessageDialog(null,+numero2+nuemro3+numero4+numero1);
            }else if ((nuemro3<numero4)&&(numero4<numero1)&&(numero1<numero2)){
                JOptionPane.showMessageDialog(null,+nuemro3+numero4+numero1+numero2);
            }else if ((numero4<numero1)&&(numero1<numero2)&&numero2<nuemro3){
                JOptionPane.showMessageDialog(null,+numero4+numero1+numero2+nuemro3);
            }
        } else{
            JOptionPane.showMessageDialog(null,"Numeros   "+
                    "\n"+numero1+" "+numero2+ " "+nuemro3+" "+numero4);
        }



    }
}
