package Ejercicio2;

public class Libro {
    private int  ISBN;
    private String titulo;
    private String autor ;
    private int numeroPagina;

    public Libro(int ISBN, String titulo, String autor, int numeroPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }



    public String toString() {
        return "\nEl libro : " +titulo+
                "\nISBN : "+ISBN+
        "\nnombre de Autor : "+autor+
        "\nNumero de paginas "+numeroPagina;
    }
}
