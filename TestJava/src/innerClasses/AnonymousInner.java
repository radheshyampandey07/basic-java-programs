package innerClasses;

interface Eatable {
	void sayHi();

	default void sayHello() {
		System.out.println("say hello");
	}
}

abstract class Person {
	abstract void eat();

	abstract void sleep();

}

public class AnonymousInner {

	public static void main(String[] args) {
		// instead of implementing interface or abstract classes in another class
		// we can directly implement their methods
		Person p = new Person() {

			@Override
			void eat() {
				System.out.println("I am eating");
			}

			@Override
			void sleep() {
				System.out.println("I want to sleep");
			}
		};
		p.eat();
		p.sleep();

		Eatable eatable = new Eatable() {

			@Override
			public void sayHi() {
				System.out.println("i want to eat..");
			}
		};
		
		Eatable eatable2 = () -> {
			System.out.println("printig data using lambda expression......");
		};
		eatable2.sayHi();
		eatable.sayHello();
		eatable.sayHi();
	}

}
