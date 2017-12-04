package com.week1.presession;

public class isNumeric {

	public static void main(String[] args) {
	
	}
	
	public int isNumber(final String a) {
	    
	    String s = a;
    
    	if(s == null)
		    return 0;
		
	    s = s.trim();
	    
	    if(s.length()==0)
	    	return 0;
	    
	    if(s.length()==1)
	    	if(s.charAt(0) == '-' || s.charAt(0) == '+' || s.charAt(0) == '.'  || s.charAt(0) == 'e')
	    		return 0;
	    
	    boolean isESeen = false,  isDotSeen = false, isDigitSeen=false;
	    
	    for(int i =0;i<s.length();i++){
	    	if(s.charAt(i) >= '0' && s.charAt(i) <='9' ){
	    		isDigitSeen=true;
	    	}else if(s.charAt(i) == 'e'){
	    		if(!isDigitSeen || i+1==s.length() || s.charAt(i-1) == '.')
	    			return 0;
	    		isESeen = true;
	    	}else if(s.charAt(i) == ' '){
	    		return 0;
	    	}
	    	else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
	    		if(i==0)
	    			continue;
	    		if(i+1==s.length() || s.charAt(i-1) == '.' || s.charAt(i-1) == '+'  || s.charAt(i-1) == '-' || s.charAt(i+1) == '.')
	    			return 0;
	    	}else if(s.charAt(i) == '.'){
	    		if(isDotSeen || i+1==s.length() || isESeen)
	    			return 0;	
	    	}else return 0;
	    	
	    }
	    
	    return 1;	    

	}

}
