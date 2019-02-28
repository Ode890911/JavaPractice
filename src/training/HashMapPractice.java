package training;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	
	//public static HashMap<Integer, String> monthYear(){
		/*HashMap<Integer, String>Months = new HashMap<Integer, String>();
		
		Months.put(1, "January");
		Months.put(2, "febraury");
		Months.put(2, "march");
		Months.put(4, "April");
		Months.put(5, "May");
		
		Months.replace(4, "September");
		return Months;
		*/
		
	//}

	public static void main(String[] args) {
		HashMap<Integer, Customers> data = new HashMap<Integer, Customers>();
		data.put(1, new Customers(21, "ode", 22304));
		data.put(2, new Customers(12, "aaron", 22354));
		data.put(3, new Customers(46, "eby", 22103));
		for (Map.Entry<Integer, Customers> entry: data.entrySet()){
			//get the value from the map
			Customers c = entry.getValue();
			// from the customer object I print the customer object
			
		System.out.println(entry.getKey() + " " + c.getAge() + " "+ c.getName() + " " + c.getZipcode());
	

	
		}
	}


}