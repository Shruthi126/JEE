package com.java.enumer;

//Enum is final by default, so using the final keyword is superfluous.
public enum Days {
	
	MON("Monday"),TUE("Tuesday"),WED("Wednesday");
	
	
	private String x;
	private Days(String x){
		this.x=x;
	}
	
	/*public constructor is not allowed
		Think of Enums as a class with a finite number of instances. There can never be any different instances
	    beside the ones you initially declare.
	
		Thus, you cannot have a public or protected constructor, because that would allow more instances to be created.
	*/	
	
	public static void main(String args[]){
		
		System.out.println(Days.MON);
		System.out.println(Days.MON.x);
		/*Days.MON.x
		 * This is equivalent to below line. As there is no public constructor this cannot be done
		 * Days MON = new Days("Monday");
		 *  MON instance will have one field i.e x
		 *  */
		
		System.out.println(Planet.MERCURY.mass);//This is can be accessed here as it is default
		System.out.println(Planet.EARTH.radius);
	}
	
}

 enum Planet {
	 MERCURY (3.303e+23, 2.4397e6),
	    VENUS   (4.869e+24, 6.0518e6),
	    EARTH   (5.976e+24, 6.37814e6),
	    MARS    (6.421e+23, 3.3972e6),
	    JUPITER (1.9e+27,   7.1492e7),
	    SATURN  (5.688e+26, 6.0268e7),
	    URANUS  (8.686e+25, 2.5559e7),
	    NEPTUNE (1.024e+26, 2.4746e7);
    public double mass;   
     public double radius; //no private
    
    Planet(double mass,double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
public static void main(String args[]){
		
		System.out.println(Days.MON);
		//System.out.println(Days.MON.x); x is private hence it cannot be used here
		
		System.out.println(Planet.MERCURY.mass);
		System.out.println(Planet.EARTH);
	}
 }
