import java.util.*;
import java.util.Map.Entry;
public class SortByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sortByValues();
	}

	private static void sortByValues() {
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("G", "Pavan");
		map.put("C","Sudheer");
		map.put("J","Priya");
		
		List<Map.Entry<String,String>> li = new ArrayList<Map.Entry<String, String>>();
		
		Comparator<Map.Entry<String,String>> comp = new Comparator<Map.Entry<String,String>>() {
			
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
			
		};
		li.addAll(map.entrySet());
		Collections.sort(li, comp);
		
		for (Entry<String, String> entry : li) {
			System.out.println(entry.getValue());
		}
		
		
		
	}

}
