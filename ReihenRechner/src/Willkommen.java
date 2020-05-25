
import java.io.Console;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;

public class Willkommen {
	
	public void login(){
		Scanner input = new Scanner(System.in);

	    String username;
	    String password;

	    System.out.println("Einloggen: ");
	    time();
	    System.out.println("Benutzername: ");
	    username = input.next();
	    time();
	    System.out.println("Passwort: ");
	    password = input.next();
	    time();
	    //users check = new users(username, password);

	    if(username.equals("Ivy") && password.equals("Sternchen")) { 
	        System.out.println("Herzlich Willkommen " + username);
	    } else {
	    	System.err.println("\nFalsche Benutzerdaten\n\n\n");
	    	time();
	    	login();
	    	
	    	
	    }
	

}
		
		
		
		
	
		private void time() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			  }
		}
		
}