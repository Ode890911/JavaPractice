package training;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String Original; String rev = "";
		
		Scanner in= new Scanner(System.in);
		/*System.out.println("Enter a String");
		Original= in.nextLine();
		int len= Original.length();
		for(int i= len-1; i>=0; i--){
			rev= rev + Original.charAt(i)	;	
		}
		System.out.println(rev);
		
		if(Original.equals(rev))
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		*/
		
		
		//compare 2 string
		
		String s1; String s2;
		System.out.println("enter a string");
		
		s1=in.nextLine();
		
		System.out.println("enter the 2nd string");;
		s2= in.nextLine();
		
		
		if(s1.equals(s2)){
			System.out.println(s1 + " is similar to " + s2);
		}
		else{

			System.out.println(s1 + " is different from " + s2);
		
		}
			
		
		
	}
	
		
		
}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		//how to reverse a string
		String rev= ""; String original;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an String");;
		original=in.nextLine();		
		
		int len= original.length();
		for(int i=len-1; i>=0; i--){
			rev= rev+ original.charAt(i);			
			}
		System.out.println(rev);
		if(original.equals(rev)){
			System.out.println("It is a palindrome");
			
		}else{
			System.out.println("it is not a palindrome");
		}
		
		*/

	


