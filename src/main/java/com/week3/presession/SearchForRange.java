package com.week3.presession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchForRange {

	public static void main(String[] args) {

		Integer arr[] = {5, 7, 7, 8, 8, 10};
		int target = 8;

		findRange(Arrays.asList(arr), target);
		
	}
	
	public static ArrayList<Integer> findRange(List<Integer> input, int target){
	
		ArrayList<Integer> result = new ArrayList<>();
		
		int left =0, right = input.size()-1;
		
		while(left<=right){
			
            int mid = left + (right - left) / 2;
            
            if(target == input.get(mid)){
            	
                if(input.get(left) == target && input.get(right) == target){
                	result.add(left);
                	result.add(right);
                	
                	return result;
                }

                else if(input.get(left) != target)
                    left++;
                else
                    right--;
            }
            else if(target > input.get(mid)){
				left = mid+1;
			}else{
				right = mid-1;
			}
				
		}
		
		if(result.isEmpty()){
			result.add(-1);
			result.add(-1);
		}
			
		return result;
	}

}
