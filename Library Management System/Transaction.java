import java.util.Scanner;

public class Transaction {
    private int transactionId;
    private int memberId;
    private int bookId;
    private int borrowDate;
    private int returnDate;
    private boolean returned;

    public Transaction(int transactionId, int mId, int bId, int borrowDate) {
        this.transactionId = transactionId;
        this.memberId = mId;
        this.bookId = bId;
        this.borrowDate = borrowDate;
        this.returnDate = 0;
        this.returned = false;
    }

    public void display() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Member ID: " + memberId);
        System.out.println("Book ID: " + bookId);
        System.out.println("Borrow Date: " + borrowDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Returned: " + returned);
    }

    public int calculateFine() {
        long diff = returnDate - borrowDate;

        if (diff > 0 && diff <= 7) {
            return (int) (diff * 50);
        } 
        else if(diff > 7) {
            return (7 * 50) + (int) ((diff - 7) * 100);
        }
        else{
            return 0;
        }
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setReturnDate() {
        Scanner scanNo = new Scanner(System.in); //scanner for numbers
        System.out.print("Enter Return Date: ");
        int date = scanNo.nextInt();
        this.returnDate = date;
    }
    public boolean setReturned() {
        return returned = true;
    }

    public boolean getReturned() {
        return returned;
    }

    public int getBookId(){
        return bookId;
    }
}