package MetodoRetorno;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class OperacionRetorno {

    //Metodo

    //Metodo para sumar ambos numeros
    public  int sumar (int numero1 , int numero2){

        int suma = numero1 + numero2 ;

        return  suma ;
    }

    //Metodo para restar  ambos numeros

    public int restar (int numero1 , int numero2){

        int resta = numero1 - numero2 ;

        return resta ;
    }

    // Metodo para multiplicar ambos numeros

    public  int multiplicar (int numero1 , int numero2){

        int multiplicacion = numero1 * numero2 ;

        return  multiplicacion;
    }

    //Metodo para dividir ambos numeros

    public int dividir (int numero1 , int numero2 ){

        int division = numero1 / numero2 ;

        return division;
    }

    //Mostramos los resultados

    public  void  mostarResultado (int suma , int resta , int multiplicacion , int division){

        JOptionPane.showMessageDialog(null,"Los resultados son" +
                "\nLa suma es : "+suma+
                "\nLa resta es : "+resta+
                "\nLa multiplicacion es : "+multiplicacion+
                "\nLa division es : "+division);
    }
}
