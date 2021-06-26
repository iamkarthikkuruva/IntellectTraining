package com.intellect.karthik;

import com.intellect.karthik.InterNetBanking.Customer;

class InterNetBanking {
private int accNo;
private String accHolder;
private double accBal;


public InterNetBanking(int accNo, String accHolder, double accBal) {
	super();
	this.accNo = accNo;
	this.accHolder = accHolder;
	this.accBal = accBal;
}

void acctStatement() {
	System.out.println("Account Number  : " + accNo);
	System.out.println("Account Holder  : " + accHolder);
	System.out.println("Account Balance : " + accBal);
}

public double getBalance(String custName) { 
	return accBal;
}

private void setBalance(double amount, String custName) {
	accBal = amount;
}

public  void deposit(double amountToDeposit, String custName) {
	double currentBalance = getBalance(custName); 
	double newBalance = currentBalance + amountToDeposit;
	setBalance(newBalance, custName);
}
class Customer extends Thread {
	String custName;
	InterNetBanking bref;
	double amountToDeposit;
	
	
	
	public Customer(String custName, InterNetBanking bref, double amountToDeposit) {
		super();
		this.custName = custName;
		this.bref = bref;
		this.amountToDeposit = amountToDeposit;
	}



	@Override
	public void run() {
		bref.deposit(amountToDeposit, custName);
	}
}
}

public class SynchronizedTest {
	public static void main(String[] args) {
		InterNetBanking inb = new InterNetBanking(101,"karthik",35000);
				Customer cust =new Customer("Vijay", inb, 2000);
				

	}
}
