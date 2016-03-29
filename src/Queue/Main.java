package Queue;

public class Main {

	
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * Implementing Queue using linked list
		 */
		/*
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.printQueue();
		
		q.deaqueue();
		q.printQueue();
		q.enqueue(21);
		q.printQueue();
		q.deaqueue();
		q.printQueue();
		*/
		
		QueueArray arr = new QueueArray(5);
		
		arr.enque(1);
		arr.enque(3);
		arr.enque(3);
		arr.printQueue();
		System.out.println();
		arr.dequeue();
		arr.printQueue();
		System.out.println();
		arr.dequeue();
		arr.printQueue();
		System.out.println();
		arr.dequeue();
		arr.printQueue();
		System.out.println();
		arr.dequeue();
		System.out.println(arr.getStart());
		System.out.println(arr.getEnd());
		
		
		
		
	
		
		
	}
}
