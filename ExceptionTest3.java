package com.intellect.karthik;

public class ExceptionTest3 {

	public static void main(String[] args) {
		String str = "Intellect Design Arena";
		try {
			//str=null;
			System.out.println(str);
			System.out.println(str.length());
			System.out.println(str.toUpperCase());
			try {
				System.out.println(str.charAt(10));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("invalid index  range");
			}
			String[] eNames = { "suresh", "karthik", "naveen" };
			try {
				System.out.println(eNames[2]);
				System.out.println(eNames.length);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("invalid key entered..");
			}
		} catch (NullPointerException e) {
			System.out.println("entered null value....");
		}

	}

}
