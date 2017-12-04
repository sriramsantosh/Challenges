package com.week1.presession;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PrettyPrintJson {

	public static void main(String[] args) {
		String str = "{A:'B',C:{D:'E',F:{G:'H',I:'J'}}}";
	//	System.out.println(printJsonString(str));
		
		
		ArrayList<String> res = prettyJSON(str);
		for(String s: res){
			System.out.println(s);
		}
	}


	static ArrayList<String> prettyJSON(String a) {
		
	    ArrayList<String> formattedList = new ArrayList<>();

		if(a == null || a.trim().length() == 0){
			formattedList.add(a);
			return formattedList;
		}

        StringBuilder sb = new StringBuilder();
        int indent = 0;
        char pre = 0;
        for (char c : a.toCharArray()) {
            if (Character.isWhitespace(c)) continue;
            if (c == ']' || c == '}') indent--;
            if (pre == '[' || pre == '{' || pre == ',' || c == ']' || c == '}') {
                sb.append('\n');
                for (int i = 0; i < indent; i++) sb.append("\t");
            }       
            sb.append(c);
            if (c == '[' || c == '{') indent++;
            pre = c;
        }       

		
		String[] arr = sb.toString().split("\n");
		
		for(String s: arr)
			formattedList.add(s);

	 
		return formattedList;
	}

	static ArrayList<String> prettyJSON2(String a) {
		
	    ArrayList<String> formattedList = new ArrayList<>();

		if(a == null || a.trim().length() == 0){
			formattedList.add(a);
			return formattedList;
		}

        StringBuilder sb = new StringBuilder();
        int indent = 0;
        char pre = 0;
        for (char c : a.toCharArray()) {
            if (Character.isWhitespace(c)) continue;
            if (c == ']' || c == '}') indent--;
            if (pre == '[' || pre == '{' || pre == ',' || c == ']' || c == '}') {
                sb.append('\n');
                for (int i = 0; i < indent; i++) sb.append("\t");
            }       
            sb.append(c);
            if (c == '[' || c == '{') indent++;
            pre = c;
        }       
		
		String[] arr = sb.toString().split("\n");
		
		for(String s: arr)
			formattedList.add(s);

	 
		return formattedList;
	}
}
