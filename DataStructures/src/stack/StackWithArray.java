package stack;

public class StackWithArray {
	private int maxSize;
	private char[] array;
	private int top;


	public StackWithArray (int maxSize){
		this.maxSize=maxSize;
		this.array= new char[maxSize];
		this.top=-1;
	}
	
	public void push(char value) throws Exception{
		if(isFull())
			throw new Exception("Stack is full. increase the size and try");
		top++;
		array[top]=value;
	}
	
	public char pop() throws Exception{
		if(isEmpty())
			throw new Exception("Stack is empty. ");
		
		return array[top--];
	}
	
	public boolean isEmpty(){
		return top == -1;
		
	}
	
	public boolean isFull(){
		return (maxSize) == top;
		
	}


}
