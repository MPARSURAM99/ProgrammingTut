package sis.model;

public class Student {
private String studentId;
private String name;
private String email;
private String mobile;
private int age;
private String UserName;
private String Passward;



public Student(String studentId, String name, String email, String mobile, int age, String userName, String passward) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.age = age;
	UserName = userName;
	Passward = passward;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassward() {
	return Passward;
}
public void setPassward(String passward) {
	Passward = passward;
}
public String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return mobile;
}
public Student(String studentId, String name, String email, String mobile, int age) {
	super();
	this.studentId = studentId;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
	this.age = age;
}
public Student() {
	// TODO Auto-generated constructor stub
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getUserid() {
	// TODO Auto-generated method stub
	return null;
}


}
