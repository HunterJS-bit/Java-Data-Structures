package HashTable;

public class HashTable {

	
	int size;
	HashEntry [] arr;
	int sizeOfArray;
	
	
	public HashTable(int sizeOfArray) {
		this.sizeOfArray = sizeOfArray;
		arr = new HashEntry[sizeOfArray];
		size = 0;
	}
	
	
	public void emptyArray(){
		this.size = 0;
		
		for(int i = 0;i<this.sizeOfArray;i++){
			arr[i] = null;
		}
	}
	public boolean isEmpty(){
		return size>0;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int hashFunction(String key){
		
		int hash=0;
		
		for(int i=0;i<key.length();i++){
		  hash = 31*hash + key.charAt(i);
	}
		return hash;
	
	}
	
	
	public int compression(String key){
		int n = hashFunction(key);
		
	return n%sizeOfArray;
		
		
	}
	
	
	public void put(String key,int value){
		int i = compression(key);
		if(arr[i]==null){
		
			arr[i] = new HashEntry(key, value);
			this.size++;
		}else{
			System.out.println("there is already number");
		}
		
		
	}
	
	public void delete(String key){
		int n = compression(key);
		
		arr[n] = null;
		this.size--;
		
		
	}
	
	public int  get(String key){
		int n = compression(key);
	return arr[n].value;
	}
	
	
	
	public void printHashTable(){
	
		
		
	}
}
