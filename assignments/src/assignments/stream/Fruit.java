package assignments;

public class Fruit {
	 String name; 
     String color; 
     int calories; 
     int price;
     
		public Fruit(String name, int calories, int price,String color) {
			super();
			this.name = name;
			this.calories = calories;
			this.price = price;
			this.color = color;
		}
		public String getname() {
			return name;
		}
		public String getColor() {
			return color;
		}
		public int getCalories() {
			return calories;
		}
		public int getPrice() {
			return price;
		}
}
