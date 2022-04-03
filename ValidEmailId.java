  package www.bridgelabz.urp;

/**
 * Purpose: Check Whether Mobile Number Is Valid Or Not
 * @author ShubhamNhalde
 * @since 31/03/2022
 */

public class ValidEmailId {

	public static void main(String[] args) {
		System.out.println(firstName("Shubham"));
		System.out.println(lastName("Nhalde"));

		email();
	}

	// Method for Checking validate first name
	public static boolean firstName(String firstName) {
		
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

	// Method For Checking validate last name
	public static boolean lastName(String lastName) {
		return lastName.matches("[A-z]{1}[a-z]{2,}$");
	}

	// Method For Checking validate given email
	public static void email() {
		String email = "shubham@gmail.com";
		String regex = "^[a-z]{7}@[a-z]{5}[.]{1}[a-z]{3}$";
		boolean result = email.matches(regex);
		if (result) {
			System.out.println("Given email-id is valid");
		} else {
			System.out.println("Given email-id is not valid");
		}

	}

}
