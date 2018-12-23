package modifiers.test2;


import modifiers.test.ModifiersCheck;
/*We need to extend the class before we use its  protected or public member variables 
 * as it is in different package */
public class Check3 extends ModifiersCheck {

	public static void main(String[] args) {
		System.out.println("b is "+b);
		//System.out.println("c is "+c); When you extend in diff package only protected,public works
		System.out.println("d is "+d);
		
	}

}
