package assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("ram","hyderabad");
		map.put("sunny","warangal");
		map.put("hunny","hanamkonda");
		map.put("sai","andhrapradesh");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=map.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		

	}

}
