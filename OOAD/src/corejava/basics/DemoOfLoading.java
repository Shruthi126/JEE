package corejava.basics;

public class DemoOfLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB c =new ClassB();
		new ClassB();// stsic blocks will not be called  in this call as there are loaded only once
		
	}
	
	/*They're for two very different purposes:

	* The static initializer block will be called on loading of the class, and will have no access to instance 
		variables or methods. As per @Prahalad Deshpande's comment, it is often used to create static variables.
		The non-static initializer block on the other hand is created on object construction only, will have access 
		to instance variables and methods, and (as per the important correction suggested by @EJP) will be called at
		the beginning of the constructor, after the super constructor has been called (either explicitly or implicitly) 
		and before any other subsequent constructor code is called. I've seen it used when a class has multiple 
		constructors and needs the same initialization code called for all constructors. Just as with constructors,
		you should avoid calling non-final methods in this block.
	 * The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to
	    share a block of code between multiple constructors.
	 * Gets called every time an instance of the class is constructed. The static block only gets called once, 
	    when the class itself is initialized, no matter how many objects of that type you create.
*/
	
	
	
}
