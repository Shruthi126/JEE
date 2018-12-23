package binary.search.tree;

import lombok.Data;

@Data
public class BNode<T> {

	private int key;
	private T value;
	private BNode<T> rightChild;
	private BNode<T> leftChild;
	
	public BNode (int key,T value){
		this.key=key;
		this.value=value;
	}

}
