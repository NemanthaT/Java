//Final version

//Car class with name, model, color, year, and reference number as attributes
public class Car{
    String name;
    String model;
    String color;
    int year;
    int refno;

    //constructor to initialize the attributes
    public Car(String name, String model, String color, int year, int refno){
        this.name=name;
        this.model=model;
        this.color=color;
        this.year=year;
        this.refno=refno;
    }

    //function to display the details of the car
    public void displayInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Reference Number: " + refno);
    }
}