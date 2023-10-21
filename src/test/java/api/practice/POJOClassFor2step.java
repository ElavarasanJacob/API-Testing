package api.practice;

public class POJOClassFor2step {
	
	private String firstName;
	private String lastName;
	private long rowNo;

	public POJOClassFor2step(String firstName, String lastName, long rowNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rowNo = rowNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getRowNo() {
		return rowNo;
	}
	public void setRowNo(long rowNo) {
		this.rowNo = rowNo;
	}

}
