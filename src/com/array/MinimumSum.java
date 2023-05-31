package com.array;

public final class MinimumSum {

	private MinimumSum() {
	}
	
	static int arr[]= {12,34,10,6,40};
	
	public static void main(String[] args) {
		System.out.println("Min Pair Sum is " + findSmallestSumPair());
	}

	static int findSmallestSumPair() {
		//initialize first and second smallest element
		int first, second;
		if (arr[0] < arr[1]) {
			first =arr[0];
			second=arr[1];
		}else {
			first=arr[1];
			second=arr[0];
		}
		
		for (int i = 2; i < arr.length; i++) {
			/*
			 * If current element is smaller than first then update both first and second
			 */
			if(arr[i] < first) {
				second=first;
				first=arr[i];
			}
			/* If arr[i] is in between first and second then update second */
			else if (arr[i] < second && arr[i] != first)
				second = arr[i];
		}
		return (first + second);		
	}
}
