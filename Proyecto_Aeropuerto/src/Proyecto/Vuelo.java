package Proyecto;
//Segunda Clase
public class Vuelo {
    //Atributo
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int numMaximoPasajeros;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[];

    //Metodo Constructor
    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int numMaximoPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numMaximoPasajeros = numMaximoPasajeros;
        this.numActualPasajeros=0;
        this.listaPasajeros = new Pasajero[numMaximoPasajeros];
    }

    //IncertarPasajero
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros] = pasajero;
        numActualPasajeros++;
    }

    //Metodos Geters

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumMaximoPasajeros() {
        return numMaximoPasajeros;
    }

    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }

    //Metodo Geter Encontrar Pasajero
    public Pasajero getPasajero(int i){
       return listaPasajeros[i];
    }

    //Sobre carga de Metodo Geter . Encontrar Pasaporte
    public Pasajero getPasajero (String pasaporte){
        boolean encontrado = false;
        int i=0;
        Pasajero pas= null;

        while ((encontrado == false)&&(i< listaPasajeros.length)){
            if (pasaporte == listaPasajeros[i].getPasaporte()){
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;

    }
}
