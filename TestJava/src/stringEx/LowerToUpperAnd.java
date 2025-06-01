package stringEx;

public class LowerToUpperAnd {

	public static void main(String[] args) {
		String tr = "Hello! there";
		char[] ch = tr.toCharArray();
		for (int i = 0; i < tr.length(); i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char) (ch[i] + 32);
			}
		}
		System.out.println(ch);
	}
}
