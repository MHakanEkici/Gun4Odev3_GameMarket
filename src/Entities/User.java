package Entities;

public class User {
	
	private String firstName;
	private String lastName;
	private String nationalId;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String nationalId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
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

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

}
