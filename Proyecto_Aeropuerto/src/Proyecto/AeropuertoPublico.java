package Proyecto;

public class AeropuertoPublico extends Aeropuerto{
    //Atributos
    private double subvencion;

    //Metodo Constructor1
    public AeropuertoPublico(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    //Metodo Constructor 2
    public AeropuertoPublico(String nombre, String ciudad, String pais, Compañia[] c, double subvencion) {
        super(nombre, ciudad, pais, c);
        this.subvencion = subvencion;
    }

    //Metodo Constructor 3
    public AeropuertoPublico(String nombre, String ciudad, String pais, double subvencion) {
        super(nombre, ciudad, pais);
        this.subvencion = subvencion;
    }

    //Metodo Geter
    public double getSubvencion() {
        return subvencion;
    }
}
