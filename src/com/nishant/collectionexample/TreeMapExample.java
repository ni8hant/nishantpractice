package com.nishant.collectionexample;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Employ, Integer> map = new TreeMap<>();
		Employ emp1 = new Employ("Nishant", new Date());
		Employ emp2 = new Employ("UTK", new Date());

		map.put(emp1, 20001);
		map.put(emp2, 45003);

		map.get(emp1);
		emp1.getAge().setTime(12345);

		map.get(emp1);
		emp1.getAge().setTime(12345);

		for (Map.Entry<Employ, Integer> result : map.entrySet()) {
			System.out.println(result.getKey().age + " " + result.getKey().name + " " + result.getValue());
		}

//        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Employ.getName)).forEach(System.out::println);
	}

}

class Employ {
	String name;
	Date age;

	public Employ(String name, Date age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

}




