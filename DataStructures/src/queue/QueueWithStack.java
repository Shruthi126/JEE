package queue;

import java.util.Stack;

//Unbounded
//queue poll/remove ie in turn stack pop from s2
public class QueueWithStack {
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2= new Stack<>();
	
	public void add(Integer a){
		s1.push(a);
	}
	
	public Integer remove() throws Exception{
		if(s2.isEmpty()){
			if(s1.empty()){
				throw new Exception("Queue is empty");
			}
			else{
				while(!s1.isEmpty()){
				s2.push(s1.pop());
				}
				
				return s2.pop();
			}
		}else{
			return s2.pop();
		}
		
		
	}
	//Second way
	public void add1(Integer a){
		while(!s2.empty()){
				s1.push(s2.pop());
			}
			s2.push(a);
			while(!s1.empty()){
				s2.push(s1.pop());
			}
		
	}
	
	public Integer remove1() throws Exception{
		if(!s2.isEmpty())
			return s2.pop();
		else
			throw new Exception("Queue is empty");

	}

}
