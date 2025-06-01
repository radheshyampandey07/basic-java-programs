package innerClasses;

class Hello {
	private String msgHello = "Hello World!";

	// Java Member Inner Class Example
	public Hello() {
		System.out.println(msgHello);
	}

	class Hi {
		String msg = "Hi World !!";

		public Hi() {
			System.out.println(msg + msgHello);
		}
	}
}

public class InnerClassesExamples {

	public static void main(String[] args) {
		Hello hello = new Hello();
		Hello.Hi hi = hello.new Hi();
	}

}
