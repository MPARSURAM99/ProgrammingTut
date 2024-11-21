package beans;

public class Student {
	private String name;
	private int rollNumber;

//	Here data type should be the class name of dependency to be injected.
	private Address address;
	

	
	public String getName() {
		return name;
	}



	public void setName(String name) {
//		Here setter method is calling & di is happening by the setter method.
		System.out.println("Student Name.");
		this.name = name;
	}



	public int getRollNumber() {
		return rollNumber;
	}



	public void setRollNumber(int rollNumber) {
		System.out.println("Student roll number.");
		this.rollNumber = rollNumber;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		System.out.println("Student address.");
		this.address = address;
	}



	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Roll Number is " + rollNumber);
		System.out.println("Address is " + address);
		System.out.println("==================================");
	}
}
