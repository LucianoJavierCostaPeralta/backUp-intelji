package SistemaDeDescuento;

import java.util.Date;

public class Visit {
    //Atributos
    private Customer customer;
    private Date date;
    private double serviceExpense ;
    private double productExpense ;

    //Metodos

    //Metodo Constructor
    public Visit(String name,Date date) {
        this.date = date;
        this.customer = new Customer(name);
    }

    //Metodo Geter & Seters

    public String getName(){
        return this.customer.getName();
    }

    public void setCustomer(String memberType){

        this.customer.setMemberType(memberType);

        if (this.customer.getMemberType().equals(null)){
            this.customer.setMember(false);
        }
        else {
            this.customer.setMember(true);
        }

    }


    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getServiceExpenseDisc (){
        return this.serviceExpense-(DiscountRate.getServiceDiscountRate(this.customer.getMemberType())*this.serviceExpense);
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getProductExpenseDisc(){

        if (this.customer.isMember()){
            return this.productExpense-(this.productExpense*0.1);
        }
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    public double getTotalExpense (){
        return getProductExpense()+getServiceExpense();
    }

    public double getTotalExpenseDis(){
        return getProductExpense()+getServiceExpense();
    }


    //Metodo ToString

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}'+super.toString();
    }
}
