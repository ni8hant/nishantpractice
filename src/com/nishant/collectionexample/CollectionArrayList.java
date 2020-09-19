package com.nishant.collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Nishant Kumar");
		list.add("Utkarsh Kumar");
		list.add("Suchi");
		list.add("golu");
		list.add("apple");
		list.add("Utkarsh Kumar");

		System.out.println(list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("Index 1 element : " + list.get(1));
		System.out.println("Index set element at index 1 : " + list.set(1, "Partap Sing"));
		// For each loop Iteration
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("Size of array List :- " + list.size());
		System.out.println("CHeck Array is empty :- " + list.isEmpty());

		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("After Sorting :- " + list.get(i));
		}
		System.out.println("***********Using lemda expression**************");
		list.forEach(a -> {
			System.out.println(a);
		});

		System.out.println("*********Traversing list through forEachRemaining() method:********");
		Iterator<String> itr2 = list.iterator();
		itr2.forEachRemaining(a -> {
			System.out.println(a);
		});

		// Object set example
		Student s1 = new Student(1, "Nishant", 27);
		Student s2 = new Student(2, "Nisu", 24);
		Student s3 = new Student(3, "Kumar", 43);

		ArrayList<Student> s = new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);

		s.forEach(b -> {
			System.out.println(b.name + " " + b.age + " " + b.rollno);
		});

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");

		list.addAll(1, al2);
		System.out.println(list);

		list.remove(1);
		System.out.println(list);
		list.removeAll(al2);
		System.out.println(list);

		list.retainAll(al2);
		System.out.println(list);

		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Remove");
		al3.add("Kia hai");

		al3.removeIf(str -> str.contains("Remove")); // Here, we are using Lambda expression
		System.out.println("After invoking removeIf() method: " + al3);

		al3.clear();
		System.out.println("clear all : " + al3);

		List<Books> booklist = new ArrayList<>();
		Books books = new Books();
		books.setAuthor("Nishant Kumar");
		books.setPage(23);
		books.setBookName("Java");
		booklist.add(books);

		Books books1 = new Books();
		books1.setAuthor("UTK Kumar");
		books1.setPage(105);
		books1.setBookName("Data Structure");
		booklist.add(books1);

		booklist.forEach(bookvar -> {
			System.out.println(bookvar.getAuthor() + " " + bookvar.getBookname() + " " + bookvar.getPage());
		});
	}

}

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class Books {
	private String bookname;
	private String author;
	private int page;

	public String getBookname() {
		return bookname;
	}

	public void setBookName(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}
