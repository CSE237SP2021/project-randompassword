package randomPassword;

import java.util.Random;

public class password {
	private static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	private static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String numbers = "1234567890";
	private static String symbols = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
	private static String characters = lowerCase + upperCase + numbers + symbols;
	
	/**
	 * This method adds any specific characters randomly into a given password
	 * @param specifiedCharacters characters you want added into the password
	 * @param password given password where the specifiedCharacters are going to be added
	 * @return new password with specified characters randomly inserted into it
	 */
	public String addSpecifiedCharacters(String specifiedCharacters, String password) {
		int[] randomIndices = generateSpecifiedCharPosition(specifiedCharacters, password);
		String tempPassword = "";
		password = insertSpecifiedCharAtGeneratedPosition(specifiedCharacters, password, randomIndices, tempPassword);
		return password;
	}
	/**
	 * This method inserts the specified characters into the array at the given positions
	 * @param specifiedCharacters characters you want added into the password
	 * @param password given password where the specifiedCharacters are going to be added
	 * @param randomIndices the array containing the positions the specifiedCharacters will be added
	 * @param tempPassword a string that temporarily holds the generated password
	 * @return password with the specifiedCharacters inserted at the given positions
	 */
	public String insertSpecifiedCharAtGeneratedPosition(String specifiedCharacters, String password,
			int[] randomIndices, String tempPassword) {
		for (int i = 0; i < specifiedCharacters.length(); i++) {
			for (int j = 0; j < password.length(); j++) {
				tempPassword += password.charAt(j);
				if (randomIndices[i] == j) {
					tempPassword += specifiedCharacters.charAt(i);
				}
			}
			password = tempPassword;
			tempPassword = "";
		}
		return password;
	}
	
	/**
	 * This method randomly generates the positions that the specifiedCharacters will be placed
	 * @param specifiedCharacters characters you want added into the password
	 * @param password given password where the specifiedCharacters are going to be added
	 * @return an array containing the positions the specifiedCharacters will be placed
	 */
	public int[] generateSpecifiedCharPosition(String specifiedCharacters, String password) {
		int randomIndices[] = new int[specifiedCharacters.length()];
		for (int i = 0; i < randomIndices.length; i++) {
			randomIndices[i] = new Random().nextInt(password.length());
		}
		return randomIndices;
	}
	/**
	 * Generates password with specific length 
	 * @param passwordLength desired password length
	 */
	public void generatePassword(String passwordLength) {
			int length = Integer.parseInt(passwordLength); 
			String password = "";
			for (int i = 0; i < length; i++) {
				int index = new Random().nextInt(characters.length());
				password += characters.charAt(index);
			}
			System.out.println(password);
	}
	/**
	 * Generates password including specific characters
	 * @param passwordLength desired password length
	 * @param specifiedCharacters specific characters to include in password generation
	 */
	public void generatePassword(String passwordLength, String specifiedCharacters) {
			int length = Integer.parseInt(passwordLength) - specifiedCharacters.length();
			String password = "";
			for (int i = 0; i < length; i++) {
				int index = new Random().nextInt(characters.length());
				password += characters.charAt(index);
			}
			password = addSpecifiedCharacters(specifiedCharacters, password);
			System.out.println(password);
		
	}
	/**
	 * This functions determines if the givenInput are within the range of inputs acceptable to run the program
	 * @param givenInput
	 * @return a boolean stating whether givenInput is within the range of acceptable inputs to run the program
	 */
	public boolean isInputInRange(String givenInput) {
		boolean isInputInRange = false;
		char firstCharInInput = givenInput.charAt(0);
		if(numbers.indexOf(firstCharInInput) >= 0 ) {
			isInputInRange = true;
		}
		
		return isInputInRange;
	}
}
