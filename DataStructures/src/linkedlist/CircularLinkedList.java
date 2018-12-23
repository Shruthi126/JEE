package linkedlist;

public class CircularLinkedList {
	private Node<Integer> first;
	private Node<Integer> last;
	
	public CircularLinkedList(){
		first=null;
		last= null;
	}
	
	public boolean isEmpty(){
		return first==null ;
	}
	
	public void insertFirst(Integer data){
		Node<Integer> newNode= new Node<Integer>();
		newNode.setData(data);
		
		if(isEmpty()){
			last=newNode;
		}
		newNode.setNext(first);
		first=newNode;
	}
	
	public void insertLast(Integer data){
		Node<Integer> newNode= new Node<Integer>();
		newNode.setData(data);
		newNode.setNext(null);
		if(isEmpty())
			first=newNode;
		else
			last.setNext(newNode);
			
		last=newNode;
	}
	
	public Node<Integer> deleteFirst(){
		Node<Integer> temp=first;
		if(!isEmpty()){
			if(first.getNext()==null)
				last=null;
		first=first.getNext();
		}
			
		return temp;
		
	}
}

