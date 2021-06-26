package com.intellect.karthik;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MessageTest {

	public static void main(String[] args) {
		Message m1 = new Message("A", 10,20,30,40);
		Message m2 = new Message("B", 10,20,30,40);
		Message m3 = new Message("C", 10,20,30,40);
		Message m4 = new Message("D", 10,20,30,40);
		
		m1.setVisible(true); 
		m2.setVisible(true); 
		m3.setVisible(true); 
		m4.setVisible(true);

		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		Thread t3 = new Thread(m3);
		Thread t4 = new Thread(m4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}

class Message extends JFrame implements Runnable {

	String message;
	JTextField msgLine = new JTextField(10);

	public Message(String message, int i, int j, int p, int q) throws HeadlessException {
		super();
		this.message = message;
		add(msgLine);
		setSize(i, j);
		setLocation(p, q);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			msgLine.setText(message + " " + i);

			try {
				Thread.sleep(10); // wait for a second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}