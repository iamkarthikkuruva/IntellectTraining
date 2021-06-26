package com.intellect.karthik;

interface RBI {
	void deposits();

	void withdrawls();

	void aadharLink();

	void minBal();

	// default method
	default void KYC() { 
		System.out.println("Update ur KYC as early as possible");
	}
}

abstract class SBI implements RBI {
	public void deposits() {
		System.out.println("1.U can deposit ur money in SBH happily");
	}

	public void withdrawls() {
		System.out.println("2.U can withdrawl ur money from SBH sadly");
	}

	public void aadharLink() {
		System.out.println("3.As per rule of RBI please link ur aadhar with account");
	}
}

class SBH extends SBI {
	public void minBal() {
		System.out.println("4.As per rules please maintain 3k as Min balance");
	}
}

class ICIC implements RBI {
	public void deposits() {
		System.out.println("5.U can deposit ur money in ICIC happily");
	}

	public void withdrawls() {
		System.out.println("6.U can withdrawl ur money from ICIC happily");
	}

	public void aadharLink() {
		System.out.println("7.As per rule u need to link Aadhar");
	}

	public void minBal() {
		System.out.println("8.For All ICIC cust it is mandt to maintain min bal of 2500Rs/-");
	}
}

class PNB implements RBI {
	public void deposits() {
		System.out.println("9.U can deposit ur money in PNB happily");
	}

	public void withdrawls() {
		System.out.println("10.U can withdrawl ur money from PNB happily");
	}

	public void aadharLink() {
		System.out.println("11.As per rule u need to link Aadhar");
	}

	public void minBal() {
		System.out.println("12.For All PNB cust it is mandt to maintain min bal of 2000Rs/-");
	}
}

class HDFC implements RBI {
	public void deposits() {
		System.out.println("13.U can deposit ur money in PNB happily");
	}

	public void withdrawls() {
		System.out.println("14.U can withdrawl ur money from PNB happily");
	}

	public void aadharLink() {
		System.out.println("15.As per rule u need to link Aadhar");
	}

	public void minBal() {
		System.out.println("16.For All PNB cust it is mandt to maintain min bal of 3500Rs/-");
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		SBH s1 = new SBH();
		s1.aadharLink();
		s1.minBal();
		s1.deposits();
		s1.withdrawls();
		s1.KYC();
		ICIC i1 = new ICIC();
		i1.aadharLink();
		i1.deposits();
		i1.withdrawls();
		i1.minBal();
		i1.KYC();
		PNB p1 = new PNB();
		p1.aadharLink();
		p1.minBal();
		p1.deposits();
		p1.withdrawls();
		p1.KYC();
		HDFC h1 = new HDFC();
		h1.aadharLink();
		h1.minBal();
		h1.deposits();
		h1.withdrawls();
		h1.KYC();
	}

}
