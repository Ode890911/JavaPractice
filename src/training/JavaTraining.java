package training;

public class JavaTraining {
	// instance variable
	static int aaronEbby = 1;
	static int a = 9;
	static int b = 12;
	static int c = a + b;
	private int age= 12;
	private String name= "akassi";

	static int d = a + b + c;

	public String getName(){
		return name;
	}


public String setName(String name){
	return this.name=name;
}
	public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}


	static int akassiEbby = 1;
	static boolean ant= true;
	
	
	
	public static void main(String[] args) { 
	if(ant){	
	
		System.out.println("cat");
	
	}else{
		System.out.println("dog");
	}
	}
}
	/*
	 * public static void main(String[] args) { // test();//cannot call an
	 * instance method in a static area System.out.println(" c is :" + c);
	 * 
	 * System.out.println(" d is :" + d);
	 * 
	 * JavaTraining jt = new JavaTraining();// with jt, we manipulate
	 * javatrianing class // System.out.println(jt.sa);// we create new
	 * reference to manipulate or have access to the class field //JavaTraining
	 * controller;
	 * 
	 * //test(6);//static way when method is static
	 * 
	 * int value= jt.test(); //System.out.println("the value is: " + value);
	 * 
	 * } public int test(){
	 * 
	 * // System.out.println("initial value is :" + a); a++;
	 * //System.out.println("1st increment is :" + a++);
	 * //System.out.println("2nd increment is : " + a++);
	 * 
	 * return a;
	 * 
	 * 
	 * 
	 * 
	 * 
	 * //calling the instance method bark in the instance area test, direct
	 * calling }
	 * 
	 */
	
	
	


