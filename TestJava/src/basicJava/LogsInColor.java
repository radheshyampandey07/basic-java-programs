package basicJava;

public class LogsInColor {

	// Declaring ANSI_RESET so that we can reset the color
	public static final String ANSI_RESET = "\u001B[0m";

	// Declaring text and background colors
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	public static final String ANSI_BOLD = "\u001B[1m";


	// Main driver method
	public static void main(String[] args) {

		// Printing text with different background colors
		System.out.println(ANSI_RED_BACKGROUND + "This has a RED background" + ANSI_RESET);
		System.out.println(ANSI_GREEN_BACKGROUND + "This has a GREEN background" + ANSI_RESET);
		System.out.println(ANSI_YELLOW_BACKGROUND + "This has a YELLOW background" + ANSI_RESET);
		System.out.println(ANSI_BLUE_BACKGROUND + "This has a BLUE background" + ANSI_RESET);
		System.out.println(ANSI_PURPLE_BACKGROUND + "This has a PURPLE background" + ANSI_RESET);
		System.out.println(ANSI_CYAN_BACKGROUND + "This has a CYAN background" + ANSI_RESET);
		System.out.println(ANSI_WHITE_BACKGROUND + "This has a WHITE background" + ANSI_RESET);

		// Printing colored text with different backgrounds
		System.out.println(ANSI_BLACK + ANSI_WHITE_BACKGROUND + "Black text on White Background" + ANSI_RESET);
		System.out.println(ANSI_WHITE + ANSI_BLACK_BACKGROUND + "White text on Black Background" + ANSI_RESET);
		System.out.println(ANSI_RED + ANSI_CYAN_BACKGROUND + "Red text on Cyan Background" + ANSI_RESET);
		System.out.println(ANSI_BLUE + ANSI_YELLOW_BACKGROUND + "Blue text on Yellow Background" + ANSI_RESET);
		System.out.println(ANSI_BOLD + ANSI_RED + ANSI_WHITE_BACKGROUND + "Bold Red Text on White Background" + ANSI_RESET);

	}
}
