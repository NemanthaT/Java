import java.util.Scanner;

public class p2q2 {
    public static void check(float a){
        if (a>10.0){
            System.out.println("Good");
        }
        else{
            System.out.println("Bad");
        }

    }
    public static void main (String[] args){

        Scanner scn= new Scanner(System.in);
        float a=14.5F;

        check(a);

        System.out.print("Enter a new number: ");

        a=scn.nextFloat();

        check(a);
    }
}