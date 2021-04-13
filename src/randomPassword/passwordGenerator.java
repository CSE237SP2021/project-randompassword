package randomPassword;

import java.util.Random;

public class passwordGenerator {
	private static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	private static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String numbers = "1234567890";
	private static String symbols = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
	
	private static void printBeginningMessage() {
		System.out.println("Welcome to You Shall Not Pass. This is a random password generator. "
				+ "To begin using the program, run the program normally and add a password length as a command line argument.");
		System.out.println("For example, if your desired password length is 5, run the program as: java randomPassword.passwordGenerator 5");
		
		//TODO: Update commands here
	}
	private static void printArgumentErrorMessage() {
		System.out.println("No command line argument specified or arguments were incorrect. Use help as a command line argument for more information on how to run this program.");
		System.out.println("Example: java randomPassword.passwordGenerator help");
	}
	//TODO: Add specified characters feature to generating step
	private static void generatePassword(String passwordLength) {
		int length = Integer.parseInt(passwordLength);
		
		String firstIterationCharacters = lowerCase + upperCase + numbers + symbols; 
		
		String password = "";
		for (int i = 0; i < length; i++) {
			int index = new Random().nextInt(firstIterationCharacters.length());
			password += firstIterationCharacters.charAt(index);
		}
		System.out.println(password);
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
			case 2:
				//generatePassword(args[0], args[1]);
		}
	}
}
