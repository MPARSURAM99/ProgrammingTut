package beans;

public class Address {
	private String state;
	private String district;
	private String village;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		System.out.println("Student state.");
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		System.out.println("Student district.");
		this.district = district;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		System.out.println("Student village.");
		this.village = village;
	}
	
//	Override to string
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (village + " , " + district + " , " + state);
	}
}
