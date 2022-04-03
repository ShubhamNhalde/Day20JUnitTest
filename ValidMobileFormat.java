package www.bridgelabz.urp;

/**
 * Purpose: Check Whether Mobile Number Is Valid Or Not
 * @author ShubhamNhalde
 * @since 31/03/2022
 */

public class ValidMobileFormat {

	public static void main(String[] args) {
		System.out.println(firstName("Shubham"));
		System.out.println(lastName("Nhalde"));

		email();
		phoneNumber();
	}

	// validate first name
	public static boolean firstName(String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

	// validate last name
	public static boolean lastName(String lastName) {
		return lastName.matches("[A-Z]{1}[a-z]{2,}$");
	}

	// validate given email
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

	// validate given phone number
	public static void phoneNumber() {
		String phone = "91-9919819801";
		String regex = "[0-9]{2}[-][0-9]{10}";
		boolean result = phone.matches(regex);
		if (result) {
			System.out.println("Given phone number is valid");
		} else {
			System.out.println("Given phone number is not valid ");
		}
	}

}
