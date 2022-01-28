package OptionalDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Profile {
	private String firstName;
	private Optional<String> middleName = Optional.empty();
	private String lastName;
	private Optional<String> hobbies = Optional.empty();
	
	private List<String> friends = new ArrayList<>();
	
	public Profile(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	public Optional<String> getMiddleName() {
		return middleName;
	}

	public void setMiddleName(Optional<String> middleName) {
		this.middleName = middleName;
	}

	public Optional<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Optional<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Profile [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", hobbies=" + hobbies + "]";
	}
	
}
