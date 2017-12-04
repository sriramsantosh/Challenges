package com.week2.presession;

public class SortList {

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
	
	public ListNode sortList(ListNode a) {
		
        if (a == null || a.next == null)
            return a;
        ListNode f = a.next.next;
        ListNode p = a;
        while (f != null && f.next != null) {
            p = p.next;
            f =  f.next.next;
        }
        ListNode h2 = sortList(p.next);
        p.next = null;
        return merge(sortList(a), h2);
	}
    
    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode hn = new ListNode(Integer.MIN_VALUE);
        ListNode c = hn;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                c.next = h1;
                h1 = h1.next;
            }
            else {
                c.next = h2;
                h2 = h2.next;
            }
            c = c.next;
        }
        if (h1 != null)
            c.next = h1;
        if (h2 != null)
            c.next = h2;
        return hn.next;
    }


}
