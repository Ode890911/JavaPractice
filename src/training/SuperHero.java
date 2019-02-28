package training;

public class SuperHero
{
	
	 private String power = ("Generic Power");
	    public void useSuperPower() {
	        System.out.println(power);
	    }
	    
	    public static void main(String[] args) {
			
	    	
	        //example 1
	        SuperHero hero = new SuperHero();
	        SuperHero hero1 = new Spiderman();
	        SuperHero hero2 = new Wolverine();

	        hero.useSuperPower();
	        hero1.useSuperPower();
	        hero2.useSuperPower();


	        //example 2
	        Spiderman test = new Spiderman();
	        Wolverine test2 = new Wolverine();

	        test.useSuperPower();
	        test2.useSuperPower();
	    }

	    
	}
	class Spiderman extends SuperHero {
	    private String power = ("Web sling!");
	    public void useSuperPower() {
	       System.out.println(power);
	   }
	}

	class Wolverine extends SuperHero {
	    private String power = ("Hack and Slash!");
	    public void useSuperPower() {
	        System.out.println(power);
	    }
	    
	}
	

