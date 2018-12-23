package stack;

import java.util.LinkedList;

public class StackWithLL2<T> {

	private  LinkedList<T> l; 
	  
	  public StackWithLL2() {
		l=new LinkedList<T>();
	  }
	  
	  //STACK the key is to add and remove from the same end addFirst and remove First OR addLast removeLast
	  public void push(T a){
			 l.addFirst(a); 
			 //l.addLast(a);
		  }
		  
		  public T pop() throws Exception{
			  if(!l.isEmpty())
				  //return l.removeLast()
			 return l.removeFirst();
			  else
				  throw new Exception("Stack is empty");
			
			  
		  }
}
