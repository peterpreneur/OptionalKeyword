package OptionalDemo;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Profile profile1 = new Profile("Trevor", "Page");		
		outputProfile(profile1);		

		Profile profile2 = new Profile("Jane","Doe");
		profile2.setMiddleName(Optional.of("Lane"));
		outputProfile(profile2);

		Profile profile3 = new Profile("John","Doe");
		profile3.setMiddleName(Optional.of("Wayne"));
		profile3.setHobbies(Optional.of("Golf"));
		outputProfile(profile3);
	
	}

	private static void outputProfile(Profile profile) {
		System.out.println("First Name: " + profile.getFirstName().trim());

		profile.getMiddleName().ifPresent(middleName -> System.out.println("Middle Name: " + middleName));
		
		System.out.println("Last Name: " + profile.getLastName().trim());
		
		profile.getHobbies().ifPresent(hobbies -> System.out.println("Hobbies: " + hobbies));

	}

}
