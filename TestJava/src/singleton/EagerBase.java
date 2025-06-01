package singleton;

class EagerMain {

	private static EagerMain eagerInitialization = new EagerMain();

	private EagerMain() {
		System.out.println("eager initilization of singleton class.");
	}

	public static EagerMain getInstance() {
		System.out.println("return single object...");
		return eagerInitialization;
	}
}

public class EagerBase {
	public static void main(String[] args) {
		// now we can not create object using new 
//		EagerInitialization initialization = new 
		// to create a object we have use 
		EagerMain initialization  = EagerMain.getInstance();
//		initialization.getInstance();
	}
}
