import java.util.Scanner;
import java.util.Stack;

public class CarDete{

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);


        String nam;
        String modl;
        String clr;
        int yr;

        System.out.print("Enter Car name: ");
        nam=sc.nextLine();
        System.out.print("Enter Car model: ");
        modl=sc.nextLine();
        System.out.print("Enter Car color: ");
        clr=sc.nextLine();
        System.out.print("Enter Car year: ");
        yr=sc.nextInt();
        Car cars= new Car(nam,modl,clr,yr);
        System.out.println("-----------------------------------");
        System.out.println("Car details,");
        cars.displayInfo();
    }
}