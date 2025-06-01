package reflection;

import java.lang.reflect.Constructor;

class XYZ {
	int x;

	public XYZ() {
		System.out.println("default constructor");
	}

	public XYZ(int x) {
		System.out.println("one parameter constructor");
	}

	public XYZ(int x, int y) {
		System.out.println("two parameter constructor");
	}

}

public class Reflection {

	public static void main(String[] args) {

		Class<?> getInfo = XYZ.class;
		Constructor<?>[] constructors = getInfo.getDeclaredConstructors();
		
		for (Constructor<?> constructor : constructors) {
			System.out.println("Constructor: " + constructor);
		}

	}

}
