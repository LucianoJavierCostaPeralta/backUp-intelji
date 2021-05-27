package Peson;
//Clase hija de la clase padre "Person"
public class Student extends Person {
    //Atributos
    private String program ;
    private int year ;
    private double fee ;

    //Metodo Constructor
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    //MetodosGeters & Seters
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "\n  "+super.toString()+
                "\nPrograma : "+program+
                "\nAño : "+year+
                "\nCuota : "+fee;
    }
}
