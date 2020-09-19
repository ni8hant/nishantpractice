package com.nishant.collectionexample;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapGenericExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Deeksha Bhatt");
		map.put(2, "Anjana");
		map.put(3, "Suchita Tiwari");
		map.put(4, "Kanchan");
		System.out.println(map);

		for (Map.Entry<Integer, String> a : map.entrySet()) {
			System.out.println(a.getKey() + " " + a.getValue());
		}

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);

		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "Nibi");
		hs.put(2, "Sweta");
		hs.put(3, "Rompy Bharti");
		hs.put(4, "Nikita");

		for (Map.Entry<Integer, String> res : hs.entrySet()) {
			System.out.println(res.getKey() + " " + res.getValue());
		}
		hs.put(8, "Nishant");
		for (Map.Entry<Integer, String> noDuplicate : hs.entrySet()) {
			System.out.println(noDuplicate.getKey() + " " + noDuplicate.getValue());
		}

		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(5, "Suchita");
		hashmap.put(6, "Gunja");
		hs.putAll(hashmap);
		System.out.println(hs);

		hs.remove(8);
		System.out.println(hs);
		hs.remove(4, "Nikita");
		System.out.println(hs);

		hs.replace(5, "Ganga");
		for (Map.Entry<Integer, String> ent : hs.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
		}
		hs.replaceAll((Integer, String) -> "Sweta");
		System.out.println(hs);

		HashMap<Integer, BooksPublic> books = new HashMap<>();
		BooksPublic b1 = new BooksPublic(512, "Digital Electronic", "Kharate", "Bharti Bhvan", 570);
		BooksPublic b2 = new BooksPublic(518, "Power Electronic", "Blue Whel", "KAVB", 684);

		BooksPublic b3 = new BooksPublic(1783, "Analog", "White Paper", "TMH", 1020);

		BooksPublic b4 = new BooksPublic(1895, "MAchine ", "B L Thereja", "SIT", 1750);
		books.put(101, b1);
		books.put(102, b2);
		books.put(103, b3);
		books.put(104, b4);
		for (Map.Entry<Integer, BooksPublic> bookresult : books.entrySet()) {
			int key = bookresult.getKey();
			BooksPublic b = bookresult.getValue();
//			System.out.println(key + " " + b.page + " " + b.author + " " + b.publication + b.name + " " + b.price);
			if (b.price > 600) {
				System.out.println(key + " " + b.page + " " + b.author + " " + b.publication + b.name + " " + b.price);

			}

		}
	}

}

class BooksPublic {
	int page;
	String name, author, publication;
	int price;

	public BooksPublic(int page, String name, String author, String publication, int price) {

		this.page = page;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.price = price;
	}

}
