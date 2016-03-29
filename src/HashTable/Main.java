package HashTable;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		
		
		HashTable table = new HashTable(15);
	
		table.put("marko", 10);
		table.put("msado", 5);
		table.put("joca", 23);
		int n = table.get("joca");
		System.out.println(n);
		
	}
	

}
