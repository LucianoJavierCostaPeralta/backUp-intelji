package Account;

public class Principal {
    public static void main(String[] args) {
        Account account = new Account("123","Luciano",100);

        account.credit(10);

        account.debit(2);
        System.out.println(account.toString());


    }
}
