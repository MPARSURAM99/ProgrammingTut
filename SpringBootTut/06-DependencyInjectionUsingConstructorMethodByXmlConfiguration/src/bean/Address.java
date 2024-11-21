package bean;

public class Address {
	private String state;
	private String district;
	private String village;
	
//	Creating construction using field for dependency injection.
	public Address(String state, String district, String village) {
		super();
		this.state = state;
		this.district = district;
		this.village = village;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return(state + " , " + district + " , " + village);
	}
	
}
