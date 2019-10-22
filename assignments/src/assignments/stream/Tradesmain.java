package assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tradesmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Trades> rv3=new ArrayList<>();
		rv3.add(new Trades("ram", "nizambad"));
		rv3.add(new Trades("remo","Pune"));
		rv3.add(new Trades("sunny", "warangal"));
		rv3.add(new Trades("srinu", "Pune"));
		rv3.add(new Trades("phani", "kakinada"));
		rv3.add(new Trades("jagan", "Indore"));
		rv3.add(new Trades("vamshi", "Pune"));
		rv3.add(new Trades("suresh", "Indore"));
		System.out.println("unique cities where traders work");
		List<String> names=rv3.stream()
				.map(Trades::getCity)
				.distinct()
				.collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("traders from pune");
		List<Trades> names1=rv3.stream()
				.filter(p->p.getCity()=="Pune")
				.sorted(Comparator.comparing(Trades::getName))
				.collect(Collectors.toList());
		names1.forEach(System.out::println);
		
		System.out.println("all traders ");
		
		List<Trades> names2=rv3.stream()
				.sorted(Comparator.comparing(Trades::getName))
				.collect(Collectors.toList());
		String S=names2.stream()
				.map(Trades::getName)
				.collect(Collectors.joining(", "));
		System.out.println(S);
		
		
		System.out.println("traders based in indore");
	
		List<String> names3=rv3.stream()
				.filter(p->p.getCity()=="Indore")
				.map(Trades::getName)
				.collect(Collectors.toList());
		names3.forEach(System.out::println);
		
		
		
		
	}

	}


