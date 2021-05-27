package Empleados;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Clase principal - Ejecutable
public class Principal {

    public static void main(String[] args) {
        //Creamos Objetos

        Empleados empleados = new Empleados("Luciano ",23,100);
        EmpleadoComercial  empleadoComercial = new EmpleadoComercial("Julian",40,10000,6000);
        EmpleadoRepartidor empleadoRepartidor = new EmpleadoRepartidor("Javier ",21,10000,3);

        //Aplicamos Metodo Plus a los objetos


        empleados.Plus(50);
        System.out.println(empleados.toString());

        empleadoComercial.Plus(150);
        System.out.println(empleadoComercial.toString());

        empleadoRepartidor.Plus(200);
        System.out.println(empleadoRepartidor.toString());



    }
}
