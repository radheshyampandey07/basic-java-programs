package basicJava;

public class SwitchCases {

	public static void main(String[] args) {

		/*
		 * int, char, byte, short is allowed in switch 
		 * ENUMs are allowed since JDK 1.5
		 * Strings are allowed since JDK 1.7
		 */
		String str = "Radhe";

		switch (str) {
		case "Hi":
			System.out.println("Hi " + str);
			break;
		case "Hello":
			System.out.println("Hello " + str);
			break;
		case "Radhe":
			System.out.println("Hey " + str);
			break;

		default:
			System.out.println("Default " + str);
			break;
		}

	}

}
