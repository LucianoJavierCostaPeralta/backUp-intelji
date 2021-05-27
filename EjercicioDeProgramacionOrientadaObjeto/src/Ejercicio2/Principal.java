package Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Libro l1 = new Libro(10156,"El libro","Agustin R",200);
        Libro l2 = new Libro(10168,"Rey","Luciano C",300);

        l1.toString();
        l2.toString();

        if (l1.getNumeroPagina() == l2.getNumeroPagina()){
            System.out.println("Tienen el mismo numero de pagina");
        }
        else if (l1.getNumeroPagina() > l1.getNumeroPagina()){
            System.out.println("El libro "+l1.getTitulo()+" tiene mas paginas que "+l2.getTitulo());
        }
        else{
            System.out.println("El libro "+l2.getTitulo()+" tiene mas paginas que "+l1.getTitulo());
        }
    }
}
