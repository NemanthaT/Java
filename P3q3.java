import java.util.Scanner;
import java.util.*;

public class P3q3 {

    public static void main(String[] args){
    	Scanner scn = new Scanner(System.in);
    	System.out.print("Enter a sentence: ");
        String s= scn.nextLine();
        String str[] = s.split(" ");
        Collections.reverse(Arrays.asList(str));
        System.out.println(String.join(" ", str));
    }
}
