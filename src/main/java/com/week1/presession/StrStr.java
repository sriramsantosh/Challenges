package com.week1.presession;

public class StrStr {

	public static void main(String[] args) {
	
		System.out.println(strStr("baba", "bbbbbbbbab"));
	}

	
	static int strStr(String needle, String hayStack){
		
		if(needle == null || needle.isEmpty() || hayStack ==null || hayStack.isEmpty())
			return -1;
		
		if(needle.length()> hayStack.length())
			return -1;
		
		if(needle.equalsIgnoreCase(hayStack))
			return 0;
		
		int j = 0;
		
		for(int i=0;i<hayStack.length();i++){
			
			if(j<needle.length() && hayStack.charAt(i) == needle.charAt(j)){
				j++;
				int p = i+1;
				while(p<hayStack.length()){
				
					if(j<needle.length() && hayStack.charAt(p) != needle.charAt(j)){
						j =0;
						break;
					}
					
					while(p<hayStack.length() && j<needle.length() && hayStack.charAt(p) == needle.charAt(j)){
						j++;
						p++;
					}
					
					if(j==needle.length()) 
						return i;
					else {
						j=0;
						break;
					}
					
				}
					
			}
		}
		
		return -1;
	}
}
