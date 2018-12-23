package binary.search.tree;

public class BinarySearchTree<T> {
	private BNode<T> root;

	public void insert(int key,T value){
		BNode<T> newNode= new BNode<T>(key,value);

		if(root==null){
			root=newNode;
		}else{
			BNode<T> current=root;
			BNode<T> parent;

			while(current!=null){
				parent=current;
				if(key<current.getKey()){
					current=current.getLeftChild();
					if(current==null){
						parent.setLeftChild(newNode);
						return;
					}
				}else{
					current=current.getRightChild();
					if(current==null){
						parent.setRightChild(newNode);
						return;
					}
				}
			}
		}
	}

	public BNode<T> getMinimum(){
		BNode<T> current=root,left=null;

		while(current!=null){
			left=current;
			current=current.getLeftChild();
		}
		return left;

	}
	public BNode<T> getMaximum(){
		BNode<T> current=root,right=null;

		while(current!=null){
			right=current;
			current=current.getRightChild();
		}
		return right;

	}
	public boolean delete(int key){
		BNode<T> current=root,parent=root;
		boolean isRightChild=false;
		//Searching the key which has to be deleted
		while(current.getKey()!=key){
			parent=current;
			 if(current.getKey()>key){
				 isRightChild=false;
				current=current.getLeftChild();
			}else{
				isRightChild=true;
				current=current.getRightChild();
			}
			 if(current==null) return false;//Not found
		}
		
		//-----Found the node
		//Leaf node
		if(null==current.getRightChild()&& null==current.getLeftChild()){
			if(current==root)
				root=null;
			if(isRightChild)
				parent.setRightChild(null);
			else
				parent.setLeftChild(null);
		}
		//Two leaves
		else if(null!=current.getRightChild()&&null!=current.getLeftChild()){
			
			BNode<T> successor=getSuccessor(current);
			if(current==root){
				root=successor;
			}else if (isRightChild) {
				parent.setRightChild(successor);
			}else{
				parent.setLeftChild(successor);
			}
			 
		}
		//One of the leaves
		else if(null!=current.getRightChild()){
			if(current==root)
				root=current.getRightChild();
			else if(isRightChild)
				parent.setRightChild(current.getRightChild());
			else 
				parent.setLeftChild(current.getRightChild());
		}else{
			if(current==root)
				root=current.getLeftChild();
			else if(isRightChild)
				parent.setRightChild(current.getLeftChild());
			else 
				parent.setLeftChild(current.getLeftChild());
			
		}
		return true;
	}

	private BNode<T> getSuccessor(BNode<T> nodeToDelete) {
		BNode<T> successorParent=nodeToDelete,successor=nodeToDelete;
		BNode<T> current=nodeToDelete.getRightChild();
		while(current!=null){
			successorParent=successor;
			successor=current;
			current=current.getLeftChild();
		}
		
		if(successor!=nodeToDelete.getRightChild()){
			//If left most node has only right child
			successorParent.setLeftChild(successor.getRightChild());
			//This is set only to successor is not right child nodeToDelete. No need to setting in case right child is the end 
			successor.setRightChild(nodeToDelete.getRightChild());
		}
		successor.setLeftChild(current.getLeftChild());//Very important
		return successor;
	}
	
	public void displayTree(){
		int depth=getDepth(root);
		for(int i=0;i <Math.pow(2,getDepth(root)-1);i++)
			System.out.print("\t");
		System.out.println(root.getValue());
		displayTree(root,depth-1);
		
	}
	private void displayTree(BNode<T> current,int depth){
		while(null!=current || depth>0){
		/*	for(int i=0;i <Math.pow(2,depth-1);i++)
				System.out.print("\t");
			System.out.println(current.getValue());*/
			if(current.getRightChild()==null && current.getLeftChild()==null)
				return ;
			else{
				if(current.getLeftChild()!=null){
					System.out.print(current.getLeftChild().getValue());
					
				}
					
				if(current.getRightChild()!=null ){
					for(int i=0;i <Math.pow(2,depth-1);i++)
						System.out.print("\t");
					System.out.println(current.getRightChild().getValue());
					displayTree(current.getRightChild(),depth-1);
				}
				if(current.getLeftChild()!=null){
					displayTree(current.getLeftChild(),depth-1);					
				}
				if(current.getRightChild()!=null ){
					displayTree(current.getRightChild(),depth-1);
				}
					
				return ;
			}
			
		}
	
	}
	/**
	 * Get depth returns the depth of the whole tree
	 * @return 
	 * depth
	 */
	public int getDepth(){
		return getDepth(root);
	}
	/**
	 * Get Depth returns the depth of the  tree from mentioned point
	 * @return 
	 * depth
	 */
	public int getDepth(BNode<T> current){
		int maxDepth=Integer.MIN_VALUE; int rightDepth=Integer.MIN_VALUE,leftDepth=Integer.MIN_VALUE;
		while(null!=current){
			if(current.getRightChild()==null && current.getLeftChild()==null)
				return 0;
			else{
				if(current.getRightChild()!=null )
					rightDepth=1+getDepth(current.getRightChild());
				if(current.getLeftChild()!=null)
					leftDepth=1+getDepth(current.getLeftChild());
				maxDepth= rightDepth>leftDepth?rightDepth:leftDepth;
				 return maxDepth;
			}
			
		}
		return maxDepth;
	}
	
	
	private void inOrderTraversal(BNode<T> node){
		if(node!=null) { 
			if(node.getLeftChild()!=null){
			inOrderTraversal(node.getLeftChild());
			}
			System.out.println(node.getValue());
			if(node.getRightChild()!=null){
				inOrderTraversal(node.getRightChild());
			}
		}
		
	}
	
	public void inOrderTraversal(){
		if(root== null){
			System.out.println("No data in tree");
			return;
		}
		inOrderTraversal(root);
	}
	
	
	private void preOrderTraversal(BNode<T> node){
		if(node!=null) {
			System.out.println(node.getValue());
			if(node.getLeftChild()!=null){
				preOrderTraversal(node.getLeftChild());
			}
			if(node.getRightChild()!=null){
				preOrderTraversal(node.getRightChild());
			}
		}
		
	}
	
	public void preOrderTraversal(){
		if(root== null){
			System.out.println("No data in tree");
			return;
		}
		preOrderTraversal(root);
	}
	
	private void postOrderTraversal(BNode<T> node){
		if(node!=null) {
			if(node.getLeftChild()!=null){
				postOrderTraversal(node.getLeftChild());
			}
			if(node.getRightChild()!=null){
				postOrderTraversal(node.getRightChild());
			}
			System.out.println(node.getValue());
		}
		
	}
	
	public void postOrderTraversal(){
		if(root== null){
			System.out.println("No data in tree");
			return;
		}
		postOrderTraversal(root);
	}
	


}
