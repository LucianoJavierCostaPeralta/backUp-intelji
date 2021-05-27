package ClasesyObjetos;

public class MainOperacion {
    public static void main(String[] args) {
        //Creamos Objeto de la clase Operacion

        Operacion op = new Operacion();

        op.LeerNumero();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultado();

    }
}
