package Treepart2;

public class Node {

	
	public int data;
	public Node leftNode;
	public Node rightNode;
	
	public Node(int data){
		this.data = data;
		leftNode = null;
		rightNode = null;
	}
	
	
	
	public Node(int data ,Node left,Node right){
		this.data = data;
		leftNode = left;
		rightNode = right;
	}



	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public Node getLeftNode() {
		return leftNode;
	}



	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}



	public Node getRightNode() {
		return rightNode;
	}



	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	
	
	
}
