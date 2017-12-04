package com.week1.presession;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstMissingInteger {

	public static void main(String[] args) {

		Integer [] ab = new Integer []{3,4,-1,1};
		
		System.out.println(firstMissingPositive( Arrays.asList(ab)));
	}

	static int firstMissingPositive(List<Integer> a){
		
        Set<Integer> setOfSubArrays = new HashSet<Integer>();

        
        Integer[] nums = new Integer[a.size()];
        nums = a.toArray(nums);
        
        int i = 0;
        while(i < nums.length){
            if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) i++;
            else if(nums[nums[i]-1] != nums[i]) swap(nums, i, nums[i]-1);
            else i++;
        }
        i = 0;
        while(i < nums.length && nums[i] == i+1) i++;
        return i+1;


	}
	
    static void swap(Integer[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
