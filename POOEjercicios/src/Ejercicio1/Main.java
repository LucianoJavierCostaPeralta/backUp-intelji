package Ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Creamos el objeto de la clase "Cuadrilatero"
        Cuadrilatero oc1;
        float lado1 ,lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1 del cuadrilatero"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2 del cuadrilatero "));

        if (lado1 == lado2){//Es un cuadrado
            oc1 = new Cuadrilatero(lado1);
        }
        else {//Es un cuadrilatero
            oc1 = new Cuadrilatero(lado1,lado2);
        }

        //Mostramos resultados

        JOptionPane.showMessageDialog(null,"El perimetro es "+oc1.getPerimetro()+
                "\nEl area es "+oc1.getArea());

    }

}
