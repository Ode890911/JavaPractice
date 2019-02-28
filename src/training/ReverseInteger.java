package training;

public class ReverseInteger {
	
	
	
	
	public static void main(String[] args) {
		/*String s1= "java";
		String s2="java";
		s2="naveen";*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String s2= new String("java");	//new object in heap; literal java in string pool	
		String s3= new String("java");	//new object in heap; literal java in string pool
		String s4 ="java";//no object in heap; literal java in string pool
		String s5 ="java";//no object in heap; literal java in string pool
		Boolean s6= (s2.equals(s3));
		
		
		//true or false 
		//== compare reference
		System.out.println(s2==s3);//false,  refer to 2 different new object created in heap pointing at same liteal in string pool
		System.out.println(s2.equals(s3));//equals compare literal

		System.out.println(s6);


		System.out.println(s3==s4); // false doesn't create a new object in heap //reference 

		System.out.println(s4==s5);// true point to the same strign literal
		
	
		System.out.println(s2.equals(s3));// true equals compare literal
		
		System.out.println(s3.equals(s4));//true

		System.out.println(s4.equals(s5));//true
		
		
		/*String str1 = new String("java5");
		String str2 = "java5";
				String str3 = new String(str2);
				String str4 = "java5";
				

				
				System.out.println(str1==str2);//false, new object created in heap pointing at same liteal in string pool

				System.out.println(str2==str3); //doesn't create a new object in heap //reference 

				System.out.println(str3==str4);//point to the same strign literal
				//System.out.println(str1==str3);//point to the same strign literal

				*/
				
			/*	System.out.println(str1.equals(str2));

				System.out.println(str2.equals(str3)); 

				System.out.println(str3.equals(str4));
*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	System.out.println(s3);


		//System.out.println(s2);

		/*int num = 1972;
		//initialize the reverse integer to 0
		int rev =0;
		//check if the number is #0 
		while(num!=0){//1972/197/19/1
			rev= rev*10+num%10;//0+1972/10=2 rev= 2 /2*10=20+7 rev=27/ 27*10=270+9 rev= 279/279*10 +1
			num = num/10;//197/19/1
			System.out.println(rev);
		}
		//System.out.println(rev);
*/		//System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		
				
		
				
		/*
		int distance= 124692;
		
		while(distance!=0){
			revd= revd*10 +distance%10;
			distance= distance/10;
		System.out.println(revd);
			
			
		}
		
		//by using stringbuffer and valueOf(integer)
		
		String dist= String.valueOf(distance);
	StringBuffer sb=	new StringBuffer(dist);
		System.out.println(sb.reverse());*/
	}

	
}
