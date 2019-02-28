package training;

public class Wrapper {
	int age= 20;
	Integer ageof= Integer.valueOf(age);
	Integer ageof1= age;
	
	int age2= ageof1.intValue();
	
	static Integer number= new Integer(20);
	
	static Integer number2= new Integer("45");
	  static Boolean real= new Boolean("real");
	  static Float fl2= new Float("2.67");
	   public static void main(String[] args) {
		System.out.println(number);
		System.out.println(number2);
		System.out.println(real);
		System.out.println(fl2);



	}

}
