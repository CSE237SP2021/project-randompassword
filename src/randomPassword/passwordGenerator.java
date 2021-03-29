package randomPassword;

import java.util.Random;

public class passwordGenerator {
	public static void main(String[] args) {
		//separated all possible characters for future iterations
		//this will allow for the implementation of specific characters being needed
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "1234567890";
		String symbols = "~`!@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
		//joined all strings for creation of random password function in first iteration **will change with user input implementation**
		String firstIterationCharacters = lowerCase + upperCase + numbers + symbols; 
		int bankLength = firstIterationCharacters.length();
		
		//RandomPasswordGenerator autoset to 15 **will implement user input next**
		String password = "";
		for (int i = 0; i < 15; i++) {
			int index = new Random().nextInt(firstIterationCharacters.length());
			password += firstIterationCharacters.charAt(index);
		}
		System.out.println(password);
	}
}
