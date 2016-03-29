package Heap;

public class Main {


	public static void main(String[] args) {
		ArrayHeap heap = new ArrayHeap();
		heap.insert(1);
		heap.insert(5);
		heap.insert(6);
		heap.insert(9);
		heap.insert(3);
		heap.insert(2);
	
		
		
		heap.printHeap();
		
		System.out.println("\nDeleting minimum element");
		System.out.println(heap.deleteMin());
		
		System.out.println();
		heap.printHeap();
		

		
	}
	
	
	
}
