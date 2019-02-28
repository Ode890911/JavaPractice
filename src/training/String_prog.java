package training;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class String_prog {
	//1. Write a Java program to get the character at the given index within the String.
	public static void charAt(String s1, int index){
		System.out.println(s1.charAt(index));
	}
	
	//2. Write a Java program to get the character (Unicode code point) at the given index within the String.
	public static void UnicodeChar(String s1, int index){
		System.out.println(s1.codePointAt(index));
	}
	
	//Write a Java program to get the character (Unicode code point) before the specified index within the String
	public static void UnicodeCharBef(String s1, int index){
		System.out.println(s1.codePointBefore(index));
	}
	
	//3 Write a java program to count a number of Unicode code points in the specified text range of a String
	
	//Write a java program to compare two strings lexicographically.
	
	public static void  stringLexiCompare(String s1, String s2){
		System.out.println("String 1 is :" + s1);
		System.out.println("String 2 is :" + s2);

		int result= s1.compareTo(s2);
		if(result<0){
			System.out.println(s1  + " is less than " + s2);
		}
		else if(result==0){
			System.out.println(s1 + " is equal to " + s2);

		}
		else if(result>0){
			System.out.println(s1 + " is more than " + s2);

		}
	}
	
	//6. Write a java program to compare two strings lexicographically, ignoring case differences.
	public static void  stringLexiCompareIgnorecase(String s1, String s2){
		System.out.println("String 1 is :" + s1);
		System.out.println("String 2 is :" + s2);

		int result= s1.compareToIgnoreCase(s2);
		if(result<0){
			System.out.println("\"" + s1 +"\""  + " is less than " +"\"" +  s2+ "\""  );
		}
		else if(result==0){
			System.out.println("\"" + s1 + "\"" + " is equal to " + "\"" + s2+ "\""  );

		}
		else if(result>0){
			System.out.println("\"" + s1 + "\"" + " is more than " +"\"" +  s2+"\""  );

		}
	}
	
	//7. Write a Java program to concatenate a given string to the end of another string.
	
	public static void ConcatStringEnd(String s1, String s2){
		
		System.out.println(s1.concat(s2));
	}
	
	//Write a Java program to test if a given string contains the specified sequence of char values
	public static void stringChar(String s1, String charSequence){
		//boolean result= 
			System.out.println(s1.contains(charSequence));
	}
	//Write a Java program to compare a given string to the specified character sequence
	
	public static void compareStringChar(String s1, String charSequence){
		
		
		System.out.println("String  is :" + s1);
		System.out.println("Characther sequence  is :" + charSequence);

		boolean result= s1.contentEquals(charSequence);
		if(result){
			System.out.println("\"" + s1 +"\""  + "  represents the same sequence of char values as " +"\"" +  charSequence+ "\""  );
			
		}
		else if(result==false){
			System.out.println("\"" + s1 +"\""  + " does not represents the same sequence of char values as " +"\"" +  charSequence+ "\""  );
 
		}
		
		
	}
	
	//10. Write a Java program to compare a given string to the specified string buffer.
	public static void compareStrSb(String s1){
		
		StringBuffer s2= new StringBuffer(s1);
		

		Boolean result = s1.contentEquals(s2);
		if(result){
			System.out.println("\"" + s1 +"\""  + "  represents the same sequence of char values as the stringbuffer " +"\"" +  s2+ "\""  );

		}else{
			System.out.println("\"" + s1 +"\""  + " does not represents the same sequence of char values as the stringbuffer " +"\"" +  s2+ "\""  );

		}
		
	}
	
	//11.Write a Java program to create a new String object with the contents of a character array. 
	public static void arrayString(){
		char [] name= new char[]{'o','d','e'};
		
		String str= String.copyValueOf(name);
		
		System.out.println(str);
	}
	//15. Write a java program to print current date and time in the specified format
	
	public static void currentDate(){
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		System.out.println( "current date and time");
		
		System.out.format(dateName);
	}
	
	public static void substringRegex(){
		String s1= "The quick brown fox jumps over the lazy dog.";
		
		
		//19. Write a Java program to get the index of all the characters of the alphabet.	
		for(char i='a'; i<='z'; i++){
			System.out.println("the index of " + i +  " is " + (s1.toLowerCase()).indexOf(i));

		}
		//25. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement

		//System.out.println(s1.replaceAll("fox", "cat"));
		
		//21. Write a Java program to get the last index of a string within a string
		//int lastnum= (s1.length()-1);
		//System.out.println(s1.charAt(lastnum));
		/*for(char i='a'; i<='z'; i++){
			System.out.println("the last index of " + i +  " is " + s1.lastIndexOf(i));
			
		}
		*/
		//24. Write a Java program to replace all the 'd' characters with 'w' characters.
		//System.out.println(s1.replaceAll("d", "w"));
	}
	//29. Write a Java program to convert all the characters in a string to lowercase.
	
	public static void lowerString(String s1){
		
		System.out.println(s1.toLowerCase());
		}
	
	//28. Write a Java program to create a character array containing the contents of a string.
	public static void stringCharArray(String s1){
		
		char[] char_array= s1.toCharArray();
		
		System.out.println(char_array);
	}
	//30.Write a Java program to convert all the characters in a string to uppercase.
	public static void upperString(String s1){		
	System.out.println(s1.toUpperCase());
	}
		
	//31. Write a Java program to trim any leading or trailing whitespace from a given string.	
	public static void trimStrim(String s1){
		System.out.println(s1.trim());
	}
	
	//23. Write a Java program to find whether a region in the current string matches a region in another string.
	public static void regionMatch(){
		String s1= "je vais";
		String s2= "vais je";
		//System.out.println(s1.substring(0, 2));
		//22. Write a java program to get the length of a given string.
	//	System.out.println(s2.length());;
		//System.out.println(s1.regionMatches(0, s2,5, 2));
	}
	public static void main(String[] args) {
		//regionMatch();
		 String s1 = "kouame";
		 String s2="ode";
		 String s3="Kouame";
		 
		 substringRegex();
	//	stringCharArray(s1);
		//lowerString("je vais a ala maison");

//		upperString("je vais a ala maison");
		
	//	trimStrim("    je vais a la maison");
		//currentDate();
		
		 //13. Write a Java program to check whether two String objects contain the same data.
		// System.out.println(s1.equals(s3));
		 
		// 14. Write a Java program to compare a given string to another string, ignoring case considerations.
		// System.out.println(s1.equalsIgnoreCase(s3));
		 
		 //arrayString();
		    //System.out.println(name.charAt(2));
	//charAt(s1, 2 );
	//UnicodeChar(s1, 1);
	//UnicodeCharBef(s1, 4);
		//System.out.println(s1.codePointCount(1, 3));
		//Write a java program to compare two strings lexicographically.
		//	stringLexiCompare("J'ai faim deh", "j'ai faim deh");

	//stringLexiCompareIgnorecase("J'ai faim deh", "j'ai faim deh");
		// ConcatStringEnd(s1, s2);
		// stringChar(s1, "oua");
		//compareStringChar("j'ai faim deh", "j'ai faim deh");
		// compareStrSb(s1);
	
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
