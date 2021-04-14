package randomPassword;

import java.util.Random;

public class passwordGenerator {
	private static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	private static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String numbers = "1234567890";
	private static String symbols = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
	private static String characters = lowerCase + upperCase + numbers + symbols;
	
	private static void printBeginningMessage() {
		System.out.println("Welcome to You Shall Not Pass. This is a random password generator.");
		System.out.println("To begin using the program, run the program as:");
		System.out.println("				java randomPassword.passwordGenerator <length> <characters>");	
		System.out.println("Where length is the desired length of the password and characters is any specific characters wanted in the password.Ommit the <>");
		System.out.println("<length> is required for program to run. <characters> is optional, if left blank will generate password randomly.");
		System.out.println("Example:");
		System.out.println("java randomPassword.passwordGenerator 5");
		System.out.println("or");
		System.out.println("java randomPassword.passwordGenerator 10 *Dg");
	}
	private static void printArgumentErrorMessage() {
		System.out.println("No command line argument specified or arguments were incorrect. Use help as a command line argument for more information on how to run this program.");
		System.out.println("Example: java randomPassword.passwordGenerator help");
	}
	/**
	 * This method adds any specific characters randomly into a given password
	 * @param specifiedCharacters characters you want added into the password
	 * @param password given password where the specifiedCharacters are going to be added
	 * @return new password with specified characters randomly inserted into it
	 */
	private static String addSpecifiedCharacters(String specifiedCharacters, String password) {
		int randomIndices[] = new int[specifiedCharacters.length()];
		for (int i = 0; i < randomIndices.length; i++) {
			randomIndices[i] = new Random().nextInt(password.length());
		}
		String tempPassword = "";
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
	 * Generates password with specific length 
	 * @param passwordLength desired password length
	 */
	private static void generatePassword(String passwordLength) {
		if(isInputInRange(passwordLength)) {
			int length = Integer.parseInt(passwordLength); 
			String password = "";
			for (int i = 0; i < length; i++) {
				int index = new Random().nextInt(characters.length());
				password += characters.charAt(index);
			}
			System.out.println(password);
		} else {
			printArgumentErrorMessage();
			printBeginningMessage();
		}
		
	}
	/**
	 * Generates password including specific characters
	 * @param passwordLength desired password length
	 * @param specifiedCharacters specific characters to include in password generation
	 */
	private static void generatePassword(String passwordLength, String specifiedCharacters) {
		if(isInputInRange(passwordLength)) {
			int length = Integer.parseInt(passwordLength) - specifiedCharacters.length();
			String password = "";
			for (int i = 0; i < length; i++) {
				int index = new Random().nextInt(characters.length());
				password += characters.charAt(index);
			}
			password = addSpecifiedCharacters(specifiedCharacters, password);
			System.out.println(password);
		} else {
			printArgumentErrorMessage();
			printBeginningMessage();
		}
		
	}
	
	public static boolean isInputInRange(String givenInput) {
		boolean isInputInRange = false;
		char firstCharInInput = givenInput.charAt(0);
		if(numbers.indexOf(firstCharInInput) >= 0 ) {
			isInputInRange = true;
		}
		
		return isInputInRange;
	}
	
	public static void main(String[] args) {
		int argsLength = args.length;
		switch(argsLength) {
			case 0:
				printArgumentErrorMessage();
				break;
			case 1:
				if (args[0].equals("help")) {
					printBeginningMessage();
				} else {
					generatePassword(args[0]);
				}
				break;
			case 2:
				generatePassword(args[0], args[1]);
				break;
		}
	}
}
