package patterns;

public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int c = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(c+ " ");
				c++;
			}
			System.out.println();
		}

	}

}
