package com.week1.presession;

import java.util.LinkedList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
	
		System.out.println(reverseStringByWord("the sky is blue"));	
}
	
	static String reverseString(String str){
		
		if(str==null || str.length()<=1)
			return str;
		
		return str.charAt(str.length()-1) + reverseString(str.substring(0, str.length()-1));
	}
	
	static String reverseStringByWord(String a){
		
		if(a==null || a.length()<=1)
			return a;
		
		a = a.trim();
		
		List<String> wordList = new LinkedList<String>();
		
		int i = 0;
		int j = 0;
		
		while(j<a.length()){
			if(a.charAt(j) == ' ' || j==a.length() ){
				wordList.add(a.substring(i,j));
				while(j<a.length() && a.charAt(j) == ' '){
					j++;
					i=j;
				}
			}else j++;
			
				
		}
		
		wordList.add(a.substring(i,j)); //for the last word

		
		StringBuilder  sb = new StringBuilder();
		
		for(int p = wordList.size()-1;p>=0;p--){
			sb.append(wordList.get(p));
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
	
	
}
