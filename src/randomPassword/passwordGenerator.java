package randomPassword;

import java.util.Random;

public class passwordGenerator {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No command line argument specified. Use help as a command line argument for more information on how to run this program.");
			System.out.println("Example: java randomPassword.passwordGenerator help");
		}
		else if (args[0].equals("help")){
			// type help message
			System.out.println("help was specified");
		}
		else if (args.length > 0 && args[0].equals("help") == false) {
			int passwordLength = Integer.parseInt(args[0]);
			//System.out.println("help was not specified, can continue checking inputs");
			
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
			for (int i = 0; i < passwordLength; i++) {
				int index = new Random().nextInt(firstIterationCharacters.length());
				password += firstIterationCharacters.charAt(index);
			}
			System.out.println(password);
		}
	}
}
