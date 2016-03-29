package BinarySearchTree;

public class BSTNode {

	
	
	int data;
	BSTNode parent;
	BSTNode leftChild;
	BSTNode rightChild;
	
	
	public BSTNode(int data){
		this.data = data;
		leftChild = rightChild = null;
	}
	
	
	public BSTNode(int data,BSTNode left,BSTNode right){
		this.data = data;
		this.leftChild = left;
		this.rightChild = right;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public BSTNode getNodeLeft() {
		return leftChild;
	}


	public void setNodeLeft(BSTNode nodeLeft) {
		this.leftChild = nodeLeft;
	}


	public BSTNode getNodeRight() {
		return rightChild;
	}


	public void setNodeRight(BSTNode nodeRight) {
		this.rightChild = nodeRight;
	}
	
	
	
}
