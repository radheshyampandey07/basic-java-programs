package innerClasses;

class SingletonBase {
	private static SingletonBase singletonBase;
	private int age = 22;

	private SingletonBase() {
	}

	private SingletonBase(int a) {
		this.age = a;
	}

	public static SingletonBase getInstance() {
		if (singletonBase == null)
			singletonBase = new SingletonBase();
		return singletonBase;
	}

	public static SingletonBase createInstance(int b) {
		if (singletonBase == null)
			singletonBase = new SingletonBase(b);
		return singletonBase;
	}

	// Other methods and properties of the Singleton class
	public void doSomethingElse() {
		System.out.println("Singleton class is doing something.");
	}

	public void printAge() {
		System.out.println("my age is : " + age);
	}

	public void printAge(int a) {
		this.age = a;
		System.out.println("your age is : " + age);
	}

}

public class SingletonExample {

	public static void main(String[] args) {

		// in following two instances only one instance will be created .
		SingletonBase base = SingletonBase.getInstance();
		base.doSomethingElse();
	
		base.printAge();

		SingletonBase base1 = SingletonBase.createInstance(23);
		base1.printAge(23);

	}

}
