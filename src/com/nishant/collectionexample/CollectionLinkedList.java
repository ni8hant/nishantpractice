package com.nishant.collectionexample;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author nishant LinkedList implements the Collection interface. It uses a
 *         doubly linked list internally to store the elements. It can store the
 *         duplicate elements. It maintains the insertion order and is not
 *         synchronized. In LinkedList, the manipulation is fast because no
 *         shifting is required.
 */

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Nishant Kumar");
		list.add("Rahul Kumar");
		list.add("Dee Bhardwaj");
		list.add("Patna");
		list.add("Dee Bhardwaj");
		list.add("Nishant Kumar");
		list.add("Rahul Kumar");

		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		LinkedList<String> ll = new LinkedList<>();
		ll.add("Duja");
		ll.add("Zoya");

		list.addAll(ll);

		list.forEach(a -> {
			System.out.println(a);
		});

		list.add(1, "Fokat");
		System.out.println(list);

		list.removeAll(ll);
		System.out.println(list);

		list.removeFirstOccurrence("Nishant Kumar");
		System.out.println(list);

		list.removeLastOccurrence("Dee Bhardwaj");
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);

		Iterator<String> it = list.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		List<BooksCls> books = new LinkedList<>();
		BooksCls b1 = new BooksCls(10, "JAVA", "Schild", "Bharti", 10);
		BooksCls b2 = new BooksCls(18, "C", "kanitkar", "TTC", 5);
		BooksCls b3 = new BooksCls(200, "Data Staructure", "CCAven", "publisher", 20);

		books.add(b1);
		books.add(b2);
		books.add(b3);

		books.forEach(count -> {
			System.out.println(count.page + " " + count.authoranme + " " + count.name + " " + count.publisher + " "
					+ count.quantity);
		});

		Collections.sort(list);
		System.out.println(list);
	}

}

class BooksCls {
	int page;
	String name, authoranme, publisher;
	int quantity;

	public BooksCls(int page, String name, String authoranme, String publisher, int quantity) {

		this.page = page;
		this.name = name;
		this.authoranme = authoranme;
		this.publisher = publisher;
		this.quantity = quantity;
	}

}
