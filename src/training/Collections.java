package training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Collections {
	
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> studentG = new HashMap<Integer, String>();
		studentG.put(1, "Kouame");
		studentG.put(2, "ode");
		studentG.put(3, "Marie");
		studentG.put(4, "Louise");
		//when you add entry with the same key, it override the previous entry
		studentG.put(3, "Ml");
		//duplicate value not allowed
		studentG.put(4, "Louise");


		
		studentG.get(2);
		studentG.get(4);
		//get the set of entry of the map
		
	//	for(Map.Entry <Integer, String> m: studentG.entrySet()){
			for(Map.Entry  m: studentG.entrySet()){//return type is map of entry

			System.out.println( "the key is " + m.getKey() + " the value is :" + m.getValue());
			
		}
			
			//insertion order is not maintained in hashmap
			
			//non generic example
			
		/*	Map studentG = new HashMap();
			studentG.put(1, "Kouame");
			studentG.put(2, "ode");
			studentG.put(3, "Marie");
			studentG.put(4, "Louise");*/
			//when you add entry with the same key, it override the previous entry
			studentG.put(3, "Ml");
			//duplicate value not allowed
			studentG.put(4, "Louise");
			//we can add any type of key/value pair in the non generic map
			studentG.put("Test", "ode");
			
			//for(Map.Entry m: studentG.entrySet()){ this doesn't work, type mismatch : cannot convert from object to map
			
			Set set= studentG.entrySet();// we are converting to Set so we can iterate or traverse
			Iterator itr=  set.iterator();//Returns an iterator over the elements in this set
				while(itr.hasNext()){
					Map.Entry entry= (Map.Entry) itr.next();//we are converting to map enrry so that we can get k,v pair
					System.out.println(entry.getKey() + " " +  entry.getValue());
				
		
		
		//LInkedHashset to maintain insertion order
		
		Map<Integer, String> studentG = new HashMap<Integer, String>();
		studentG.put(6, "eby");//inserted last
		studentG.put(1, "Kouame");
		studentG.put(11, "mavalue");
		studentG.put(3, "Marie");
		studentG.put(2, "ode");
		
		studentG.put(4, "Louise");
		//when you add entry with the same key, it override the previous entry
		studentG.put(3, "Ml");
		//duplicate value not allowed
		studentG.put(4, "Louise");
		studentG.put(10, "aka");


		//get the set of entry of the map
		
	//	for(Map.Entry <Integer, String> m: studentG.entrySet()){
			for(Map.Entry  m: studentG.entrySet()){//return type is map of entry

			System.out.println( "the key is " + m.getKey() + " the value is :" + m.getValue());
			
		}
		
		
		//TreeMap sort key in numeric order (1, 2, 3) in ascending order
		
				Map<Integer, String> studentG = new TreeMap<Integer, String>();
				studentG.put(6, "eby");//inserted last
				studentG.put(1, "Kouame");
				studentG.put(3, "Marie");
				studentG.put(2, "ode");
				
				studentG.put(4, "Louise");
				//when you add entry with the same key, it override the previous entry
				studentG.put(3, "Ml");
				//duplicate value not allowed
				studentG.put(4, "Louise");


				//get the set of entry of the map
				
			//	for(Map.Entry <Integer, String> m: studentG.entrySet()){
					for(Map.Entry  m: studentG.entrySet()){//return type is map of entry

					System.out.println( "the key is " + m.getKey() + " the value is :" + m.getValue());
					
				}
			
			}
				
		
	/*	int ar[] = {2,  8, 5, 9};
		
	System.out.println(Arrays.toString(ar));
	//System.out.println();
*/	}


