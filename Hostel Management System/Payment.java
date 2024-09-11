import java.util.*;

public class Payment {
    private String month;
    private int amount;

    public Payment(String month, int amount) {
        this.month = month;
        this.amount = amount;
    }

    public String getMonth(){
        return month;
    }
    public int getAmount() {
        return amount;
    }

    public void setMonth(String month) {
        this.month=month;
    }
    public void setAmount(int amount) {
        this.amount=amount;
    }

}
