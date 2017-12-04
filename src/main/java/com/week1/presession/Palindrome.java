package com.week1.presession;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("'"));
	}
	
	static int isPalindrome(String a) {
		
		a = a.toLowerCase();
		if(a==null || a.isEmpty())
			return 0;
		if(a.length()==1)
			return 1;
		
		int start =0;
		boolean isAlphaNumeric = false;
		int end = a.length() -1;
		
		while(start<=end){
			while( start< end && (!Character.isLetterOrDigit(a.charAt(start)) || a.charAt(start) == ' ' ))
				start++;
			while( end>0 && (!Character.isLetterOrDigit(a.charAt(end)) || a.charAt(end) == ' ') )
				end--;
			
			if(start>=a.length()-1 || end<=0 && (!isAlphaNumeric))
				return 1;
			if(start>=a.length()-1 || end<=0 && (isAlphaNumeric))
				return 0;
			
			if(a.charAt(start) == a.charAt(end)){
				isAlphaNumeric = true;
				start++;
				end--;
			}else return 0;
		}
		
		return 1;
	}

}
