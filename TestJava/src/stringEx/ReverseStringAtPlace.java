package stringEx;

import java.util.Scanner;

public class ReverseStringAtPlace {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scn.nextLine();
//		String str = "Call me Phenomenal";
		str+= ' ';
		for (int i = 0, j = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
//				System.out.println(i);
				for (int k = i-1; k >= j; k--) {
					System.out.print(str.charAt(k));
				}
				System.out.print(' ');
				j = i;
			}
		}
	}
}
