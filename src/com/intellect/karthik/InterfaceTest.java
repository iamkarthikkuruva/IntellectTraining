package com.intellect.karthik;

interface Exam {
	void result();
}

class Upsc implements Exam {

	@Override
	public void result() {
		System.out.println("upsc--->Pass  ");
	}

}

class BankExam implements Exam {
	@Override
	public void result() {
		System.out.println("bank--->Pass  ");
	}
}

class OcjaExam implements Exam {
	@Override
	public void result() {
		System.out.println("ocja--->Pass  ");
	}
}

class ItExam implements Exam {
	@Override
	public void result() {
		System.out.println("It--->Pass  ");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		Exam e = new BankExam();
		e.result();

	}

}
