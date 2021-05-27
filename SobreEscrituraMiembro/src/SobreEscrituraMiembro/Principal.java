package SobreEscrituraMiembro;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Persona persona = new Persona();
        Perro perro = new Perro();

        animal.comer();
        persona.comer();
        perro.comer();
    }
}
