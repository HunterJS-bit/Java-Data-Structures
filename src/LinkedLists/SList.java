package LinkedLists;

import HomeWork3.SListNode;

public class SList {

	
	public int size;
	public Node head;
	
	
	public SList() {
		this.size = 0;
		this.head = null;
	}

	

	
	
	
	public void addFirst(int item){
	Node n = new Node(item, null);
		if(head==null){
			head = n;
			size++;
		}else{
			n.setNode(head);
			head = n;
			size++;
			
		}
		
		
	}
	

			
		
		
		
	
	public void removeFirst(){
		
		if(head==null){
			System.out.println("Cannot delete list is empty");
		}else{
			Node n = head.getNode();
			head.setNode(null);
			head = n;
			size--;
		}

	}
		
		
		
		
	
	
	
	public void addLast(int item){
		Node n = new Node(item,null);
		
		if(head==null){
			head = n;
			size++;
		}else{
			Node na = head;
			
			while(na.getNode()!=null){
				
				na = na.getNode();
			}
			na.setNode(n);
			size++;
			
		}
	}
	
	
	
	public void removeLast(){
		
		if(head==null){
			System.out.println("cannot delete ,list is already empty");
		}else{
			Node n = head;
			
			for(int i = 1;i<size-1;i++){
				
				n = n.getNode();
			}
			n.setNode(null);
			size--;}
	
	}
		
	
		
		
		
		
	
	public void setInfront(Node n,int i ){
		
	}
	
	
	
	
	public void resetList(){
		
		this.head = null;
		this.size = 0;
	}
	
	
	
	
	
	
	
	public int getSize(){
		return this.size;
	}

	
	public boolean isEmpty(){
		return size==0;
	}

	  public String toString() {
		    int i;
		    Object obj;
		    String result = "[  ";

		    Node cur = head;

		    while (cur != null) {
		      obj = cur.item;
		      result = result + obj.toString() + "  ";
		      cur = cur.getNode();
		    }
		    result = result + "]";
		    return result;
		  }
	
	
	
}
