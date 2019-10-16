package assignments;

import java.util.Scanner;

public class Pr6 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		int count=0;
		 
		    System.out.println("Log in:");
		    System.out.println("username: ");
		   String username = sc.next();

		    System.out.println("password: ");
		    String password = sc.next();
		  
		    if(username.equals(username) && password.equals(password)) 
		        System.out.println("welcome"+username);
		    else if (username.equals(username)) {
		        System.out.println("Invalid Password!");
		    } else if (password.equals(password)) {
		        System.out.println("Invalid Username!");
		    }
		    else if (count>=3)
		        System.out.println("Contact admin");
		    }
	 
	 }
		   


