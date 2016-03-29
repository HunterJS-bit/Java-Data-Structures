package HomeWork3;

import javax.swing.plaf.SliderUI;

import DoubleLinkedLIst.Node;

public class SList {

	

	
	private SListNode head;
	  private int size;

	  /**
	   *  SList() constructs an empty list.
	   **/

	  public SList() {
	    size = 0;
	    head = null;
	  }

	  /**
	   *  isEmpty() indicates whether the list is empty.
	   *  @return true if the list is empty, false otherwise.
	   **/

	  public boolean isEmpty() {
	    return size == 0;
	  }

	  /**
	   *  length() returns the length of this list.
	   *  @return the length of this list.
	   **/

	  public int length() {
	    return size;
	  }

	  /**
	   *  insertFront() inserts item "obj" at the beginning of this list.
	   *  @param obj the item to be inserted.
	   **/

	  public void insertFront(Object obj) {
	    head = new SListNode(obj, head);
	    size++;
	  }

	  /**
	   *  insertEnd() inserts item "obj" at the end of this list.
	   *  @param obj the item to be inserted.
	   **/

	  public void insertEnd(Object obj) {
	    if (head == null) {
	      head = new SListNode(obj);
	    } else {
	      SListNode node = head;
	      while (node.next != null) {
	        node = node.next;
	      }
	      node.next = new SListNode(obj);
	    }
	    size++;
	  }

	  /**
	   *  nth() returns the item at the specified position.  If position < 1 or
	   *  position > this.length(), null is returned.  Otherwise, the item at
	   *  position "position" is returned.  The list does not change.
	   *  @param position the desired position, from 1 to length(), in the list.
	   *  @return the item at the given position in the list.
	   **/

	  public Object nth(int position) {
	    SListNode currentNode;

	    if ((position < 1) || (head == null)) {
	      return null;
	    } else {
	      currentNode = head;
	      while (position > 1) {
	        currentNode = currentNode.next;
	        if (currentNode == null) {
	          return null;
	        }
	        position--;
	      }
	      return currentNode.item;
	    }
	  }

	  /**
	   *  squish() takes this list and, wherever two or more consecutive items are
	   *  equals(), it removes duplicate nodes so that only one consecutive copy
	   *  remains.  Hence, no two consecutive items in this list are equals() upon
	   *  completion of the procedure.
	   *
	   *  After squish() executes, the list may well be shorter than when squish()
	   *  began.  No extra items are added to make up for those removed.
	   *
	   *  For example, if the input list is [ 0 0 0 0 1 1 0 0 0 3 3 3 1 1 0 ], the
	   *  output list is [ 0 1 0 3 1 0 ].
	   *
	   *  IMPORTANT:  Be sure you use the equals() method, and not the "=="
	   *  operator, to compare items.
	   **/

	  public void squish() {
	   
		  if(head == null) {   // empty list
		      return;
		    }
		    SListNode prevNode = head;
		    SListNode currNode = head.next;
		    while (currNode != null) {
		      if (currNode.item.equals(prevNode.item)) {
		    	  
			prevNode.next = currNode.next;
		        this.size--;
		      } else {
		        prevNode = currNode;
		       
		      }
		     
		      currNode = currNode.next;
			 
		  }
	
		  
		  
		  }
		  
		
		  
		  
	
	  
	  

	 

	  public void twin() {
	   
		  
		SListNode n = head;
		  
		while(n!=null){
			SListNode na = new SListNode(n.item, n.next);
			n.next =na;
			n = n.next;
		}
		  
		
		  
	  }

	  /**
	   *  toString() converts the list to a String.
	   *  @return a String representation of the list.
	   **/

	  public String toString() {
	    int i;
	    Object obj;
	    String result = "[  ";

	    SListNode cur = head;

	    while (cur != null) {
	      obj = cur.item;
	      result = result + obj.toString() + "  ";
	      cur = cur.next;
	    }
	    result = result + "]";
	    return result;
	  }


	

	  public static void main (String[] args) {
	    
		  
		  
		
	
		SList list = new SList();
		list.insertFront(1);
		list.insertFront(1);
		list.insertFront(1);
		list.insertEnd(1);
		list.insertFront(2);
		list.insertEnd(1);
		list.insertEnd(3);
		list.insertEnd(3);
		list.insertEnd(2);
	
		  System.out.println(list.toString());
		  list.squish();
		 
		  System.out.println(list.toString());
		 
	  }

	    
	

	    

	
	
	
	
	
}
