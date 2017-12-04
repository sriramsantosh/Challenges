package com.week2.presession;

public class PalindromeList {

	public static void main(String[] args) {

	}
	
	/**
	 * Definition for singly-linked list.
	 * */
	  class ListNode {
	      public int val;
	      public ListNode next;
	      ListNode(int x) { val = x; next = null; }
	  }
	 
    public int lPalin(ListNode A) {
       
    	int listSize = 0;
        ListNode tmp = A;
        
        while(tmp != null){
            listSize++;
            tmp = tmp.next;
        }
        
        if(listSize == 0 || listSize == 1){
            return 1;
        }
        
        ListNode left;
        ListNode right;
        if(listSize % 2 == 0){
            tmp = A;
            for(int i = 1; i < (listSize / 2); i++){
                tmp = tmp.next;
            }
            right = tmp.next;
            tmp.next = null;
            left = reverse(A);    

        }else{
            tmp = A;
            for(int i = 0; i< ((listSize/2) - 1); i++){
               tmp = tmp.next;
            }
            right = tmp.next.next;
            tmp.next = null;
            left = reverse(A);
        }
        
        while(left != null){
            if(left.val != right.val){
                return 0;
            }
            left = left.next;
            right = right.next;
        }
        return 1;
    }
    
    private ListNode reverse(ListNode A){
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = A;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }	

}
