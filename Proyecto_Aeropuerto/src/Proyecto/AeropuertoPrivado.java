package Proyecto;
//Quinta clase / Clase Hija de clase "Aeropuerto"
public class AeropuertoPrivado extends Aeropuerto{
    //Atributos
    private String listaEmpresas []= new String[10];
    private int  numEmpresas ;

    //Metodo Constructor 1
    public AeropuertoPrivado(String nombre, String ciudad, String pais, ) {
        super(nombre, ciudad, pais);

    }

    //Metodo Constructor 2
    public AeropuertoPrivado(String nombre, String ciudad, String pais, Compañia[] c, String e []) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        numEmpresas = e.length;


    }

    //Metodo Insertar Empresas
    public void insertarEmpresas (String e[]){
        this.listaEmpresas = e ;
        this.numEmpresas = e.length;
    }

    //Metodo InsetarEmpresa
    public void insertarEmpresa (String e){
        listaEmpresas[numEmpresas]=e;
        numEmpresas++;
    }

    //Metodos Geter
    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresas() {
        return numEmpresas;
    }

}
