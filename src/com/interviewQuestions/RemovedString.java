package com.interviewQuestions;

public final class RemovedString {

	/*
	 * Given a string, return a version where all the "x" have been removed. Except
	 * an "x" at the very start or end should not be removed.
	 * 
	 * stringX("xxHxix") → "xHix" stringX("abxxxcd") → "abcd" stringX("xabxxxcdx") →
	 * * "xabcdx"
	 * 
	 */

	public RemovedString() {
	}

	public static void main(String[] args) {
		String str = "xabxxxcdx";
		String word = "xxx";
		
		remove(str, word);
		
		remove2(str, word);
		
		remove3(str);

	}

	static void remove(String str, String word) {
		String msg[] = str.split(" ");
		String new_str = "";

		for (String words : msg) {
			if (!words.equals(word)) {
				new_str += words + " ";
			}
		}
		System.out.print(new_str);
	}

	static void remove2(String str, String word) {
		str = str.replaceAll("xxx", "");
		str = str.trim();
		System.out.print(str);
	}

	static void remove3(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Original StringBuilder Object: " + sb.toString());
		sb.delete(3,6);
		System.out.println("New StringBuilder Object: " + sb.toString());
	}

}
