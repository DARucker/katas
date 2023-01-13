package katas_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata_2023_01_12 {

	public static void main(String[] args) {
		getSearchResults();
	}

	public static void getSearchResults() {

		List<String> words = new ArrayList<>();
		List<String> queries = new ArrayList<>();
		List<String> anagrams = new ArrayList<>();
		List<List<String>> result = new ArrayList<>();
		
		words.addAll(Arrays.asList("atac", "pardas", "duel", "tracas", "speed", "dule", "cars", "taca", "caat", "tracas"));
		queries.addAll(Arrays.asList("spede", "deul", "cata", "cartas"));
		
		for (String string1 : queries) {
			if(!anagrams.isEmpty()) {
				result.add(anagrams);
			}
			anagrams = new ArrayList<>();

			int length1 = string1.length();
			String sort1 = sortString(string1);	
			for (String string2 : words) {
				
				int length2 = string2.length();
				if(length1 == length2) {
					String sort2 = sortString(string2);
					if(sort2.equals(sort1)) {
						anagrams.add(string2);
					}
				}
			}
		}
		result.add(anagrams);
		System.out.print(result);
	}

	public static String sortString(String stringToSort) {
		char[] stringToChar = stringToSort.toCharArray();
		Arrays.sort(stringToChar);
		return new String(stringToChar);

	}
}
