package ClasesyObjetos;

import javax.swing.*;

public class Operacion {
    //Atributos
    int numero1 , numero2 ;
    int suma , resta , multiplicaion , division ;


    //Metodos

    //Metodo para que el usuario nos digite 2 numeros
    public void LeerNumero () {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
    }

    //Metodo para sumar ambos numeros
    public void sumar (){
        suma = numero1 + numero2 ;
    }

    //Metodo para restar ambos numeros
    public void restar (){
       resta = numero1 - numero2 ;
    }

    //Metodo para multiplicar ambos numeros
    public void multiplicar (){
        multiplicaion = numero1 * numero2 ;
    }

    //Metodo para dividir ambos numeros
    public void dividir (){
        division = numero1 / numero2 ;
    }

    //Metodo para Mostrar los resultados
    public void mostrarResultado(){
        JOptionPane.showMessageDialog(null,"\nLa suma es : "+suma+
                "\nLa resta es : "+resta+
                "\nLa multiplicacion es : "+multiplicaion+
                "\nLa division es :  "+division);
    }


}
