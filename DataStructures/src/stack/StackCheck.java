package stack;

import java.util.Stack;

public class StackCheck {

		
	public static void main(String[] args) throws Exception {
		
		Stack<Integer> s= new Stack<>();
		
//------------------------------------Own implementations------------------------------------------------------
		// Bounded stack
		StackWithArray sa= new StackWithArray(5);
		sa.push('3');
		sa.push('8');
		sa.push('4');
		
		System.out.println(sa.pop());System.out.println(sa.pop());System.out.println(sa.pop());
		//System.out.println(sa.pop());
		
		//Unbounded
		StackWithLL<Double> sl= new StackWithLL<Double>();
		sl.push(89.4);
		sl.push(8d);
		sl.push(3.2);
		
		System.out.println(sl.pop());System.out.println(sl.pop());System.out.println(sl.pop());
		//System.out.println(sa.pop());
	}

}
