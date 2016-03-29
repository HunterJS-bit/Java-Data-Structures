package Treepart2;

public class BinaryTree {

	
	public Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	public BinaryTree(Node n) {
		root = n;
	}
	
	public boolean isEmpty(){
		return root==null;
	}
	
	public Node getRoot(){
		return root;
	}
	
	public void setRoot(Node n){
		this.root = n;
	}
	public void preorder(){
		preorder(this.root);
	}
	
	public void preorder(Node n){
		if(n==null)
			return;
		System.out.println(n.data);
		preorder(n.leftNode);
		preorder(n.rightNode);
	}
	
	
	
	public void inOrder(){
		inOrder(this.root);
	}
	
	public void inOrder(Node n){
		if(n==null)
			return;
		
		inOrder(n.leftNode);
		System.out.println(n.data);
		inOrder(n.rightNode);
	}
	
	
	public void postOrder(){
		inOrder(this.root);
	}
	
	public void postOrder(Node n){
		if(n==null)
			return;
		
		postOrder(n.leftNode);
		System.out.println(n.data);
		postOrder(n.rightNode);
	}
	
	
	public void height(){
		int height = heightOfTree(this.root);
		System.out.println(height);
	}
	
	
	public int heightOfTree(Node n){
		if(n==null)
			return 0;
		else{
			return Math.max(1+heightOfTree(n.leftNode),1+heightOfTree(n.rightNode));
		}
	}

}
