package api.practice;

public class Address {

	private String location;
	private String cmpnyName;
	
	public Address(String location, String cmpnyName) {
		super();
		this.location = location;
		this.cmpnyName = cmpnyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCmpnyName() {
		return cmpnyName;
	}
	public void setCmpnyName(String cmpnyName) {
		this.cmpnyName = cmpnyName;
	}
	
	
	
	
	
}
