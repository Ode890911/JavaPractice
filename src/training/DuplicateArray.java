package training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateArray {
	public static String replaceCharAt(String s, int i, char c) {
		StringBuffer buf = new StringBuffer(s);
		buf.setCharAt(i, c);
		return buf.toString();
	}

	public static void main(String[] args) {
	
		String [] names = {"ode", "Kouame", "eby", "aka", "ode"};
		
		/*Set<String>odenum= new HashSet<String>();
			for(String name1:names){
			
			if(odenum.add(name1)==false){
				System.out.println("duplicate values is : " + name1);
				
			}
		}
		
		*/
			
		
		
		
		//find duplicates using hashset
			// we use Hashset, which is part of java collection
			//hashset accept unique value, in other owrds, duplicate are not allowed
			//I create a new object of Set
			//
		
		Set<String> SortedName= new HashSet<String>();//time complexity is O(n)
		//I start my foreach loop and create and String nme in the array
		//I itterate and put one condition
		//If trying to add string name in the hashset object and it returns false
		
		for(String name:names){
			if(SortedName.add(name)==false){// set cannot accept duplicate value
			//the moment we try to add "ode" again it will return false because the set wont add it
				//System.out.println("duplicate element is: " + name);
			}
			
			
			
			//usinf hasmap duplicate values are allowed
		/*	//Hashmap store object in key -value pair format
		// create a map object
			Map<String, Integer>NameMap= new HashMap<String, Integer>();
			
			for (String name1:names){//iterate name array
				Integer count= NameMap.get(name1);//I try to get the value into the map object. it is not in the beginning
				//System.out.println(count);
				if(count ==null){//if the value is not available, add 1
					NameMap.put(name1, 1);//put method is used to add value in hashmap
				}else{
					NameMap.put(name1, ++count);//if elem count not null, I store the value by increasing the value by 1
				}
				
				
			}
			
			System.out.println(NameMap);*/

			
			//get the value using entrySet
			
		//	Set<Entry<String, Integer>>entryset= new NameMap.entrySet();
			
			
			
			
			
			
			
			
		}
		
	}

	}


