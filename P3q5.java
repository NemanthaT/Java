import java.util.Scanner;
import java.util.Stack;

public class P3q5{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String mySent = scn.nextLine();
		String dupSent = String.valueOf(mySent);
		Stack<Character> checkSent = new Stack<>();
		Stack<Character> newSent = new Stack<>();
		Stack<Character> finalSent = new Stack<>();
		int i=0;
		int r=0;
		char c=' ';

		for(i=0;i<mySent.length();i++){
			newSent.push(mySent.charAt(i));
		}
		for(i=0;i<mySent.length();i++){
			checkSent.push(mySent.charAt(i));
		}
		
		for(char k: checkSent){
			for(char j: newSent){
				if (k==j){
					//System.out.println("k: "+k+" j: "+j);
					continue;						
				}
				else{
					c=k;
				}
			}
			finalSent.push(c);
			
		}
		/*for(i=0;i<mySent.length();i++){
			for(char j: newSent){
				if (mySent.charAt(i)!=j){
					System.out.println("i: "+mySent.charAt(i)+" j: "+j);
					c = mySent.charAt(i);
					System.out.println("c: "+c);
						
					//String ch = c;				
				}
			}
			newSent.push(c);	
		}*/
		System.out.print("Modified: ");
		/*while(!(newSent.isEmpty())){
			System.out.print(newSent[i]);
			i++;
		}*/
		while(!(finalSent.isEmpty())){
			System.out.print(finalSent.pop());
		}

		System.out.println("\n");
		System.out.println(mySent);
		System.out.println(dupSent);
		System.out.println(dupSent.length());
	}
}

/* 
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        boolean[] seen = new boolean[256]; // Array to track seen characters (assuming ASCII)
        char[] resultArray = new char[input.length()];
        int index = 0;

        for (char c : input.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                resultArray[index++] = c;
            }
        }

        return new String(resultArray, 0, index);
    }
}*/