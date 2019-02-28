package training;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		//1. Write a Java program to sort a numeric array and a string array.
	/*	String [] name= new String[]{"ode", "aka", "ble"};
		System.out.println("original string array is : " + Arrays.toString(name));
		Arrays.sort(name);
	
		System.out.println("sorted string array is : " + Arrays.toString(name));*/
		int [] age= new int[]{12, 34, 11, 5, 83, 89};
		//System.out.println("original string array is : " + Arrays.toString(age));
		Arrays.sort(age);
	
		//System.out.println("sorted string array is : " + Arrays.toString(age));
		
		//2. Write a Java program to sum values of an array
		int sum= 0;
		/*for(int i:age){
			sum+=i;*/
		for (int i=0; i<age.length; i++){
			sum=sum +age[i];
		}
	/*	System.out.println(sum);
		//4.Write a Java program to calculate the average value of array elements.
		double avg= sum/age.length;
		System.out.println(avg);*/
		//5. Write a Java program to test if an array contains a specific value.
		boolean result= Arrays.asList(age).contains(89);
		System.out.println(result);
		
		//11. Write a Java program to reverse an array of integer values.
		
		//17. Write a Java program to find the second largest element in an array.
		
		//18. Write a Java program to find the second smallest element in an array.
		
		//22. Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
		
	}
}
				
