package debugging;

public class Main {

	public static String sayHi() {
		return "Hello world";
	}

	public static String sayHello(String name) {
		return "Hello " + name;
	}

	public static void main(String[] args) {

		String msg = null;
		msg = sayHi();
		System.out.println(msg);
		
		msg = sayHello("Radhe");
		System.out.println(msg);

		StudentService service = new StudentService();
		System.out.println(service.getAll());
	}

}
