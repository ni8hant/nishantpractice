package com.nishant.practice.array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWordCount {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> result = countWord();
		for (Map.Entry<String, Integer> entry : result.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
		}
	}

	public static Map<String, Integer> countWord() throws IOException {

		String file = "/home/nishant/Nishant.txt";

		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringBuilder stringBuilder = new StringBuilder();
		char[] buffer = new char[10];
		while (reader.read(buffer) != -1) {
			stringBuilder.append(new String(buffer));
			buffer = new char[10];
		}
		reader.close();

		String words = stringBuilder.toString().trim();
		System.out.println(words);

		String[] wordArray = words.split(" ");
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < wordArray.length; i++) {
			int count = 1;
			if (!map.containsKey(wordArray[i])) {
				for (int j = i + 1; j < wordArray.length; j++) {

					if (wordArray[i].equalsIgnoreCase(wordArray[j])) {
						count++;
						map.put(wordArray[i], count);
					}

				}
				if (count == 1) {
					map.put(wordArray[i], count);
				}
			}

		}

		return map;
	}
}