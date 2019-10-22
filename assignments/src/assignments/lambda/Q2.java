package assignments;

public class Q2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface m=(price,n)->{
			if(price>(10000))
			{
			System.out.println(n);
			}
			return price;
			};
		System.out.println(m.order(9009, "Completed"));
		System.out.println(m.order(10001, "Completed"));
		System.out.println(m.order(100001, "Accepted"));
	}
	public interface myInterface {
		public int order(int price,String status);

	}
}
