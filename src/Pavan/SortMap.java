package Pavan;
import java.util.*;
import java.util.Map.Entry;
public class SortMap {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map = new TreeMap<String,Integer>();
		
		map.put("p", 121);
		map.put("j", 131);
		map.put("k", 111);
		
		System.out.println(map);
		
		ArrayList<Map.Entry<String, Integer>> li = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String,Integer>>() {
			
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		};
		
		Collections.sort(li, comp);
		
		System.out.println(li);
	}
	

}
