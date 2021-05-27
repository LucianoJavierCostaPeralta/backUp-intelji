package EncapsulamientoyMetodosAccesores;

import javax.swing.*;

public class Clase2 {

    public static void main(String[] args) {

        Clase1 c1 = new Clase1();

        c1.setEdad(23);
        c1.setNombre("Luciano");

        JOptionPane.showMessageDialog(null,"El nombre es "+c1.getNombre()+". La edad "+c1.getEdad());


    }
}
