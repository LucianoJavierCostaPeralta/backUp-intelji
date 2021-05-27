package Ejercicio3;

public class Alumno extends  Persona{
    //Atributos
    private double nota ;

    public Alumno(String nombre, String dni, int edad, char sexo, double nota) {
        super(nombre, dni, edad, sexo);
        this.nota = nota;
    }

}
