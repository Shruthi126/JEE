package corejava.basics;

public class ClassB extends ClassA {
	
	public int j=step(8);
	private static int k=step(3);
	
	{
	step(9);
	}
	
	static {
		step(4);
		}
	
	public ClassB(){
		step(10);
	}
			/*public String  ClassB(){
			System.out.println("Class B construtor");
			return "sdf";
		}
		Constructor can never have return type*/
	
	public static int step4(int a) 
	{
		System.out.println("Step step"+a);
		return a;
	}
	

}
