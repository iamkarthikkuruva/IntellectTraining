package com.intellect.karthik;

public class MethodOverloadingTest {

	int cal(int a, int b) {
		return a + b;
	}

	int cal(float a, float b) {
		return (int) (a - b);
	}

	int cal(int a, int b, int c) {
		return a + b * c;
	}

	int cal(float a, int b, int c) {
		return (int) (a + b % c);
	}

	public static void main(String[] args) {
		MethodOverloadingTest mot = new MethodOverloadingTest();

		System.out.println(mot.cal(1, 2));
		System.out.println(mot.cal(1, 2));
		System.out.println(mot.cal(1.0f, 2.0f));
		System.out.println(mot.cal(1.0f, 2, 3));
		System.out.println(mot.cal(1.0f, 2.0f));
		System.out.println(mot.cal(1, 2, 3));
	}
}
