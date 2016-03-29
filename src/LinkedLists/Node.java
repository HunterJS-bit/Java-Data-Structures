package LinkedLists;

public class Node {

	
	
	public int item;
	public Node node;
	
	
	
	public Node() {
		// TODO Auto-generated constructor stub
	}
	
    
	
	public Node(int item,Node node){
		this.item = item;
		this.node = node;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	public int getItem() {
		return item;
	}



	public void setItem(int item) {
		this.item = item;
	}



	public Node getNode() {
		return node;
	}



	public void setNode(Node node) {
		this.node = node;
	}
	
	
	
	
}
