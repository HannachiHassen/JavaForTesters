package com.concept;

public final class AllMethods {

	int x, y;

	public static void main(String args[]) {
		AllMethods e = new AllMethods();
		e.fun();
		e.fun1(5, 3);
	}

	void fun() {
		System.out.println("fun method");
	}

	void fun1(int a, int b) { // Pass values
		x = a; // local variable this.x=x if x is passed in fun1()
		y = b;
		int s = a + b;
		System.out.println(s);
		int f1 = fun2(s); // calling third method and passing value
		System.out.println(f1);

	}

	int fun2(int z) { // return type is integer
		z = z + 5;
		return z; // return should be last statement in the method
	}
}
