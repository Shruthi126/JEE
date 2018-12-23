package stack;

import java.util.LinkedList;

public class StackWithLL<T> {
  private  LinkedList<T> l; 
  
  public StackWithLL() {
	l=new LinkedList<T>();
  }
  
  public void push(T a){
	 l.add(a); 
  }
  
  public T pop() throws Exception{
	  if(!l.isEmpty())
	 return l.removeLast();
	  else
		  throw new Exception("Stack is empty");
	
	  
  }
  
}
