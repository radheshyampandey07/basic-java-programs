package basicJava;

public class StringTest {

	// Q.2 Prepare a hashmap & sort a hashmap using java 8 stream functionality,
	// values should be sorted in descending order,
	// map should be of string & integer

	// E#&D%^C*B@A)#@ - reverse this string,
	// keeping the special characters fixed
	public static void main(String[] args) {

		String str = "#&D%^C*B@A)#@";
		// A#&B%^C*D@E)#@
		char[] ch = str.toCharArray();
		System.out.println(ch);

		for (int i = 0, j = ch.length - 1; i < ch.length / 2 && j > ch.length / 2;) {
			if (ch[j] >= 65 && ch[j] < 91) {
				if (ch[i] >= 65 && ch[i] < 91) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					j--;
					i++;
				} else
					i++;
			} else
				j--;

		}

		System.out.println(ch);
		System.out.println("program end");
	}
}
