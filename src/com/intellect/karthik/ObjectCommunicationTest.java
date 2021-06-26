package com.intellect.karthik;

class BookMyShowClient {
	BookMyShowServer server;

	public BookMyShowClient(BookMyShowServer server) {
		super();
		this.server = server;
	}

	void bookTicket(float amt) {
		server.bookTicket(amt);
	}
}

class BookMyShowServer {
	BookMyShow bms;

	public BookMyShowServer(BookMyShow bms) {
		super();
		this.bms = bms;
	}

	void bookTicket(float amt) {
		bms.bookTicket(amt);
	}
}

class BookMyShow {
	private float ticket;

	public BookMyShow(float ticket) {
		super();
		this.ticket = ticket;
	}

	void bookTicket(float amt) {
		System.out.println("BookMyShow: before " + ticket);
		ticket = ticket - amt;
		System.out.println("BookMyShow: after " + ticket);
	}

	float getBill() {
		return ticket;
	}
}

public class ObjectCommunicationTest {

	public static void main(String[] args) {
		BookMyShow bms = new BookMyShow(150);
		BookMyShowServer server = new BookMyShowServer(bms);
		BookMyShowClient client = new BookMyShowClient(server);
		client.bookTicket(150);

	}
}
