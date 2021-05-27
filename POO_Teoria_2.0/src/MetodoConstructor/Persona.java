package MetodoConstructor;

public class Persona {
    //Atributos
    String nombre ;
    int edad ;

    //Metodo

    //Metodo Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo MostrarDatos

    public void mostrarDatos (){
        System.out.println("\nEl nombre es : "+nombre+
                "\nLa edad es : "+edad);
    }
}
