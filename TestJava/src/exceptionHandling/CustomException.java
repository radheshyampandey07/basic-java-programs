package exceptionHandling;

class MyException extends Exception {
	public MyException() {
		super("I am throwing my custom exception");
	}
}

public class CustomException {

	public static void main(String[] args) {
		int x = 100;
		try {
			if (x > 2) {
				System.out.println(x);
				throw new MyException();
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

}
