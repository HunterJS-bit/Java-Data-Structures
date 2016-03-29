package LinkedLists;

import java.util.Arrays;

public class Main {

	
	
	
	public static void main(String[] args) {
		
	
		SList list = new SList();
	list.addLast(2);
	list.addFirst(1);
	list.addFirst(3);
	list.addLast(5);
	list.addLast(10);
	list.addLast(2);
	list.addFirst(1);
	list.addFirst(3);
	list.addLast(5);
	System.out.println(list.toString()+" and curent size is "+list.getSize());
	
		
		list.removeLast();
		
		System.out.println(list.toString()+"curent size is"+list.getSize());
	}
	
	

	
	
	
}
