package Queue;

public class Queue {

	
	
	public int size;
	public Node head,tail;
	
	
	public Queue(){
		this.size = 0;
		head = null;
		tail = null;
	}
	
	
	public void enqueue(int data){
		  Node node = new Node(data, null);
	        if (head == null) {
	            head = node;
	            tail = node;
	        } else {
	            tail.next = node;
	            tail = node;
	        }

	       
	        size++;
	}
	
	
	
	public int getSize(){
		return this.size;
	}
	
	
	public boolean isEmpty(){
		return this.size==0;
	}
	
	
	
	public void deaqueue(){
		
		if(this.size == 0){
			System.out.println("cannot delete queueu is empty");
		}else{
			Node n = head.getNext();
			head = n;
			this.size--;
		}
	}
	
	
	public void printQueue(){
		
		Node n = head;
		
		
		while(n!=null){
			System.out.print(n.data+",");
			n = n.next;
		}
		System.out.println();
		
	}
}
