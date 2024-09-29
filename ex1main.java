public class ex1main {
    protected String name;
    String make;
    int year;

    public ex1main(String name, String make, int year) {
        this.name = name;
        this.make = make;
        this.year = year;
    }

    void display() {
        System.out.println("Name: " + name + ", Make: " + make + ", Year: " + year);
    }

    void changeName(String name) {
        this.name = name;
    }

}