package Ekercicio10;
//Clase Padre - Abstracta
public abstract class Persona {
    //Atributos
    protected String nombre ;
    protected String apellido;
    protected int edad;

    //Metodos

    //Metodo Constrcutor

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

   //Metodos Geter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    //Metodo Viajar
    public void viajar (){
        System.out.println("Viajar");
    }

    //Metodo PartidoFootball
    public abstract void partidoFootball ();

    //Metodo Entrenamiento
    public abstract void  entrenamiento ();
}
