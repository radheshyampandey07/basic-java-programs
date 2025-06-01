package patterns;

public class NumberPatern {

	public static void main(String[] args) {

//		Scanner scn = new Scanner(System.in);
//		int n;
//		System.out.println("Enter a number");
//		n = scn.nextInt();
		int num = 5;
		for (int i = num; i >= 1; i--) {			
			for (int j = num; j >= i; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
