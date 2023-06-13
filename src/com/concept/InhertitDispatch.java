package com.concept;

public final class InhertitDispatch {
	
	public static void main(String[] args) {
		
	}
	
	class A{
		void callme(){
		System.out.println("Inside A's callme method");
		}
	}

	class BB extends A{
		void callme(){
		System.out.println("Inside B's callme method");
		}
	}
	
	class c extends A{
		
	}
	
}

