package com.week2.presession;

public class KReverseList {

	public static void main(String[] args) {

	}
	
    public ListNode reverseList(ListNode A, int B) {
    	
        if (A==null||A.next==null||B<2) return A;
        
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        
        ListNode tail = dummy, prev = dummy,temp;
        int count;
        while(true){
            count =B;
            while(count>0&&tail!=null){
                count--;
                tail=tail.next;
            } 
            if (tail==null) break;//Has reached the end
            

            A=prev.next;//for next cycle
            while(prev.next!=tail){
                temp=prev.next;//Assign
                prev.next=temp.next;//Delete
                
                temp.next=tail.next;
                tail.next=temp;//Insert
                
            }
            
            tail=A;
            prev=A;
            
        }
        return dummy.next;
        
    }

     class ListNode {
    	      public int val;
    	      public ListNode next;
    	      ListNode(int x) { val = x; next = null; }
    	  }


}
