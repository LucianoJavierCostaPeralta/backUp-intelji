package Employee;

public class Employee {
    //Atributos
    private int id ;
    private String firstName;
    private String lastName;
    private int salary ;

    //Metodo

    //Metodo Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    //Metodos Geters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //Metodo String name
    public String name (){
        return getFirstName()+" "+getLastName();
    }


    //Metodos Geter & Seter Salary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Metodo Geter Salario Anual
    public int getAnualSalary (){
        return this.salary*12;
    }

    //Metodo  RaiceSalary

    public  int raiceSalary (int percent ){

        return ((this.salary*percent)/100)+this.salary;
    }

    //Metodo To String


    @Override
    public String toString() {
        return "\nIdentificador : "+id+
                "\nNombre : "+firstName+
                "\nApellido : "+lastName+
                "\nSalario $ "+salary;

    }
}
