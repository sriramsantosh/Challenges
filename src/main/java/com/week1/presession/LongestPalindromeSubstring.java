package com.week1.presession;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {

		System.out.println(getLongestPalindromSubString("ac"));
	}
	
	static String getLongestPalindromSubString(String a){
				
		String longestPalindrome = "";
		if(a==null || a.isEmpty() || a.length()==1)
			return a;
		int longestPalindromeLength= 0;

		for(int i=0;i<a.length();i++){
			
			int p =i;
			int j = a.length()-1;
			int beginIndex = p;
			int endIndex = j;
			while(p<j){
				if(a.charAt(p) == a.charAt(j)){
					p++;j--;
				}
				else{
						p = i; 
						j = endIndex-1;
						endIndex = j;
					};
					
				if(p>=j){
					String palindrome = a.substring(beginIndex, endIndex+1);
					if(palindrome.length() > longestPalindromeLength){
						longestPalindromeLength = Math.max(longestPalindromeLength, palindrome.length());
						longestPalindrome = palindrome;
					}
						
				}
				
			}
			
		}
		
		return longestPalindrome;
	}
	
	

}
