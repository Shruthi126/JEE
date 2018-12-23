package inner.classes;

public class NonStaticInnerClass {
	private static int a= 10;
	private  int b= 10;
	/* Non-static nested classes (inner classes) have access to other members of the enclosing class, 
	even if they are declared private*/
	/*An instance of InnerClass can exist only within an instance of OuterClass and has direct access to the methods and fields of its enclosing instance.
		To instantiate an inner class, you must first instantiate the outer class. Then, create the inner object within the outer object with this syntax:
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		*/
	
	
	public static void main(String args[]){
		NonStaticInnerClass outerObj= new NonStaticInnerClass();
		NonStaticInnerClass.InnerClassPub innerPub= outerObj.new InnerClassPub();
		innerPub.getVariable();
		
		NonStaticInnerClass.InnerClassPri innePri= outerObj.new InnerClassPri();
		innePri.getVariable();

		NonStaticInnerClass.InnerClassDef innerDef= outerObj.new InnerClassDef();
		innerDef.getVariable();
		
		NonStaticInnerClass.InnerClassPro innerPro= outerObj.new InnerClassPro();
		innerPro.getVariable();
		
		
	}
	
	
	public class InnerClassPub {
		public final static int f=10;
		public int g;
       public void getVariable(){
    	   System.out.println(a+b);
       }
    }
	private class InnerClassPri {
		
		public  void getVariable(){
	    	   System.out.println(a+b);
	       }
    }
	class InnerClassDef {
		public void getVariable(){
	    	   System.out.println(a+b);
	       }
    }
	protected class InnerClassPro {
		public void getVariable(){
	    	   System.out.println(a+b);
	       }
    }

}
