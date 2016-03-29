package Queue;

public class QueueArray {

	public int start;
	public int end;
	public int size;
	public int [] arr;
	
	
	public QueueArray(int size) {
		start = -1;
		end = 0;
		this.size = size;
		arr = new int[size];
	}
	
	
	public void enque(int data){
		if(isEmpty()){
			this.start = start+1;
			arr[start] = data;
			end++;
		}else{
			arr[end++] =data;
		}
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty cant delete");
		}else{
			arr[start] = 0;
			start++;
		}
	}
	
	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public int getSize(){
		return this.size;
	}
	
	
	public boolean isEmpty(){
		return start==-1 || start>=end;
	}
	
	public int front(){
		return arr[start];
	}
	
	public int getElement(int n){
		return arr[n]; 
	}
	
	
	public void printQueue(){
		for(int i = 0;i<this.size;i++){
			System.out.print(arr[i]+",");
		}
	}
}
