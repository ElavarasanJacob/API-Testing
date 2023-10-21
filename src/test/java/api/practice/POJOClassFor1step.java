package api.practice;

import java.util.List;

public class POJOClassFor1step {
	
	private String name;
	private String email;
	private long phoneNo;
	private int idno;
	private List<POJOClassFor2step> details;
	private Address address;
	
	public POJOClassFor1step(String name, String email, long phoneNo, int idno, List<POJOClassFor2step> details,
			Address address) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.idno = idno;
		this.details = details;
		this.address = address;
	}
	public List<POJOClassFor2step> getDetails() {
		return details;
	}
	public void setDetails(List<POJOClassFor2step> details) {
		this.details = details;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}

}
