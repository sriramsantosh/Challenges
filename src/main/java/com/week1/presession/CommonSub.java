package com.week1.presession;

public class CommonSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubsequence("hackerracks", "hackers"));
		System.out.println(longestSubsequence("abc", "aedace"));
		System.out.println(longestSubsequence("abcdaf", "a"));


	}
	
    static int longestSubsequence(String x, String y) {
        
        if(x==null || y ==null || x.isEmpty() || y.isEmpty())
           return 0;
         
        if(x.equalsIgnoreCase(y))
           return x.length();

        int traverseLength = Math.min(x.length(), y.length());
         
        if(x.length() > y.length()) 
        	return getLongestCommonSubsequence(x,y, traverseLength);
        else	
        	return getLongestCommonSubsequence(y,x, traverseLength);
         
     }

     static int getLongestCommonSubsequence(String str1, String str2, int traverseLength){
         
         int  j=0;
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<traverseLength;i++){
             if(str1.charAt(j) == str2.charAt(i)){
                 sb.append(str1.charAt(j));
                 j++;
                 continue;
             }else {
            	 //break;
             }
             if(j<=str1.length()-1 && str1.charAt(j) == str2.charAt(i))
                 sb.append(str1.charAt(j));
//             else
//                 j=i;
         }
      
         if(str2.contains(sb.toString()))
        	 return sb.toString().length();
         else return 0;
     }

}
