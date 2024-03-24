package com.example.bubble.sort;

public class BubbleSortRecursive {
	
	public void swap(int arr[],int n) {
		if(n==1)
			return;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		swap(arr,n-1);
	}
	
	public void print(int arr[]) {
		for(int i:arr) {
			System.out.print(i +" ");
		}
	}
	
	
	public static void main(String args[]) {
		BubbleSortRecursive bubbleSortRecursive=new BubbleSortRecursive();
		int arr[]= {5,3,10,12,7,6,3,2,25,18,12,11};
		int n =arr.length;
		bubbleSortRecursive.swap(arr,n);
		bubbleSortRecursive.print(arr);
		
		
	}

}
