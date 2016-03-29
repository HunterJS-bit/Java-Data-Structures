package DoubleLinkedLIst;

public class DoublLinkedList {

	
	
	
	public Node tail;
	public Node head;
	int size;
	
	
	
	public DoublLinkedList() {
		head = new Node( 0, null, null);
		tail = new Node(0,head, null);
		this.size = 0;
		
	}
	
	
	
	public void addFirst(int data){
		Node newNode = new Node(data,null,null);
		if(size==0){
			Node n = head.getNext();
			newNode.setNext(n);
			newNode.setPrevious(head);
			head.setNext(newNode);
			tail.setPrevious(newNode);
			
			size++;
		}
		else{
		
			Node n = head.getNext();
			newNode.setNext(n);
			newNode.setPrevious(head);
			head.setNext(newNode);
			
			size++;
			
		}
		
		
	}

	
	
	
	public void addLast(int data){
		
		Node newNode = new Node(data, null, null);
		
		if(size==0){
			Node n = head.getNext();
			newNode.setNext(n);
			newNode.setPrevious(head);
			tail.setPrevious(newNode);
			head.setNext(newNode);
			
			
			size++;
		}else{
		
			Node n = tail.getPrevious();
			newNode.setNext(tail);
			newNode.setPrevious(n);
			n.setNext(newNode);
			tail.setPrevious(newNode);
			
			
			size++;
		}
		
		
	}
	
	
	
	public void removeFirst(){
		if(isEmpty()){
			System.out.println("cannot delete,list is already empty");
		}else{
		Node n = head.getNext();
		Node newNode = n.getNext();
		head.setNext(newNode);
		newNode.setPrevious(head);
		n.setPrevious(null);
		n.setNext(null);
		size--;
			
			
		}
	}
	
	
	
	public void removeLast(){
		if(isEmpty()){
			System.out.println("cannot delete,list is already empty");
		}else{
		
			Node n = tail.getPrevious();
		
			Node newLast = n.getPrevious();
			tail.setPrevious(newLast);
			newLast.setNext(tail);
			n.setNext(null);
			n.setPrevious(null);
			size--;
			
		}
	}
	
	
	
	
	
	public void addAfter(Node n,int data){

		
		
	}
	
	public void addBefore(Node n,int data){
		
	}
	
	
	public int getItem(int num){
		if(num>this.size){
		return 0;
		}else{
			Node n =head.getNext();
			for(int i = 1;i<num;i++){
				n = n.getNext();
			}
			return n.getData();
		}
			
		
		
	}
	
	public int getSize(){
	return this.size;
	}
	
	
	public boolean isEmpty(){
		return size==0;
	}
	
	
	
	public void print(){
		if(size==0){
			System.out.println("There are no elements");
		}else{
			Node n = head.getNext();
			for(int i = 0;i<size;i++){
				
				System.out.print(n.getData()+",");
				n = n.getNext();
				
			}
			
		}

}

}