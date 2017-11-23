package com.intuit.challenges;

import java.util.ArrayList;

public class NextGreater {

	public static void main(String[] args){
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(2);
		a.add(10);

		System.out.println(nextGreater(a));
	}
	
	public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
		ArrayList<Integer> nextGreaterList = new ArrayList<Integer>();
		for(int i=0;i<a.size();i++){
			for(int j=i+1;j<a.size();j++){
				if(a.get(i)<a.get(j)){
					nextGreaterList.add(a.get(j));
					break;
				}
			}
			
			if(nextGreaterList.size()!=i+1)
				nextGreaterList.add(-1);
		}
		
		return nextGreaterList;
	}

}
