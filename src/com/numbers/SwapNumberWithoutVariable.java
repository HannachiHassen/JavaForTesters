/**
 * 
 */
package com.numbers;

/**
 * Oct 24, 2022
 * 
 * @author HASSEN
 * @version 1.0
 * @since 1.0
 */
public final class SwapNumberWithoutVariable {

	/**
	 * @author Hassen Oct 24, 2022
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		System.out.println("Before Swap");
		System.out.println("x value: "+x);
		System.out.println("y value: "+y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
	     System.out.println("After Swap");
		 System.out.println("x value: "+x);
		 System.out.println("y value: "+y);
	}
}
