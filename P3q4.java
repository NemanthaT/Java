import java.util.Scanner;

public class P3q4{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String mySent = scn.nextLine();
		int countv=0;
		int countc=0;
		int c=0;
		int i=0;
		
		while(i<mySent.length()){
			if ((mySent.charAt(i)=='a')||(mySent.charAt(i)=='A')){
				countv++;
			}
			else if ((mySent.charAt(i)=='e')||(mySent.charAt(i)=='E')){
				countv++;
			}
			else if ((mySent.charAt(i)=='i')||(mySent.charAt(i)=='I')){
				countv++;
			}
			else if ((mySent.charAt(i)=='o')||(mySent.charAt(i)=='O')){
				countv++;
			}
			else if ((mySent.charAt(i)=='u')||(mySent.charAt(i)=='U')){
				countv++;
			}
			else if(mySent.charAt(i)==' '){
				c++;
			}
			else{
				countc++;
			}
			i++;
		}
		System.out.println("Vowels: " + countv);
		System.out.println("Consonants: " + countc);
	}
}
