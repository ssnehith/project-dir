package assignments;

public class Trades {
	String name;
	String city;
	
	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Trades(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return "tradername=" + name + ", city=" + city ;
	}
}
