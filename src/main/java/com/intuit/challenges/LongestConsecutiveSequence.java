package com.intuit.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The Class LongestConsecutiveSequence.
 */
public class LongestConsecutiveSequence {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(100);
		a.add(4);
		a.add(200);
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(99);
		a.add(201);
		a.add(199);
		
		System.out.println(longestConsecutiveOptimized(a));
	}
	
//	public static int longestConsecutiveSecondType(final List<Integer> a){
//		if(a==null || a.size()==0)
//			return 0;
//		
//		if(a.size()==1)
//			return 1;
//		
//		int max = 1;
//		
//		for(int element: a){
//			int sum = 1;
//			int searchIndex = element;
//			while(a.contains(--searchIndex)){
//				sum++;
//			}
//			
//			searchIndex = element;
//			
//			while(a.contains(++searchIndex)){
//				sum++;
//			}
//			
//			max = Math.max(max, sum);
//		}
//		
//		return max;
//	}
	
	
	/**
 * Longest consecutive optimized.
 *
 * @param a the a
 * @return the int
 */
public static int longestConsecutiveOptimized(final List<Integer> a) {

		if(a==null || a.size()==0)
			return 0;
		
		if(a.size()==1)
			return 1;
		
		int res = 0;
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int n : a) {
	        if (!map.containsKey(n)) {
	            int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
	            int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
	            int sum = left + right + 1;
	            map.put(n, sum);
	             
	            res = Math.max(res, sum);
	            
	            map.put(n - left, sum);
	            map.put(n + right, sum);
	        }
	        else {
	            continue;
	        }
	    }
	    return res;
	}

	/**
	 * Longest consecutive brute force.
	 *
	 * @param a the a
	 * @return the int
	 */
	public static int longestConsecutiveBruteForce(final List<Integer> a) {
		
		if(a==null || a.size()==0)
			return 0;
		
		if(a.size()==1)
			return 1;
		
		int tempConsecutiveSequenceLength = 0;
		int longestConsecutiveSequenceLength = 1;

		boolean sequenceSpotted = false;
		int searchKey = a.get(0)-1;
		Set<Integer> sequenceSet = new HashSet<Integer>();
		
		int i=0;
		
		while(true){
						
			if(a.contains(searchKey)){
				sequenceSet.add(a.get(i));
				sequenceSet.add(searchKey);
				--searchKey;
				sequenceSpotted = true;
			}else{
				sequenceSpotted = false;
				i++;
				if(i==a.size())
					break;
				if(!sequenceSet.contains(searchKey))
					searchKey = a.get(i)-1;
			}
			
			if(sequenceSpotted){
				tempConsecutiveSequenceLength = sequenceSet.size();
			}
			else{
				if(tempConsecutiveSequenceLength > longestConsecutiveSequenceLength)
					longestConsecutiveSequenceLength = tempConsecutiveSequenceLength;
				tempConsecutiveSequenceLength = 0;
				sequenceSet.clear();
			}
			
			if(i==a.size())
				break;
		}
		
		return longestConsecutiveSequenceLength;
	}
	

}
