package Proyecto;
//Primer Clase
public class Pasajero {
    //Atributos
    private String nombre ;
    private String pasaporte;
    private String nacionalidad ;

    //Metodo Constructor
    public Pasajero(String nombre, String pasaporte, String nacionalidad) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        this.nacionalidad = nacionalidad;
    }

    //Metodos Geters
    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
