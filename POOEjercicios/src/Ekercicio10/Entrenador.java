package Ekercicio10;
//Clase HIja
public class Entrenador extends  Persona {
    //Atributo
    private String estrategia ;

    //Metodos

    //Metodo Constructor


    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    //Metodo Geter


    public String getEstrategia() {
        return estrategia;
    }

    //Metodo partidoFultbal

    @Override
    public void partidoFootball() {

        System.out.println("Dirige un partido de Football");
    }

    //Metodo Entrenamiento

    @Override
    public void entrenamiento() {
        System.out.println("Dirige un entrenamiento");
    }

    //Metodo PlanificarEntrenamiento
    public void planificarEntrenamiento (){
        System.out.println("Planificar Entrenamiento");

    }
}
