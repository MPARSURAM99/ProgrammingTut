package beans;

public class Address {
	
	private String state;
	private String district;
	private String village;
	
	public Address(String state, String district, String village) {
		super();
		this.state = state;
		this.district = district;
		this.village = village;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (state + " , " + district + " , " + village);
	}
}
