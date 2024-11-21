package beans;

public class Address {
	private String state;
	private String district;
	private String village;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (state + " , " + district + " + " + village);
	}
}
