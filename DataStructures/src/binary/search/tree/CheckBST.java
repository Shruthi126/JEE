package binary.search.tree;

public class CheckBST {

	public static void main(String[] args) {
		BinarySearchTree<String> bst= new BinarySearchTree<String>();
		bst.insert(30, "30");
		bst.insert(10, "10");
		bst.insert(0, "0");
		bst.insert(35, "35");
		bst.insert(32, "32");
		
/*		System.out.println(bst.getMinimum().getValue());
		System.out.println(bst.getMaximum().getValue());
		System.out.println(bst.getDepth());
		System.out.println(bst.delete(0));
		System.out.println(bst.getMinimum().getValue());
		System.out.println(bst.delete(20));*/
		bst.insert(45, "45");
		bst.insert(15, "15");
		bst.insert(14, "14");
		bst.insert(13, "13");
		//System.out.println(bst.getDepth());
		//bst.displayTree();
		
		BinarySearchTree<Integer> bst2= new BinarySearchTree<Integer>();
		
		bst2.insert(25,25 );
		bst2.insert(15,15 );
		bst2.insert(50, 50);
		bst2.insert(10, 10);
		bst2.insert(22, 22);
		bst2.insert(35,35 );
		bst2.insert(70,70 );
		bst2.insert(4,4 );
		bst2.insert(12, 12);
		bst2.insert(18,18 );
		bst2.insert(24,24 );
		bst2.insert(31, 31);
		bst2.insert(44,44 );
		bst2.insert(66,66 );
		bst2.insert(90,90 );
		System.out.println("In order traversal");
		bst2.inOrderTraversal();
		System.out.println("--------------------------------");
		System.out.println("Pre order traversal");
		bst2.preOrderTraversal();
		System.out.println("--------------------------------");
		System.out.println("Post order traversal");
		bst2.postOrderTraversal();
		
	}

}
