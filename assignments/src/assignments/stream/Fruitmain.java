package assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruitmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruit> rv1=new ArrayList<Fruit>();
		rv1.add(new Fruit("apple",80,120,"red"));
		rv1.add(new Fruit("Banana",40,30,"Yellow"));
		rv1.add(new Fruit("mango",70,50,"yellow"));
		rv1.add(new Fruit("kiwi",200,80,"Green"));
	    rv1.add(new Fruit("Guava",130,70,"Green"));
		
		
		System.out.println("names of low calories fruits:");
		
		List<String> names=rv1.stream()
				.filter(p->p.getCalories()<100)
				.sorted(Comparator.comparing(Fruit::getCalories).reversed())
				.map(Fruit::getname)
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		
		System.out.println("color wise list of fruit names:");
		
		List<Fruit> colors=rv1.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		colors.forEach(e->System.out.println(e.getname()+"  color is: "+e.getColor()));
		
		System.out.println("RED color fruits:");
		List<String> prices=rv1.stream()
				.filter(p->p.getColor()=="Red")
				.sorted(Comparator.comparing(Fruit::getPrice))
				.map(Fruit::getname)
				.collect(Collectors.toList());
		prices.forEach(System.out::println);
		
		
}
	}


