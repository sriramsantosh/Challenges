package com.week1.presession;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String [] s = new String[]{"abcdefgh",

		  "aefghijk",

		  "abcefgh"};

		System.out.println(getLongestCommonPrefix(s));
	}
	
	static String getLongestCommonPrefix(String [] s){
		
		if(s==null || s.length <=0)
			return "";
		

		if(s.length ==1)
			return s[0];
		
		StringBuilder sb = new StringBuilder();
						
		//Calculate the shorted length of the string
		
		int shortestLength = Integer.MAX_VALUE;
		
		for(String str : s) // With this, we can get the shorted length of the string.
			shortestLength = Math.min(shortestLength, str.length());
		
		int j =0;
		
		for(int i=0;i<shortestLength; i++){
		
			while(j<s.length-1 && s[j].charAt(i) == s[j+1].charAt(i)){
				j++;
			}
			
			if(j ==s.length-1){
				sb.append(s[j].charAt(i));
				j=0;
			}else break;
			
		}
		
		return sb.toString();
	}

}
