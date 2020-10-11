package nishantpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Test {
	static int a;
	int b;

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String args[]) {
		Test test = new Test(a, a);
		System.out.println(test.a + " " + test.b);
	}
}

class Test1 {

	{
		System.out.println("Inside Ananymous Block");
	}

	static {
		System.out.println("Inside Static Block");
	}

	Test1() {
		System.out.println("Inside Constructor of Class");
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		Test1 obj1 = new Test1();
	}
}

class Test2 {
	public static void main(String args[]) {
		String s = "Hello";
		s.concat(" World");
		System.out.println(s);
	}
}

class Test3 {
	public static void main(String args[]) {
		String a = new String("Hello");
		String b = "Hello";
		if (a == b) {
			System.out.println("a == b");
		}
		if (a.equals(b)) {
			System.out.println("a equals b");
		}
	}
}

class Test4 {
	public static void main(String[] args) {
		try {
			int a[] = { 1, 2, 3, 4 };
			System.out.println(a[10]);

		}
		/*
		 * Compile Time error if not maintain hierarchy
		 */
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

		catch (Exception e) {
			System.out.println("error = " + e);
		}

	}
}

class Student {
	int rollno;
	String name;

	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	public static void main(String args[]) {
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(111, "Karan");
		System.out.println(s1.equals(s2));

		Set<Student> set = new HashSet<>();

		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
	}
}

class Test5 {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.remove(10);// Index 10 out of bounds for length 3
		System.out.println(list);

	}

}

interface Animal {

}

class Dog implements Animal {

}

class Cat implements Animal {

}

class AnimalService {

	/*
	 * @Autowire Animal dog;
	 */

}
