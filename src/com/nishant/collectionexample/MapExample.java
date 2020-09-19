package com.nishant.collectionexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Non Generic
public class MapExample {

	public static void main(String[] args) {

		Map map = new HashMap<>();
		map.put(1, "NISNAT");
		map.put(2, "Sushant");
		map.put(3, "Rahul");

		System.out.println(map);

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entery = (Map.Entry) itr.next();
			System.out.println(entery.getKey() + " " + entery.getValue());

		}
	}

}
