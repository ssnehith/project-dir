package assign2;

import java.util.HashMap;

public class Employ {
	 String name; 
	    int id; 
	      
	    Employ(String name, int id) 
	    { 
	          
	        this.name = name; 
	        this.id = id; 
	    } 
	      
	    
	    public boolean equals(Object obj) 
	    { 
	          
	    
	    if(this == obj) 
	            return true; 
	        if(obj == null || obj.getClass()!= this.getClass()) 
	            return true; 
	          
	        Employ employ = (Employ) obj; 
	          
	      
	        return (employ.name.equals(this.name)  && employ.id == this.id); 
	    } 
	    public int hashCode() 
	    { 
	        return this.id; 
	    } 
	      
	} 
	class H 
	{ 
	    public static void main (String[] args)  
	    { 
	        Employ rv1= new Employ("ram", 1); 
	        Employ rv2 = new Employ("ramu", 2); 
	          
	       HashMap<Employ, String> map = new HashMap<Employ, String>(); 
	        map.put(rv1, "remo"); 
	        map.put(rv2, "raam"); 
	          
	        for(Employ employ : map.keySet()) 
	        { 
	            System.out.println(map.get(employ).toString()); 
	        } 
	  
	    } 
}
