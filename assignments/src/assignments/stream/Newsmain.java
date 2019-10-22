package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Newsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<News> rv2=new ArrayList<>();
		rv2.add(new News(102,"abc","Election notification yet to be released ","It will release by March"));
		rv2.add(new News(103,"def","sports","IPL "));
		rv2.add(new News(103,"xyz","budget","The budget is 23LAKH CRORES"));
		rv2.add(new News(103,"def","sports","IPL "));
		rv2.add(new News(103,"xyz","budget","The budget is 23LAKH CRORES"));
		rv2.add(new News(101,"xyz","sports","First IPL match is in april"));
		rv2.add(new News(102,"abc","Election notification yet to be released ","It will release by March"));
		//->nPredicate<String> p= n->n.contentEquals("budget");
	List<News> list1=rv2.stream().filter(n->n.getComment().contains("budget")).collect(Collectors.toList());
	long l=list1.stream().count();
	System.out.println("The word budget in comments"+l);
	
	Map<Integer, List<News>> newsId1 = rv2.stream() .collect(Collectors.groupingBy(News::getNewsId)); 
	
    
    System.out.println("commentby user id wise "+newsId1);
    
	Integer count =newsId1.values().stream().mapToInt(List::size).sum();
	

	Map<Object,Long> map=rv2.stream().collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()));
 
    long maxval=(Collections.max(map.values()));
    for(Entry<Object, Long> entry:map.entrySet())
    {
    	if(entry.getValue()==maxval)
    	{
    		System.out.println("user posted max comments is :"+entry.getKey());
    	}
    }

	}

}
