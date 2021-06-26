package com.intellect.karthik;

public class ExceptionTest {

	
	int a;
	int b;

	int division(int a, int b) {
		return a / b;
	}
	
	public static void main(String[] args) {
		
		ExceptionTest et = new ExceptionTest();
		et.division(10, 0);
	}

}
