package com.week1.presession;

public class CompareVersionNumbers {

	public static void main(String[] args) {

		System.out.println(compareVersion1("9","2"));
		System.out.println(compareVersion1("01","1"));
		System.out.println(compareVersion1("1", "1"));
		System.out.println(compareVersion1("1.0", "1"));
		System.out.println(compareVersion1("4444371174137455", "1.13.4"));
		System.out.println(compareVersion1("1.0", "0.1"));

	}
	
	static int compareVersion1(String a, String b){
		 String[] arr1 = a.split("\\.");
		 String[] arr2 = b.split("\\.");

		 int traverseLength = Math.min(arr1.length, arr2.length);
		 
		 boolean isEqual = false;
		 
		 for(int i=0;i<traverseLength;i++){
			 if(Double.parseDouble(arr1[i]) > Double.parseDouble(arr2[i])){
				 return 1;
			 }else if(Double.parseDouble(arr1[i]) == Double.parseDouble(arr2[i])){
				 isEqual = true;
				 continue;
			 }else
				 return -1;
		 }
		 
		 if(!isEqual)
			 return 1;
		 
		 if(isEqual){
			 if(arr2.length > arr1.length){
				 for(int i=traverseLength;i<arr2.length;i++){
					 if(Double.parseDouble(arr2[i]) > 0)
						 return -1; 
				 }
			 }else if(arr2.length < arr1.length){
				 for(int i=traverseLength;i<arr1.length;i++){
					 if(Double.parseDouble(arr1[i]) > 0)
						 return 1; 
				 }
			 }
		 }
		 
		return 0; // Equal length and same
	}
	
	
	
	static int comp(String version1, String version2){
		 String[] arr1 = version1.split("\\.");
		 String[] arr2 = version2.split("\\.");
		 
		    int i=0;
		    while(i<arr1.length || i<arr2.length){
		        if(i<arr1.length && i<arr2.length){
		            if(Double.parseDouble(arr1[i]) < Double.parseDouble(arr2[i])){
		                return -1;
		            }else if(Double.parseDouble(arr1[i]) > Double.parseDouble(arr2[i])){
		                return 1;
		            }
		        } else if(i<arr1.length){
		            if(Double.parseDouble(arr1[i]) != 0){
		                return 1;
		            }
		        } else if(i<arr2.length){
		           if(Double.parseDouble(arr2[i]) != 0){
		                return -1;
		            }
		        }
		 
		        i++;
		    }
		 
		    return 0;
	}
	
	
	static int compareVersion(String a, String b) {
		
		String[] version1 = a.split("\\.");
		String[] version2 = b.split("\\.");
		
		int traverseLen = version1.length >= version2.length ? version2.length: version1.length;
		
		if(version1.length==1 && version2.length==1){
			int lowestSubStrLen = version1[0].length() >= version2[0].length() ? version2[0].length(): version1[0].length();

			version1[0] = version1[0].replace("0", "");
			version2[0] = version2[0].replace("0", "");
			
			boolean isEqual = false;
			for(int j=0;j<lowestSubStrLen;j++){	
				if(Character.getNumericValue(version1[0].charAt(j)) > Character.getNumericValue(version2[0].charAt(j)) ){
					isEqual = false;
					continue;
				}
			else if(Character.getNumericValue(version1[0].charAt(j)) == Character.getNumericValue(version2[0].charAt(j))){
					isEqual = true;
					continue;
				}else
					return -1;
			}

			if(isEqual)	  
				return 0;
			
            return 1;
		}
				
		for(int i=0;i<traverseLen;i++){
			
			version1[i] = version1[i].replace("0", "");
			version2[i] = version2[i].replace("0", "");
			
			int lowestSubStrLen = version1[i].length() >= version2[i].length() ? version2[i].length(): version1[i].length();
			
			for(int j=0;j<lowestSubStrLen;j++){	
					if(Character.getNumericValue(version1[i].charAt(j)) >=   Character.getNumericValue(version2[i].charAt(j)) )
						continue;
				else
					return -1;
			}						
		}
		
		// if it is equal, the bigger length string is greater if they don't have only zeroes.
		if(version2.length > version1.length){
			for(int k=traverseLen; k<version2.length;k++){
				for(int p =0;p<version2[k].length();p++)
					if(version2[k].charAt(p) != '0')
						return -1;
			}
			return 0;
		}
		else if(version1.length > version2.length){
			for(int k=traverseLen; k<version1.length;k++){
				for(int p =0;p<version1[k].length();p++)
					if(version1[k].charAt(p) != '0')
						return 1;
			}
			return 0;
		}
		
		return 0;
	}


}
