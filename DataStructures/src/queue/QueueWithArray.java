package queue;

//Bounded Queue
public class QueueWithArray {
	private long array[];
	private int front;//Front index for element in front
	private int rear;// Index for element in back
	private int maxSize;
	private int nItems;
	
	public QueueWithArray(int maxSize){
		this.maxSize=maxSize;
		array= new long[maxSize];
		front=0;
		rear=-1;
		nItems=0;
	}

	public void insert(long value) throws Exception{
		if(isFull()){
			 throw new Exception("Queue is full");
		}
		if(isFull()){
			 rear=-1;//This implementation where it overrides the first element is "CIRCULAR QUEUE"
		}
		rear++;
		array[rear]=value;
		nItems++;
	}
	
	public long remove() throws Exception{
		if(isEmpty()){
			front=0;//We are assigning front with zero as we can utilize entire array again
			rear=-1;
			nItems=0;
			 throw new Exception("Queue is empty");
		}
		nItems--;
		return array[front++];
	}
	
	public boolean isEmpty(){
		return front==maxSize;
	}
	
	public boolean isFull(){
		return rear==maxSize-1;
	}
}
