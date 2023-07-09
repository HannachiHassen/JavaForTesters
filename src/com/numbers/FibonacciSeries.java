package com.numbers;

public final class FibonacciSeries {

	private FibonacciSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a=0, b=1, c, i, count=10;
		
		System.out.println(a+ " " +b);
		
		for (int j = 0; j < count; j++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
