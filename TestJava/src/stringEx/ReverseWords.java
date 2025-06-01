package stringEx;

public class ReverseWords {

	public static void main(String[] args) {
		String str = "Hello there Im the boss";
		String[] str1 = str.split(" ");
//		System.out.println(str1[0]);
		for (int i = str1.length-1; i >= 0; i--)
			System.out.print(str1[i]+ " ");
	}

}
