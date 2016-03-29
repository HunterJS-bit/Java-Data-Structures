package Stacks;

import java.util.Stack;

public class DijekstraInterpreter {

	
	Stack<String> expresion;
	Stack<Integer> values;
	
	
	public DijekstraInterpreter(){
		expresion = new Stack<String>();
		values = new Stack<Integer>();
	}
	
	
	public void interpreter(String word){
		
		
		String [] arr = word.split("");
		
		for(String s:arr){
			if(isNumeric(s)){
				values.push(Integer.valueOf(s));
			}
			if(s.equals("(")){
				
			}else if(s.equals("+")){
				expresion.push(s);
			}else if(s.equals(")")){
				int n = values.pop();
				int n2 = values.pop();
				String some = expresion.pop();
				values.push(n+n2);
			}
			
			
		}
		
	System.out.println(values.pop());
		
	}
	
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	
	
	
	
}
