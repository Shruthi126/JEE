package binary.search.tree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
	private BNode<Integer> root;
	
	
	public boolean isBST(){
		
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	
	private boolean isBST(BNode<Integer> node,Integer min, Integer max){
		boolean rightBST=false,leftBST=false;
		if(node.getValue()<max && node.getValue()>=min){
			if(node.getRightChild()!=null)
				rightBST=isBST(node.getRightChild(),node.getValue(),max);
			else{
				rightBST=true;
			}
			if(node.getLeftChild()!=null)
					leftBST=isBST(node.getLeftChild(),min,node.getValue());
			else
				leftBST=true;
		}else
			return false;
		
		return rightBST&&leftBST;
		
	}

	public void insert(int key,Integer value){
		BNode<Integer> newNode= new BNode<Integer>(key,value);

		if(root==null){
			root=newNode;
		}else{
			//Nodes present, So checking vacant position for adding new Node in sequential fashion by adding present ones to queue
			 Queue<BNode> q = new LinkedList<BNode>();
			 q.add(root);
			 while(!q.isEmpty()){
				 BNode node = q.poll();
				 if(node.getLeftChild()!=null && node.getRightChild()!=null){
					 q.add(node.getLeftChild());
					 q.add(node.getRightChild());
					}else{
						 if(node.getLeftChild()==null){
							 node.setLeftChild(newNode);
						 }else{
							 node.setRightChild(newNode);
						 }
						 //breaking out once it is added to vacant position.
						 break;
					}
		     }
	    }
	}
}
