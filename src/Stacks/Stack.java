package Stacks;

public class Stack {

	
	
	int size;
	Node head;
	
	public Stack(){
		this.size = 0;
		this.head = null;
	}
	
	public void push(int data){
		
		if(this.size==0){
			Node n = new Node(data, null);
			head = n;
			this.size++;
		}
		else{
			Node n = head;
			
			head = new Node(data, n);
			this.size++;
		}
		
		
		
	}
	
	
	public int getSize(){
		return this.size;
	}
	
	
	
	public boolean isEmpty(){
		return this.size == 0;
	}
	
	
	
	public void pop(){
		
		if(this.size==0){
			System.out.println("Error stack is already empty");
		}else{
			
			
			Node n = head.next;
			head = n;
			
			this.size--;
			
		}
		
		
	}
	
	
	
	public void printStack(){
		
		
		Node n = head;
		
		while(n!=null){
			System.out.print(n.data+",");
			n=n.next;
		}
		System.out.println();
		
	}
}
