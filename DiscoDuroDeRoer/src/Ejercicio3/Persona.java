package Ejercicio3;

public class Persona {
    private String nombre ;
    private String dni;
    private int edad ;
    private char sexo;

    private final String nombre_chicos [] ={"luciano","Javier","Santiago","Leandro","Ramiro"};
    private  final String nombre_chicas [] = {"Bianca","Paula","Juliana","Belen","Lara"};


    public Persona() {

        int determinar_sexo = MetodosSueltos.generarNumeroAleatorio(0,1);

        //Determina El sexo
        if (determinar_sexo ==0){
            nombre = nombre_chicos[MetodosSueltos.generarNumeroAleatorio(0,4)];
        }
        else{
            nombre = nombre_chicas[MetodosSueltos.generarNumeroAleatorio(0,4)];
        }
    }


}
