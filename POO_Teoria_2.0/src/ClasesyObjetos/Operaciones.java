package ClasesyObjetos;

import javax.swing.*;

public class Operaciones {
    //Atributos
    int numero1;
    int numero2;
    int sumna;
    int resta ;
    int multiplicacion;
    int division;

    //Metodos

    //Metodo para pedir al usuario que nos digite 2 numeros
    public void leerNumeros (){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
    }

    //Metodo Sumar

    public void sumar (){
        sumna = numero1+numero2;
    }

    //Metodo Restar
    public void restar (){
        resta = numero1-numero2;
    }

    //Metodo multiplicar
    public void multiplicar (){
        multiplicacion = numero1*numero2;
    }

    //Metodo Dividir
    public void dividir (){
        division = numero1 / numero2 ;
    }

    //Metodo MostrarDatos
    public void mostrarDatos() {
        System.out.println("\nLa suma es : "+sumna+
                "\nLa resta es : "+resta+
                "\nLa multiplicacion es : "+multiplicacion+
                "\nLa division es : "+division);
    }

}
