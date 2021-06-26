package com.intellect.karthik;

class PrintMessage {
	void printMsg(String msg) {
		System.out.println("[");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class MsgPrinterThread implements Runnable {
	String msg;
	PrintMessage pm;
	Thread t;

	public MsgPrinterThread(String msg, PrintMessage pm, Thread t) {
		super();
		this.msg = msg;
		this.pm = pm;
		this.t = t;
		t=new Thread();
	}

	@Override
	public void run() {
		pm.printMsg(msg);
	}

}

public class PrintMessageTest {
	public static void main(String[] args) {
		PrintMessage pm = new PrintMessage();
		MsgPrinterThread ob1 = new MsgPrinterThread("k",pm);
		MsgPrinterThread ob2 = new MsgPrinterThread("kiran", pm);
	}
}
