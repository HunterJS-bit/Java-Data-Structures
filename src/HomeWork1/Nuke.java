package HomeWork1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nuke {

	
	/*
	 * Problem 2 --------- Write a program called "Nuke2.java" containing a class called Nuke2 whose main
method reads a string from the keyboard and prints the same string, with its
second character removed. (That’s character number 1, since Java numbers
characters in a string starting from zero.) In other words, after you run
"java Nuke2", if you type in the string "skin", the program will print "sin".
	 * 
	 */
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter some string");
		String s = reader.readLine();
		
		String s2 = s.charAt(0)+s.substring(2);
		System.out.println(s2);
		
		
	}
	
}

