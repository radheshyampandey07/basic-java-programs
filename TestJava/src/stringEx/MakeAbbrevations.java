package stringEx;

import java.util.Scanner;

public class MakeAbbrevations {

	// Write a program that takes your full name as input
	// and displays the abbreviations of the first and middle names
	// except the last name which is displayed as it is.
	// For example, if your name is Radhe Shyam Pandey, then the output should be
	// R.S. Pandey.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a name");
		String name = sc.nextLine();
		System.out.print(name.charAt(0) + ".");
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ')
				// System.out.print(i);
				System.out.print(name.charAt(i+1)+".");
		}
	}
}
