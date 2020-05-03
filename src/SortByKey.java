import java.util.*;
import java.util.Map.Entry;
public class SortByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Map<String, String> hmap = new TreeMap<String,String>();
	hmap.put("G","pavan");
	hmap.put("K", "kumar");
	hmap.put("A","avan");
	hmap.put("B", "lumar");
	System.out.println(hmap);
	
	List<Map.Entry<String, String>> li = new ArrayList<Map.Entry<String, String>>(hmap.entrySet());
	
	
	Comparator<Map.Entry<String, String>> com = new Comparator<Map.Entry<String, String>>() {
		@Override
		public int compare(Entry<String, String> o1, Entry<String, String> o2) {
			// TODO Auto-generated method stub
			return o1.getValue().compareTo(o2.getValue());
		}
	};
	
	Collections.sort(li, com);
	for(Map.Entry<String, String> entry : li) {
		System.out.println(entry.getKey() +" : "+entry.getValue());
	}
	li.stream().sorted().
	}
	
	

}
