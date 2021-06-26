package com.intellect.karthik;

abstract class Person {
	private int id;
	private String name;
	private String addrs;

	abstract void getting(String gain);

	public Person(int id, String name, String addrs) {
		super();
		this.id = id;
		this.name = name;
		this.addrs = addrs;
	}

	void displayDetails() {
		System.out.println("id no" + id);
		System.out.println("Name" + name);
		System.out.println("Address" + addrs);
	}

}

class Student extends Person {

	private String course;

	// parameterized ctor
	public Student(int id, String name, String addrs) {
		super(id, name, addrs);
	}

	void displayDetails() {
		super.displayDetails();
		System.out.println("Course" + course);
	}

	@Override
	void getting(String gain) {
		System.out.println(gain);
	}

}

class Employee extends Student {

	private String deptNo;

	public Employee(int id, String name, String addrs, String deptNo) {
		super(id, name, addrs);
		this.deptNo = deptNo;
	}

	void getting(String gain) {
		System.out.println(gain);
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("deptNumber " + deptNo);
	}

}

public class InheritanceTest {
	public static void main(String[] args) {

		Student s = new Student(101, "Karthik", "4-150/A,kurnool,AP");
		s.displayDetails();
		s.getting("knowledge");

		Employee e = new Employee(11, "Karthik", "4-150/A,kurnool,AP", "Core Java");
		e.displayDetails();
		e.getting("salary");

	}
}
