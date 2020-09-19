package nishantpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NotMatchDataFromList {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("1", "3", "3", "5");
		List<String> lst2 = Arrays.asList("1", "7");

		List<String> lst = new ArrayList<String>();
		lst.addAll(lst1);
		lst.addAll(lst2);
		System.out.println(lst);
		Collections.sort(lst);
		System.out.println(lst);
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for (int i = 0; i < lst.size(); i++) {
			if (hs.containsKey(lst.get(i))) {
				int count = hs.get(lst.get(i));
				hs.put(lst.get(i), ++count);
			} else {
				hs.put(lst.get(i), 1);
			}
		}
		List<String> ls = new ArrayList<String>();

		for (Map.Entry<String, Integer> entry : hs.entrySet()) {
			int value = entry.getValue();
			if (value == 1) {
				ls.add(entry.getKey());
			}
		}
		System.out.println(ls);
	}

}
