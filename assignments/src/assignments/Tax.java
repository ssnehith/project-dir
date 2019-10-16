package assignments;

import java.util.Scanner;

public class Tax {
	 public static void main(String[] args) 
		{
		 Scanner sc=new Scanner (System.in);
		 double inc=sc.nextDouble();
		 double tax=0;

		 if(inc<=186000)
	          tax=0;
			 else if(180001<=inc&&inc<=300000)
			 tax=(inc)*0.10;
			 else if(300000<=inc&&inc<=500000)
				 tax=(inc)*0.20;
			 else if(500001<=inc&&inc<=1000000)
				 tax=(inc)*0.30;
		 if(inc<=186000)
			 System. out. println("tax payable is zero"+tax);
			 else if(180001<=inc&&inc<=300000)
				 System. out. println("tax payable is 10%"+tax);
			 else if(300000<=inc&&inc<=500000)
				 System. out. println("tax payable is 20%"+tax);
			 else if(500001<=inc&&inc<=1000000)
				 System. out. println("tax payable is 30%"+tax);
		
		}
}