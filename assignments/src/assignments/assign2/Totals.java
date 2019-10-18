package assign2;

public class Totals {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee rv1=new Manager();
System.out.println(rv1.salary());
Employee rv2=new Labour();
System.out.println(rv2.salary());
 int totalSalary=rv1.salary()+rv2.salary();
 System.out.println("Total salary of all employees is:"+totalSalary);
	}
}
