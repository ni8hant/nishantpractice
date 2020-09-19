package nishantpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GetUniqueAndCommFrmArray {

	public static void main(String[] args) {
		List<String> lst1 = Arrays.asList("a", "b", "c", "d");
		List<String> lst2 = Arrays.asList("a", "d", "e", "f", "g");
		
		List<String> list = new ArrayList<String>(lst1);
		list.addAll(lst2);
		System.out.println(list.toString());
		Set<String> result = new LinkedHashSet<>(list);
		System.out.println(result);
		
		ArrayList<String> lst3 = new ArrayList<String>(lst1);
//		System.out.println(lst3);
		lst3.retainAll(lst2);
		
		System.out.println(lst3);
	}

}
