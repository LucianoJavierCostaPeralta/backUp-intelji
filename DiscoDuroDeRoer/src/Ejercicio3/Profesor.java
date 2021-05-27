package Ejercicio3;

public class Profesor extends  Persona{
    private String materia ;

    public Profesor(String nombre, String dni, int edad, char sexo, String materia) {
        super(nombre, dni, edad, sexo);
        this.materia = materia;
    }
}
