package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import randomPassword.passwordGenerator;

class testAddSpecifiedCharacters {

	@Test
	void test() {
		passwordGenerator testCase = new passwordGenerator();
		String specifiedChars = "abcd";
		String testPassword = "xxxxxxxx";
		boolean containsSpecifiedChars = true;
		
		testPassword = testCase.addSpecifiedCharacters(specifiedChars, testPassword);
		
		for(int j = 0; j < specifiedChars.length(); j++) {
			if(testPassword.indexOf(specifiedChars.charAt(j)) < 0) {
				containsSpecifiedChars = false;
			}
		}
		
		assert(containsSpecifiedChars);
	}

}
