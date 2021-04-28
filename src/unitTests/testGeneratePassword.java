package unitTests;

import static org.junit.jupiter.api.Assertions.*;
import randomPassword.password;

import org.junit.jupiter.api.Test;

class testGeneratePassword {

	@Test
	void testGeneratePasswordLength() {
		password testCase = new password();
		int desiredLength = 5;
		boolean isDesiredLength = false;
		
		String generatedPassword = testCase.generatePassword(String.valueOf(desiredLength));
		
		if(desiredLength == generatedPassword.length()) {
			isDesiredLength = true;
		}
		
		assert(isDesiredLength);
	}
	
	@Test
	void testGeneratePasswordIncludeCharacters() {
		password testCase = new password();
		int desiredLength = 5;
		String desiredChars = "Abc";
		boolean isDesiredLength = false;
		boolean containsChars = false;
		
		String generatedPassword = testCase.generatePassword(String.valueOf(desiredLength),desiredChars);
		
		if(desiredLength == generatedPassword.length()) {
			isDesiredLength = true;
		}
		if((generatedPassword.indexOf(desiredChars.charAt(0)) > -1) && (generatedPassword.indexOf(desiredChars.charAt(1)) > -1) && (generatedPassword.indexOf(desiredChars.charAt(2)) > -1)) {
			containsChars = true;
		}
		
		assert(isDesiredLength && containsChars);
	}

}
