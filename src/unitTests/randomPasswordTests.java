package unitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import randomPassword.passwordGenerator;
import randomPassword.password;

class randomPasswordTests {

	@Test
	void testIsInputInRangeTrue() {
		password testCase = new password();
		
		boolean isInRange = testCase.isInputInRange("123");
		assert(isInRange);
	}
	
	@Test
	void testIsInputRangeFalse() {
		password testCase = new password();
		
		boolean isNotInRange = testCase.isInputInRange("thisFails");
		assert(!isNotInRange);
	}
	
//	@Test
//	void testinsertSpecifiedCharAtGeneratedPosition() {
//		password testCase = new password();
//		String specChars = "abc";
//		String password = "xxxxxx";
//		int[] randomIndices = {3,1,5};
//		String tempPassword = "";
//		
//		String generatedPass = testCase.insertSpecifiedCharAtGeneratedPosition(specChars, password, randomIndices, tempPassword);
//		
//		boolean charsAtExpectedLoc = false;
//		char firstChar = generatedPass.charAt(randomIndices[0] + 1);
//		char secondChar = generatedPass.charAt(randomIndices[1] + 1);
//		char thirdChar = generatedPass.charAt(randomIndices[2] + 1);
//		if(firstChar == specChars.charAt(0) && secondChar == specChars.charAt(1) && thirdChar == specChars.charAt(2)) {
//			charsAtExpectedLoc = true;
//		}
//		
//		assert(charsAtExpectedLoc);
//	}
	
	@Test
	void testgenerateSpecifiedCharPosition() {
		password testCase = new password();
		String specChars = "abc";
		String password = "xxxxxx";
		
		int[] genPos = testCase.generateSpecifiedCharPosition(specChars, password);
		boolean isRightSize = genPos.length == specChars.length();
		boolean isInLength = true;
		
		for(int j = 0; j < genPos.length; j++) {
			if(genPos[j] > password.length()) {
				isInLength = false;
			}
		}
		assert(isInLength && isRightSize);
	}
	
}
