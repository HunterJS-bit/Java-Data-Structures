package DeQueue;

public class DeQueue {

	
	public int size;
	public Node head;
	public Node tail;
	
	
	public DeQueue() {

		this.size = 0;
		head = null;
		tail= null;
	
	}
	
	
	
	public int getSize(){
		return this.size;
	}
	
	
	public boolean isEmpty(){
		return this.size==0;
	}
	
	
	
	public int getFirst(){
		Node n = head.getNext();
		return n.data;
	}
	
	
	public int getLast(){
		Node n = tail.getPrevious();
		return n.data;
	}
	
	
	public void insertFirst(int data){
		 Node newNode=new Node(data,null,null);  
		if(getSize()==0){
			head = newNode;
			newNode.setNext(tail);
			this.size++;
		}else{
			Node m = head.getNext();
			newNode.setNext(m);
			head = newNode;
			this.size++;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void printDeQueeu(){
		Node n = head;
while(n.next!=null){
	System.out.println(n.data);
	n = n.next;
}
		
		
	}
	
	
	
	
	
}
