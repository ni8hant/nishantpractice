package com.nishant.practice.array;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurancesOfWordsInFIle {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> words = new HashMap<>();
		countWordsFromFile("/home/nishant/Nishant.txt", words);
		System.out.println(words);
		System.out.println("*****UserinhHasp Map***");
		countWordsFromFileThroughMap("/home/nishant/Nishant.txt", words);

	}

	private static void countWordsFromFile(String fileName, Map<String, Integer> words) throws FileNotFoundException {
		Scanner file = new Scanner(new File(fileName));
		while (file.hasNext()) {
			String word = file.next();
			Integer count = words.get(word);
			
		  if (count != null) {
				count++;
			} else {
				count = 1;
			}
			words.put(word, count);

		}
		file.close();

	}
	


	private static void countWordsFromFileThroughMap(String string, Map<String, Integer> words)
			throws FileNotFoundException {
		Scanner sc = new Scanner(new File(string));
		while (sc.hasNext()) {
			String word = sc.next();
			if (words.containsKey(word)) {
				Integer count = words.get(word);
				words.put(word, count);
			} else {
				words.put(word, 1);
			}
		}
		sc.close();
		for (Map.Entry<String, Integer> entry : words.entrySet()) {
          System.out.println(entry);
		}

	}

}
