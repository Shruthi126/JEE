package queue;

import java.util.LinkedList;

public class QueuewithLL2 {
	
	private LinkedList<Integer> ll;
	
	public QueuewithLL2() {
		ll= new LinkedList<Integer>();
	}
	public void add(Integer a){
		ll.addFirst(a);
	}
	//QUEUE the key is to add and remove from the different end. addFirst and removeLast  OR addLast removeFirst
	public Integer remove() throws Exception{
		if(!ll.isEmpty())
			return ll.removeLast();//This is method of LL and not list
		else
			throw new Exception("Queue is empty");
	}

}
