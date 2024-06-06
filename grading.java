import java.util.Scanner;

public class grading{
    public static void calculating(int a, int b, int c){
        System.out.println("Your assigment marks is: "+a*0.4);
        System.out.println("Your midterm marks is: "+b*0.3);
        System.out.println("Your final exam marks is: "+c*0.3);

        int total=(int)((a*0.4)+(b*0.3)+(c*0.3));
        System.out.println("Your total marks is: "+total);
        System.out.println("_____________________________________");
        System.out.println("Your grade is:" + grade(total));
    }

    public static char grade(int total){
        if (total>80){
            return 'A';
        }
        else if (total>70){
            return 'B';
        }
        else if (total>60){
            return 'C';
        }
        else if (total>50){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your assigment marks: ");
        int asg=sc.nextInt();
        System.out.print("Enter your midterm marks: ");
        int midm=sc.nextInt();
        System.out.print("Enter your final exam marks: ");
        int finm=sc.nextInt();
        System.out.println("_____________________________________");
        calculating(asg, midm, finm);
    }
}