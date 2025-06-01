package innerClasses;

class EagerSingelton {
	// this will create instance of the class whether it is going to be used or not.
	private static EagerSingelton connection1 = new EagerSingelton();

	private EagerSingelton() {

	}

	public static EagerSingelton getInstance() {
		return connection1;
	}
}

class StaticSingelton {
	private static StaticSingelton singelton;

	private StaticSingelton() {
	}

	// static block initialization for exception handling
	static {
		try {
			singelton = new StaticSingelton();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}
}

class LazyInitializationSingelton {
	private static LazyInitializationSingelton instance = null;

	private LazyInitializationSingelton() {

	}

// In this case if multiple thread tries to access this method then it will create multiple obj.
	public static LazyInitializationSingelton getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingelton();
		}
		return instance;
	}
}

class ThreadSafeSingelton {
	private static ThreadSafeSingelton instance;

	private ThreadSafeSingelton() {
	}

	// since it is using synchronized then it is making it slow to use as
	// when multiple thread will hit then it will make them wait.
	public synchronized static ThreadSafeSingelton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingelton();
		}
		return instance;
	}
}

class BillPughSingelton {
	// inner class will be used only when it is called
	private static class SingeltonHelper {
		private static BillPughSingelton singelton = new BillPughSingelton();
	}

	public static BillPughSingelton getInstance() {
		return SingeltonHelper.singelton;
	}
}

public class TypesOfSingelontonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
