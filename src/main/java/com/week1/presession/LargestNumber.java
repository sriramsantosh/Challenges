package com.week1.presession;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class LargestNumber {

	public static void main(String[] args) {

		Integer [] nums = new Integer[] {3, 30, 34, 5, 9};
		getLargestNumber(Arrays.asList(nums));
	}
	
	
	static String getLargestNumber(List<Integer> nums){

        if (nums == null || nums.size() == 0) return "";
        
        String[] strs = new String[nums.size()];
        
        for (int i = 0; i < nums.size(); i++) {
            strs[i] = String.valueOf(nums.get(i));
        }
               
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s2.compareTo(s1);
            }
        });
        
        
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            result.append(strs[i]);
        }
        return result.toString();
	}

}
