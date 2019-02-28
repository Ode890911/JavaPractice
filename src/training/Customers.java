package training;

public class Customers {
	
	private int age;
	private String name;
	private int zipcode;
	 public Customers(int age,String name, int zipcode) {
		 this.age= age;
		 this.name= name;
		 this.zipcode= zipcode;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
