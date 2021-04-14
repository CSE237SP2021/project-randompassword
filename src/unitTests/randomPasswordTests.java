package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import randomPassword.passwordGenerator;

class randomPasswordTests {

	@Test
	void testIsInputInRangeTrue() {
		passwordGenerator testCase = new passwordGenerator();
		
		boolean isInRange = testCase.isInputInRange("123");
		assert(isInRange);
	}

	void testIsInputRangeFalse() {
		passwordGenerator testCase = new passwordGenerator();
		
		boolean isNotInRange = testCase.isInputInRange("thisFails");
		assert(!isNotInRange);
	}
}
