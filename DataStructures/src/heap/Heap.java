package heap;

import java.util.Arrays;

import lombok.Data;

public class Heap {
	
	@Data 
	private static class HNode{
		private int value;
		public HNode(int value) {
			super();
			this.value = value;
		}
	} 
	
	private HNode[] heapArray;
	private int maxSize ;
	private int currentSize;
	
	public Heap(int size){
		this.currentSize=0;
		this.maxSize=size;
		heapArray=new HNode[size];//creates array with mentioned size
	}
 
	public boolean isEmpty(){
		return currentSize==0;
	}
	
	public int getsize(){
		return currentSize;
	}
	
	public boolean insert(int key){
		//Always element is added to the end of array if size has not been exceeded
		if(currentSize==maxSize)
			return false;
			
		HNode newNode= new HNode(key);
		heapArray[currentSize]= newNode;
		
		trickleUp(currentSize);
		currentSize++;
		return true;
	}

	/*Once node is inserted, trickling up is required for proper placement of values*/
	private void trickleUp(int childIndex) {
		
		int parentIndex=(childIndex-1)/2;
		HNode nodeToInsert=heapArray[childIndex];
		
		while( childIndex>0 && heapArray[parentIndex].getValue()<nodeToInsert.getValue()){
			heapArray[childIndex]=heapArray[parentIndex];
			
			childIndex=parentIndex;
			parentIndex=(childIndex-1)/2;
		}	
		
		heapArray[childIndex]=nodeToInsert;
	}
	
	public void printData(){
		Arrays.asList(heapArray).stream().filter(a->a!=null).forEach(a->System.out.println(a.getValue()));
	}
	
	public void printDiagrmatically(){
		
		int level=(int) (Math.log(currentSize) / Math.log(2));
		for(int i=level;i>0;i--){
			for(int j=0;j<Math.pow(2, i);j++){
				System.out.println("\t");
			}
			
		}
		
	}
	
	
	public HNode remove(){
		//Always root element or zeroth element is removed.
		HNode rootNode=heapArray[0];
		currentSize--;
		heapArray[0]=heapArray[currentSize];//Placing the last element in the root place and then trickling down
		heapArray[currentSize]=null;
		trickleDown(0);
		
		return rootNode;
	}

	private void trickleDown(int parent) {
		int largerChild;
		HNode top=heapArray[0];
		
		//will run as long as parent has one child
		while(parent<currentSize/2){ 
			int leftChild=2*parent+1;
			int rightChild=leftChild+1;
			
			if(rightChild<currentSize&&heapArray[rightChild].getValue()>heapArray[leftChild].getValue())
				largerChild=rightChild;
			else 
				largerChild=leftChild;
			
			if(top.getValue()>=heapArray[largerChild].getValue()){ 
				//root is made the largest.
				break;
			}
			heapArray[parent]=heapArray[largerChild];
			parent=largerChild;
			
		}
		heapArray[parent]=top; //At last we will place last element which was in first place
		
	}
}


