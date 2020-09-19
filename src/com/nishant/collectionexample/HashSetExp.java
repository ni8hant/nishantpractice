package com.nishant.collectionexample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * HashSet class implements Set Interface. It represents the collection that
 * uses a hash table for storage. Hashing is used to store the elements in the
 * HashSet. It contains unique items.
 *
 */
public class HashSetExp {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("UTK");
		set.add("Nishant");
		set.add("Nishant");
		set.add("UTK");
		set.add("utk");

		System.out.println(set);
		set.remove("UTK");
		System.out.println(set);
		set.removeIf((a -> set.contains("hant")));
		System.out.println(set);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		HashSet<String> hs = new HashSet<>();
		hs.add("Paru");
		hs.add("Rupa");
		set.addAll(hs);
		System.out.println(set);
		set.removeAll(hs);
		System.out.println(set);
		set.clear();
		System.out.println(set);

	}

}
