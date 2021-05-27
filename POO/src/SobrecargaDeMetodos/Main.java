package SobrecargaDeMetodos;

import MetodoConstructor.Persona;

public class Main {
    public static void main(String[] args) {
        Persona1 persona = new Persona1("Luciano",23);

        persona.correr();

        Persona1 persona2 = new Persona1("40034988");

        persona2.correr(100);

    }
}
