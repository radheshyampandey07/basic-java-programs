package stringEx;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String str = "@A321Ab!hj*&^nui)";
		char[] ch = str.toCharArray();
		char[] ch1 = new char[ch.length];
		for (int i = 0, j = 0; i < ch.length; i++) {
			if ((ch[i] >= 65 && ch[i] <= 90) || (ch[i] >= 97 && ch[i] <= 122)) {
				ch1[j] = ch[i];
				j++;
			}
		}
		System.out.print(ch1);
	}
}
