package com.ustglobal.exception.first;

public class TestE {

	public static void main(String[] args) {

		System.out.println("main started");

		int[] a = {10, 20, 30};
		int b = 10;
		try {
			System.out.println(b/0);
		} 
		catch(ArithmeticException ae) {
			System.out.println("Number divided by zero");
		} 
		try {
			System.out.println(a[2]);
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index not present");
		}

		System.out.println("Main ended");
	}
}
