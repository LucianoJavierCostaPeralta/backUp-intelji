package SistemaDeDescuento;

import java.util.Calendar;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Date today = Calendar.getInstance().getTime();
        Visit visit = new Visit("luciano",today);

        visit.setCustomer("Gold");
        visit.setServiceExpense(1000);
        visit.setProductExpense(1000);

        System.out.println(visit.getTotalExpense());
        System.out.println(visit.getTotalExpenseDis());
    }
}
