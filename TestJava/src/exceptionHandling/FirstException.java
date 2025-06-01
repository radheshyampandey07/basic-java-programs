package exceptionHandling;

class UserDefinedException extends RuntimeException {
	public UserDefinedException(String msg) {
		super(msg);
	}
}

public class FirstException {

	// throws keyword is used to declare that this kind of of exception may be occur.
	// either throws or try catch blocks are necessary to handle exception

	public static void main(String[] args) {
		int n = 17;
		try {
			if (n < 18) {
				// throw keyword is used to create exception object manually.
				// The Java throw keyword is used to throw an exception explicitly.
				throw new UserDefinedException("Person is not eligible to vote.");

				// after throw clause no code will compile.
//				System.out.println("helo");
			} else
				System.out.println("Person is eligible to vote!!");

		} catch (UserDefinedException e) {
			System.out.println(e.getMessage());

			// printStackTrace() method prints exception name,
			// description and where it occurs.
//			e.printStackTrace();

//			e.toString();

		} finally {
			System.out.println("finally exception handled");
		}
	}

}
