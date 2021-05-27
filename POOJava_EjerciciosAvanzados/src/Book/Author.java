package Book;

public class Author {
    //Atributos
    private String authorName;
    private String email;
    private char gender ;

    //Metodos

    //Metodo Constructor
    public Author(String authorName, String email, char gender) {
        this.authorName = authorName;
        this.email = email;
        this.gender = gender;
    }

    //Metodos Geter & Seters
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    //Metodo ToString



    public String toString() {
       String ret = this.authorName + " (" +this.gender+ ") at " +this.email;
       return  ret;
    }
}
