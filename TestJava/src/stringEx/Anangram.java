package stringEx;

public class Anangram {

	public static void main(String[] args) {
		String str = "silent";
		String str1 = "listen";
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
//		if(str.charAt(1) > str.charAt(3))
//			System.out.println("greater");

		// sort both string
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[j] < ch[i]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
				if (ch1[j] < ch1[i]) {
					char temp1 = ch1[i];
					ch1[i] = ch1[j];
					ch1[j] = temp1;
				}
			}
		}
		String st = new String(ch);
		String st1 = new String(ch1);
		System.out.println("string 1 : "+ st);
		System.out.println("string 2 : "+ st1);

		if (st.equals(st1))
			System.out.println("string are anagram");
	}

}
