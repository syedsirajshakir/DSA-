package com.example.bubble.sort;

public class BubbleSort {

	static int arr[]= {10,5,6,2,7,3,15,25,11,1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort bubbleSort=new BubbleSort();
		
		bubbleSort.bubbleSorting(arr);
		
		bubbleSort.print(arr);

	}
	
	public static void bubbleSorting(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public void print(int arr[]) {
		for(int i:arr) {
			System.out.print(i +" ");
		}
	}

}
