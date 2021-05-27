package Account;

public class Account {
    //Atributos
    private String id;
    private String name ;
    private int balance = 0;

    //Metodos

    //Metodo Constructor 1
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Metodo Constructor 2
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Metodos Geter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }


    //Metodo Credito
    public int credit (int amount ){
        this.balance += amount;
        return  this.balance;
    }

    //Metodo Debito
    public int debit (int amount){
        if (amount <= balance){
            this.balance -= amount;
            return this.balance;
        }
        else {
            System.out.println("El monto exede al saldo actual");
        }
        return this.balance;
    }

    //Metodo Transgerencia
    public  int transferTo (Account another , int amount){
        if (amount <= balance){
            another.credit(amount);
            this.balance -=amount;
            return this.balance;
        }
        else {
            System.out.println("El monto exede el saldo actual");
        }


        return balance;
    }

    //Metodo To String


    @Override
    public String toString() {
        return "\nID : "+id+
                "\nNombre : "+name+
                "\nBalance : "+balance;
    }
}
