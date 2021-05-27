package SobrecargaDeMetodos;

import javax.swing.*;

public class Persona1 {
    //Atributos
    String nombre ;
    String dni ;
    int edad ;

    //Metodos

    //Metodo constructor

    public  Persona1(String nombre , int edad ){

        this.nombre = nombre ;
        this.edad = edad ;
    }

    public  Persona1 (String dni){
        this.dni = dni ;
    }

    public void correr (){
        JOptionPane.showMessageDialog(null,"Soy "+nombre+" . Tengo "+edad+
                "\nEstoy corriendo una mataton");
    }

    public void correr (int km){
        JOptionPane.showMessageDialog(null,"He corrido "+km+" Kilometros");
    }


}
