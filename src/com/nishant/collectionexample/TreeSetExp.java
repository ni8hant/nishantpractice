package com.nishant.collectionexample;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 * TreeSet class implements the Set interface that uses a tree for storage. Like
 * HashSet, TreeSet also contains unique elements. However, the access and
 * retrieval time of TreeSet is quite fast. The elements in TreeSet stored in
 * ascending order.
 *
 */
public class TreeSetExp {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<>();
		s.add("Nishant");
		s.add("cat");
		s.add("Amrita");
		s.add("Babu");
		s.add("Amrita");
		s.add("Babu");

		Iterator<String> str = s.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());

		}

		Iterator<String> itr = s.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");

		System.out.println("Set : " + set);
		System.out.println("Head Set : " + set.headSet("C"));
		System.out.println("Sub Set : " + set.subSet("A", "D"));
		System.out.println("Tail set : " + set.tailSet("C"));
	}

}
