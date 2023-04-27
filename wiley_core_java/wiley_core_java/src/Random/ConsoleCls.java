package Random;
 import java.io.*;
public class ConsoleCls {

	public static void main(String[] args) {
Console console = System.console();

	
		if (console == null) {
			System.out.println("Console not Available: ");
			System.exit(1);
		}
		
		String name = console.readLine("What's your name?: ");
		char[] password = console.readPassword("Enter your Password: ");
		
		console.printf("Hello %s\n",name);
		console.printf("Your Password is: %s ",new String(password));
		
	}

}
