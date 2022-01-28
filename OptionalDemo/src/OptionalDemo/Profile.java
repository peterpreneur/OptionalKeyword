package OptionalDemo;

public class Profile {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Profile(String firstName, String middleName) {
		this.firstName = firstName;
		this.middleName = middleName;
	}
	
	private String hobbies;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return "Profile [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", hobbies=" + hobbies + "]";
	}
	
}
