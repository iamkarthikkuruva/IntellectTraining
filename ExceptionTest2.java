package com.intellect.karthik;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;

		try {
			int div = num1 / num2;
			System.out.println("division :" + div);
		} catch (ArithmeticException ae) {
			System.out.println("Cannot be divided by zero");
			ae.printStackTrace();
		}
	}

}
