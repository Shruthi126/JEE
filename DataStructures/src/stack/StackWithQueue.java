package stack;

import java.util.LinkedList;
import java.util.Queue;

//stack pop ie inturn queue poll from q2
public class StackWithQueue<T> {
	
	private Queue<T> q1;
	private Queue<T> q2;
	
	public StackWithQueue() {
		q1= new LinkedList<T>();
		q2= new LinkedList<T>();
	}
	 public void push(T a){
		 q1.offer(a);
	 }
	 
	 public T pop() throws Exception{
		 while(!q1.isEmpty()){
			 q2.offer(q1.poll());
		 }
		 if(q2.poll()!=null)
		return q2.poll() ;
		else
			throw new Exception("Stack is empty");
	 }
	 
	 
	 public void push1(T a){
		while(!q2.isEmpty()){
			q1.offer(q2.poll());
		}
		q1.offer(a);
		while(!q1.isEmpty()){
			q2.offer(q1.poll());
		}
	 }
	 
	 public T pop1() throws Exception{
		 if(!q2.isEmpty()){
			 return q2.poll();
		 }else{
			 throw new Exception("Stack is empty");
		 }
		 
		
		 
	 }
}
