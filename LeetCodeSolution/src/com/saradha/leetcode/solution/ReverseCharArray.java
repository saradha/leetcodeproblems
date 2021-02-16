package com.saradha.leetcode.solution;

public class ReverseCharArray {

	public static void main(String[] args) {
		char arr[] = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(arr);
	}

	public static void reverseString(char[] s) {
		int len = s.length - 1;
		int mid = len / 2; // find mid of the element
		// swap char in the array from start to end until mid reached
		for (int i = 0; i < mid; i++) {
			char elem = s[i];
			s[i] = s[len - i];
			s[len - i] = elem;
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}

	}
}
