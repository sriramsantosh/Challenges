package com.week1.presession;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInteger("XIV"));
	}
	
	static int romanToInteger(String romanStr){
		
		if(romanStr == null || romanStr.isEmpty())
			return 0;
		
		Map<Character, Integer> romanMap = new HashMap<>();
		
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		if(romanStr.length()==1)
			return romanMap.getOrDefault(romanStr.charAt(0), 0);
		

		for(int i=0;i<romanStr.length(); i++){
			if(romanMap.get(romanStr.charAt(i)) ==null)
					return 0;
		}	
		
		int intValue =0;
		
		for(int i=0;i<romanStr.length()-1;i++){
			if(romanMap.get(romanStr.charAt(i)) < romanMap.get(romanStr.charAt(i+1)) )
				intValue = intValue - romanMap.get(romanStr.charAt(i));
			else
				intValue = intValue + romanMap.get(romanStr.charAt(i));
		}
		
		intValue = intValue + romanMap.get(romanStr.charAt(romanStr.length()-1));
		
		return intValue;
	}

}
