package com.week1.presession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[]{3,1,2,3,2};
		int [] b = new int[]{4,3,1,2,1};
		
		System.out.println(maxLength(a, 4));
		System.out.println(maxLength(b, 4));				
//		System.out.println(maxLength2(a, 4));
//		System.out.println(maxLength2(b, 4));				

	}
	
	static int maxLength2(int[]a, int k){
		Map<Integer, Integer> index = new HashMap();
		index.put(0, -1);
		int sum =0, max =0;
		for(int i=0;i<a.length;i++){
			sum = sum+a[i];
			max= Math.max(max, index.getOrDefault(sum-k, i));
			index.putIfAbsent(sum, i);
		}
		return max;
	}

	
	  static int maxLength(int[] a, int k) {
	       
	        Set<ArrayList<Integer>> setOfSubArrays = new HashSet<ArrayList<Integer>>();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        Arrays.sort(a);
	        
	        for(int i=0;i<a.length;i++){
	            list.add(a[i]);
	            setOfSubArrays.add(new ArrayList(list));
	            for(int j=i+1;j<a.length;j++){
	                list.add(a[j]);
	                setOfSubArrays.add(new ArrayList(list));
	              
	            }
	            list.clear();
	        }
	        
	        int sum =0;
	        int maxLength = Integer.MIN_VALUE;
	        
	        for(ArrayList<Integer> subList: setOfSubArrays){
	        	for(Integer num: subList){
	        		sum = sum+num;
	        	}
	        	
	        	if(sum<=k){
	        		maxLength = Math.max(maxLength, subList.size());
	        	}
	        	sum =0;
	        }
	        
	        return maxLength;
	    }

}
