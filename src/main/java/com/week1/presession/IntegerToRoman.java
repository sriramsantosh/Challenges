package com.week1.presession;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {

	public static void main(String[] args) {

		System.out.println(intToRoman(3));
		System.out.println(ss(3));

	}
	
	static String intToRoman(int num){
				
		Map<Integer, String> romanMap = new LinkedHashMap<Integer, String>();
		
		romanMap.put(1000, "M");
		romanMap.put(900, "CM");
		romanMap.put(500, "D");
		romanMap.put(400, "CD");
		romanMap.put(100, "C");
		romanMap.put(90, "XC");
		romanMap.put(50, "L");
		romanMap.put(40, "XL");
		romanMap.put(10, "X");
		romanMap.put(9, "IX");
		romanMap.put(5, "V");
		romanMap.put(4, "IV");
		romanMap.put(1, "I");
		
		StringBuilder sb = new StringBuilder();
		
		for(int key:romanMap.keySet()){
			while(num>=key){
				num = num-key;
				sb.append(romanMap.get(key));
			}
		}
		
		return sb.toString();
	}
	
	static String ss(int num){
		int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	    String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	    
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i=0;i<values.length;i++) {
	        while(num >= values[i]) {
	            num -= values[i];
	            sb.append(strs[i]);
	        }
	    }
	    return sb.toString();
	}

}
