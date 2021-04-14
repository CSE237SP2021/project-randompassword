package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import randomPassword.passwordGenerator;

class testGeneratePassword {

	@Test
	void testGeneratePasswordLength() {
		passwordGenerator testCase = new passwordGenerator();
		int desiredLength = 5;
		boolean isDesiredLength = false;
		
		String generatedPassword = testCase.generatePassword(String.valueOf(desiredLength));
		
		if(desiredLength == generatedPassword.length()) {
			isDesiredLength = true;
		}
		
		assert(isDesiredLength);
	}

}
