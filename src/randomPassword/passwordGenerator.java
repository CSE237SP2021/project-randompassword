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
	}
	
	private static void generatePassword(String passwordLength) {
		int length = Integer.parseInt(passwordLength);
		
		String firstIterationCharacters = lowerCase + upperCase + numbers + symbols; 
		int bankLength = firstIterationCharacters.length();
		
		String password = "";
		for (int i = 0; i < length; i++) {
			int index = new Random().nextInt(firstIterationCharacters.length());
			password += firstIterationCharacters.charAt(index);
		}
		System.out.println(password);
	}
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No command line argument specified. Use help as a command line argument for more information on how to run this program.");
			System.out.println("Example: java randomPassword.passwordGenerator help");
		}
		else if (args[0].equals("help")){
			printBeginningMessage();
		}
		else if (args.length > 0 && args[0].equals("help") == false) {
			generatePassword(args[0]);
		}
	}
}
