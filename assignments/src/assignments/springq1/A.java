package assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<Integer> rv1= new ArrayList<Integer>();
		rv1.add(10);
		rv1.add(15);
		rv1.add(25);
		rv1.add(20);
		rv1.add(30);
		rv1.add(35);
		rv1.add(50);
		rv1.add(45);
		rv1.add(40);
		rv1.add(30);
		rv1.add(10);
		rv1.add(20);
		rv1.add(15);
		rv1.add(50);
		rv1.add(25);
		rv1.add(20);
		rv1.add(35);
		rv1.add(50);
		rv1.add(45);
		rv1.add(40);
		System.out.println("unsorted list is :"+rv1);
		Collections.sort(rv1);
		System.out.println("Sorted list is:"+rv1);
		try{
	         FileOutputStream fos= new FileOutputStream("C:\\A\\NumberList.txt");
	         ObjectOutputStream oos= new ObjectOutputStream(fos);
	         oos.writeObject(rv1);
	         oos.close();
	         fos.close();
	       }catch(IOException ioe){
	            ioe.printStackTrace();
	        }
		System.out.println("after serialization output is in bytes we cant read it");
		try
	       {
	            FileInputStream fis = new FileInputStream("C:\\A\\NumberList.txt");
	           ObjectInputStream ois = new ObjectInputStream(fis);
	            rv1 = (ArrayList) ois.readObject();
	            ois.close();
	            fis.close();
	         }catch(IOException ioe){
	            ioe.printStackTrace();
	             return;
	          }catch(ClassNotFoundException c){
	             System.out.println("Class not found");
	             c.printStackTrace();
	             return;
	         }
	        for(int i: rv1){
	           System.out.println(i);
	        }
	        Collections.shuffle(rv1);
	        System.out.println("repostion the elements "+rv1);
	}
}
