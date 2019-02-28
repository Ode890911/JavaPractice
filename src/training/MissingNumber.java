package training;

public class MissingNumber {
	public static void main(String[] args) {
		int [] num= {3,4,5,6,8,9};
		int sum = 0;
		 for( int i=0; i<num.length; i++){
			 sum= sum + num[i];
		 }
		int sum2= 0;
		for(int j=3; j<=9; j++){
			sum2= sum2 +j;
		}
		
		int miss= sum2-sum;
		System.out.println("missing number is :" + miss);
		
		
		
			
		
		
		
		
		
		
		
		
		/*int sum = 0;
		for (int i=0; i<num.length; i++){
			sum= sum + num[i];
			
		}
		System.out.println(sum);
		
		int sum2= 0;
		for (int j= 3; j<=9; j++){
			sum2 = sum2 +  j;
							
		}
		System.out.println(sum2);
		System.out.println("missing number is :" + (sum2-sum));
		*/
		
		
		
	/*	//given an array of number
		int[] age = {12,13,14,16,17};
		//give the sum of number in array
		int sumage= 0;
		for (int i=0; i<age.length; i++){
			sumage= sumage + age[i];
			System.out.println(sumage);
		}
		
		int sum3= 0;
	for (int i=12; 1<=17; i++)
	{sum3= sum+age[i];
	System.out.println(sum3);
	System.out.println("the missimg number is :" + (sum3-sumage));	
	}
	*/
	
		
				
	}

}
