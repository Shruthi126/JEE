package inner.classes;

public class StaticInnerClass {

	
	private static int a= 10;
	private  int b= 20;// this cannot be accessed by static classes
	public static void main(String[] args) {		
		StaticInnerClass.InnerClassPri innerPri= new StaticInnerClass.InnerClassPri();
		StaticInnerClass.InnerClassPub innerPub= new StaticInnerClass.InnerClassPub();
		StaticInnerClass.InnerClassPro innerPro= new StaticInnerClass.InnerClassPro();
		StaticInnerClass.InnerClassDef innerDef= new StaticInnerClass.InnerClassDef();
		innerPri.getVariable();
		innerPub.getVariable();
		innerPro.getVariable();
		innerDef.getVariable();
		
		
	}
	/*And like static class methods, a static nested class 
	cannot refer directly to instance variables or methods defined in its enclosing class*/
	public static class InnerClassPub {
	       public  void getVariable(){
	    	   System.out.println(a);
	       }
	    }
		private static class InnerClassPri {
			public void getVariable(){
		    	   System.out.println(a);
		       }
	    }
		static class InnerClassDef {
			public void getVariable(){
		    	   System.out.println(a);
		       }
	    }
		protected static class InnerClassPro {
			public void getVariable(){
		    	   System.out.println(a);
		       }
	    }

}
