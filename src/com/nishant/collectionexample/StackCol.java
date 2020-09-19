package com.nishant.collectionexample;

import java.util.Iterator;
import java.util.Stack;

/**
 * The stack is the subclass of Vector. It implements the last-in-first-out data
 * structure, i.e., Stack. The stack contains all of the methods of Vector class
 * and also provides its methods like boolean push(), boolean peek(), boolean
 * push(object o), which defines its properties.
 *
 */
public class StackCol {

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Nishant");
		st.push("KKr");
		st.push("Arshad");
		st.push("Ankit");
		st.push("Susu");
		st.push("Divya");

		Iterator<String> itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
