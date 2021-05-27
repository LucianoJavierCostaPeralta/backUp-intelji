package Uber;
//Clase Padre
public class Cuenta {
    Integer id;
    String nombre;
    String dni;
    String email;
    String contraseña;

    public Cuenta(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
}
