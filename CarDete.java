import java.util.Scanner;
import java.util.Stack;

public class CarDete{

    static Stack<Car> carStack = new Stack<>();
    static boolean cond=true;
    static Scanner sc= new Scanner(System.in);
    public static boolean choice(char ch){
        //Scanner sc= new Scanner(System.in);
        if(ch=='y'){
            enterDete();
        }
        else{
            cond=false;
        }
        return cond;
    }

    public static void enterDete(){
        Scanner scan= new Scanner(System.in);
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
        carStack.push(cars);
        String cho;
        System.out.print("Do you want to add more cars (y/n): ");
        cho=scan.nextLine();
        char ch=cho.charAt(0);
        choice(ch);
    }

    public static void printCarStack(Stack<Car> carStack){
        for (Car car : carStack){
            car.displayInfo();
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args){
        while(cond==true){
            //Scanner scan= new Scanner(System.in);
            enterDete();
            /*String cho;
            System.out.println("Do you want to add more cars (y/n): ");
            cho=scan.nextLine();
            char ch=cho.charAt(0);
            if(ch=='y'){
                enterDete();
            }
            else{
                cond=false;
            }*/
        }

        System.out.println("-----------------------------------");
        System.out.println("Car details,");
        printCarStack(carStack);
    }
}