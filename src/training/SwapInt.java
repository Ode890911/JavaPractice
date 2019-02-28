package training;

public class SwapInt {

	public static void main(String[] args) {
		int a = 5;
		int b= 10;
		//swaping using 3rd varieble
		/*int c;
		c=a;
		a=b;
		b=c;*/
		
		//without using  3rd variable
		/*a= a+b;//15
		b= a-b;//5
		a= a-b;//10
		
*/		
		//using *
		/* a= a*b;//50
		 b= a/b;//5
		 a= a/b; //10
*/		 
		//using xor
		
		a= a^b;
		b=a^b;
		a=a^b;
		 
		
		System.out.println(a);
		System.out.println(b);

				

	}

}
