import java.util.*;

public class Tenant {
    private String name;
    private int number;
    private ArrayList<Payment> payments = new ArrayList<Payment>();
    private int paymentMonth;

    public Tenant(String name, int number) {
        this.name = name;
        this.number = number;
        this.paymentMonth = 0;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    public int getPaymentMonth() {
        return paymentMonth;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setPayMonth(int paymentMonth){
        this.paymentMonth = paymentMonth;
    }

    public void addPayment(Payment payment){
        payments.add(payment);
    }

    public void viewPayment(){
        for(Payment payment : payments){
            System.out.println("Month: " + payment.getMonth());
            System.out.println("Amount: " + payment.getAmount());
            System.out.println("------------");
        }
    }

    public void sumPay(){
        int sum = 0;
        for(Payment payment : payments){
            sum += payment.getAmount();
        }
        System.out.println("Sum of the payments are: " + sum);
    }

}