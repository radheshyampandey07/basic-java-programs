package stringEx;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println(str.length() / 2);
		int j = str.length() - 1;
		for (int i = 0; i < str.length() / 2 && j > str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(j)) {
				j--;
			} else {
				break;
			}
		}
		if (j == str.length() / 2)
			System.out.println("palindrome");
		else
			System.out.println("string is not palindrome");
	}

}
