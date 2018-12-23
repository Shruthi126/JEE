package doubly.linkedlist;

public class DoubleLinkedList<T> {
	private Node<T> first;
	private Node<T> last;
	private T data;

	public boolean isEmpty(){
		return first==null;
	}

	public void insertFirst(T data){
		Node<T> newNode= new Node<T>();
		newNode.setData(data);

		if(isEmpty()){
			last= newNode;
		}else{
			first.setPrevious(newNode);
		}
		newNode.setNext(first);
		this.first=newNode;
	}
	
	public void insertLast(T data){
		Node<T> newNode= new Node<T>();
		newNode.setData(data);
		
		if(isEmpty()){
			first=newNode;
		}else{
			last.setNext(newNode);
		}
		newNode.setPrevious(last);
		last=newNode;
	}
	
	public Node<T> deleteFirst(){
		Node<T> temp= first;
		if(!isEmpty()){
			if(null==first.getNext()){//only if one element in list
				last=null;
			}else if(null==first.getNext().getNext()){ //only if two elements are in list
				last=first.getNext();
			}else{
				first.getNext().setPrevious(null);
			}
		}
		first=first.getNext();
		return temp;
		
	}
	
	public Node<T> deleteLast(){
		Node<T> temp= last;
		if(!isEmpty()){
			if(null==last.getPrevious()){
				first=null;
			}else if(null==last.getPrevious().getPrevious()){
				first=last.getPrevious();
			}else{
				last.getPrevious().setNext(null);
			}
			
			last= last.getPrevious();
		}
		
		return temp;
		
	}
	
	public boolean insertAfter(T key,T data){
		Node<T> current =first;
		if(!isEmpty()){
			while(current.getData()!=key){
				current=current.getNext();
				if(current==null)
					return false;
			}
			
		Node<T> next=current.getNext();
		
		Node<T> toBeInserted= new Node<T>();
		toBeInserted.setData(data);
		toBeInserted.setNext(next);
		toBeInserted.setPrevious(current);
			
		if(current==last)
			last=toBeInserted;
		
		current.setNext(toBeInserted);
		next.setPrevious(toBeInserted);
		return true;
		}
		return false;
	}
	
	public Node<T> delete(T key){
		Node<T> current =first;
		if(!isEmpty()){
			while(current.getData()!=key){
				current=current.getNext();
				if(current==null)
					return null;
			}
			
			Node<T> previous=current.getPrevious();
			Node<T> next= current.getNext();
			if(current==first){
				first=first.getNext();//make first.next as first as first will be deleted
			}else if(current==last){
				last=last.getPrevious();//make last.previous as last will be deleted
			}
			previous.setNext(next);
			next.setPrevious(previous);
			
			
	}
		return current;
	}

}
