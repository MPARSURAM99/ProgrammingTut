package beans;

public class Student {
//	Declaring bean object property;
	private String name;
	private int rollNumber;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Roll Number is " + rollNumber);
		System.out.println("Email id is " + email);
		System.out.println("=================================");
	}
	
}
