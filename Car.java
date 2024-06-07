public class Car{
    String name;
    String model;
    String color;
    int year;

    public Car(String name, String model, String color, int year){
        this.name=name;
        this.model=model;
        this.color=color;
        this.year=year;
    }

    public void displayInfo(){
        System.out.println("-----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}