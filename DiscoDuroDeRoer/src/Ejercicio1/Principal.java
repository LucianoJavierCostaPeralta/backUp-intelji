package Ejercicio1;

public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro(123456789,"C#POO","Jose Perez",150);
        Libro libro2 = new Libro(987654321,"JavaPOO","Alejandro Taboada",100);

        System.out.println("Datos de los libros . \n" +
                "\nLibro 1 "+libro1.toString()+
                "\n\nLibro 2 "+libro2.toString());

        if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()){
            System.out.println("El Libro  "+libro1.getTitualo()+
                    " . Tiene un numero superior de paginas  que el libro "+libro2.getTitualo());
        }
        else if (libro1.getNumeroPaginas() == libro2.getNumeroPaginas()){
            System.out.println("Los 2 libros tienen la misma cantidad de paginas");
        }
        else {
            System.out.println("El libro "+libro2.getTitualo()+
                    ". Tiene un numero superior de paginas , wue el libro  "+libro1.getTitualo());
        }
    }
}
