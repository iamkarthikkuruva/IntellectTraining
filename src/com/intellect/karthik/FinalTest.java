package com.intellect.karthik;

class Central {
	public void lockdown() {
		System.out.println("Central.lockdown():announced");
	}
}

final class Andhra extends Central {
	public void lockdown() {
		System.out.println("Andhra.lockdown():implemented");
	}
}

public class FinalTest {

	public static void main(String[] args) {
		Central cm = new Central();
		
		Andhra ap= new Andhra();
		ap.lockdown();

	}

}
