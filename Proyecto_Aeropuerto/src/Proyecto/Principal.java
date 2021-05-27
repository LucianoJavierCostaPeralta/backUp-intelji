package Proyecto;

import java.util.Scanner;

//Clase Principal / Ejecutable
public class Principal {
    //Metodo Static . Para ingresar por teclado
    static Scanner entreda = new Scanner(System.in);

    //Numero de Aeropuertos
    static final int numAeropuertos = 4;
    static final Aeropuerto aeropuertos [] = new Aeropuerto[numAeropuertos];

    //Metodo Main -Ejecutable
    public static void main(String[] args) {


        //Insertar Datos  de los  Aeropuertos


    }

    //Metodo Insertar Aeropuertos
    public static void insertarAeropuertos (Aeropuerto aero []){
        //Primer Aeropuerto
        aero[0] = new AeropuertoPublico("Jorge Chavez","lima","Peru",80000000);
        aero[0].instertarCompañia(new Compañia("AeropuePeru"));
        aero[0].instertarCompañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima","Distrito Federal",150.90,150));
        aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("iB21","lima","Buenos Aires",180.99,120));
        aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12","lima","Londres",500.90,180));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro","20BGHP","Peruana"));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria","PJKL20","Mexicana"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Luciano","RGNL10","Argentina"));

        //Segundo Aeropuerto
        aero[1] = new AeropuertoPrivado("El Palmar","Buenos Aires","Argentina");
        aero[1].instertarCompañia(new Compañia("Flybondi"));
        aero[1].getCompañia("Flybondi").insertarVuelo(new Vuelo("FLY50","Buenos Aires","Resistencia",100.50,110));
        aero[1].getCompañia("Flybondi").insertarVuelo(new Vuelo("FLY60","Buenos Aires","Cordoba",105.75,120));
        aero[1].getCompañia("Flybondi").getVuelo("FLY50").insertarPasajero(new Pasajero("Santiago","QWER10","Argentino"));
        aero[1].getCompañia("Flybondi").getVuelo("FLY50").insertarPasajero(new Pasajero("Leandro","ZXCV05","Argentino"));
        aero[1].getCompañia("Flybondi").getVuelo("FLY60").insertarPasajero(new Pasajero("Paula","ASDF01","Argentina"));
        aero[1].getCompañia("Flybondi").getVuelo("FLY60").insertarPasajero(new Pasajero("Ariana","IUYT99","Argentina"));


        //Aeropuerto Publico
        aero[2] = new AeropuertoPublico("Ezeiza","Buenos Aires","Argentina",100000000);
        aero[2].instertarCompañia(new Compañia("Aerolinea Argentina"));
        aero[2].getCompañia("Aerolinea Argentina").insertarVuelo(new Vuelo("ARG56","Buenos Aires","Panama",200.85,160));
        aero[2].getCompañia("Aerolinea Argentina").insertarVuelo(new Vuelo("ARG21","Buenos Aires","Madrid",205.68,175));
        aero[2].getCompañia("Aerolinea Argentina").getVuelo("ARG56").insertarPasajero(new Pasajero("Lorena","PLV22","Argentina"));
        aero[2].getCompañia("Aerolinea Argentina").getVuelo("ARG56").insertarPasajero(new Pasajero("Oscar","GOM29","Panameño"));
        aero[2].getCompañia("Aerolinea Argentina").getVuelo("ARG21").insertarPasajero(new Pasajero("Bianca","BOK30","Paraguaya"));
        aero[2].getCompañia("Aerolinea Argentina").getVuelo("ARG21").insertarPasajero(new Pasajero("Ruben","RBN39","Puertoriqueño"));


        //Aeropuerto Publico
        aero[3] = new AeropuertoPublico("Silvio Petirozi","Asuncion","Paraguay",);
        aero[3].instertarCompañia(new Compañia("GOL"));
        aero[3].getCompañia("GOL").insertarVuelo(new Vuelo("GOL86","Asuncion","Italia",195.23,135));
        aero[3].getCompañia("GOL").insertarVuelo(new Vuelo("GOL98","Asuncion","Las  Vegas",280.91,200));
        aero[3].getCompañia("GOL").getVuelo("GOL86").insertarPasajero(new Pasajero("Matias","MTL26","Inglesa"));
        aero[3].getCompañia("GOL").getVuelo("GOL86").insertarPasajero(new Pasajero("Ximena","XMN16","Brasilera"));
        aero[3].getCompañia("GOL").getVuelo("GOL98").insertarPasajero(new Pasajero("Milagros","MLG09",""));
        aero[3].getCompañia("GOL").getVuelo("GOL98").insertarPasajero(new Pasajero("Carlos","CRL45","Uruguaya"));

    }

}
