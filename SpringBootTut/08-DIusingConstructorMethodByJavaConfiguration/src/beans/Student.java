package beans;

public class Student {
	
	private String name;
	private int rollNumber;
	private Address address;
	
	public Student(String name, int rollNumber, Address address) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.address = address;
	}

	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Roll Number is " + rollNumber);
		System.out.println("Address is " + address);
	}
}
