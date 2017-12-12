package com.week3.presession;

public class SquareRootOfX {

	public static void main(String[] args) {

		System.out.println(sqrt(144));
	}
	
	public static int sqrt(int x) {
	    if (0 == x) return 0;
        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                ans = mid;
            } else {
                right = mid - 1;
            }
        }
        return ans;
	}


}
