package LinkedLists;


/*
 * Implementing java Arraylist
 * 
 * 
 * 
 */
public class ArraList {

	public int size = 10; //size of array
	public int [] arr;
	public int index = 0;
	
	
	public ArraList() {
		arr = new int [10];
	}
	
	
	
	public void add(int n){
		
		if(index==size){
			int [] b = new int[size *2];
			for(int i = 0;i<arr.length;i++){
				b[i] = arr[i];
			}
			arr = b;
			size=arr.length;
		}
		arr[index] = n;
		
		index++;
		
	}
	
	
	public int get(int index) {
		
			if(index<0 || index>this.index) {
				
		
			System.out.println("Index out of bond");
			}
		return arr[index];
	}
	
	
	public int  removeElement(int n){
		if(index<0 || n>this.index){
			System.out.println("Index out of bond");
		}
		int element = arr[n];
		for(int i = n;i<this.index;i++){
			arr[i] =arr[i+1];
		}
		return element;
		
		
	}
	
	
	public int removeFirst(){
		if(index<1){
			System.out.println("Error");
		}
		int n = arr[0];
	 for(int i = 0;i<this.index;i++){
		arr[i] = arr[i+1];
	 }
	 return n;
	}
	
	
	public int removeLast(){
		if(index<1){
			System.out.println("Error");
		}
		int n = arr[index-1];
		arr[index-1] = 0;
		return n;
	}
	
	
	
	
	public void addGivenPosition(int n,int pos){
		if(pos>arr.length){
			System.out.println("Error");
		}
		if(index==size){
			int [] b = new int[size *2];
			for(int i = 0;i<arr.length;i++){
				b[i] = arr[i];
			}
			arr = b;
			size=arr.length;
		}
	
	
	for(int i = this.index;i>pos;i--){
		arr[i] = arr[i-1];
	}
	arr[pos] = n;
	index++;
	}
	
	
	
	public int returnSize(){
		return this.index;
	}
	
}
