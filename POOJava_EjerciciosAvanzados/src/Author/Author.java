package Author;

public class Author {
    //Atributos

    private String name ;
    private String email ;
    private char gender  ;

    //Metodos

    //Metodo Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Metodos Geter Name
    public String getName() {
        return name;
    }

    //Metodo Geter & Seter Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo Geter Gender
    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "\nNombre : "+name+
                "\nEmail : "+email+
                "\nGenero : "+gender;
    }
}
