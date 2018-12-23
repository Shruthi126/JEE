package linkedlist;

public class SingleLinkedList {
	private Node<Integer> first;
	
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void insertFirst(Integer data){
		Node<Integer> newNode= new Node<Integer>();
		newNode.setData(data);
		newNode.setNext(first);
		first=newNode;
	}
	public Node<Integer> deleteFirst(){
		Node<Integer> temp = first;
		first=first.getNext();
		return temp;
	}
	
	public void insertLast(Integer data){
		Node<Integer> newNode= new Node<Integer>();
		newNode.setData(data);
		newNode.setNext(null);
		Node<Integer> temp= first;
		
		while(temp.getNext()!=null){
			temp=temp.getNext();
		}
		temp.setNext(newNode);
	}
	
	public void reverse(){
		Node<Integer> nextNode,prevNode=null;
		Node<Integer> current=first;
		while(null!=current){
			nextNode=current.getNext();
			current.setNext(prevNode);
			prevNode=current;
			current=nextNode;
		}
		first=prevNode;
	}
	
	
	public void display(){
		Node<Integer> node=first;
		while(null!=node){
			node.displayNode();
			node= node.getNext();
		}
	}

}
