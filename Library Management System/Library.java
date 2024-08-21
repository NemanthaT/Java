import java.util.Scanner;
import java.util.ArrayList;

public class Library {
    public static Book addBook (int bookId) {
        Scanner scanNo = new Scanner(System.in); //scanner for numbers
        Scanner scanStr = new Scanner(System.in); //scanner for strings
        System.out.print("Enter Book Title: ");
        String title = scanStr.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanStr.nextLine();
        Book book = new Book(bookId, title, author);

        return book;

    }

    public static Member addMember (int memberId) {
        Scanner scanNo = new Scanner(System.in); //scanner for numbers
        Scanner scanStr = new Scanner(System.in); //scanner for strings
        System.out.print("Enter Member Name: ");
        String name = scanStr.nextLine();
        System.out.print("Enter Member Tel No: ");
        String telNo = scanStr.nextLine();
        Member member = new Member(memberId, name, telNo);

        return member;

    }

    public static Transaction lend (int lendId, ArrayList<Book> books) {
        Scanner scanNo = new Scanner(System.in); //scanner for numbers
        System.out.print("Enter Member ID: ");
        int memberId = scanNo.nextInt();
        System.out.print("Enter Book ID: ");
        int bookId = scanNo.nextInt();
        System.out.print("Enter Borrow Date: ");
        int borrowDate = scanNo.nextInt();
        Transaction transaction = new Transaction(lendId, memberId, bookId, borrowDate);

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId() == bookId) {
                books.get(i).setUnavailable();
                break;
            }
        }

        return transaction;

    }


    public static void main (String[] args) {
        Scanner scanNo = new Scanner(System.in); //scanner for numbers
        Scanner scanStr = new Scanner(System.in); //scanner for strings
        ArrayList<Book> books = new ArrayList<Book>(); //arraylist for books
        ArrayList<Member> members = new ArrayList<Member>(); //arraylist for members
        ArrayList<Transaction> transactions = new ArrayList<Transaction>(); //arraylist for transactions
        int choice = 0;
        int memberId = 0;
        int bookId = 0;
        int lendId = 0;

        while(choice != 13) {
            System.out.println("\n************ Library Management System ************");
            System.out.println(" 1. Add Book");
            System.out.println(" 2. Remove Book");
            System.out.println(" 3. Search Book");
            System.out.println(" 4. Display Book Names");
            System.out.println("-------------------------------");
            System.out.println(" 5. Register Member");
            System.out.println(" 6. Remove Member");
            System.out.println(" 7. Search Member");
            System.out.println(" 8. Display Member Names");
            System.out.println("-------------------------------");
            System.out.println(" 9. Lend Book");
            System.out.println("10. Return Book");
            System.out.println("11. View Lending Info");
            System.out.println("12. Display Overdue Books");
            System.out.println("13. Exit");
            System.out.println(" ");

            System.out.print("Enter your choice: ");
            choice = scanNo.nextInt();
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

            switch (choice) {
                case 1:
                    books.add(addBook(bookId));
                    bookId++;
                    break;

                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanNo.nextInt();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getBookId() == removeId) {
                            books.remove(i);
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanNo.nextInt();
                    for (int i = 0; i < books.size(); i++) {
                        if (books.get(i).getBookId() == searchId) {
                            books.get(i).display();
                            break;
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < books.size(); i++) {
                        books.get(i).display();
                    }
                    break;
                
                case 5:
                    members.add(addMember(memberId));
                    memberId++;
                    break;

                case 6:
                    System.out.print("Enter Member ID to remove: ");
                    removeId = scanNo.nextInt();
                    for (int i = 0; i < members.size(); i++) {
                        if (members.get(i).getMemberId() == removeId) {
                            members.remove(i);
                            break;
                        }
                    }
                    break;
                
                case 7:
                    System.out.print("Enter Member ID to search: ");
                    searchId = scanNo.nextInt();
                    for (int i = 0; i < members.size(); i++) {
                        if (members.get(i).getMemberId() == searchId) {
                            members.get(i).display();
                            break;
                        }
                    }
                    break;

                case 8:
                    for (int i = 0; i < members.size(); i++) {
                        members.get(i).display();
                    }
                    break;
                case 9:
                    transactions.add(lend(lendId, books));
                    lendId++;
                    break;
                case 10:
                    System.out.print("Enter Transaction ID to return: ");
                    int returnId = scanNo.nextInt();
                    for (int i = 0; i < transactions.size(); i++) {
                        if (transactions.get(i).getTransactionId() == returnId) {
                            transactions.get(i).setReturned();
                            transactions.get(i).setReturnDate();
                            int bid = transactions.get(i).getBookId();
                            for (int j = 0; j < books.size(); j++) {
                                if (books.get(j).getBookId() == bid) {
                                    books.get(j).setAvailable();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                
                case 11:
                    for (int i = 0; i < transactions.size(); i++) {
                        transactions.get(i).display();
                    }
                    break;
                
                case 12:
                    for (int i = 0; i < transactions.size(); i++) {
                        if (transactions.get(i).getReturned() == false) {
                            transactions.get(i).display();
                        }
                    }
                    break;
                    
                case 13:
                    System.out.println("Exiting System..........");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}