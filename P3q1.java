import java.util.Scanner;

public class P3q1{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String mySent = scn.nextLine();
		int count=1;
		int i=0;
		
		while(i<mySent.length()){
			if ((mySent.charAt(i))==' '){
				count++;
			}
			i++;
		}
		System.out.print("Number of words: " + count);
	}
}
