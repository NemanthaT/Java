import java.util.Scanner;

public class ex1{
    public static void power(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int no = scn.nextInt();
            System.out.print("Square is: "+ no*no);
            System.out.println("");
        }
        catch(Exception e){
            System.out.println("Invalid input");
            power();
        }
        finally{
            System.out.println("You handled the exception.");

        }
    }
    
    public static void main(String args[]){
        ex1main car1 = new ex1main("Civic", "Honda", 2014);
        ex1main car2 = new ex1main("Accord", "Honda", 2015);
        car1.display();
        car2.display();
        car1.changeName("CRV");
        car1.display();
        car2.name = "Pilot";
        car2.display();
        String car = "Petrol";
        String bus = "Petrol";
        car=car+bus;
        System.out.println(car);
        int i = 1;
        for(i = 1; i <= 5; i++) {
            continue;
        }
        System.out.println("i = " + i);

        power();

    }
}