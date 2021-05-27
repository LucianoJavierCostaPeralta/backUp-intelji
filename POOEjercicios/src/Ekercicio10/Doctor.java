package Ekercicio10;
//Clase hija
public class Doctor extends  Persona {
    //Atributo
    private String titulacion;
    private int anosExperiencia ;

    //Metodos

    //Metodo Constructor


    public Doctor(String nombre, String apellido, int edad, String titulacion, int anosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    //Metodo Geter

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    //Metodo partidoFutbal

    @Override
    public void partidoFootball() {
        System.out.println("Da asisntecia en un partido de Football");
    }

    //Metodo entrenamiento

    @Override
    public void entrenamiento() {
        System.out.println("Da asisntencia en un  entrenamiento ");
    }

    //Metodo curarPersona
    public void curarPersona (){
        System.out.println("Curar Personas");
    }
}
