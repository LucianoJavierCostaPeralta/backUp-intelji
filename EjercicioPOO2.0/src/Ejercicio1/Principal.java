package Ejercicio1;
/*Construir un programa que calcule el area y el perimetro de un cuadrilatero
Dada la longitud de sus lados . Los valores de la longitud deberan introducirse
por lineas de ordenes . Si es un cuadrado solo se proporcionara la longitud
de uno de los lados del constructor*/

import javax.swing.*;

//Clase principal - Ejecutable
public class Principal {
    public static void main(String[] args) {
        Cuadrilatero c1 ;//Creamos objeto de la clase "Cuadrilatero"
        float lado1,lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del cuadrilatero "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del cuadrilatero "));

        //Verificamos si es un cuadrado o Cuadrilatero
        if (lado1 == lado2){//Es un Cuadrado
            c1 = new Cuadrilatero(lado1);
        }
        else {//Es un Cuadrilatero
            c1 = new Cuadrilatero(lado1,lado2);
        }

        JOptionPane.showMessageDialog(null,"El perimetro es : "+c1.getPerimetro()+
                "\nEl area es : "+c1.getArea());


    }
}
