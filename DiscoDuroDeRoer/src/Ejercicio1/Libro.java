package Ejercicio1;

public class Libro {
    //Atributos
    private int ISBM ;
    private String titualo ;
    private String autor ;
    private int numeroPaginas;

    //Metodo Constructor
    public Libro(int ISBM, String titualo, String autor, int numeroPaginas) {
        this.ISBM = ISBM;
        this.titualo = titualo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    //Metodos Geter y Seter

    public int getISBM() {
        return ISBM;
    }

    public void setISBM(int ISBM) {
        this.ISBM = ISBM;
    }

    public String getTitualo() {
        return titualo;
    }

    public void setTitualo(String titualo) {
        this.titualo = titualo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "El libro : "+titualo+
                "\nISBM : "+ISBM+
                "\nAutor : "+autor+
                "\nNumero de Paginas : "+numeroPaginas;
    }
}
