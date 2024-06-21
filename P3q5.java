import java.util.Scanner;
import java.util.Stack;

public class P3q5{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String mySent = scn.nextLine();
		String dupSent = String.valueOf(mySent);
		Stack<Character> newSent = new Stack<>();
		int i=0;
		int j=0;
		int r=0;
		char c=' ';
		
		for(i=0;i<mySent.length();i++){
			for(j=0;j<mySent.length();j++){
				if (mySent.charAt(i)!=dupSent.charAt(j)){
					c = mySent.charAt(i);
					//String ch = c;
						
				}
				newSent.push(c);
			}	
			
		}
		System.out.print("Modified: ");
		i=0;
		/*while(!(newSent.isEmpty())){
			System.out.print(newSent[i]);
			i++;
		}*/
		for(char y : newSent){
			System.out.print(y);
		}
		System.out.print("\n");
		System.out.println(mySent);
		System.out.println(dupSent);
		System.out.println(dupSent.length());
	}
}
