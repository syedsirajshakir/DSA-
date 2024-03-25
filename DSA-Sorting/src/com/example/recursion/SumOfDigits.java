package com.example.recursion;

public class SumOfDigits {
	
	//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
	
	public static void main(String args[]) {
		System.out.println(sumOfDigits(125));
	}
	static int sumOfDigits(int n) {
        // code here
        if(n<10)
            return n;
            
        return sumOfDigits(n/10)+(n%10);
    }

}
