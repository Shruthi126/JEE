package binary.search.tree;

public class CheckBT {

	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
		bt.insert(25,25 );
		bt.insert(15,15 );
		bt.insert(50, 50);
		bt.insert(10, 10);
		bt.insert(22, 22);
		bt.insert(35,35 );
		
		System.out.println("Is the tree BST ? "+bt.isBST());
		
		BinaryTree bt2= new BinaryTree();
		bt2.insert(25,25 );
		bt2.insert(35,35 );
		bt2.insert(15,15 );
		bt2.insert(50, 50);
		bt2.insert(10, 10);
		bt2.insert(22, 22);
		
		System.out.println("Is the tree BST ? "+bt2.isBST());
	}

}
