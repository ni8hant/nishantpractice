package nishantpractice;

import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String[] arr1 = { "a", "b", "c", "d" };
		String[] arr2 = { "a", "d", "d", "e", "f" };
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < arr1.length; i++) {
			list.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			list.add(arr2[i]);
		}

		HashMap<String, Integer> map = new HashMap<>();

		for (int j = 0; j < list.size(); j++) {
			if (map.containsKey(list.get(j))) {
				int count = map.get(list.get(j));
				map.put(list.get(j), ++count);
			} else {
				map.put(list.get(j), 1);
			}
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int value = entry.getValue();
			if (value > 1) {
				System.out.println(entry.getKey());
			}

		}

		Set<String> result = new HashSet<String>(list);
		System.out.println(result);

		

	}
}
