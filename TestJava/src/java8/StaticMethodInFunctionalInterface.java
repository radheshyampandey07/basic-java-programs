package java8;

interface AB {
	static void sayHEllo() {
		System.out.println("say hello there!");
	}
}

public class StaticMethodInFunctionalInterface {
	static void sayHEllo() {
		System.out.println("say hello there!");
	}

	public static void main(String[] args) {
		AB.sayHEllo();

	}

}
