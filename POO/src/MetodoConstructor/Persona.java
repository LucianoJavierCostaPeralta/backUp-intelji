package MetodoConstructor;

import javax.print.attribute.standard.JobKOctetsProcessed;
import javax.swing.*;

public class Persona {
    //Atributos
    String nombre ;
    int edad ;

    //Metodo

    //Metodo constructor

    public Persona (String _nombre , int edad){

        nombre = _nombre;
        this.edad = edad;

    }

    //Mostramos los datos . Los atributos

    public  void mostrarDatos (){

        JOptionPane.showMessageDialog(null,"El nombre es  "+nombre+
                "\nLa edad es  "+edad);

    }
}
