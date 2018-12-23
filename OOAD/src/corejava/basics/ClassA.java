package corejava.basics;

public class ClassA {
	
	
	private int a=step(5);
	{
	step(6);
	}
	
	static {
		step(1);
		}
	private static int b=step(2);
	
	public ClassA(){
		step(7);
		
	}

	public static int step(int step) 
	{
		System.out.println("Step  "+ step);
		return step;
	}

}
