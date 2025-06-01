package stringEx;

public class NoOfWords {

	public static void main(String[] args) {

		String str = "  Call me sherni boy s s s s s  ";
//		String  s = str.trim();
//		System.out.println(s);
		int count = 0;
		String[] words = str.trim().split(" ");
		
		for(String w: words) {
			count++;
		}
		System.out.print(count);
		
	}

}
