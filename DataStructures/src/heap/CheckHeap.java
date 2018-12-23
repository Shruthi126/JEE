package heap;

public class CheckHeap {

	public static void main(String[] args) {
		 
		Heap heap = new Heap(7);
		heap.insert(5);
		heap.insert(3);
		heap.insert(10);
		heap.insert(12);
		heap.insert(1);
		heap.insert(11);
		heap.insert(9);
		System.out.println("------------Heap data------------");
		heap.printData();
		
		System.out.println("---Heap data after 1st removal---");
		heap.remove();
		heap.printData();
		
		System.out.println("---Heap data after 2st removal---");
		heap.remove();
		heap.printData();
		
		System.out.println("---Heap data after 3st removal---");
		heap.remove();
		heap.printData();
		
		System.out.println("---Heap data after 4st removal---");
		heap.remove();
		heap.printData();
	}

}
