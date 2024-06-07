import java.util.Scanner; //importing Scanner class
import java.util.Stack; //importing Stack class

//Car class
public class CarDete{

    static Stack<Car> carStack = new Stack<>(); //creating a stack of Car objects
    static Stack<Car> tempcarStack = new Stack<>(); //creating a temporary stack of Car objects
    static boolean cond=true; //boolean variable to check the condition
    static int rfno=0;

    //function to check the choice of the user
    public static boolean choice(char ch){

        if(ch=='y'){
            enterDete();
        }
        else{
            cond=false;
        }
        return cond;
    }

    //function to enter the details of the car
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

    //function to search the car by reference number
    public static void searchRef(){
        Scanner delref= new Scanner(System.in);
        System.out.print("Enter the reference number of the car you want to delete: ");
        int ref=delref.nextInt();

        for(Car car: carStack){
            if(car.refno==ref){
                car.displayInfo();
            }
        }
        delRef(ref);
        System.out.println("Car details deleted successfully.");
    }

    //function to delete the car by reference number
    public static void delRef(int ref){
        for(Car car: carStack){
            if(car.refno==ref){
                carStack.remove(car);
            }
        }
    }

    //function to find the car to delete
    public static void deleteInfo(){
        Scanner delsc= new Scanner(System.in);
        Scanner delch= new Scanner(System.in);
        String delnam;
        String delmodl;
        String delclr;
        int delyr;

        System.out.println("Enter the details of the car you want to delete: ");
        System.out.print("Enter the detail that you going to search to find the car( Name=n, Model=m, Color=c, Year=y): ");
        String dels= delch.nextLine();
        char del=dels.charAt(0);

        if(del=='n'){
            System.out.print("Enter Car name: ");
            delnam=delsc.nextLine();
            for(Car car: carStack){
                if(car.name==delnam){
                    car.displayInfo();
                    searchRef();
                }
                else{
                    System.out.println("Car not found.");
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
                else{
                    System.out.println("Car not found.");
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
                else{
                    System.out.println("Car not found.");
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
                else{
                    System.out.println("Car not found.");
                }
            }
        }
        else{
            System.out.println("Invalid input.Enter valid input.");
            deleteInfo();
        }

    }

    //function to print the car details
    public static void printCarStack(Stack<Car> carStack){
        for (Car car : carStack){
            car.displayInfo();
            System.out.println("-----------------------------------");
        }
    }

    //main function
    public static void main(String[] args){
        while(cond==true){
            System.out.println("Enter the details of the car,");
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