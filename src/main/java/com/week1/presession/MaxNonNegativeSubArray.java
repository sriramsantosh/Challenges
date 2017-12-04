package com.week1.presession;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		Integer[] n = new Integer[]{  -846930886, -1714636915, 424238335, -1649760492  };
	//	maxNonNegativeSubArray(n);
	}


	
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    
		if(a.size()==0)
			return a;
		
		ArrayList<ArrayList<Integer>> positiveLists = new ArrayList<>();
	    ArrayList<Integer> subList = new ArrayList<>();

		for(int i=0;i<a.size();i++){
			
			if(a.get(i)>=0){
				subList.add(a.get(i));
			} 
			
			if(a.get(i)<0 || i+1==a.size())
			{
				if(subList.size()>0)
					positiveLists.add(new ArrayList(subList));
				subList.clear();
			}	
		}
		
		Long maxSum = 0L;
		Long tempSum = 0L;
		ArrayList<Integer> maxList = new ArrayList<Integer>();
		for(ArrayList<Integer> l : positiveLists){
			
			for(Integer num: l){
				tempSum = tempSum + num;
			}
			
			if(tempSum>maxSum){
				maxList = l;
				maxSum = tempSum;
			}else if(tempSum == maxSum){
				if(maxList.size() > l.size())
					continue;
				else if(maxList.size() < l.size())
					maxList = l;
			}
			tempSum = 0L;
		}
		
		
		return maxList;
	}
	
}
