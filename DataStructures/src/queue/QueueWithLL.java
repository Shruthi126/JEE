package queue;

import java.util.LinkedList;

//Unbounded
public class QueueWithLL {
	private LinkedList<Integer> ll= new LinkedList<Integer>();
	private int rear;
	
	public QueueWithLL() {
		this.rear=-1;
	}
	public void add(Integer a){
		rear++;
		ll.add(a);
	}
	
	public Integer remove() throws Exception{
		if(!ll.isEmpty())
		//return ll.remove(rear);
			//OR
			return ll.removeFirst();//This is method of LL and not list
		else
			throw new Exception("Queue is empty");
	}
	
	
}
