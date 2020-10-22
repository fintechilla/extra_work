package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		
		// HashSet - Does not maintain order
		Set<String> set = new HashSet<String>();
		set.add("VW");
		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		set.add("Honda");
		
		// System.out.println(set);
		System.out.println("HashSet - Does not maintain order");
		for (String item : set) {
			System.out.println(item);
		}
		
		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lHSet = new LinkedHashSet<String>();
		lHSet.add("VW");
		lHSet.add("BMW");
		lHSet.add("Audi");
		lHSet.add("Honda");
		System.out.println("LinkedHashSet - It maintains the order in which the elements are added");
		for (String item: lHSet) {
			System.out.println(item);
		}
		
		// TreeSet - It maintains the natural sorting 1, 2, 3... alphabetical
		Set<String> tSet = new TreeSet<String>();
		tSet.add("VW");
		tSet.add("BMW");
		tSet.add("Audi");
		tSet.add("Honda");
		System.out.println("TreeSet - It maintains the natural sorting 1, 2, 3... alphabetical");
		for (String item: tSet) {
			System.out.println(item);
		}
		
		List<String> list = new ArrayList<String>();
		
		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		list.add("Honda");
		// System.out.println(list);
		
	}

}
