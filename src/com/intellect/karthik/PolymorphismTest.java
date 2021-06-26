package com.intellect.karthik;

class WHO {
	public void lockdown()// Overridden method
	{
		System.out.println("up to-->30-june-2021");// Method Implementation
	}
}

class India extends WHO {
	public void lockdown()
	{
		System.out.println("up to-->29-june-2021");
	}

}

class AP extends India {
	public void lockdown()
	{
		System.out.println("up to-->27-june-2021");
	}
}

class TN extends India {
	public void lockdown()
	{
		System.out.println("up to-->25-june-2020");
	}
}
class IT extends India {
	public void lockdown()
	{
		System.out.println("up to-->31-dec-2021");
	}
}
public class PolymorphismTest {
	public static void main(String args[]) {
		WHO who=new WHO();
		who.lockdown();
		India a = new India();
		a.lockdown();
		AP ap=new AP();
		ap.lockdown();
		TN t = new TN();
		t.lockdown();
		IT it=new IT();
		it.lockdown();
	}
}