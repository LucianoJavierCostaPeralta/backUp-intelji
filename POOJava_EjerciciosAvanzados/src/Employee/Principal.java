package Employee;

public class Principal {
    public static void main(String[] args) {
        Employee employee = new Employee(1001,"Luciano","Costa",100000);

        System.out.println("\nDatos del Empleado :"+employee.toString()+
                "\nSalario Anual $ "+employee.getAnualSalary()+
                "\nSalario  mas un aumento $ "+employee.raiceSalary(60));




    }
}
