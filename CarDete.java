import java.util.Scanner;
import java.util.Stack;

public class CarDete{

    static Stack<Car> carStack = new Stack<>();
    static Stack<Car> tempcarStack = new Stack<>();
    static boolean cond=true;
    static int rfno=0;

    public static boolean choice(char ch){

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
        rfno++;
        Car cars= new Car(nam,modl,clr,yr,rfno);
        carStack.push(cars);

        String cho;
        System.out.print("Do you want to add more cars (y/n): ");
        cho=scan.nextLine();
        System.out.println("-----------------------------------");
        char ch=cho.charAt(0);
        choice(ch);
    }

    public static void searchRef(){
        Scanner delref= new Scanner(System.in);
        int ref=delref.nextInt();

        for(Car car: carStack){
            if(car.refno==ref){
                car.displayInfo();
            }
        }
        delRef(ref);
        System.out.println("Car details deleted successfully.");
    }

    public static void delRef(int ref){
        for(Car car: carStack){
            if(car.refno==ref){
                carStack.remove(car);
            }
        }
    }

    public static void deleteInfo(){
        Scanner delsc= new Scanner(System.in);
        String delnam;
        String delmodl;
        String delclr;
        int delyr;

        System.out.println("Enter the details of the car you want to delete: ");
        System.out.print("Enter the detail that you going to search to find the car( Name=n, Model=m, Color=c, Year=y): ");
        String dels= delsc.nextLine();
        char del=dels.charAt(0);

        if(del=='n'){
            System.out.print("Enter Car name: ");
            delnam=delsc.nextLine();
            for(Car car: carStack){
                if(car.name==delnam){
                    car.displayInfo();
                    searchRef();
                }
            }
        }

        else if(del=='m'){
            System.out.print("Enter Car Model: ");
            delmodl=delsc.nextLine();
            for(Car car: carStack){
                if(car.model==delmodl){
                    car.displayInfo();
                    searchRef();
                }
            }
        }

        else if(del=='c'){
            System.out.print("Enter Car Color: ");
            delclr=delsc.nextLine();
            for(Car car: carStack){
                if(car.color==delclr){
                    car.displayInfo();
                    searchRef(); 
                }
            }
        }

        else if(del=='y'){
            System.out.print("Enter Car Color: ");
            delyr=delsc.nextInt();
            for(Car car: carStack){
                if(car.year==delyr){
                    car.displayInfo();
                    searchRef(); 
                }
            }
        }
        else{
            System.out.println("Invalid input.Enter valid input.");
            deleteInfo();
        }

    }

    public static void printCarStack(Stack<Car> carStack){
        for (Car car : carStack){
            car.displayInfo();
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args){
        while(cond==true){

            enterDete();

        }

        System.out.println("-----------------------------------");
        System.out.println("Car details,");
        printCarStack(carStack);
        
        deleteInfo();
        System.out.println("Car details, after deletion,");
        printCarStack(carStack);
    }
}