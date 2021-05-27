package Proyecto;
//Tercer Clase
public class Compañia {
    //Atributo
    private String nombre ;
    private Vuelo listaVuelos [] = new Vuelo[10];
    private int numeroVuelo = 0;

    //Metodo constructor 1
    public Compañia(String nombre) {
        this.nombre = nombre;
    }

    //Metodo Constructor2
    public Compañia(String nombre,Vuelo v[]) {
        this.nombre = nombre;
        this.listaVuelos = v;
        this.numeroVuelo = v.length;

    }

    //Metodo InsertarVuelos
    public void insertarVuelo(Vuelo vuelo){
        listaVuelos[numeroVuelo]=vuelo;
        numeroVuelo++;
    }

    //Metodo Geters
    public String getNombre() {
        return nombre;
    }

    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    //Metodo Geter OpetenerVuelo
    public Vuelo getVuelo(int i){
        return listaVuelos[i];

    }

    //Sobrecarga de Metodo Geter. identificador Del Vuelo
    public  Vuelo getVuelo (String id){
        boolean encontrado = false;
        int i = 0;
        Vuelo v = null;

        while ((encontrado == false)&&(i< listaVuelos.length)){
            if (id == listaVuelos[i].getIdentificador()){
                encontrado = true;
                v = listaVuelos[i];
            }
            i++;
        }
        return v;
    }
}
