package HomeWork1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.URL;
import java.util.Arrays;

public class Problem1 {

	
	public static void main(String[] args) throws IOException {
		
		  BufferedReader keyboard;
		    String inputLine;

		    keyboard = new BufferedReader(new InputStreamReader(System.in));

		    System.out.print("Please enter the name of a company (without spaces): ");
		    System.out.flush();        /* Make sure the line is printed immediately. */
		    inputLine = keyboard.readLine();

		    /* Replace this comment with your solution.  */
		    URL u = new URL("http://www." + inputLine + ".com");
		    InputStream ins = u.openStream();
		    InputStreamReader isr = new InputStreamReader(ins);
		    BufferedReader website = new BufferedReader(isr);

		    String[] foo = new String[5];

		    for(int i = 0; i < 5; i++) {
		     foo[i] = website.readLine();
		    }

		    /* Prints the results in reverse */

		    for(int i = foo.length; i > 0; i--) {
		     System.out.println(foo[i-1]);
		    }
		  }
}
