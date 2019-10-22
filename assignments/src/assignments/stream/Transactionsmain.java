package assignments;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Transactionsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Transactions> rv4=new ArrayList<>();
		rv4.add(new Transactions(new Trades("akshay", "Pune"),2011,2000));
		rv4.add(new Transactions(new Trades("suresh","Hyderabad"),2012,3000));
        rv4.add(new Transactions(new Trades("terminator", "Indore"),2011,5000));
		rv4.add(new Transactions(new Trades("jade", "Pune"),2015,20000));
		rv4.add(new Transactions(new Trades("scarlet", "Indore"),2011,6000));
		rv4.add(new Transactions(new Trades("kunglao", "Delhi"),2016,8000));
		rv4.add(new Transactions(new Trades("scorpion", "Delhi"),2011,10000));
		rv4.add(new Transactions(new Trades("subzero", "Indore"),2014,1000));
		
		
		System.out.println("transcations in 2011");
		List<Transactions> trans=rv4.stream()
				.filter(p->p.getYear()==2011)
				.sorted(Comparator.comparing(Transactions::getValue))
				.collect(Collectors.toList());
		trans.forEach(System.out::println);
		
	}

	}

