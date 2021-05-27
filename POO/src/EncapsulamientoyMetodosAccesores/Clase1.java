package EncapsulamientoyMetodosAccesores;
//SETTERS y GETTERS . Metodos Accesores
public class Clase1 {

    //Atributo Private
private String nombre ;
    private  int edad ;


    //Metodo Setter establecemos la edad

    public void setEdad (int edad){
        this.edad = edad ;
    }

    //Metodo Getters mostramos la edad

    public int getEdad (){
        return edad ;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
