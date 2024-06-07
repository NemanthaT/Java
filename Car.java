public class Car{
    String name;
    String model;
    String color;
    int year;
    int refno;

    public Car(String name, String model, String color, int year, refno){
        this.name=name;
        this.model=model;
        this.color=color;
        this.year=year;
        this.refno=refno;
    }

    public void displayInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}