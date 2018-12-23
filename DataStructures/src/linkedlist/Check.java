package linkedlist;


public class Check {

	public static void main(String[] args) {
		
		Node<String> nodeA= new Node<>();
		nodeA.setData("Yayy");
		
		Node<String> nodeB= new Node<>();
		nodeB.setData("I");
		
		Node<String> nodeC= new Node<>();
		nodeC.setData("did");
		
		Node<String> nodeD= new Node<>();
		nodeD.setData("it!");
		
		nodeD.setNext(null);
		nodeC.setNext(nodeD);
		nodeB.setNext(nodeC);
		nodeA.setNext(nodeB);
		
		
		System.out.println(LLlength(nodeA));
		System.out.println(LLlength(nodeB));
		System.out.println(LLlength(nodeC));
		System.out.println(LLlength(nodeD));
	}
	
	public static int LLlength(Node node){
		int count=0;
		
		while(null!=node){
			count++;
			node=node.getNext();
		}
		
		return count;
	}
}
