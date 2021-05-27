package Proyecto;
//Cuarta Clase / Clase Padre
public class Aeropuerto {
    //Atributos
    private String nombre ;
    private  String ciudad ;
    private  String pais;
    private Compañia listaCompañias [] = new Compañia[10];
    private int numCompañias;

    //Metodo Constructor1
    public Aeropuerto(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numCompañias = 0;
    }

    //Metodo Constructor2
    public Aeropuerto(String nombre, String ciudad, String pais,Compañia c[]) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.listaCompañias= c;
        this.numCompañias = c.length;
    }

    //Metodo insertarCompañia
    public void instertarCompañia(Compañia compañia){
        listaCompañias[numCompañias] = compañia;
        numCompañias++;
    }

    //Metodos Geters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public Compañia[] getListaCompañias() {
        return listaCompañias;
    }

    public int getNumCompañias() {
        return numCompañias;
    }

    //Metodo Geter Optener Compañia
    public Compañia getCompañia(int i){
        return listaCompañias[i];
    }

    //Sobrecarga de Metodo Geter . Optener nombre de Compañia
    public Compañia getCompañia(String nombre){
        boolean encontrado = false;
        int i = 0;
        Compañia c=null;

        while ((encontrado == false)&& (i< listaCompañias.length)){
            if (nombre.equals(listaCompañias[i].getNombre())){
                encontrado = true;
                c = listaCompañias[i];
            }
            i++;
        }
        return c;
    }
}
