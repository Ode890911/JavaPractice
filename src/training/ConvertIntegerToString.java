package training;

public class ConvertIntegerToString {

	public static void main(String[] args) {
		String s1= "1234";
		
		//using Integer.parseInt
		int newTring= Integer.parseInt(s1);
		//System.out.println(newTring);
		
		//using valurOf
		int newString2= Integer.valueOf(s1);
		System.out.println(newString2);

	}
	
	/*valueOf(String) method returns an object of Integer class 
	whereas the parseInt(String) method returns a primitive int value.*/

}
