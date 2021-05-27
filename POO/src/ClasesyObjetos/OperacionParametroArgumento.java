package ClasesyObjetos;

import javax.swing.*;

public class OperacionParametroArgumento {
    //Atributo
    int sumas , restas , producto , divizion ;

    //Metodos
    //Declaramos los paramentros

    //Metodo de la operacion sumar
    public  void sumars (int numero11 , int numero12 ){
        sumas = numero11 + numero12;
    }

    //Metodo de la operacion restar

    public void restars (int numero11 , int numero12 ){
        restas = numero11 - numero12 ;
    }

    //Metodo de la operacion Multiplicar
    public void productors (int numero11 , int numero12){
        producto = numero11 * numero12 ;
    }

    //Metodo de la operacion Dividir
    public  void dividirs (int numero11 , int numero12){

        divizion = numero11 / numero12 ;
    }

    //Mostramos los resultados

    public void Resultadors (){

        JOptionPane.showMessageDialog(null,"\nLa suma es :  "+sumas+
                "\nLa resta es : "+restas+
                "\nEl producto es : "+producto+
                "\nLa division es : "+divizion);
    }

}
