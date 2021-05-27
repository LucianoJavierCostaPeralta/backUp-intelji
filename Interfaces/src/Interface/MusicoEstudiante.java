package Interface;

public class MusicoEstudiante implements Musico,Estudiante{
    @Override
    public void hablar() {
        System.out.println("Estoy hablando español ");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Estoy tocando la Guitarra");
    }

    @Override
    public void estudiar() {
        System.out.println("Estoy estudiando Programacion ");
    }
}
