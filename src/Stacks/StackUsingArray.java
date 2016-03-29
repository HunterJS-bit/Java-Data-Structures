package Stacks;

public class StackUsingArray {

	/*
	 * 
	 * 
	 * implement Stack using array
	 */
	
	public int [] arr;
	public int arrSize = 10;
	public int index;
	
	
	
	public StackUsingArray() {
		arr = new int[arrSize];
		index = -1;
	}
	

	
	
	public void push(int data){
		
		index++;
		arr[index] = data;
		
		
		
		
	}
	
	public void pop(){
		arr[index] = 0;
		index--;
	}
	
	public void printArray(){
		
		for(int i = 0;i<index+1;i++){
			System.out.println(arr[i]);
		}
	}
	
}
