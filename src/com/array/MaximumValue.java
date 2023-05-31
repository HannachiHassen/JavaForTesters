package com.array;

public final class MaximumValue {

	public static void main(String[] args) {
		int input[] = {4,2,1,6,0,8,7};
		System.out.println("The Maximum Value of the array is: " +max(input));
	}

	private static int max(int[] arr) {
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max=arr[i];
			}
		}
		return max;
	}
}
