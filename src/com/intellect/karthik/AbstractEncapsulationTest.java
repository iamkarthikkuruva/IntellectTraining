package com.intellect.karthik;

class AtmMachine { //outer class
	int atmNumber;
	private double totalCashPresent;
	int numberOfCustomerHitToday;
	private int numberOf500 = 100;
	private int numberOf200 = 100;
	private int numberOf100 = 300;

	private void dispense(double cashToDispense) { // 1200
		totalCashPresent = totalCashPresent - cashToDispense;
		numberOf500 = numberOf500 - 5;
	}

	void withdraw(float amountToWithdraw) {
		BankConnection ba = new BankConnection();
		ba.connecToBankServer();
		dispense(amountToWithdraw);
	}

	private class BankConnection { //inner class
		void connecToBankServer() {
			System.out.println("Connecting to bank server...");
		}

		void downloadUpdates() {
			System.out.println("Downloading new updates from the bank server...");
		}

		void uploadDailyTransactions() {
			System.out.println("Uploading todays all transactions to the bank server...");
		}
	}
}

public class AbstractEncapsulationTest {

	public static void main(String[] args) {
		AtmMachine atm = new AtmMachine();
		atm.withdraw(5000);
		//atm.BankConnection b = new AtmMachine.BankConnection();

	}
}
