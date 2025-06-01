package exceptionHandling;

public class MultipleException {

	public static void main(String[] args) {

		int[] arr = { 11, 21, 31, 44 };
//		int arr = 3;
		int n = 0;
		try {

			System.out.println(arr[7] / n);

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// Handling exception
			if (n == 0)
				System.out.println(arr[3] / 2);  
//			e.printStackTrace();
		}
//			catch (ArrayIndexOutOfBoundsException e) {
//
//			e.printStackTrace();
//		}

		System.out.println("successful");

	}

}
