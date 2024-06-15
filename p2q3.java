import java.util.Scanner;

public class p2q3{

    public static void comp(int a, int b){
        if (a==b){
            System.out.println("a is equal to b");
        }
        if (a!=b){
            System.out.println("a is not equal to b");
        }
        if (a>b){
            System.out.println("a is greater than b");
        }
        if (a<b){
            System.out.println("a is less than b");
        }
        if (a>=b){
            System.out.println("a is greater than or equal to b");
        }
        if (a<=b){
            System.out.println("a is less than or equal to b");
        }

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number \"a\": ");
        int a= scn.nextInt();
        System.out.print("Enter number \"b\": ");
        int b= scn.nextInt();

        comp(a,b);

    }
}