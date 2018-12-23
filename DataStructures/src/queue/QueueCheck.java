package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueCheck {

	public static void main(String[] args) throws Exception {
		
	/*Queue is an interface.LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations of java.
	The Queues which are available in java.util package are Unbounded Queues
	The Queues which are available in java.util.concurrent package are the Bounded Queues.*/
		
		Queue< Integer> q0= new LinkedList<Integer>();
		Queue< Integer> q1= new ArrayBlockingQueue<Integer>(34);
		Queue< Integer> q2= new PriorityQueue<Integer>();
		
//------------------------------------Own implementations------------------------------------------------------
		
		//Bounded Queue
		QueueWithArray qa= new QueueWithArray(5);
		
			qa.insert(5);
			qa.insert(4);
			qa.insert(15);
			qa.insert(50);
			qa.insert(56);
			
			System.out.println(qa.remove());
			System.out.println(qa.remove());
			System.out.println(qa.remove());
			System.out.println(qa.remove());
			System.out.println(qa.remove());
			//System.out.println(qa.remove());//Uncomment this to see exception
		
		//Unbounded Queue	
		QueueWithStack qs= new QueueWithStack();
			
			qs.add1(5);
			qs.add1(4);
			qs.add1(15);
			qs.add1(50);
			qs.add1(56);
			

		System.out.println(qs.remove1());
		System.out.println(qs.remove1());
		System.out.println(qs.remove1());
		System.out.println(qs.remove1());
		System.out.println(qs.remove1());
		//System.out.println(qs.remove1());//Uncomment this to see exception
		
		//Unbounded Queue
		QueueWithLL ql= new QueueWithLL();
		
			ql.add(5);
			ql.add(4);
			ql.add(15);
			ql.add(50);
			ql.add(56);
		
		System.out.println(ql.remove());
		System.out.println(ql.remove());
		System.out.println(ql.remove());
		System.out.println(ql.remove());
		System.out.println(ql.remove());
		//System.out.println(ql.remove());//Uncomment this to see exception
	}

}
