package com.week1.presession;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(length(" nmas    "));
	}
	
	static int length(String s){
		
		if(s==null || s.isEmpty())
			return 0;
		
		if(s.length() ==1 && s.charAt(0)!=' ')
			return 1;
			
		int i =0,j=1;
		int currentCount =0;
		boolean isCountable = false;
		
		while(j<s.length()){
			if(s.charAt(i) == ' ' && s.charAt(j) !=' '){
				isCountable = false;
				i++;
			}else if((s.charAt(i) !=' ' && s.charAt(j) == ' ')){
				currentCount = j-i;
				i=j;
				j++;
			}else if((s.charAt(i) !=' ' && s.charAt(j) != ' ')){
				j++;
				if(j==s.length())
					isCountable = true;
				else
					isCountable = false;
			}else {
				i=j;
				j++;
				isCountable = false;
			}
			
			
			if(isCountable)
				currentCount = j-i;
		}
		
		return currentCount;
	}

}
