package com.week2.presession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {

		String [] input = {"cat", "dog", "god" ,"tca"};
		
		anagrams(Arrays.asList(input));
	}
	
	
	public static String sortString(String str){
		
		if(str==null || str.isEmpty())
			return str;
		
		char [] ch = str.toCharArray();
		Arrays.sort(ch);
		
		return new String(ch);
	}
	
	public static ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		
		Map<String, ArrayList<Integer>> wordMap = new HashMap<>();
		ArrayList<Integer> anagramsList = new ArrayList<>();
		int currentIndex=0;
		for(String str: a){
			currentIndex++;
			str = sortString(str);
			
			if(wordMap.containsKey(str)){
				anagramsList = wordMap.get(str);
				anagramsList.add(currentIndex);
				wordMap.put(str, new ArrayList(anagramsList));
			}else{
				anagramsList.add(currentIndex);
				wordMap.put(str, new ArrayList(anagramsList) );
			}
			
			anagramsList.clear();
		}
		
		for(String str: wordMap.keySet())
			result.add(wordMap.get(str));
		
		return result;
	}


}
