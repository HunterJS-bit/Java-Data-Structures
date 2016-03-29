package Treepart2;

public class Main {

	public static void main(String[] args) {
		
		
		BinaryTree tree = new BinaryTree();
		Node n = new Node(1);
		tree.setRoot(n);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		n.setLeftNode(n2);
		n.setRightNode(n3);
		n2.setLeftNode(n4);
		n3.setRightNode(n5);
		n5.setLeftNode(n6);
		tree.preorder();
		System.out.println("-----");
		tree.inOrder();
		System.out.println("-----");
		tree.postOrder();
		
		System.out.println("---");
		
		tree.height();
		
		
	}
	
	
}
