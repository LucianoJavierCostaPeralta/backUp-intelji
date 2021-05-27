package Peson;
//Clase Padre
public class Person {
    //Atributos
    private String name ;
    private String address;

    //Metodos

    //Metodo Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Metodo Geter name
    public String getName() {
        return name;
    }

    //Metodo Geter & Seter address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "\nNombre : "+name+
                "\nHabla a : "+address;

    }
}
