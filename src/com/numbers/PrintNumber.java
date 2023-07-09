package com.numbers;

public final class PrintNumber {
	private PrintNumber() {	}
	
	public static void main(String[] args) {
		printNumbers(0);
	}

	private static void printNumbers(int i) {
		if (i<10) {
			System.out.println(i);
			printNumbers(i+1);
		}		
	}

}
