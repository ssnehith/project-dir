package assign2;

public class Shapes {
	public static void main(String[] args) {
	Line rv1=new Line();
	Rectangle rv2=new Rectangle();
	Cube rv3=new Cube();
	rv1.draw();
	rv2.draw();
	rv3.draw();
	}
}
class Line extends Shape{
  public void draw() {
	System.out.println("line");	
	}
}
class Rectangle extends Shape{
    public void draw() {
    	System.out.println("rectangle");	
	}
}
class Cube extends Shape{
	 public void draw() {
		 System.out.println("cube");	
	}
}
abstract class Shape{
	abstract public void draw();
}