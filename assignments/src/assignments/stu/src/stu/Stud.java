package stu;

	 
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.Set;
	import java.util.Map;
	import java.util.HashMap;
	 
	public class Stud {
	 
	    public static void main(String[] args) {
	        // TODO code application logic here
	        Scanner in = new Scanner(System.in);
	 
	        HashMap<String, String> rv1 = new HashMap<>();
	      
	        rv1.put("ram", "123456");
	        rv1.put("remo", "234567");
	        rv1.put("aparichith", "345678");
	        rv1.put("vikram", "456789");
	 
	        
	        Set entrySet = rv1.entrySet();
	 
	     
	        Iterator it = entrySet.iterator();
	 
	        System.out.println("CURRENT STUDENT PHONE NUMBER : ");
	        while (it.hasNext()) {
	            Map.Entry me = (Map.Entry) it.next();
	            System.out.println("Student name: " + me.getKey()
	                    + " ; "
	                    + " Phonenumber: " + me.getValue());
	        }
	       
	        System.out.println("Would you like to add a student?  Type YES or NO: ");
	        String a = in.next();
	 
	        if (a.equalsIgnoreCase("yes")) {
	            String b = in.nextLine();
	            System.out.println("Enter a new name: ");
	            String name = in.next();
	            System.out.println("Enter a new phone number: ");
	            String phone = in.next();
	            rv1.put(name,phone);
	        } else if (a.equalsIgnoreCase("no")) {
	        }
	 
	        System.out.println("Would you like to remove a student?  Type YES or NO: ");
	        String c = in.next();
	 
	        if (c.equalsIgnoreCase("yes")) {
	            String d = in.nextLine();
	            System.out.println("Remove a student:");
	            String name = in.next();
	            rv1.remove(name);
	        } else if (c.equalsIgnoreCase("no")) {
	 
	        }
	 
	        System.out.println("Would you like to change a phone number?  Type YES or NO: ");
	 
	        String e = in.next();
	 
	        if (c.equalsIgnoreCase("yes")) {
	            String f = in.nextLine();
	            System.out.println("Whose phone number is changed for? ");
	            String name3 = in.next();
	            System.out.println("Enter a new phone number: ");
	            String phone3 = in.next();
	            rv1.put(name3, phone3);
	        } else if (a.equalsIgnoreCase("no")) {
	 
	        }
	 
	        Iterator it1 = entrySet.iterator();
	 
	        
	        System.out.println("UPDATED STUDENT PHONE NUMBER: ");
	        while (it1.hasNext()) {
	            Map.Entry me = (Map.Entry) it1.next();
	            System.out.println("Student name: " + me.getKey()
	                    + " ; "
	                    + " Phone number: " + me.getValue());
	        }
	 
	    }
	}
