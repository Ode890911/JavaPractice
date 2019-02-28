package training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Casting {
	public static void main(String[] args) {
		byte b = 122;
		short sh= 30567;
		char ch= "asd";
		int num= 145;
		long lg= 146789231;
		float fl= 2.6f;
		double db=2.045 ;
		
	
		
		
		/*ArrayList names = new ArrayList();
		names.add("abcd"); //adding String
		names.add(1);   //adding Integer

		String name = (String) names.get(0); //OK
		// If the object you are casting  is of different type.
		name = (String) names.get(1); // throw ClassCastException because you can not convert Integer to String
		Integer num= (Integer) names.get(1);*/
		
		//using generic
		
		Map map = new HashMap();
		map.put(1, "ode");
		map.put("as", "ode");
		map.put("eby", 3);
		/*Integer kev= (Integer)map.get(1);//class cas exception
		System.out.println(kev);*/
		//String kev= (String)
				map.get(1);
		System.out.println(map.get(1));
		
		
		
		
	}
}
		
/*HashMap<Integer, String>Months = new HashMap<Integer, String>();
		
		Months.put(1, "January");
		Months.put(2, "febraury");
		Months.put(2, "march");
		Months.put(4, "April");
		Months.put(5, "May");
		
		
		
	}

}

	
//}*/