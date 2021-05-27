package Peson;
//Clase hija de la clase padre "Person"
public class Staff extends Person{
    //Atributos
    private String school;
    private double pay;

    //Metodo Constructor aplicando herencia
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }


    //Metodos Geter & Seters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    //Metodo ToString


    @Override
    public String toString() {
        return " : " + super.toString() +
                "\nEscuela : " + school +
                "\nPago $ " + pay;

    }
}
