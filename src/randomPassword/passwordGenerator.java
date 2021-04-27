package randomPassword;

public class passwordGenerator {
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
	
	
	public static void main(String[] args) {
		run(args);
	}
	/**
	 * This method generates a password when there has only been two parameters given
	 * @param args arguments entered when the program was first ran
	 * @param passwordObj generated password from password class
	 */
	private static void generatePasswordTwoParameters(String[] args, password passwordObj) {
		if(passwordObj.isInputInRange(args[0])) {
			passwordObj.generatePassword(args[0], args[1]);
		}else {
			printArgumentErrorMessage();
			printBeginningMessage();
		}
	}
	/**
	 * This method generates a password when there has only been one parameter given
	 * @param args arguments entered when the program was first ran
	 * @param passwordObj generated password from password class
	 */
	private static void generatePasswordSingleParameter(String[] args, password passwordObj) {
		if(passwordObj.isInputInRange(args[0])) {
			passwordObj.generatePassword(args[0]);
		}else {
			printArgumentErrorMessage();
			printBeginningMessage();
		}
	}
	/**
	 * This method runs the program; it uses the arguments the user inputs to call the appropriate methods
	 * @param args arguments entered when the program first ran
	 */
	private static void run(String[] args) {
		int argsLength = args.length;
		password passwordObj = new password();
		switch(argsLength) {
			case 0:
				printArgumentErrorMessage();
				break;
			case 1:
				if (args[0].equals("help")) {
					printBeginningMessage();
				} else {
					generatePasswordSingleParameter(args, passwordObj);
				}
				break;
			case 2:
				generatePasswordTwoParameters(args, passwordObj);
				break;
		}
	}
}
