package ClasesyObjetos;

import javax.swing.*;

public class Coche {
    //Atributos
    String color ;
    String marca ;
    int km ;

    public static void main(String[] args) {
        //Creamos el objeto
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        coche1.color = "Blanco"; coche2.color = "Rojo";//Definimos el atributo color a los objetps
        coche1.marca = "Audi"; coche2.marca = "Ferrari";//Definimos el atributo marca a los objetos
        coche1.km = 0; coche2.km = 100;//Definimos el atributo km a los objetos

        //Imprimimos

        JOptionPane.showMessageDialog(null,"Choche 1 \n" +
                "\nColor : "+coche1.color+
                "\nMarca : "+coche1.marca+
                "\nK/HR : "+coche1.km+
                "\n\nCoche 2 \n\n Color : "+coche2.color+
                "\nMarca : "+coche2.marca+
                "\nKM/H : "+coche2.km);


    }
}
