package stringEx;

@FunctionalInterface
interface Example {
	public int sum(int a, int b);
}

public class LambdaEx {

	public static void main(String[] args) {

		Example ex = (a, b) -> {
			return a + b;
		};

		int a = ex.sum(5, 6);
		System.out.println(a);

		Example ex1 = (u, i) -> {
			return u - i;
		};
		System.out.println(ex1.sum(5, 6));;
//		
//		Example ex2 = (a, b) -> {
//			System.out.println(a*b);
//		};
//		ex2.sum(5, 6);

	}

}
