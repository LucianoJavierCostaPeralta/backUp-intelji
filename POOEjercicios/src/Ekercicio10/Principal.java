package Ekercicio10;

import java.util.ArrayList;
import java.util.Scanner;

//Clase Principal - Ejecutable
public class Principal {
    //Array Dinamico
    static ArrayList<Persona>personas= new ArrayList<Persona>();
    static Scanner entreda = new Scanner(System.in);

    static Persona fulbolista1 = new Futbolista("Gonzalo","Higuain",29,9,"Delantero");
    static Persona fulbolista2 = new Futbolista("Pablo","Dybala",23,21,"Delantero");
    static Persona entrenador = new Entrenador("Maximiliano","Alegri",49,"Defensiva");
    static Persona doctor = new Doctor("Alex","Marroni",55,"Lic Fisoterapia",20);

    public static void main(String[] args) {
        personas.add(fulbolista1);
        personas.add(fulbolista2);
        personas.add(entrenador);
        personas.add(doctor);

        //Metodo menu
        menu();


    }

    //Metodo Menu

    public static void menu (){
        int opcion;

        do {
            System.out.println("\tMENU.");
            System.out.println("1.Viaje de equipo");
            System.out.println("2.Entrenamiento");
            System.out.println("3.Partido de Football");
            System.out.println("4.Planificar Entrenamiento");
            System.out.println("5.Dar Entrevista ");
            System.out.println("6.Curar Lesion");
            System.out.println("7.Salir");
            System.out.print("Opcion : ");
            opcion = entreda.nextInt();

            switch (opcion){
                case 1 : System.out.println("");
                    viajarEquipo();  //Viaje de equipo
                    break;
                case  2 : System.out.println(" ");
                    entrenarEquipo(); //Entrenamiento
                    break;
                case 3 : System.out.println(" ");
                    partidoFootball(); //Partido Football
                    break;
                case 4 :
                    System.out.println(" ");
                    planificarEntrenamiento(); //Planificar Entrenamiento
                    break;
                case 5 : System.out.println(" ");
                     darEntrevista(); //Dar Entrebista
                    break;
                case 6 : System.out.println(" ");
                     curarLesiones(); //Curar Lesiones
                    break;
                case  7 : //Salir
                    break;
                default:
                    System.out.println("Se equivoco de opcion del menu "); break;
            }


            System.out.println("");
        }while (opcion != 7);
    }

    //Metodo Viajar Equipo

    public static void viajarEquipo (){
        for (Persona equipo : personas){
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.viajar();
        }
    }

    //Metodo entrenarEquipo

    public static void entrenarEquipo (){
        for (Persona equipo : personas){
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.entrenamiento();
        }

    }

    //Metodo partidoFultbal

    public static void partidoFootball (){
        for (Persona equipo : personas){
            System.out.println(equipo.getNombre()+" "+equipo.getApellido()+" -> ");
            equipo.partidoFootball();
        }
    }

    //Metodo PlanificarEntrenamiento

    public static void planificarEntrenamiento (){
        System.out.println(entrenador.getNombre()+" "+entrenador.getApellido()+" -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }

    //Metodo DarEntrevista
    public static void darEntrevista (){
        System.out.println(fulbolista1.getNombre()+" "+fulbolista1.getApellido()+" ->");
        ((Futbolista)fulbolista1).entrevista();
        System.out.println(fulbolista2.getNombre()+" "+fulbolista2.getApellido()+" -> ");
        ((Futbolista)fulbolista2).entrevista();
    }

    //Medico CurarLesiones
    public static void curarLesiones (){

        System.out.println(doctor.getNombre()+" "+doctor.getApellido()+" -> ");
        ((Doctor)doctor).curarPersona();
    }

}
