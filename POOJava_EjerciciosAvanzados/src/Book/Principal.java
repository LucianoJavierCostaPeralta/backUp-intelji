package Book;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entreda = new Scanner(System.in);

        String name ;
        String email;
        String authorName ;
        int price ;
        int qyt;
        char gender ;

        //Arreglo de obejtos
        Author author [] = new Author[2];

        for (int i = 0 ; i < author.length ; i ++){
            System.out.print("\nNombre del Autor : ");
            authorName = entreda.nextLine();
            System.out.print("Email del Autor : ");
            email = entreda.nextLine();
            System.out.print("Genero del Autor . 'm'(Masculino) 'f'(Femenuno). : ");
            gender = entreda.next().charAt(0);

            author [i] = new Author(authorName,email,gender);
            entreda.nextLine();
        }

        //Informacion del Libro
        System.out.print("\nTitulo del libro : ");
        name = entreda.nextLine();
        System.out.print("Precio del libro $ ");
        price = entreda.nextInt();
        System.out.print("¿Cuantas copias del libro se han vendido ? : ");
        qyt = entreda.nextInt();

        entreda.close();



    }
}
