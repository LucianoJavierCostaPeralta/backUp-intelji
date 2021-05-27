package Book;

import java.util.Arrays;

public class Book {
    //Atributos
    protected static final int QTY_DEF = 0;
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    //Metodo Constructor 1
    public Book(String name, Author[] authors, double price) {
        this(name, authors, price, QTY_DEF);
    }

    //Metodo Constructor 2
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    //Metodos Geters

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    //Metodos Geter & Seter
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    //Metodo Coma
    public void coma (){
        System.out.println(" , ");
    }

    //Metodo ToString
    public String toString() {
        String ret ="'" + this.name + "'by " + authors.length + "author(s)";
        return  ret;
    }
}
