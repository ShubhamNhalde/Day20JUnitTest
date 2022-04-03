package www.bridgelabz.urp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidMobileFormatTest {

	@Test
	void whenNameRegexMatcherCalled_givenFirstName_shouldReturnTrue() {

		ValidEmailId email = new ValidEmailId();

		boolean regexMatcher = email.firstName("Shubham");
		Assertions.assertTrue(regexMatcher);
	}

	@Test
	void whenNameRegexMatcherCalled_givenLastName_shouldReturnTrue() {

		ValidEmailId email = new ValidEmailId();

		boolean regexMatcher = email.lastName("Nhalde");
		Assertions.assertTrue(regexMatcher);
	}

	@Test
	void whenNameRegexMatcherCalled_givenEmail_shouldReturnTrue() {
		
		String email = "shubham@gmail.com";
		String regex = "^[a-z]{7}@[a-z]{5}[.]{1}[a-z]{3}$";
		boolean result = email.matches(regex);
		
		Assertions.assertTrue(result, "shubham@gmail.com");
	}
	@Test
	void whenNameRegexMatcherCalled_givenMobileFormat_shouldReturnTrue() {
		
		String phone = "91-9919819801";
		String regex = "[0-9]{2}[-][0-9]{10}";
		boolean result = phone.matches(regex);
		
		Assertions.assertTrue(result);
		
	}
	
}
