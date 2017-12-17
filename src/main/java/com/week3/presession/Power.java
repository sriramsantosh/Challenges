package com.week3.presession;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int pow(int x, int n, int d) {
        
        if (n == 0) return 1 % d;

        long result = 1, base = x;
        while (n > 0) {

            if (n % 2 == 1) {
                result = (result * base) % d;
                n--;
            } else {
                base = (base * base) % d;
                n /= 2;
            }
        }
        if (result < 0) 
            result = (result + d) % d;
        return Long.valueOf(result).intValue();
	}

}
