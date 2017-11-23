package com.intuit.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * The Class KthSmallestElement.
 */
public class KthSmallestElement {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		System.out.println(findKthSmallest(a,5));
	}

	/**
	 * Find kth smallest.
	 *
	 * @param a the a
	 * @param k the k
	 * @return the int
	 */
	public static int findKthSmallest(final List<Integer> a, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<a.size();i++){
			pq.offer(a.get(i));
		}
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}


}
