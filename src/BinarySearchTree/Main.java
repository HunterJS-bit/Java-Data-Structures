package BinarySearchTree;

public class Main {

	
	
	public static void main(String[] args) {
		
		BSTNode node = new BSTNode(30);
		
		BSTTree tree = new BSTTree();
		
		tree.insert(3);
		tree.insert(1);
		
		tree.insert(8);
		tree.insert(7);
		tree.insert(2);
		tree.insert(0);
		
		
		tree.printInorder();
		
	
		System.out.println("minimum value in tree "+tree.getMinValue());
		
		
		System.out.println("maximum value in tree "+tree.getMaxValue());
	
		
		
		System.out.println(tree.find(10));
		
		
		System.out.println("courrent number of nodes is "+tree.countNodes());
		
		
		tree.deleteNode(3);
		
		
	}
}
