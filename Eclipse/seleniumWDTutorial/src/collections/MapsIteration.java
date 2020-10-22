package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsIteration {

	public static void main(String[] args) {
		// HashMap - Does not maintain order
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		
		hashMap.put(1, "BMW");
		hashMap.put(6, "Audi");
		hashMap.put(4, "Honda");
		
		System.out.println("Iteration 1 - Map using entrySet()");
		for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", value: " + value);
		}
		
		System.out.println("Iteration 2 - hashMap using keySet()");
		for (Integer key: hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println("Key: " + key + ", value: " + value);
		}
		
		// Maintain the order in which they are added
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		linkedMap.put(1, "BMW");
		linkedMap.put(6, "Audi");
		linkedMap.put(4, "Honda");
		
		System.out.println("Iteration 3 - linkedMap using keySet()");
		for (Integer key: linkedMap.keySet()) {
			String value = linkedMap.get(key);
			System.out.println("Key: " + key + ", value: " + value);
		}
		
		// Maintains natural sorting
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "BMW");
		treeMap.put(6, "Audi");
		treeMap.put(4, "Honda");
		
		System.out.println("Iteration 4: treeSet using keySet()");
		for(Integer key: treeMap.keySet()) {
			String value = treeMap.get(key);
			System.out.println("The key: " + key + " value: " + value);
 		}
		
	}

}
