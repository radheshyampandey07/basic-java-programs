package stringEx;

public class MakeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abd";
		
		for(int i=0; i<str.length(); i++) {
			for(int j =i; j<=str.length(); j++) {
				System.out.print(str.substring(i, j) + " ");
			}
		}
	}
}
