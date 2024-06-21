import java.util.Scanner;

public class P3q2{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String mySent = scn.nextLine();
		int count=1;
		int i=0;
		int j=0;
		char c,ch;
		c=mySent.charAt(0);
		ch=Character.toUpperCase(c);
		StringBuilder newSent = new StringBuilder(mySent);
        newSent.setCharAt(0, ch);
				
		while(i<mySent.length()){
			if ((mySent.charAt(i))==' '){
				j=0;
				j=i+1;
				c=mySent.charAt(j);
				ch=Character.toUpperCase(c);
				//mySent=mySent.replace(mySent.charAt(j), ch);
				newSent.setCharAt(j, ch);
			}
			i++;
		}
		System.out.print("Modified Sentence: " + newSent);
	}
}
