package com.week2.presession;

public class AddTwoNumbersAsLists {

	public static void main(String[] args) {

		

	}

	public ListNode addTwoNumbers(ListNode a, ListNode b) {
		
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = ((b == null) ? 0 : b.val) + ((a == null) ? 0 : a.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;
            
            a = (a == null) ? a : a.next;
            b = (b == null) ? b : b.next;
        }
        return head.next;

	}
	  class ListNode {
		      public int val;
		      public ListNode next;
		      ListNode(int x) { val = x; next = null; }
		 }
}
