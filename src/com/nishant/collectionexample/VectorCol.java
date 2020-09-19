package com.nishant.collectionexample;

import java.util.Iterator;
import java.util.Vector;

/**
 * 
 * Vector uses a dynamic array to store the data elements. It is similar to
 * ArrayList. However, It is synchronized and contains many methods that are not
 * the part of Collection framework.
 *
 */
public class VectorCol {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Nishant");
		v.add("Sushant");
		v.add("Shank");
		v.add("Nishant");

		System.out.println(v);

		Iterator<String> itr = v.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
