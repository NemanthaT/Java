public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Available: " + available);
    }

    public void setAvailable() {
        available = true;
    }

    public void setUnavailable() {
        available = false;
    }

    public int getBookId() {
        return bookId;
    }

}