package Constante ;

import javax.swing.*;

public  class Persona {
    private  final String nombre ;
    private int edad ;


    //Metodo constructor
    public Persona (String nombre , int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    //Metodo Mostrar

    public void mostrar(){
        JOptionPane.showMessageDialog(null,"El nombre es "+nombre+
                "\nLa edad es "+edad);
    }
}
