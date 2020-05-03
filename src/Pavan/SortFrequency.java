
package Pavan;
import java.util.*;
import java.util.Map.Entry;
public class SortFrequency {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,2,1,3,3,5,3,2};
		freqSort(arr);
		
	}

	private static void freqSort(int[] arr) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i =0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		System.out.println(map);
		ArrayList<Map.Entry<Integer, Integer>> li = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
		
		Comparator<Map.Entry<Integer, Integer>> comp = new Comparator<Map.Entry<Integer,Integer>>() {
			
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				
				return o2.getValue().compareTo(o1.getValue());
			}
		};
		
		Collections.sort(li, comp);
		
		for(Map.Entry<Integer,Integer> map1:li) {
			for(int i=0;i<map1.getValue();i++) {
				System.out.print(map1.getKey());
			}
		}
		
	}

}
