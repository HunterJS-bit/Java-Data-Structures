package Heap;

public class ArrayHeap implements HeapInterface{

	
	public int [] arr;
	public int size;
	public int index;
	
	
	public ArrayHeap() {
		arr = new int[10];
		index = 0;
		size = 10;
	}
	
	
	public ArrayHeap(int size){
		this.size = size;
		arr = new int[this.size];
		index = 0;
		arr[index]= (Integer) null;
	}


	@Override
	public int getMax() {
		return this.arr[1];
	}


	@Override
	public void insert(int n) {
		
		index++;
	arr[index] = n;
	heapify(index);
		
	}


	@Override
	public int deleteMin() {
		if(index==0){
			return 0;
		}else{
			
			int min = arr[1];
			arr[1] = arr[index];
			
			arr[index] =0;
			this.index--;
			
		restoreDown(1);
			
			return min;
		}
 
	}
	
	public int size(){
		return this.index;
	}
	
	public boolean isEmpty(){
		return this.index==0;
				
	}
	
	
	

	
	
	public void heapify(int j){

		
		int parent = j/2;
		
		
		while( arr[j]<=arr[parent]){
			int temp = arr[parent];
			int temp2 = arr[j];
			arr[j]  = temp;
			arr[parent] = temp2;
			
			j = parent;
			parent = j/2;
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public void restoreDown(int i){
	int leftC = 2*i;
	int rightC = 2*i+1;
		while(arr[i]>=Math.min(arr[leftC], arr[rightC]) && leftC<index){
			int temp = Math.min(arr[leftC], arr[rightC]);
			
			if(temp==arr[leftC]){
				
				int original = arr[i];
				int temp2  = arr[leftC];
				arr[i] = temp2;
				arr[leftC] = original;
				i=leftC;
				leftC = 2*i;
				rightC = (2*i)+1;
				
			}else if(temp==arr[rightC]){
				
				int original = arr[i];
				int temp2  = arr[rightC];
				arr[i] = temp2;
				arr[rightC] = original;
				i=rightC;
				rightC = (2*i)+1;
				leftC = 2*i;
				
			}
		}
		
		
		
	}
	public void printHeap(){
		for(int i = 0;i<this.size;i++){
			System.out.print(arr[i]+",");
		}
	}
	
}
