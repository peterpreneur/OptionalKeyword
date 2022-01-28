package OptionalDemo;

public class OptionalDemo {

	public static void main(String[] args) {
		Profile profile1 = new Profile("Trevor", "Page");
		
		outputProfile(profile1);		
		
	}

	private static void outputProfile(Profile profile) {
		System.out.println("First Name: " + profile.getFirstName().trim());
		System.out.println("Middle Name: " + profile.getMiddleName().trim());
		System.out.println("Last Name: " + profile.getLastName().trim());
		System.out.println("Hobbies: " + profile.getHobbies().trim());
	}

}
